import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = (a+b)/2;
        System.out.printf("%.4f",c);
        
    }
}