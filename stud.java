class stud
{
    String n;
    int num;
    String b;
    static int count;
    static int nextcount=1000;
    public stud(String Name,int Number,String Branch)
    {
        n=Name;
        num=Number;
        b=Branch;
        this.count=nextcount++;
        
    }
    void display()
    {
        System.out.println("Hi "+n+" Your Registration Id is D"+count);
    }
    public static void main(String args[])
    {
        stud a1=new stud("Rohit",898765432,"Computer");
        a1.display();
        stud a2=new stud("Sayali",898765432,"Computer");
        a2.display();
    }
}