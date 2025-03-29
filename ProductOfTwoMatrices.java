import java.util.Scanner;
public class ProductOfTwoMatrices
{
  void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Elements Of The First Matrix !");
    int arr[][]=new int[4][4];
    for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
    arr[i][j]=sc.nextInt();
    }
    }
    //Display Original !
    System.out.println("The Original Matrix For The First One !");
    for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
    System.out.print(arr[i][j]+" ");
    }
    System.out.println(" ");
    }
    System.out.println("Enter The Elements Of The Second  Matrix !");
    int arr1[][]=new int[4][4];
    for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
    arr1[i][j]=sc.nextInt();
    }
    }
    //Display Original !
    System.out.println("The Original Matrix For The Second One !");
    for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
    System.out.print(arr1[i][j]+" ");
    }
    System.out.println(" ");
    }
    //Multiply !
    int c[][]=new int [4][4];
    System.out.println("The Product Of The 2 Matrices Is !");
    for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
    c[i][j]+=arr[i][j]*arr1[i][j];
    }
    }
    System.out.println("The Product Of The Matrices Will Be !");
    for(int i=0;i<4;i++){
    for(int j=0;j<4;j++){
    System.out.print(c[i][j]+" ");
    }
    System.out.println(" ");
    }
    }
}