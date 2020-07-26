package creational.builder;

public class Director {
    private WebSiteBuilder webSiteBuilder;

    public void setWebSiteBuilder(WebSiteBuilder webSiteBuilder) {
        this.webSiteBuilder = webSiteBuilder;
    }

    WebSite buildWebsite() {
        webSiteBuilder.createWebSite();
        webSiteBuilder.buildName();
        webSiteBuilder.buildCms();
        webSiteBuilder.buildPrice();

        return webSiteBuilder.getWebSite();
    }
}
