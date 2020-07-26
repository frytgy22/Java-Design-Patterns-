package behavioral.iterator;

public class DeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "hibernate", "Maven"};
        JavaDeveloper developer = new JavaDeveloper("Lera", skills);

        Iterator iterator = developer.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
