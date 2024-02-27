import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        double d,h;
        if(b<=10000){
            d = (b*80)/100;
            h = (b*20)/100;
        }
        else if(b<=20000){
            d = (b*90)/100;
            h = (b*25)/100;
        }
        else{
            d = (b*95)/100;
            h = (b*30)/100;
        }
        double g = b+d+h;
        System.out.printf("%.2f",g);
    }
}