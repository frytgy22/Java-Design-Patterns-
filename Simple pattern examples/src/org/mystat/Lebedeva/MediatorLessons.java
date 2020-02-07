package org.mystat.Lebedeva;

import java.util.ArrayList;
import java.util.List;

//облегчает обшение объектов
//true there can only be one object
public class MediatorLessons {
    public static void main(String[] args) {
ConcretedMediator mediator=new ConcretedMediator();
mediator.add(new ConcretedColleague(mediator,"One"));
mediator.add(new ConcretedColleague(mediator,"Two"));
ConcretedColleague concretedColleague=new ConcretedColleague(mediator,"Three");
mediator.add(concretedColleague);
concretedColleague.changeStatus();
    }
}
interface Mediator{
void requestAll(Colleague colleague);
}
class ConcretedMediator implements Mediator{
List<Colleague>colleagueList=new ArrayList<>();
void add(Colleague colleague){
    colleagueList.add(colleague);
}
    @Override
    public void requestAll(Colleague colleague) {
colleague.setTrue();
for(Colleague colleague1:colleagueList){
    if (colleague1!=colleague){
        colleague1.setFalse();
    }
}
    }
}
interface Colleague{
void setFalse();
void setTrue();
void changeStatus();
}
class ConcretedColleague implements Colleague{
boolean status;
Mediator mediator;
String name;

    public ConcretedColleague(Mediator mediator,String name) {
        this.mediator = mediator;
        this.name=name;
    }

    @Override
    public void setFalse() {
        status=false;
        System.out.println("My status is false. "+name);
    }

    @Override
    public void setTrue() {
        status=true;
        System.out.println("My status is true. "+name);
    }

    @Override
    public void changeStatus() {
mediator.requestAll(this);
    }
}