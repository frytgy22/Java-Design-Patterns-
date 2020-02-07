package org.mystat.Lebedeva;
//через interface get method. or BD, or FS
public class DAOLessons {
    static Data data=new FileSystem();
    public static void main(String[] args) {
        System.out.println(data.getData());
    }
}
class Bd implements Data{
    String getFromTable (){
        return "data from table.";
    }

    @Override
    public String getData() {
        return getFromTable();
    }
}
class FileSystem implements Data{
    String getFromFS(){
        return "data from fs.";
    }

    @Override
    public String getData() {
        return getFromFS();
    }
}
interface Data {
    String getData();
}