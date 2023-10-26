import java.util.Scanner;

public class HRJ16 {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest =s.substring(0,k);
        String largest =s.substring(0,k);
        for (int i=0;i<=s.length()-k;i++)
        {
            String temp=s.substring(i,i+k);
            if(temp.compareTo(smallest)<0)
            {
                smallest=temp;
            }
            if(temp.compareTo(largest)>0)
            {
                largest=temp;
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'        
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
