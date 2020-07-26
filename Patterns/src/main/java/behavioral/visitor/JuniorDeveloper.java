package behavioral.visitor;

public class JuniorDeveloper implements Developer{
    public void create(ProjectClass projectClass) {
        System.out.println("junior writing class");
    }

    public void create(DataBase dataBase) {
        System.out.println("junior use db");
    }

    public void create(Test test) {
        System.out.println("junior writing test");
    }
}
