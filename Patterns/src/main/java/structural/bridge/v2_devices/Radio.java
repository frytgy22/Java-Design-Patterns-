package structural.bridge.v2_devices;

public class Radio implements Device {
    private boolean on = false;
    private int volume = 30;

    public void enable() {
        on = true;
    }

    public void disable() {
        on = false;
    }

    public int getVolume() {
        return volume;
    }
}
