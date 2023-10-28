import java.io.*;
import java.util.*;

public class javastringtoken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] tk=s.split("[^a-zA-Z]");
        int store=0;
        for(int i=0;i<tk.length;++i)
        {
            if(tk[i].length()>0)
            store++;
        }
        System.out.println(store);
        for(int i=0;i<tk.length;++i)
        {
            if(tk[i].length()>0)
            {
                System.out.println(tk[i]);            
            }
        }
        
        scan.close();
    }
}

