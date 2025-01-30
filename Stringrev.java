import java.util.Scanner;
public class Stringrev {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string: ");
        String str=sc.nextLine();
        String str1=" ";
        for(int i=str.length();i>=0;i--){
            str1=str1+str.charAt(i);
        }
        sc.close();
        System.out.println("Reversed string is: " +str1);
    }
}