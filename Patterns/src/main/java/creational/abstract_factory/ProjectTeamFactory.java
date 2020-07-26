package creational.abstract_factory;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    ManualTester getManualTester();

    ProjectManager getProjectManager();
}
