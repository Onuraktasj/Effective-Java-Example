package item05;

import java.util.function.Supplier;

public class Item05Test {

    public static void main(String[] args) {

        //Utiltiy class icin sadece ornegin turkce icin bir valid yapilabildi esneklik acisindan sifir o yuzden direkt eliyoruz
//        YaziAnaliziUtility.isValid();

        //Bu cozumde mantikli ve istenilen cozum degil aslinda
//        YaziAnaliziSingleton.INSTANCE.isValid();


        //burada digerlerinden farkli olarak dil icin turkce ingilizce ne istersen onu yazarsin yani kaynagindan gelen data ne ise ona gore esneklik gosterir
//        YaziAnaliziDependencyInjection asd = new YaziAnaliziDependencyInjection(new Sozluk("Turkce"));
//        asd.isValid();

        //Kitabin bize bir diger onerisi de LAMBDA FUNCTION
        //supplier bir functional interface ve burada oa yi string cinsinden hemen olusturup geri dondun
//        Supplier<String> oa = ()->"Onur Aktas";
//        System.out.println(oa.get());

        //Ornegimiz uzerinde lambda function uygulayalim
        Supplier<Sozluk> turkce = () -> new Sozluk("Turkce");
        YaziAnaliziDependencyInjection asd = new YaziAnaliziDependencyInjection(turkce);

    }
}
