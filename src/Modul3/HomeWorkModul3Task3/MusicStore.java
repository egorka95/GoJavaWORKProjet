package Modul3.HomeWorkModul3Task3;

import java.util.List;

/**
 * Created by nikitarozhkov on 30.05.16.
 */
public class MusicStore {

    /*
    Надо добавит переменную количество м2 в магазине.
     */

    String adress;

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public List<MusicInstruments> getMusicInstrumentses() {
        return musicInstrumentses;
    }

    public void setMusicInstrumentses(List<MusicInstruments> musicInstrumentses) {
        this.musicInstrumentses = musicInstrumentses;
    }

    int area;
    List<MusicInstruments> musicInstrumentses;
}
