package item10;

public class Item10Test {

    public static void main(String[] args) {
        //Part 1

//        //integer-type
//        System.out.println(10==20);
//        //char-type
//        System.out.println('a'=='b');
//        //char and double type
//        System.out.println('a'==97.0); // a char olarak bir ASKI oldugu icin true dondu
//        //boolean type
//        System.out.println(true==true);
        // == demek referans tipleri karsilastiriyorum demek


        // aslinda nesne iceerikleri ayni olamsina ragmen burasi false doner  cunku d ve d2 heap de ayri referanslari gosteriyor
//        DenemeSinifi d = new DenemeSinifi(1,2);
//        DenemeSinifi d2 = new DenemeSinifi(1,2);
//        System.out.println(d == d2);
//
//        System.out.println(d.equals(d2));//burasi da false dondu burada equalsi override etmemiz gerektigini anliyoruz
//        System.out.println(d.equals(d));//eger equalsi override etmezsek reflexive ozelligini saglar ve burasi true doner
//


        //Part 2 yukaridaki ornegi pekistirdik
//        DenemeSinifi denemeSinifi = new DenemeSinifi(10,11);
//        DenemeSinifi denemeSinifi1 = new DenemeSinifi(10,11);
//
//        if(denemeSinifi.equals(denemeSinifi1))
//            System.out.println("Biz esit degiliz");
//        else
//            System.out.println("Biz esit degiliz");


        //Part 3
        //equals metodunu override ederek bu iki esitligi kontrol ettik ve esit oldugunu bulduk
        //eger equals i override i override etmeseydik yani default olan kalmis olsaydi gene bu iki nesne icin esit degil donusu alacaktik
        DenemeSinifiOverride deneme =  new DenemeSinifiOverride(10,11);
        DenemeSinifiOverride deneme2 = new DenemeSinifiOverride(10,11);
        if(deneme.equals(deneme2))
            System.out.println("Biz esitiz");
        else
            System.out.println("Biz esit degiliz");


        //Part 4 hangi durumlarda equals override etmem gerekir ve override ederken nelere dikkat etmem gerekir bunun sartlari sunlardir;
//        • Reflexive: For any non-null reference value x, x.equals(x) must
//        return true.
//        • Symmetric: For any non-null reference
//        values x and y, x.equals(y) must return true if and only
//        if y.equals(x) returns true.
//        • Transitive: For any non-null reference values x, y, z,
//        if x.equals(y) returns true and y.equals(z) returns true,
//                then x.equals(z) must return true.
//        • Consistent: For any non-null reference values x and y, multiple
//        invocations of x.equals(y) must consistently return true or
//        consistently return false, provided no information used
//        in equals comparisons is modified.
//        • For any non-null reference value x, x.equals(null) must
//        return false.

        //son maddeye bianen
        System.out.println(deneme2.equals(null)); // null olmayan bir x icin x.equals(null) her zaman false donmelidir

        //Part 5 Transitive kitaptaki Point ornegi uzerinden anlatilmistir
    }
}
