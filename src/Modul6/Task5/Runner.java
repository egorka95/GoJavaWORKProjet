package Modul6.Task5;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        //создаем магазин
        MusicStore store = new MusicStore();
        //создаем асортимент
        Map<String, Integer> instrumentses = new HashMap<>();
        instrumentses.put(MusicInstruments.PIANO,2);
        instrumentses.put(MusicInstruments.GUITAR,3);
        instrumentses.put(MusicInstruments.TRUMPET,10);

        //instrumentses.add(new Guitar());
        // instrumentses.add(new Trumpet());
        store.setMusicInstrumentses(instrumentses);

        //инициализируем магазин
        store.setMusicInstrumentses(instrumentses);
        Map<String, Integer> order = new HashMap<>();
        order.put(MusicInstruments.PIANO,2);
        order.put(MusicInstruments.GUITAR,2);
        order.put(MusicInstruments.TRUMPET,3);

        List<MusicInstruments>list;
        try {
            list = store.prepareInstruments(order);
            for (MusicInstruments instruments: list){
                System.out.println(instruments);
            }
        }catch (NotEnoughtInstruments e){
            System.out.println("Не хвататет инструментов " + e.getMessage());
        }



    }
}
