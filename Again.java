import java.util.Scanner; 
public class Again
{
   Scanner sc=new Scanner(System.in);
   void main(){
    System.out.println("Enter The Ampunt !!");
    int amt=sc.nextInt();
    int store[]=new int[100];
    String arr[] = {"Zero", "One", "Two", "Three", "Four", "Five", 
                        "Six", "Seven", "Eight", "Nine"};
                        int rem,index=0;
                        
                        while(amt!=0){
                        rem=amt%10;
                        store[index]=rem;
                        amt=amt/10;
                        index++;
                        
    }
    for(int i=index-1;i>=0;i--){
     System.out.print(arr[store[i]] + " ");
    }
    System.out.println(" ");
    
    }
}
