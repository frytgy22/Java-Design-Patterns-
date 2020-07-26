package structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("some url");
      //  только когда  вызвали ран, происходит скачивание и запуск
          project.run();
    }
}
