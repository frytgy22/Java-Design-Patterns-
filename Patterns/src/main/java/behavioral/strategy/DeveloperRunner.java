package behavioral.strategy;

import behavioral.state.Codding;
import behavioral.state.Reading;
import behavioral.state.Sleeping;
import behavioral.state.Training;

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer developer = new Developer();

        developer.setActivity(new Sleeping());
        developer.executeDoIt();

        developer.setActivity(new Training());
        developer.executeDoIt();

        developer.setActivity(new Codding());
        developer.executeDoIt();

        developer.setActivity(new Reading());
        developer.executeDoIt();
    }
}
