import java.util.Scanner;
/**
 * @author (Prabuddha Pal)
 * @version (30th Of June 2024)
 */
public class Representative
{
    String name,address;
    Representative(String ng,String addp){
    name=ng;
    addp=address;
    }
    void read(String n,String add){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Name !");
    n=sc.nextLine();
    System.out.println("Enter The Address !");
    add=sc.nextLine();
    }
    void display(){
    System.out.println("The Details Are !");
    System.out.println("Name"+" "+name);
    System.out.println("Address"+" "+address);
    }
}
