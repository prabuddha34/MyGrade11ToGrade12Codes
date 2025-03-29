public class Sales extends Representative
{
  int bno,qty;
  double pr,sales;
  String pname;
  Sales(String nn,String ad,int b,int q,double p,double s,String pn){
      super(nn,ad);
      bno=b;   
      qty=q;
      pr=p;
      s=0;
      pname=pn;
    }
    void cal(){
    System.out.println("The Sale Of The Product !");
    sales=(qty*pr);
    }
    void display(){
    super.display();
    System.out.println("The Product Name"+" "+pname);
    System.out.println("The Bill Number "+""+bno);
    System.out.println("The Quantity Number"+" "+qty);
    System.out.println("The Store Price"+" "+pr);
    System.out.println("The Sale"+""+sales);
    }
}
