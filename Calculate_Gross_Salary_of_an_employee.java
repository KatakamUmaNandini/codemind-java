import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float bs = sc.nextFloat();
        float hra = sc.nextFloat();
        float da = sc.nextFloat();
        float pf = (12*bs)/100;
        float gs = bs+hra+da+pf;
        System.out.printf("%.2f
",pf);
        System.out.printf("%.2f",gs);
    }
}