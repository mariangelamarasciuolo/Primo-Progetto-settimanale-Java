package entities;

public class Audio extends MultimedialElement implements Volume {
    static int volume = 4;
    int duration;

    public Audio(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void volumeUP() {
        if (volume < maxVolume) {
            volume++;
            System.out.println("Volume" + volume);
        } else {
            System.out.println("Volume Max");
        }
    }

    @Override
    public void volumeDown() {
        if (volume > minVolume) {
            volume--;
            System.out.println("Volume" + volume);
        } else {
            System.out.println("Volume Min");
        }
    }
}
