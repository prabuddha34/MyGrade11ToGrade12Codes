import java.util.*;
public class MyStyleISC2015_StringQuestion
{
void main(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter The String !");
String str=sc.nextLine();
StringTokenizer st=new StringTokenizer(str);
int count_words=st.countTokens();
String arr[]=new String[count_words];
/*
 * Fill The Array !
 */
for(int i=0;i<arr.length;i++){
arr[i]=st.nextToken();
}
String temp=" ";
for(int i=0;i<arr.length-1;i++){
for(int j=0;j<arr.length-1-i;j++){
if(arr[j].length()>arr[j+1].length()){
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
/**
 * Find The Vowels And Consonants !
 */
System.out.println("Words\t\tVowels Count \t\t Consonant Count ");
for (int i = 0; i < arr.length; i++) {
int vowelCount = 0;
int cons=0;
for (int j = 0; j < arr[i].length(); j++) {
char ch = Character.toUpperCase(arr[i].charAt(j));
if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
vowelCount++;
}
else{
cons++;
}
}
System.out.println(arr[i] + "\t\t" + vowelCount+" "+"\t\t\t\t\t\t "+cons);
        }
    }
}    
   
