package entities;

public class Video extends MultimedialElement implements Brightness, Volume {
    static int brightness = 4;
    static int volume = 4;
    int duration;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    public void play() {
        String PuntiEsclamativi = "";
        for (int i = 0; i < volume; i++) {
            PuntiEsclamativi += "!";
        }
        String Asterischi = "";
        for (int i = 0; i < brightness; i++) {
            Asterischi += "*";
        }
        for (int i = 0; i < duration; i++) {
            System.out.println(title + " Volume: " + PuntiEsclamativi + " Brightness: " + Asterischi);
        }
    }

    @Override
    public void upBright() {
        if (brightness < maxBright) {
            brightness++;
            System.out.println("BrightUp: " + brightness);
        } else {
            System.out.println("Max Brightness");
        }
    }

    @Override
    public void downBright() {
        if (brightness > minBright) {
            brightness--;
            System.out.println("BrightDown: " + brightness);
        } else {
            System.out.println("Min Brightness");
        }
    }

    @Override
    public void volumeUP() {
        if (volume < maxVolume) {
            volume++;
            System.out.println("VolumeUp: " + volume);
        } else {
            System.out.println("Volume Max");
        }
    }

    @Override
    public void volumeDown() {
        if (volume > minVolume) {
            volume--;
            System.out.println("VolumeDown: " + volume);
        } else {
            System.out.println("Volume Min");
        }
    }
}
