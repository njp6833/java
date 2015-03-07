
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nimishparikh on 2/6/15.
 */
public class BinaryCode {

    public String[] Method(String take)
    {
        int[] P,Q;

        int c[]=new int[take.length()];
        int de[]=new int[take.length()];
        String zero="",one="";
        String[] ret= new String[2];

        for(int i=0;i<take.length();i++)
        {
                if ((i==0))
                {
                    int a = Integer.parseInt(String.valueOf(take.charAt(i + 1)));
                    int b = Character.getNumericValue(take.charAt(i));
                    c[i] = a - b;

                }
                else if ((i ==take.length()-1))
                {
                    int a = Integer.parseInt(String.valueOf(take.charAt(i)));
                    int b = Character.getNumericValue(take.charAt(i - 1));
                    c[i] = a - b;


                }
                else
                {
                    int a = Integer.parseInt(String.valueOf(take.charAt(i)));
                    int b = Character.getNumericValue(take.charAt(i - 1));
                    int d = Character.getNumericValue(take.charAt(i + 1));
                    c[i] = d - a - b;

                }
                if (c[i] >1 || c[i] < 0) {
                    zero = "NONE";
                    break;
                }
            }

        for(int i=0;i<take.length()  ;i++)
        {
                if (i==0) {
                    int a = Integer.parseInt(String.valueOf(take.charAt(i + 1)));
                    int b = Character.getNumericValue(take.charAt(i));
                    de[i] = a-b-1;
                } else if (i ==take.length()-1) {
                    int a = Integer.parseInt(String.valueOf(take.charAt(i)));
                    int b = Character.getNumericValue(take.charAt(i - 1));
                    de[i] = 1-a - b;

                } else {
                    int a = Integer.parseInt(String.valueOf(take.charAt(i)));
                    int b = Character.getNumericValue(take.charAt(i - 1));
                    int d = Character.getNumericValue(take.charAt(i + 1));
                    de[i] = d - a - b;
                }
            if (de[i] >1 || de[i] < 0) {
                one = "NONE";
                break;
            }

        }

        if(zero!="NONE"){
            zero = Arrays.toString(c);


        }
        if(!one.equals("NONE"))
            one = Arrays.toString(de);

        ret[0] = zero;
        ret[1]=one.replaceAll("//w","");

        return (ret);
    }





    public static void main(String[] args) {
        {
            BinaryCode code = new BinaryCode();
            String number;
            System.out.println("Enter the String:");
            Scanner sc = new Scanner(System.in);
            number = sc.nextLine();
            String[] print = code.Method(number);
            System.out.println(print[0]+","+print[1]);
        }
    }
}
