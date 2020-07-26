package creational.abstract_factory;

import creational.abstract_factory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        ManualTester manualTester = projectTeamFactory.getManualTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        manualTester.testCode();
        projectManager.manageProject();
    }
}
