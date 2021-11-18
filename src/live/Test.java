package live;

import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena obj1 = new Veena();
        obj1.play();
        Saxophone obj2 = new Saxophone();
        obj2.play();
        Playable obj3 = new Veena();
        obj3.play();
        Playable obj4 = new Saxophone();
        obj4.play();
    }
}
