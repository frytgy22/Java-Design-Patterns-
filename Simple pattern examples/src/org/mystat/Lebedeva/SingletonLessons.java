package org.mystat.Lebedeva;

//only one object
public class SingletonLessons {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(singleton.i);
        Singleton singleton1 = Singleton.getSingleton();
        singleton1.i=5;
        System.out.println(singleton.i);
    }
}

class Singleton {
    static private Singleton singleton = new Singleton();
    int i = 0;
    private Singleton() {
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}