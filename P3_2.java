package Nihar;
import java.util.Scanner;
interface IPrinter
{
    void displayPersonalDetails();
    void displayJobDetails();
}
interface IScanner
{
    void getPersonalDetails();
    void getJobDetails();
}
class P3_2 implements IPrinter , IScanner
{
    String name;
    String address;
    String city;
    String companyName;
    double salary;
    //creating object of scanner class
    Scanner object=new Scanner(System.in);
    public void getPersonalDetails()
    {
        System.out.println("Enter Name:");
        name=object.nextLine();
        System.out.println("Enter Address:");
        address=object.nextLine();
    }
    public void getJobDetails()
    {
        System.out.println("Enter Company Name:");
        companyName=object.nextLine();
        System.out.println("Enter Salary:");
        salary=object.nextInt();
    }
    public void displayPersonalDetails()
    {
        System.out.println("Your Name : "+name);
        System.out.println("Your Address : "+address);
    }
    public void displayJobDetails()
    {
        System.out.println("Company Name : "+companyName);
        System.out.println("Salary : "+salary);
    }
}