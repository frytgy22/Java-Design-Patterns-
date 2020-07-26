package creational.abstract_factory.website;

import creational.abstract_factory.Developer;
import creational.abstract_factory.ManualTester;
import creational.abstract_factory.ProjectManager;
import creational.abstract_factory.ProjectTeamFactory;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    public ManualTester getManualTester() {
        return new ManualPhpTester();
    }

    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
