package entities;

public class Image extends MultimedialElement implements Brightness {
    static int brightness = 4;

    public Image(String title) {
        super(title);
    }

    public void show() {
        String Asterischi = "";
        for (int i = 0; i < brightness; i++) {
            Asterischi += "*";
        }
        System.out.println(title + " Brightness: " + Asterischi);

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
}