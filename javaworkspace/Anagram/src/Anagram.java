/**
 * Created by nimishparikh on 2/6/15.
 */
import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        String s[]={"CAT","ACT","TAC","TAB"};


        Hashtable<String,ArrayList<String>> ana = new Hashtable<String, ArrayList<String>>();
        ArrayList<String> ar=new ArrayList<String>();
        for (String check:s)
        {
            char key[]=check.toCharArray();
            Arrays.sort(key);
            String r=key.toString();
            if(!ana.containsKey(r))
            {
                ar.add(check);
                ana.put(r,ar);
            }
            else {
                ArrayList<String> index = ana.get(r);
                index.add(check);
                ana.put(r, index);
            }


        }
        System.out.println("Anagrams are :\n"+ana);
    }




}
