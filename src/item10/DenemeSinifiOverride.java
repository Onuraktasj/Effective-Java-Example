package item10;

public class DenemeSinifiOverride {

    private int a,b;

    DenemeSinifiOverride(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override//override ederek default gelen equalsi gecersiz kilmis oluyoruz
    public boolean equals(Object o){
        if(o == this){
            return true; // buradaki if blogu equals sozlesmesinin ilk maddesi olan reflexive durumunu sagliyor ki burasi default equals metodu da saglar
        }
        if(!(o instanceof DenemeSinifiOverride)){
            return false; //bu if blogunda da su islem yapiliyor; bu metodun icerisine giren obje gene bu sinifin instancesi degilse bana false don
                          //zaten bu sifin bir instance si degilse ben bir esitlik bekleyemem
        }
        DenemeSinifiOverride c = (DenemeSinifiOverride) o;//son islemimiz type casting islemi
                                                          //burada DenemeSinifiOverride cinsinden bir c nesnesi olusturdum ve gelen o nesnesini bu sinifa cast ettim

        return Integer.compare(a,c.a) == 0 && Integer.compare(b,c.b) == 0;//bu sinifin icerisinde kiyaslamak zorunda oldugum hangi elemanlar varsa iceride bunlari compare ediyorum
        //bu kiyasladigim seylerin degeri esitse o zaman diyorum ki tamam bu dogru equals i sagliyor
    }




//    @Override // burada override i sil der cunku bu sekilde yapilan degisiklikler override degil overload olmus oluyor bu ayrima dikkat edelim
    //overload yaptigimiz zaman equals metodunu gecersiz kilmis olmuyorsunuz
//    public boolean equals(DenemeSinifiOverride obj) {
//        return super.equals(obj);
//    }
}
