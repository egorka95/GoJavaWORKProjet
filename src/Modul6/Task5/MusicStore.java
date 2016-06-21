package Modul6.Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by nikitarozhkov on 30.05.16.
 */
public class MusicStore {
    public void setAdress(String adress) {
        this.adress = adress;
    }



    String adress;
    public List<MusicInstruments>prepareInstruments(Map<String, Integer>order)throws NotEnoughtInstruments  {

        int cntPiano = order.get(MusicInstruments.PIANO);
        int cntPianoInShop = musicInstrumentses.get(MusicInstruments.PIANO);
        if (cntPianoInShop<cntPiano){
            throw new NotEnoughtInstruments("Сильно много хочешь");
        }
        int cntGuitar = order.get(MusicInstruments.GUITAR);
        int cntGuitarInShop = musicInstrumentses.get(MusicInstruments.GUITAR);
        if (cntGuitarInShop<cntGuitar){
            throw new NotEnoughtInstruments("Сильно много хочешь");
        }
        int cntTrumpet = order.get(MusicInstruments.TRUMPET);
        int cntTrumpetInShop = musicInstrumentses.get(MusicInstruments.TRUMPET);
        if (cntTrumpetInShop<cntTrumpet){
            throw new NotEnoughtInstruments("Сильно много хочешь");
        }
        //тоже самое на трубу и на гитару
        List<MusicInstruments>result = new ArrayList<>();
        for (int i = 0; i < cntPiano;i++){
            result.add(new Piano());
        }
        for (int i = 0;i < cntGuitar;i++){
            result.add(new Guitar());
        }
        for (int i = 0;i < cntTrumpet;i++){
            result.add(new Trumpet()    );
        }
        musicInstrumentses.put(MusicInstruments.PIANO, cntPianoInShop - cntPiano);
        musicInstrumentses.put(MusicInstruments.TRUMPET, cntTrumpetInShop - cntTrumpet);
        musicInstrumentses.put(MusicInstruments.GUITAR, cntGuitarInShop - cntGuitar);

        return result;


        /*for (int i = 0; i < cntGuitar;i++){
            result.add(new Guitar());
        }
        musicInstrumentses.put(MusicInstruments.GUITAR, cntGuitarInShop - cntGuitar);

        return result;*/
    }

    int area;

    public Map<String, Integer> getMusicInstrumentses() {
        return musicInstrumentses;
    }


    public void setMusicInstrumentses(Map<String, Integer> musicInstrumentses) {
        this.musicInstrumentses = musicInstrumentses;
    }

    public Map<String, Integer> musicInstrumentses;


}
