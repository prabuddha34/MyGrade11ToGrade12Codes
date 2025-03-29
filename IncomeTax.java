public class IncomeTax extends Employee
{
    double da,hra,gross=0,ansal,tax,scharge=0;
    void calculate(){
    da=basic*0.5;
    hra=basic*0.15;
    gross=basic+da+hra;
    }
    void compute(){
    if(ansal<=250000)
    tax=0;
    if(ansal>250000 && ansal<=500000)
    tax=(ansal-250000)*0.1;
    if(ansal>500000 && ansal<=1000000)
    tax=(ansal-500000)+5000;
    if(ansal>=1000000){
    tax=(ansal-1000000)*0.1;
    scharge=(ansal-1000000)*.1;    
}

}
void display(){
super.showdata();
System.out.println("DA"+" "+da);
System.out.println("HRA"+" "+hra);
System.out.println("Gross Salary "+" "+gross);
System.out.println("Income tax"+" "+tax);

}

}
