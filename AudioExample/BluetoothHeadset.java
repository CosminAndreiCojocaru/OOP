package oop2.AudioExample;

public class BluetoothHeadset extends AbstractBluetoothDevice implements AudioDevice {

    private int volume;
    private final int signalStrenght = 100;

    @Override
    public boolean volumeUp() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume increased");
            return true;
        }
        System.out.println("Volume is already at max");
        return false;

    }

    @Override
    public boolean volumeDown() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume decreased");
            return true;
        }
        System.out.println("Volume is already at min");
        return false;
    }

    public boolean muteVolume() {
        if (volume != 0) {
            volume = 0;
            System.out.println("Volume muted");
            return true;
        }
        System.out.println("Volume already muted");
        return false;
    }

    public void getSignalStrenght(){
        System.out.println("Signal strenght is:" + signalStrenght);;
    }

}
