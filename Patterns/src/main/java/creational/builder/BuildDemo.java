package creational.builder;

public class BuildDemo {
    public static void main(String[] args) {
        Director director = new Director();

        director.setWebSiteBuilder(new VisitCardWebSiteBuilder());
        WebSite webSite = director.buildWebsite();
        System.out.println(webSite);
    }
}
