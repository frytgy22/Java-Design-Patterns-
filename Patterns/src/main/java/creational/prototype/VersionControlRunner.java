package creational.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "master", "source");

        Project masterCopy = (Project) master.clone();
        System.out.println(masterCopy);
//or
        ProjectFactory factory = new ProjectFactory(master);
        Project projectCopy = factory.cloneProject();
        System.out.println(projectCopy);
    }
}
