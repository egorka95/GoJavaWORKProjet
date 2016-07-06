package Modul3.HomeWorkModul3Task2;

/**
 * Created by nikitarozhkov on 30.05.16.
 */
public class SoundFile extends File {
    int duration;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
/*
    Тут должна быть только хорошая музыка.
     */

    public String playMusic(String x){

        x = "Играй гармонь";
        return x;
    }
}
