/**
 * Created by nimishparikh on 2/2/15.
 */
import java.util.*;
import java.io.*;

public class ArrayL {
    public static void main(String[] args)throws IOException{

        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial length of ArrayList:"+al.size());
        al.add("java");
        al.add("PHP");
        al.add("python");
        al.add(2,"Ruby");
        System.out.println("Elements in the list are:"+al);
        al.remove("PHP");
        al.add("C++");
        al.add("C");
        al.remove(2);
        for (String s : al)
            System.out.print(s + " ");
            System.out.println();
        System.out.println("Index of Ruby:"+al.contains("Ruby"));
        System.out.println("C++ index:"+al.indexOf("C++"));
        Date d = new Date();
        System.out.println("Date is"+d);
        }

    }


