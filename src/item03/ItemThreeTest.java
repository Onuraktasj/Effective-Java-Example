package item03;

public class ItemThreeTest {
    public static void main(String[] args) {
        // constructora private cektigimiz an bu sekilde new leme yapamiyoruz
//            DefineSingleton defineSingleton = new DefineSingleton();
//            DefineSingleton defineSingleton1 = new DefineSingleton();
//            DefineSingleton defineSingleton2 = new DefineSingleton();

        //Nesneyi bu sekilde yarattik constructor private oldugu icin
//        DefineSingleton ds = DefineSingleton.ds;
//        DefineSingleton ds2 = DefineSingleton.getInstance();
//        System.out.println(ds.hashCode());
//        System.out.println(ds2.hashCode());

        //Asagida yapacagimiz ornekte yarattigimiz singleton nesneyi ayni anda iki thread cagirirsa ne olur diye dusunuyoruz
        //ornegi calistirdigimiz zaman lazy de nesnelerin degistigini eager ve enum da degismedigini goreceksiniz 
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1); // 1 milisaniye sleep koydugunda iki thred ayni anda giriyor genellikle
                }catch (InterruptedException e){

                }
                System.out.println("Hashcode of Lazy: " + LazyCache.getInstance().hashCode());
                System.out.println("Hashcode of Eager: " + EagerCache.getInstance().hashCode());
                System.out.println("Hashcode of Enum: " + CacheSingleton.INSTANCE.hashCode());

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hashcode of Lazy: " + LazyCache.getInstance().hashCode());
                System.out.println("Hashcode of Eager: " + EagerCache.getInstance().hashCode());
                System.out.println("Hashcode of Enum: " + CacheSingleton.INSTANCE.hashCode());
            }
        }).start();



    }
}
