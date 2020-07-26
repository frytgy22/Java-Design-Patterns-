package structural.bridge.v2_devices;

public class BasicRemote implements Remote{
    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }

    public void power() {
        System.out.println("Remote: power toggle");
            device.enable();
    }

    public void volumeDown() {
        System.out.println("Remote: volume down");
    }

    public void volumeUp() {
        System.out.println("Remote: volume up");
    }
}
