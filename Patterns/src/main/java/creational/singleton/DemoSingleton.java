package creational.singleton;

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance("first");
        Singleton second = Singleton.getInstance("second");

        System.out.println(first.value);
        System.out.println(second.value);
    }
}
