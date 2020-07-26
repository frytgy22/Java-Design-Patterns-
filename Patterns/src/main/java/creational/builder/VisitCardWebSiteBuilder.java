package creational.builder;

public class VisitCardWebSiteBuilder extends WebSiteBuilder {
    void buildName() {
        getWebSite().setName("visit card");
    }

    void buildCms() {
        getWebSite().setCms(Cms.WORDPRESS);
    }

    void buildPrice() {
        getWebSite().setPrice(300);
    }
}
