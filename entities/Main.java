package entities;

public class Main {
    public static void main(String[] args) {
        Audio testAudio = new Audio("test audio", 4);
        System.out.println("Static Volume Audio: " + Audio.volume);
        testAudio.volumeUP();
        testAudio.volumeDown();

        Image testBright = new Image("test image");
        System.out.println("Static Brightness Image: " + Image.brightness);
        testBright.upBright();
        testBright.downBright();

        Video testVideo = new Video("test video", 4);
        System.out.println("Static Volume Video: " + Video.volume);
        testVideo.volumeUP();
        testVideo.volumeDown();
        System.out.println("Static Brightness Video: " + Video.brightness);
        testBright.upBright();
        testBright.downBright();
    }
}
