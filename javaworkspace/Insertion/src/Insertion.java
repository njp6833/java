import javax.lang.model.element.NestingKind;

/**
 * Created by nimishparikh on 2/19/15.
 */
public class Insertion {

    public static void main(String[] args) {
        int a[]={6,2,4,8,1};
        int j,element =0;
        for(int i=1;i<a.length;i++) {
            element = a[i];
            System.out.println(a[i]);
            for (j=i;j > 0 && a[j - 1]>element;j--)
            {
                System.out.println("Before "+a[j-1]+"\t j-1 "+a[j]);
                a[j]=a[j-1];
                a[j-1]=element;
                System.out.println("After "+a[j-1]+"\t After "+a[j]);
            }

        }
            for(int n : a)
                System.out.print(n+"\t");




    }

}
