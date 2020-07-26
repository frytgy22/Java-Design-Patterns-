package behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite site=new JavaDeveloperJobSite();
        site.addVacancy("First position");
        site.addVacancy("Second position");

        Observer firstObserver = new Subscriber("Denis");
        Observer secondObserver = new Subscriber("Petr");

        site.addObserver(firstObserver);
        site.addObserver(secondObserver);

        site.addVacancy("Third position");
        site.removeVacancy("First position");
    }
}
