import java.util.Scanner;
public class LoweTraingularMatrix
{
   Scanner sc=new Scanner(System.in);
 void main(){
 System.out.println("Enter The Siize Of The Array !");
 int s=sc.nextInt();
 int arr[][]=new int[s][s];
 System.out.println(" ENTER The Elements !");
 for(int i=0;i<s;i++){
    for(int j=0;j<s;j++){
    arr[i][j]=sc.nextInt();
    }
    }
    //Display   Original !
    
    System.out.println("The Original Array !");
    for(int i=0;i<s;i++){
    for(int j=0;j<s;j++){
    System.out.print(arr[i][j]+" ");
    }
    System.out.println(" ");
    }
    System.out.println("The Left Diagonal Array Of The Thing");
      int sum4 = 0;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                if (i < j) {
                    sum4 = sum4 + arr[i][j];
                    System.out.print(sum4  + " ");
                }
            }
  }
  if(sum4==0)
  System.out.println("It Is A Lower Traingular Matrix !");
  else
  System.out.println("LOL its not that ");
}
}
