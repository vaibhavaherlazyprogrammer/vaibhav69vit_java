import java.util.Scanner;

public class HRJ10 {
    public static int B;
    public static int H;
    private static boolean flag=false;

    static{
        Scanner sc=new Scanner(System.in);
        B=sc.nextInt();
        H=sc.nextInt();
        if(B>0 && H>0)
        {
            flag=true;
        }
        else
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
}
