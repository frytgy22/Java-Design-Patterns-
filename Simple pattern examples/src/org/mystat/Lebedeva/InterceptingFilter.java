package org.mystat.Lebedeva;

import java.util.ArrayList;
import java.util.List;
//цепь фильтров
public class InterceptingFilter {
    static  FileManager fileManager=new FileManager();
    public static void main(String[] args) {
       fileManager.setFilter(new AuthFilter());
       fileManager.setFilter(new IPFilter());
fileManager.filterRequest("hello.");
    }
}
interface Filter{
    void execute(String data);
}
class AuthFilter implements Filter{
    @Override
    public void execute(String data) {
        System.out.println("auth filter "+data);
    }
}class IPFilter implements Filter{
    @Override
    public void execute(String data) {
        System.out.println("IP filter "+data);
    }
}
class FilterChain{
    List<Filter> filters=new ArrayList<>();
    Target target=new Target();
    void addFilter( Filter filter){
        filters.add(filter);
    }
    void filter(String data){
        for(Filter filter:filters){
            filter.execute(data);
        }
        target.doJob(data);
    }
}
class Target{
    void doJob(String data){
        System.out.println("data came to: "+data);
    }
}
class FileManager{
    FilterChain filterChain=new FilterChain();
    void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }
    void filterRequest(String request){
        filterChain.filter(request);
    }
}