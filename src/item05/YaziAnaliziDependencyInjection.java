package item05;

import java.util.function.Supplier;

public class YaziAnaliziDependencyInjection {

    //burada diger cozumlere gore sozluk intancesini daha dinamik bir sekilde aliyorum
    private final Sozluk sozluk;

    public YaziAnaliziDependencyInjection(Supplier<Sozluk> sozluk){
        this.sozluk = sozluk.get(); // supplier get aliyor unutmamak lazim
    }

    public boolean isValid(){
        return true;
    }

}
