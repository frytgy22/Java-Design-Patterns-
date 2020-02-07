package org.mystat.Lebedeva;

import java.util.ArrayList;
import java.util.List;

//инкапсултровать команду в отдельный класс
public class CommandLesson {
    public static void main(String[] args) {
Receiver receiver=new Receiver();
receiver.addCommand(new MouseClick());
receiver.addCommand(new MousePress());
receiver.runCommand();
    }
}
interface Commands{
    void execute();
    void revert();
}
class MouseClick implements Commands{

    @Override
    public void execute() {
        System.out.println("CLICK COMMAND");
    }

    @Override
    public void revert() {
        System.out.println("REVERT");
    }
}
class MousePress implements Commands{
    @Override
    public void revert() {
        System.out.println("REVERT");
    }
    @Override
    public void execute() {
        System.out.println("PRESS COMMAND");
    }
}
class Receiver{
    List<Commands>commands=new ArrayList<>();
    void addCommand(Commands command){
commands.add(command);
    }
    void runCommand(){
        try{
        for(Commands command:commands)
        command.execute();
    }catch (Exception e){
            for(Commands command:commands)
                command.revert();
        }
}}