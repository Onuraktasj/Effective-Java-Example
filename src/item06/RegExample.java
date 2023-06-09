package item06;

import java.util.regex.Pattern;

public class RegExample {

    //kullandigimiz metotlarin iceriklerini de bilmemiz lazim ornegin burada siniflara gidip baktikca surekli yeniden nesne urettigini gorecegiz
    //surekli nesne(gereksiz ise) uretme konusunda daha dikkatli olmamiz gerekir
    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");


    public static boolean isRomanNumeral(String s)
    {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    static boolean isNonNumeral(String s)
    {
        return ROMAN.matcher(s).matches();
    }


}
