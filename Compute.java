 class Compute extends Library{
 int d;
 double f;
 Compute(String n,String au,double prc,int dy){
    super(n,au,prc);
    d=dy;
    f=0.0;
    }
    void fine(){
    if(d>7){
    if((d-7)<=5)
    f=2*(d-7);
    if((d-7)>5 && (d-7)<10)
    f=3*(d-7);
    if((d-7)>=10)
    f=5*(d-7);
    }
    }
    void display(){
    super.show();
    System.out.println("Number Of Days taken to return "+" "+d);
    double total=(2/100)*d+f;
    System.out.println("Total Fine To Be Paid"+" "+total);
    }
}
