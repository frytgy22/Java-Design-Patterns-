package creational.factory_method;

public class JavaDeveloperCreator implements DeveloperCreator{
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
