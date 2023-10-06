package entities;

public interface Brightness {
    int maxBright = 10;
    int minBright = 1;

    void upBright();
    void downBright();
}
