package behavioral.visitor;

public class SeniorDeveloper implements Developer{
    public void create(ProjectClass projectClass) {
        System.out.println("senior writing class");
    }

    public void create(DataBase dataBase) {
        System.out.println("senior writing class");
    }

    public void create(Test test) {
        System.out.println("senior writing class");
    }
}
