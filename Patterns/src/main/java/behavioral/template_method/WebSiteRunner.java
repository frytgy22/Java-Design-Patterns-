package behavioral.template_method;

public class WebSiteRunner {
    public static void main(String[] args) {
        WebSiteTemplate welcomePage = new WelcomePage();
        welcomePage.showPage();

        WebSiteTemplate newsPage = new NewsPage();
        newsPage.showPage();
    }
}
