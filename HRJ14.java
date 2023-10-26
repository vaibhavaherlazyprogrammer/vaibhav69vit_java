import java.util.Scanner;

public class HRJ14 {
     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int i=A.length();
        int j=B.length();
        System.out.println(i+j);
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        
        System.out.print(A.substring(0,1).toUpperCase()+A.substring(1)+" ");
        System.out.println(B.substring(0,1).toUpperCase()+B.substring(1));
    }
}
