import java.util.Scanner;
public class Innermost_Elements_Array
{
Scanner sc=new Scanner(System.in);
int m,n;
int arr[][]=new int[m][n];
void input(){
System.out.println("Enter The Value Of M is");
m=sc.nextInt();
System.out.println("Enter The Value Of N Is");
 n=sc.nextInt();
 arr=new int[m][n];
}
void array(){
System.out.println("Enter The Elements !");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
arr[i][j]=sc.nextInt();
} 
}
}
void displayoriginalarray(){
System.out.println("The Original Array !");
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println(" ");
}
}
void process(){
int innM=m-2;
int innN=n-2;
System.out.println("The Innermost Element Is"+" ");
for(int i=1;i<=innM;i++){
for(int j=1;j<=innN;j++){
System.out.print(arr[i][j]+" ");
}
System.out.println(" ");
}
}
void main(){
Innermost_Elements_Array ob=new Innermost_Elements_Array();
ob.input();
ob.array();
ob.displayoriginalarray();
ob.process();
}
}