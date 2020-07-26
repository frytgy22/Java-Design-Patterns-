package structural.bridge.v2_devices;

public class Demo {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }
        public static void testDevice(Device device) {
            System.out.println("Tests with basic remote.");
            BasicRemote basicRemote = new BasicRemote(device);
            basicRemote.power();

            System.out.println("Tests with advanced remote.");
            AdvancedRemote advancedRemote = new AdvancedRemote(device);
            advancedRemote.power();
            advancedRemote.disconnect();
    }
}
