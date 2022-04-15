package oop2.AudioExample;

public abstract class AbstractBluetoothDevice implements BluetoothDevice {

    @Override
    public void connect() {
        System.out.println("Device connected");
        // complicated network code - pairing
    }

    @Override
    public void disconnect() {
        System.out.println("Device disconnected");
        // complicated network code - unpairing
    }


}
