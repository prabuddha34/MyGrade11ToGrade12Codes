public class Library
{
    String name;
    String author;
    double p;
    Library(String nm,String a,double price){
    name=nm;
    author=a;
    p=price;
    }
    void show(){
    System.out.println("Name Of The Book !"+" "+name);
    System.out.println("Name Of The Author !"+" "+author);
    System.out.println("Price Of The Of The Book !"+" "+p);
    } 
}
