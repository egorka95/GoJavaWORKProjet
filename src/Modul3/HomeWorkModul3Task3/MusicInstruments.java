package Modul3.HomeWorkModul3Task3;

import java.util.List;

/**
 * Created by nikitarozhkov on 30.05.16.
 */
public class MusicInstruments {

    /*
    Тут может быть ваша реклама.
     */

    private String name;
    private String type;
    private int price;
    private String play;
    private int size;
    private String characteristic;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPlay() {
        return play;
    }

    public void setPlay(String play) {
        this.play = play;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public MusicInstruments(String name, int size, String characteristic){
        this.characteristic = characteristic;
        this.name = name;
        this.size = size;
}


}
