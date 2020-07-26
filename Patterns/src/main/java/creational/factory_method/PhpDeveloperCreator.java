package creational.factory_method;

public class PhpDeveloperCreator implements DeveloperCreator{
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
