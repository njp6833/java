/**
 * Created by nimishparikh on 2/7/15.
 */
import java.util.*;
import java.io.*;

public class Palidrome {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
        String word = "";
        System.out.println("enter a string:");
        word = sc.next();



        String rev=word;
        StringBuilder sb = new StringBuilder(rev);

        rev = sb.reverse().toString();


        if(word.equals(rev))
        {
            System.out.println("p");
        }





    }

}
