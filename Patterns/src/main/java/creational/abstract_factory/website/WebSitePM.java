package creational.abstract_factory.website;

import creational.abstract_factory.ProjectManager;

public class WebSitePM implements ProjectManager {
    public void manageProject() {
        System.out.println("Web PM manages project");
    }
}
