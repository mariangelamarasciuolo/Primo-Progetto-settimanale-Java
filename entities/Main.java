package entities;

public class Main {
    public static void main(String[] args) {

        Audio testAudio = new Audio("test audio", 1);
        System.out.println("Static Volume Audio: " + Audio.volume);
        testAudio.volumeUP();
        testAudio.volumeDown();

        System.out.println(testAudio);
        testAudio.play();
///////////////////////////////////////////////////////////////////
        Image testImage = new Image("test image");
        System.out.println("Static Brightness Image: " + Image.brightness);
        testImage.upBright();
        testImage.downBright();

        System.out.println(testImage);
        testImage.show();
        /////////////////////////////////////////////////////////////////////////
        Video testVideo = new Video("test video", 1);
        System.out.println("Static Volume Video: " + Video.volume);
        testVideo.volumeUP();
        testVideo.volumeDown();
        System.out.println("Static Brightness Video: " + Video.brightness);
        testVideo.upBright();
        testVideo.downBright();


        System.out.println(testVideo);
        testVideo.play();
    }
}
