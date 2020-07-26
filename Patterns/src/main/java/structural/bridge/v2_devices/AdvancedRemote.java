package structural.bridge.v2_devices;

public class AdvancedRemote extends BasicRemote{

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void disconnect(){
        System.out.println("Remote: disable");
        device.disable();
    }
}
