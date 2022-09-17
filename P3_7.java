package Nihar;
interface P3_7
{
    // abstract method
    public void square(int a);

    // default method
    default void show()
    {
        System.out.println("Default Method Executed");
    }
}
class P3_7main implements P3_7
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }

    public static void main(String args[])
    {
        P3_7main d = new P3_7main();
        d.square(4);

        // default method executed
        d.show();
        System.out.println("This program is made by 21CE100");
    }
}