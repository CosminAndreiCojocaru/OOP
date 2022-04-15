package oop2.AudioExample;

public abstract class AbstractAudioDevice implements AudioDevice {
    private int volume;

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
}
