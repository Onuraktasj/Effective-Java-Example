package item09;

import java.io.*;
import java.util.Scanner;

public class Item09Test {

    private static final int BUFFER_SIZE = 0;

    static  String firstLineOfFile(String path, String defaultVal) throws IOException{

        BufferedReader br = new BufferedReader(new FileReader(path));

        try{
            return br.readLine();
        }catch (IOException e){
            return defaultVal;
            //burada tekrar bir try yazmam gerekseydi gene bir finally daha yazacaktim bu da okumayi zorlastirirdi 2. cozumde bunu ortadan kaldirdik
        }finally {
            br.close();
        }
    }


    //2
    static String firstLineOfLineWell(String path, String defaultVal){
        try (BufferedReader br = new BufferedReader(new FileReader(path))){ // yukaridaki okuma isleminin aynisi try in icerisine aliyoruz
            //bu sefer finally i yazmaktan kurtuldum
            //ilk avantaj bu finally yazmaya gerek kalmadan sizin icin dosya kapaniyor
                return br.readLine();
        }catch (IOException e){
            return defaultVal;
        }
    }


    //3
    static void   copy(String src, String dst) throws IOException{
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)){//iki farkli islemi tek bir try icerisinde yazdik ve iki kere finally yazmaktan kurtulduk

            byte[] buf = new byte[BUFFER_SIZE];
            int n;
                while ((n = in.read(buf))>=0)
                    out.write(buf,0,n);

        }

    }

    public static void main(String[] args) {



        // try-catch-finally
//		Scanner scanner = null;
//		try
//		{
//		    scanner = new Scanner(new File("D:\\FS\\Learning\\E book\\effective-java\\src\\main\\java\\com\\effectivejava\\tutorial\\effectivejava\\item8\\test.txt"));
//		    while (scanner.hasNext())
//		    {
//		        System.out.println(scanner.nextLine());
//		    }
//		}
//		catch (FileNotFoundException e)
//		{//bu exceptioni burada yakalayabildim ama bur ust blokta bir exception durumu olsaydi bunu kacirabilirdim
//		    e.printStackTrace();
//		}
//		finally
//		{
//		    if (scanner != null)
//		    {
//		    	System.out.println("Hello");
//		        scanner.close();
//                //meselada burada bir exception aldik bu sefer de yukarida yasanan bir exception durumunu burasi kesecek (ezecek)
//		    }
//		}

		// try-with-resources - try(Resources)
//		try (Scanner scanner2 = new Scanner(new File("D:\\FS\\Learning\\E book\\effective-java\\src\\main\\java\\com\\effectivejava\\tutorial\\effectivejava\\item8\\test.txt")))
//		{
//		    while (scanner2.hasNext())
//		    {
//		        System.out.println(scanner2.nextLine());
//		    }
//		}
//		catch (FileNotFoundException e)
//		{
//			System.out.println("Hello");
//		    e.printStackTrace();
//		}




        // 2
		try
		{
			int data = 25 / 0;
			System.out.println(data);
            //buradaki exceptioni handler edemedim
		}
		catch (NullPointerException e) {System.out.println("Ali");}
		finally
		{// burada firlatilan exception ilk atilan exceptioni ezdi onu yakalayamadim
            System.out.println("Burasi calisti");
			int data = 25 / 0;
			System.out.println("Ben hep çalışırım");
		}




        // Try catch Finaly!

//		try
//		{
//			int data=25/5;
//			System.out.println(data);
//		}
//		catch(NullPointerException e){System.out.println(e);}
//		finally{System.out.println("Ben hep çalışırım");}



        try
        {
            int data = 25 / 0;
            System.out.println(data);
        }
        catch (ArithmeticException e) {System.out.println(e);}
        finally
        {
            //int data = 25 / 0;
            System.out.println("Ben hep çalışırım");
        }



    }
}
