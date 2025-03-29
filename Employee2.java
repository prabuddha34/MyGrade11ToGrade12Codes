
public class Employee2
{
  double empNo;
  String empName,empDesig;
  Employee2(double eno,String ename,String edesig){
    eno=empNo;
    ename=empName;
    edesig=empDesig;
    }
    void display(){
    System.out.println("The Employee Details ");
    System.out.println("The Employee Number"+" "+empNo);
    System.out.println("The Employee Name"+" "+empName);
    System.out.println("The Employee Designation"+" "+empDesig);
    }
}
