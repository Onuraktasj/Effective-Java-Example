package item05;

public class YaziAnaliziSingleton {
    //hatirlayalim singleton tek bir instance olacak ve onun ustunden calisacakti
    //aslinda bir bakima utilty sinifimizdan pek bir farki olmamis oldu
    private final static Sozluk sözlük = new Sozluk("İngilizce");
    public static YaziAnaliziSingleton INSTANCE = new YaziAnaliziSingleton();

    private YaziAnaliziSingleton() {
        // TODO Auto-generated constructor stub
    }

    public boolean isValid()
    {
        return true;
    }
}
