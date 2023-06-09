package item06;

public class Item06Test {

    private static long topla(){

        Long sum = 0L;

        for(int i = 0 ; i < 150 ; i++){
            sum += i;
        }
        return sum;
    }

    private static long topla2(){

        long sum = 0;

        for(int i = 0 ; i < 150 ; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

//        String kelime = new String("bikini");
//        String kelime2 =  "bikini";
//        String kelime3 = "bikini";
        //burada baktigimiz sey referanslarin ayni olup olmamasi durumudur
//        System.out.println(kelime == kelime2);
//        System.out.println(kelime2 == kelime3);


        //burada gormemiz gereken sey autoboxing ile ne kadar fazla zaman kabettigimiz
        //primitive tipler ile yaptigimiz ve hic cast etmedigimiz durumlarda sure oldukca kisaliyor
        //cunku ilk topla metodunda java arka tarafta donusturme islerini yapiyor
        //kitap diyor ki autoboxing yaptigin durumlara dikkat et gereksiz kullanildigi taktirde gereksiz nesne uretebilir
        long start = System.nanoTime();
        topla();
        long end = System.nanoTime();
        long totalTime = end - start;
        System.out.println(totalTime);

        long start2 = System.nanoTime();
        topla2();
        long end2 = System.nanoTime();
        long totalTime2 = end2 - start2;
        System.out.println(totalTime2);



    }
}
