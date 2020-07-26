package creational.abstract_factory.banking;

import creational.abstract_factory.ProjectManager;

public class BankingPM implements ProjectManager {
    public void manageProject() {
        System.out.println("PM manages banking code");
    }
}
