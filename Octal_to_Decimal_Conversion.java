import java.util.Scanner;
import java.lang.Math;
public class Program{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int t;
        double s=0;
        int c=0;
        while(a!=0){
            t=a%10;
            s=s+t*(Math.pow(8,c));
            a=a/10;
            c+=1;
            
        }
        Double y=new Double(s);
        int x=y.intValue();
        System.out.println(x);
    }
}