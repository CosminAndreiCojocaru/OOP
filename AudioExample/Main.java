package oop2.AudioExample;

public class Main {

    public static void main(String[] args) {

        BluetoothHeadset bluetoothHeadset = new BluetoothHeadset();
        BluetoothClock bluetoothClock = new BluetoothClock();

        WiredHeadset wiredHeadset = new WiredHeadset();

        raiseVolume(bluetoothHeadset); // bluetoothHeadset is an AudioDevice
//        raiseVolume(bluetoothClock); bluetoothClock is not an AudioDevice as per the hierarchy states
        raiseVolume(wiredHeadset); // wiredHeadset is an AudioDevice

        connectDevice(bluetoothHeadset);  // bluetoothHeadset is an BluetoothDevice
        connectDevice(bluetoothClock);  // bluetoothClock is an BluetoothDevice
//        connectDevice(wiredHeadset);  wiredHeadset is not a BluetoothDevice
    }

    public static void raiseVolume(AudioDevice audioDevice) {
        audioDevice.volumeUp();
    }

    public static void connectDevice(BluetoothDevice bluetoothDevice) {
        bluetoothDevice.connect();
    }
}

