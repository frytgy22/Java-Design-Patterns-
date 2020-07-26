package creational.factory_method;

public class CppDeveloperCreator implements DeveloperCreator{
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
