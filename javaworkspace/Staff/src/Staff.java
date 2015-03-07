/**
 * Created by nimishparikh on 2/1/15.
 */

import java.io.*;
import java.util.*;


public class Staff {
    String CodeName ;

    Staff()
    {
    }

    Staff(String CodeName)
    {
        this.CodeName=CodeName;
    }
    void display()
    {
        System.out.println("Staff codename:"+CodeName);
    }

}
class Teacher extends Staff
{
      String Subject = null;
      String Qualification = null;

    public Teacher() {

    }

    Teacher(String Sub, String Q){
        Subject=Sub;
        Qualification=Q;
    }
    void display()
    {
        System.out.println("Subject:"+Subject+"\t"+"Qualification:"+Qualification);
    }

}

class Typist extends Staff {

    int speed;

    public Typist() {
    }

    Typist(int speed)
    {
        this.speed=speed;
    }

    void display()
    {
        System.out.println("Typist speed:"+speed);
    }
}

class Officer extends Staff {

    char grade;

    public Officer() {
    }

    Officer(char grade)
    {
        this.grade=grade;
    }

    void display()
    {
        System.out.println("Officer grade:"+grade);
    }
}

class Regular extends Typist {

    int Salary;

    public Regular() {
    }

    Regular(int S, int sup)
    {
        super(sup);
        Salary=S;
    }

    void display()
    {
        super.display();
        System.out.println("Regular Salary:"+Salary);
    }

}

class Casual extends Typist {

    float DailyWages;

    public Casual() {
    }

    Casual(float D)
    {
        DailyWages=D;
    }
    void display()
    {
        System.out.println("Casual DailyWages:"+DailyWages);
    }

}

class Imp {

    public static void main(String[]args) {
        //Declaration
        int n;
        Staff CodeName;
        Teacher t;
        Regular Sa;
        Casual ca;
        Officer off;



        char yn;
        do {
             System.out.println("Select the details you want to Enter: \n 1.staff \n 2.Teacher \n 3.Typist \n 4.Officer");
             Scanner sc = new Scanner(System.in);
             n = sc.nextInt();
            switch (n) {
                case 1:System.out.println("Enter CodeName");
                       String c = sc.next();
                       CodeName = new Staff(c);
                       //CodeName.display();
                       break;
                case 2:
                    System.out.println("Enter Subject and Qualification:");
                    String a = sc.next();
                    String b = sc.next();
                    t = new Teacher(a, b);
                    t.display();
                    break;
                case 3:
                    System.out.println("Typist (R/C)?");
                    String ch = sc.next();
                    if (ch == "R" || ch == "r") {
                        System.out.println("Enter typist speed");
                        int sp = sc.nextInt();
                        System.out.println("Enter Salary of Regular Typist:");
                        int sal = sc.nextInt();
                        Sa = new Regular(sal, sp);
                        Sa.display();
                    } else {
                        System.out.println("Enter typist speed");
                        int sp = sc.nextInt();
                        Typist tp = new Typist(sp);
                        System.out.println("Enter DailyWages of Casual Typist:");
                        float sal = sc.nextFloat();
                        ca = new Casual(sal);
                        ca.display();
                    }
                      break;
                case 4:
                    System.out.println("Enter the Grade of Officer");
                    char g = sc.next().charAt(0);
                    off = new Officer(g);
                    off.display();
                            break;
            }
            System.out.println("Do you want to continue adding data? (Y/N)");
            yn = sc.next().charAt(0);
        } while (yn == 'Y' || yn == 'y');








    }


}