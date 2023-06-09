package item11;

import item10.DenemeSinifi;
import item10.DenemeSinifiOverride;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Item11Test {
    public static void main(String[] args) {
//equals ve hashCode u ide de generate ediyor unutma !
        DenemeSinifiOverride d1 = new DenemeSinifiOverride(1,2);
        DenemeSinifiOverride d2 = new DenemeSinifiOverride(5,6);
        DenemeSinifiOverride d3 = new DenemeSinifiOverride(1,2);
        //hashcode metodu override edilmedigi default hali ile asagidaki her nesne icin farkli code uretilecek
        //her biri icin ayri instance olusturuldugu icin dogal olarak hashCode degerleri farkli oluyor
//        System.out.println(d1.hashCode());
//        System.out.println(d2.hashCode());
//        System.out.println(d3.hashCode());

        //hashCode u override etmedigim bu durumda sout icerisinde istedigim deger null donuyor
        //fakat hashCode u override ettigimiz zaman istedigimiz gibi dogru bir sekilde calisiyor
        //override edilmis hashCode metodu item10 paketinin altinda DenemeSinifiOverride class inin icinde
//        Map<DenemeSinifiOverride,String > m = new HashMap<>();
//        m.put(new DenemeSinifiOverride(1,2),"ilk eleman");
//        System.out.println(m.get(new DenemeSinifiOverride(1,2)));

        //asagidaki ornekte hashCode override edilmis bir siniftan list e ekleyerek bu list bunu iceriyor mu dedik ve true deger aldik
        List<DenemeSinifiOverride> list = new ArrayList<>();
        DenemeSinifiOverride e =  new DenemeSinifiOverride(1,2);
        list.add(e);
        System.out.println(list.contains(new DenemeSinifiOverride(1,2)));
        //unutma contains metodu icerisinde equals kullandigi icin boyle bir durum yasaniyor
        //fakat bu ornekte hashCode override etmedigimiz icin yukaridaki ornegin aynisini yapmis olmamiza ragmen false aldik
        List<DenemeSinifi> list2 = new ArrayList<>();
        DenemeSinifi r =  new DenemeSinifi(3,4);
        list2.add(r);
        System.out.println(list2.contains(new DenemeSinifi(3,4)));

    }
}
