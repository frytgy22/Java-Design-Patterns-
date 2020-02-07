package org.mystat.Lebedeva;

//create template running method
public class TemplateLessons {
    public static void main(String[] args) {
        Template template = new Job();
        template.run();
    }
}

abstract class Template {
    abstract void one();

    abstract void two();

    abstract void three();

    void run() {
        one();
        two();
        three();
    }
}

class Job extends Template {

    @Override
    void one() {
        System.out.println("start game");
    }

    @Override
    void two() {
        System.out.println("play");
    }

    @Override
    void three() {
        System.out.println("end game");
    }
}