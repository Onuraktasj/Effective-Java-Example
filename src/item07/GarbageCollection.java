package item07;

public class GarbageCollection {

    //gc nin teetiklendigini anlamamiz icin yazdik
    public void finalize(){
        System.out.println("Copler temizlendi");
    }

    public static void main(String[] args) {

        GarbageCollection onur = new GarbageCollection();
        GarbageCollection goktug = new GarbageCollection();
        GarbageCollection ersin = new GarbageCollection();

        onur = null;//bu noktada gc devreye girdi calistirip bakabiliriz
        goktug = ersin;//gc sadece null referanslilari silmez memory de ayni yerleri kaplayan bu iki nesneden birini siler
        //yani aslinda temel olarak bir referansi gostermeyen nesne icin yasam dongusu bitmis demektir

        //cikarmamiz gereken sonuclardan biri bizim gc ye uygun kod yazmamiz gerekir ki memory de sikinti yasamayalim

        System.gc();// garbage collector manuel olarak tetikleniyor

        // Bir stack memory vardir bir heap memory vardir
        //Stack her theread icin ayri ayri yaratilirken heap uygulamanin basindan sonuna sizinle gelir
        //heap de olusturulan nesneler tutuldugu icin yasam dongusu bittiginde temizlenmesi lazim bunu gerceklestiren yapi da garbage collection dir


    }



}
