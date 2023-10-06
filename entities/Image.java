package entities;

public class Image extends MultimedialElement implements Brightness{
static int brightness = 4;

public Image (String title){
    super (title);
}


    @Override
    public void upBright() {
        
    }

    @Override
    public void downBright() {

    }
}
