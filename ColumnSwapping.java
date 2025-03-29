import java.util.Scanner;
public class ColumnSwapping
{
  void main(){
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[4][4];
    System.out.println("Enter The Elements !");
    for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
    arr[i][j]=sc.nextInt();
    }
    }
    //Display The Original Array  !
    System.out.println("Original Array !");
    for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
    System.out.print(arr[i][j]+" "); 
    }
    System.out.println(" ");
    }
    //Swapping !
  int temp;
        for (int i = 0; i < arr[0].length; i++) {
            temp = arr[0][i];
            arr[0][i] = arr[i][3];
            arr[i][3] = temp;
        }
    System.out.println(" The Output Will Be ! ");
    for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
    System.out.print(arr[i][j]+" ");
    }
    System.out.println(" ");
    }
    }
}
