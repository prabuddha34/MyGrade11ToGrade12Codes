import java.util.*;
public class DeletionOfWord
{
  void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The String !");
    String str=sc.nextLine();
    StringTokenizer st=new StringTokenizer(str);
    System.out.println("Enter The Word To Delete !");
    String delete=sc.nextLine();
    int count=st.countTokens();
    String arr[]=new String[count];
    for(int i=0;i<arr.length;i++){
    arr[i]=st.nextToken();
    }
    for(int i=0;i<arr.length;i++){
    if(delete.equalsIgnoreCase(arr[i])==true){
        System.out.print(" ");
    }
    else{
    System.out.print(" "+arr[i]+" ");
    }
    }
    }
}
