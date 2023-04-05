package item12;

public class Request {

    public String header;
    public String body;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

//    @Override
//    public String toString() {
//        return "Request  [header" +  header  + ", body " + body + "]";
//    }

//Ide bu sekilde otomatik yazdirabiliyor kitapta sinifin butun fieldlarina erisim saglanmasi gerektigi soyluyor
//    @Override
//    public String toString() {
//        return "Request{" +
//                "header='" + header + '\'' +
//                ", body='" + body + '\'' +
//                '}';
//    }

    //bir diger kullanim ise bu
    //bir post request attigimizi dusunelim json ile haberlesmeli
    //bunu dependency olarak eklerseniz sinifin elemanlarini bizim icin json seklinde yazdiriyo
    //json formatina uygun bir string geliyor elimize kullanisli bir ozellik !!!
//    @Override
//    public String toString() {
//        return new com.gogle.gson.Gson.toJson(this);
//    }
}
