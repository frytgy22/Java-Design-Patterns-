package behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GithubRepo repo = new GithubRepo();

        project.setVersionAndDate("Version 1.0");
        System.out.println(project);

        repo.setSave(project.save());
        Thread.sleep(3000);

        project.setVersionAndDate("Version 1.1");
        System.out.println(project);

        System.out.println("Bad code. Need rollback ещ мукышщт 1.0");
        project.load(repo.getSave());

        System.out.println(project);
    }
}
