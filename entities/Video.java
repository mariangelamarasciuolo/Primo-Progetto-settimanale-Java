package entities;

public class Video extends MultimedialElement implements Brightness, Volume {
    static int brightness = 4;
    static int volume = 4;
    int duration;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }


    @Override
    public void upBright() {
        if (brightness < maxBright) {
            brightness++;
            System.out.println("Bright:" + brightness);
        } else {
            System.out.println("Max Brightness");
        }
    }

    @Override
    public void downBright() {
        if (brightness > minBright) {
            brightness--;
            System.out.println("Bright:" + brightness);
        } else {
            System.out.println("Min Brightness");
        }
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
        if (volume > maxVolume) {
            volume--;
            System.out.println("Volume" + volume);
        } else {
            System.out.println("Volume Min");
        }
    }
}
