package item03;

public class DefineSingleton {
    private DefineSingleton(){

    }

    //Constructor private olduugundan oturu bu sekilde nesne uretip kullaniyoruz
    //Ama kitap bunu boyle yapmayin diyour static factory metot ile cagirin
    public static DefineSingleton ds = new DefineSingleton();

    //burada donulen nesne ile yukaridaki nesne aynidir
    public static DefineSingleton getInstance(){
        return ds;
    }
}
