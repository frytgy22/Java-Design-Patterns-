package creational.factory_method;

public class Program {
    public static void main(String[] args) {
        DeveloperCreator developerCreator = new PhpDeveloperCreator();
        Developer developer = developerCreator.createDeveloper();
        developer.writeCode();
    }
}
