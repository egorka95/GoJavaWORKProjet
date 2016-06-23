package Modul3.HomeWorkModul3Task1;

import java.util.List;

/**
 * Created by nikitarozhkov on 30.05.16.
 */
public class RoseBush extends Rose {
    List<Rose> roses;

    /*
   Тут можно давить еще состояние куста.
    */

    public RoseBush(String color, int size, List<Rose> roses) {
        super(color, size);
        this.roses = roses;
    }
}
