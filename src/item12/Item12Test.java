package item12;

public class Item12Test {

    public static void main(String[] args) {

        Request as = new Request();
        as.setBody("Govde");
        as.setHeader("Kafa");

        System.out.println(as.toString()); //override etmedigimiz zaman anlamli olmayan bir geri donus oluyor
        //override edip anlamli bir geri donus alabiliriz

    }
}
