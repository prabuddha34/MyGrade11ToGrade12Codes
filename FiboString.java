import java.util.Scanner;
public class FiboString
{
    String x,y,z;
    int n;
    FiboString(){
    x="a";
    y="b";
    z="ba";
    n=0;
    }
    void accept(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number Of n");
     n=sc.nextInt();
    }
    void generate(){
    for(int i=1;i<=n;i++){
      z= x + y;
            System.out.print(" " + z);
            x = y;
            y = z;
    }
    }
   void main(){
    FiboString ob=new FiboString();
    ob.accept();
    ob.generate();
    } 
}
