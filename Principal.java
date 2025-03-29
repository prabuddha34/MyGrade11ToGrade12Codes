public class Principal extends  Teacher
{
    String t1,t2,t3;
    void sortdata(){
    for(int i=0;i<4;i++){
    for(int j=0;j<4-i-1;j++){
    if(name[j].compareTo(name[j+1])>0){
    t1=name[j];
    name[j]=name[j+1];
    name[j+1]=t1;
    t2=doj[j];
    doj[j]=doj[j+1];
    doj[j+1]=t2;
    t3=dob[j];
    dob[j]=dob[j+1];
    dob[j+1]=t3;
    }
    }
    }
    }
    void display(){
    System.out.println("Names with their date of birth and joinig are  ");
    for(int i=0;i<5;i++){
    System.out.println(name[i]+" "+dob[i]+" "+doj[i]+" ");
    }
    }
    
}
