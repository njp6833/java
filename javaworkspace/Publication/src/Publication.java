/**
 * Created by nimishparikh on 1/30/15.
 */
class Publication {
     String title;
     float price;

    Publication() {
        title = "";
        price = 0;
    }

    Publication(String title, float price) {
        this.title = title;
        this.price = price;
    }

    String getTitle() {
        return title;
    }

    Float getPrice() {
        return price;
    }
    void display()
    {
        System.out.print("Book title: " + getTitle() + "\t" + "Price: " + getPrice() + "\t");
    }
}
class Books extends Publication
{
    int pagecount;
    Books()
    {

        pagecount=0;
    }
    Books (int p,String title,float pr)
    {
        super(title,pr);
        pagecount=p;

    }
    int getP()
    {
        return pagecount;
    }
    void display()
    {
        super.display();
        System.out.println("Pagecount: "+pagecount);
    }

}

class Tape extends Publication{
    float mins;
    Tape()
    {
        mins=0;
    }
    Tape(float mins,String title,float pr)
    {
        super(title,pr);
        this.mins=mins;
    }
    float getMin()
    {
        return mins;
    }
    void display()
    {
        System.out.println("Book title: "+getTitle() + "\t" +"Price: "+getPrice()+ "\tMins: "+mins);
    }
}

class P
{
    public static void main(String args[])
    {
        Books b=new Books(10,"nimish",10);
        System.out.println(b.title);
        Tape t=new Tape(60,"manan",20);
        b.display();
        t.display();
    }
}