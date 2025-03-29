import java.util.Scanner;
public class CountOfVowelsIStartingWithVowel
{
   void accept(){
       int c=0,c1=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The String");
    String str=sc.nextLine().toUpperCase();
    if(str.charAt(0)=='A'||str.charAt(0)=='E'||str.charAt(0)=='I'||str.charAt(0)=='O'||str.charAt(0)=='U'){
     c1=1;
    }
    for(int i=0;i<str.length()-1;i++){
    if(str.charAt(i)==' '){
    if(str.charAt(i+1)=='A'||str.charAt(i+1)=='E'||str.charAt(i+1)=='I'||str.charAt(i+1)=='O'||str.charAt(i+1)=='U'){
        c++;
    
    }
    }
    }
    System.out.println("The Number Of Starting With Vowels !"+" "+(c1+c));
    }
}
