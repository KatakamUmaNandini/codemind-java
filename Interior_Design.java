import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((x+y)<(a+b)){
            System.out.println(x+y);
        }
        else{
            System.out.println(a+b);
        }
    }
}