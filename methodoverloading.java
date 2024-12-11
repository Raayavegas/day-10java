class Main{
    static void a()
    {
        System.out.println("hello");
    }
    static void a(int b)
    {
        System.out.println("hello "+b);
    }
    static void a(int a,int c,String h)
    {
        System.out.println("hello"+" "+a +" "+ c+" "+h);
    }
public static void main(String args[])
{
    a();
    a(6);
    a(3,4,"jack");
}
}