package org.mystat.Lebedeva;
//если нужно доставать Students из БД, потом из FileSystem
//View можно послать через инет, передать в HTML, в файл и т.д.
//все кониролирует Controller
public class MVC {
    public static void main(String[] args) {
Controller controller=new Controller();
controller.execute();
    }
}
class Controller{
    ModelLayer modelLayer=new BDLayer();//if need of File system, change BDLayer on FileSystemLayer
    View view=new ConsoleView();
    void execute(){
        Students students=modelLayer.getStudent();
        view.showStudent(students);
    }

}
class Students{
String name="Leon";
int age=22;
}
interface ModelLayer{
    Students getStudent();
}
class BDLayer implements ModelLayer{
    @Override
    public Students getStudent() {
        return new Students();
    }
}class FileSystemLayer implements ModelLayer{
    @Override
    public Students getStudent() {
        return new Students();
    }
}
interface View{
    void showStudent(Students students);
}
class ConsoleView implements View{
    @Override
    public void showStudent(Students students) {
        System.out.println("Student "+students.name+" "+students.age);
    }
}class HMLView implements View{
    @Override
    public void showStudent(Students students) {
        System.out.println("<html><body>Student "+students.name+" "+students.age);
    }
}