import java.util.Scanner;
public class Hai{
    public static void main(String atds[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a/365);
        System.out.println((a%365)/7);
    }
}