import java.util.Scanner;
public class MyArray
{
Scanner sc=new Scanner(System.in);
int n;
int arr[]=new int[5];
MyArray(int nm){
    for(int i=0;i<n;i++){
    arr[i]=0;
    }
    n=nm;
}
void readArray(){
System.out.println("Enter The Elements !");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
}
void display(){
System.out.println("The Original Array !");
for(int i=0;i<n;i++){
System.out.println(" \t"+""+arr[i]);
}
}
void sort(){
/**
 * Sort The Array 
 * For Binary Searching !
 */
int t=0;
for(int i=0;i<n-1;i++){
for(int j=0;j<n-1-i;j++){
if(arr[j]>arr[j+1]){
    t=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=t;
}
}
}
System.out.println("The Sorted Array In The Asecending Order Is"+" ");
for(int i=0;i<n;i++){
System.out.println(arr[i]+" \t");
}
}
int binarySearch(int value) {
    int lb = 0, ub = n - 1;
    int mid;
    int flag = 0;
    
    while (lb <= ub) {
        mid = lb + (ub - lb) / 2; 
        
        if (arr[mid] == value) {
            flag = 1;
            break; 
        } else if (arr[mid] < value) {
            lb = mid + 1;
        } else {
            ub = mid - 1; 
        }
    }
    
    if (flag == 1)
        return 1; 
    else
        return -999; 
}
void main(){
    System.out.println("Enter The Value Of n");
    int x=sc.nextInt();
MyArray ob=new MyArray(x);
ob.readArray();
ob.display();
ob.sort();
      System.out.println("Enter The Value To Search");
        int p = sc.nextInt();
        int get = ob.binarySearch(p);
if(get==1)
System.out.println("The Value Is Present !");
else
System.out.println("The Value Is Not Present !");
} 
}