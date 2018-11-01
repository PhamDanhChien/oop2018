package week7.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {


    //NullPointerException
    public static void pointer() throws NullPointerException {
        String ch = null;

        System.out.println(ch.length());
    }

    //ArrayIndexOutOfBoundsException
    public static void index() throws ArrayIndexOutOfBoundsException {
        int a[] = new int[5];
        int b = a[7];
    }

    //ArithmeticException
    public static void divzero() throws ArithmeticException {
        int a = 5/0;
    }

    //ClassCastException
    public static void cast() throws ClassCastException {
        Object a = new Integer(1999);
        System.out.println((String) a);
    }

    //IOException
    public static void io() throws IOException {
        throw new IOException();
    }

    //FileNotFoundException
    public static void file() throws FileNotFoundException {

        File fl = new File("C:/chien.txt");
        FileReader file = new FileReader(fl);

    }

    // ham main
    public static void main(String args[]) {

        //pointer
        try{
            pointer();
        }
        catch(NullPointerException a){
            System.out.println("erro: " + a);
        }

        //index erro
        try{
            index();
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("erro: " + a);
        }

        //cast
        try{
            cast();
        }
        catch(ClassCastException a){
            System.out.println("erro: " + a);
        }

        //divzero erro
        try{
            divzero();
        }
        catch(ArithmeticException a){
            System.out.println("erro: " + a);
        }

        //file erro
        try{
            file();
        }
        catch(FileNotFoundException a){
            System.out.println("erro: " + a);
        }

        //io erro
        try{
            io();
        }
        catch(IOException a){
            System.out.println("erro: " + a);
        }

    }
}
