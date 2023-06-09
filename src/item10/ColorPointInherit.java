package item10;

import java.awt.Color;

public class ColorPointInherit extends Point{
    private final Color color;

    public ColorPointInherit(int x, int y,Color color){
        super(x,y);
        this.color = color;
    }

    //Kitap sunu soyluyor bir class extends ettigi class da equals override edildiyse extend eden override etmesin
    //cunku bildigimiz standartlarda bir equlas yazinca sozlesmede soylenen simetri maddesini bozuyor
    //sozlesme maddesini halletsek ve daha karmasik bir equals yazsak da bu sefer de Transitive(donusumluluk) bozuluyor
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof ColorPointInherit))
            return false;
        return super.equals(obj) && ((ColorPointInherit)obj).color == color;
    }

//  burada da yukarida bahsettigimiz gibi Transitive(donusumluluk) boz
    //    @Override public boolean equals(Object o) {
//        if (!(o instanceof Point))
//            return false;
//
//        // If o is a normal Point, do a color-blind comparison
//        if (!(o instanceof ColorPoint))
//            return o.equals(this);
//
//        // o is a ColorPoint; do a full comparison
//        return super.equals(o) && ((ColorPoint) o).color == color;
//

    //extend ettigimizde equals oi surdurulebilir yapmak mumkun degil
    //kitapta bundan dolayi extend etmeyin gidin component olarak verin diyor yani inject edin ve constructorda da olusturun diyor
    //bu sayede genel yazdiginiz equals metodu dogru calisacaktir diyor
    public static void main(String[] args) {
        //Simetri kurali
        Point p = new Point(1,2);
        ColorPointInherit cp = new ColorPointInherit(1,2,Color.RED);
        System.out.println(p.equals(cp) + " " + cp.equals(p) );

        //Transitivity
        ColorPointInherit p1 = new ColorPointInherit(1,2,Color.RED);
        Point p2 = new Point(1,2);
        ColorPointInherit p3 = new ColorPointInherit(1,2,Color.BLACK);
        System.out.printf("",p1.equals(p2) , p2.equals(p3) , p1.equals(p3));
    }
}
