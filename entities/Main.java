package entities;

public class Main {
    public static void main(String[] args) {
        Audio testAudio = new Audio("test audio", 4);
        System.out.println(Audio.volume);
        testAudio.volumeUP();

        Image testBright = new Image("test image");
        System.out.println(Image.brightness);
        testBright.upBright();
    }
}
