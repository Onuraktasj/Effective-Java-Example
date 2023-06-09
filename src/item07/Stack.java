package item07;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

    private Object [] elemnts;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public void finalize(){
        System.out.println("Copler temizlendi");
    }

    public Stack(){
        //elemts arrayini olustrurken bu kadar size veriyor
        elemnts = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    //stack e ekleme isleme
    public void push(Object e){
        ensureCappacity();
        elemnts[size++] = e;
    }

    //stack den cikarma islemi (stack e son giren ilk cikar)
    public Object pop () {
        if (size == 0)
            throw new EmptyStackException(); // array bos ise bir sey alamam
            return elemnts[--size];//burada ise ornegin 7 elemanim var bana bir en son gireni donme diyorum yani 6 eleman donuyor
        //kalan bir elemanin referansina ise referansin eski kalmasi deniyor
    }

    public Object popWell(){
        //burada yaptigimiz islem yukaridaki duruma gore soyle;
        //aldigim 6 elemani yeni bir nesneye atadim ve eski arrayi null a cektim boylelikle bosta eski bir referans kalmadi
        //yani burada garbage collection in calisabilecegi bir ortam yarattik
        //UNUTMA statickleri GC temizleyemez  video da cok guzel bir ornek var spring ile mutlaka bak tekrardan
        if (size == 0)
            throw new EmptyStackException();
        Object result = elemnts[--size];
        elemnts[size] = null;

        return result;
    }

    private void ensureCappacity(){
        //eger arrayimizde yer yoksa git size ini bu sekilde arttir diger elemanlari da ekle
        if (elemnts.length == size){
            elemnts = Arrays.copyOf(elemnts,2 * size + 1);
        }
    }
}
