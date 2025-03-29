public class Salary extends Employee2
{
   float basic;;
   double da,hra,sal,pf,net;
   Salary(double eeno,String enn,String eed,float b){
    super(eeno,enn,eed);
    basic=b;
    }
    void calculate(){
     da=(0.1*basic);
     hra=(0.15*basic);
     sal=basic+da+hra;
     pf=(0.08*basic);
     net=sal-pf;
    }
    void display(){
    super.display();
    System.out.println("DA"+" "+da);
    System.out.println("HRA"+" "+hra);
    System.out.println("Salary"+" "+sal);
    System.out.println("PF"+" "+pf);
    System.out.println("Net Salary"+" "+net);
    }
}
