package creational.abstract_factory.banking;

import creational.abstract_factory.Developer;
import creational.abstract_factory.ManualTester;
import creational.abstract_factory.ProjectManager;
import creational.abstract_factory.ProjectTeamFactory;

public class BankingTeamFactory implements ProjectTeamFactory {

    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public ManualTester getManualTester() {
        return new QaTester();
    }

    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
