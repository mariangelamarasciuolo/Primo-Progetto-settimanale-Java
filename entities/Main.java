package entities;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MultimedialElement[] array = new MultimedialElement[5];
        Scanner FiveElements = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Make your choice!");
            System.out.println("Image: 1");
            System.out.println("Audio: 2");
            System.out.println("Video: 3");
            System.out.println("Esc: 0");

            int tipo = FiveElements.nextInt();
            switch (tipo) {
                case 1:
                    System.out.println("Title Image: ");
                    String titleImage = FiveElements.next();
                    Image image = new Image(titleImage);
                    array[i] = image;
                    break;
                case 2:
                    System.out.println("Title Audio: ");
                    String titleAudio = FiveElements.next();
                    System.out.println("Duration Video: ");
                    int audioDuration = FiveElements.nextInt();
                    Audio audio = new Audio(titleAudio, audioDuration);
                    array[i] = audio;
                    break;
                case 3:
                    System.out.println("Title Video: ");
                    String titleVideo = FiveElements.next();
                    System.out.println("Duration Video: ");
                    int videoDuration = FiveElements.nextInt();
                    Video video = new Video(titleVideo, videoDuration);
                    array[i] = video;
                    break;
                case 4:
                    System.out.println("Exit");

                    break;
                default:
                    System.out.println("WHAT?!");
                    return;
            }
        }


//////////////////////////////////////////////////////////////////////////////////
       /* Audio testAudio = new Audio("test audio", 1);
        System.out.println("Static Volume Audio: " + Audio.volume);
        testAudio.volumeUP();
        testAudio.volumeDown();

        System.out.println(testAudio);
        testAudio.play();*/
//////////////////////////////////////////////////////////////////////////////////

        /*Image testImage = new Image("test image");
        System.out.println("Static Brightness Image: " + Image.brightness);
        testImage.upBright();
        testImage.downBright();

        System.out.println(testImage);
        testImage.show();*/

//////////////////////////////////////////////////////////////////////////////////
        /*Video testVideo = new Video("test video", 1);
        System.out.println("Static Volume Video: " + Video.volume);
        testVideo.volumeUP();
        testVideo.volumeDown();
        System.out.println("Static Brightness Video: " + Video.brightness);
        testVideo.upBright();
        testVideo.downBright();

        System.out.println(testVideo);
        testVideo.play();*/
    }
}
