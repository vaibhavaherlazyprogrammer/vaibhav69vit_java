public class palindrome 
{
    public static String rev="";
    public static void main(String args[])
    {
        String s1="madam";
        int len=s1.length();
        for(int i=len-1;i>=0;i--)
        {
            rev=rev+s1.charAt(i);
        }
        if(s1.equals(rev))
            {
                System.out.println("Palindrome");
            }
            else
            {
                System.out.println("Not Palindrome");
            }
    }
}
