package entities;

public class Image extends MultimedialElement implements Brightness {
    static int brightness = 4;

    public Image(String title) {
        super(title);
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
}