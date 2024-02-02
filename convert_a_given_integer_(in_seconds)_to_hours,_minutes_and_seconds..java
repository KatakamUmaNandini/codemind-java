import java.util.Scanner;
public class Hai{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print("H:M:S-"+ a/3600 +":" + (a%3600)/60 +":"+ ((a%3600)%60));
    }
}