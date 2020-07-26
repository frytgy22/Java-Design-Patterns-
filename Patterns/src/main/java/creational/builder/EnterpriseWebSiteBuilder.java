package creational.builder;

public class EnterpriseWebSiteBuilder extends WebSiteBuilder{
    void buildName() {
        getWebSite().setName("enterprise card");
    }

    void buildCms() {
        getWebSite().setCms(Cms.ALIFRESCO);
    }

    void buildPrice() {
        getWebSite().setPrice(1300);
    }
}
