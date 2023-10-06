package entities;

public class Audio extends MultimedialElement implements Volume {
    static int volume = 4;
    int duration;

    public Audio(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    public void play() {
        String PuntiEsclamativi = "";
        for (int i = 0; i < volume; i++) {
            PuntiEsclamativi += "!";
        }

        for (int i = 0; i < duration; i++) {
            System.out.println(title + " Volume: " + PuntiEsclamativi);
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
