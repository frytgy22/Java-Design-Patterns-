package behavioral.strategy;

import behavioral.state.Activity;

public class Developer {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeDoIt() {
        activity.justDoIt();
    }
}
