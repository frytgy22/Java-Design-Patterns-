package structural.composite;

import java.io.InputStream;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer one = new JavaDeveloper();
        Developer two = new JavaDeveloper();
        Developer three = new CppDeveloper();

        team.addDeveloper(one);
        team.addDeveloper(two);
        team.addDeveloper(three);

        team.createProject();
    }
}
