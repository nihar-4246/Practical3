package Nihar;
interface P
{
    final int p=5;
    void dispP();
}
interface P1 extends P
{
    final int p1=10;
    void dispP1();
}
interface P2 extends P
{
    final int p2=20;
    void dispP2();
}
interface P12 extends P1,P2
{
    final int p12=12;
    void dispP12();
}
class P3_3 implements P12
{
    public void dispP()
    {
        System.out.println("dispP : "+p1);
    }
    public void dispP1()
    {
        System.out.println("dispP1 : "+p2);
    }
    public void dispP2()
    {
        System.out.println("dispP2 : "+p12);
    }
    public void dispP12()
    {
        System.out.println("dispP12 : "+p);
    }

}