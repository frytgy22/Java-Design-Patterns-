package creational.abstract_factory;

import creational.abstract_factory.banking.BankingTeamFactory;

public class BankProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory=new BankingTeamFactory();
        Developer developer=projectTeamFactory.getDeveloper();
        ManualTester manualTester = projectTeamFactory.getManualTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        manualTester.testCode();
        projectManager.manageProject();
    }
}
