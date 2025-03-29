import java.util.*;
public class Employee
{
  String name;
  int empcode,basic;
  void getdata(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter The Name Of The Empolyee");
  name=sc.nextLine();
  System.out.println("Enter The Employee Code ");
  empcode=sc.nextInt();
  System.out.println("Enter The Basic Salary ");
  basic=sc.nextInt();
  }
  void showdata(){
    System.out.println("The Name Of The Employee "+" "+name);
    System.out.println("The Employee Code"+" "+empcode);
    System.out.println("The Basic Salary"+" "+basic);
    }
}
