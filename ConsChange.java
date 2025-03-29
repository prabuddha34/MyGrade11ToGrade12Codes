import java.util.Scanner;
public class ConsChange
{
    String word;
    int len;
    ConsChange(){
    word=" ";
    len=0;
    }
    void read(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Word !");
    word=sc.nextLine();
    }
    void swap(){
    /**
     * Prabuddha good boy=arabuddhP doog yob
     * 
     */
    String swapwrd=" ";
       /*add last character of word to swapwrd*/
         swapwrd= swapwrd+word.charAt(len);
        /*add characters between first and last character of word to swapwrd*/
        swapwrd=swapwrd+ word.substring(1,len);
        /*add first character to swapwrd*/
        swapwrd=swapwrd + word.charAt(0);
    }
}
