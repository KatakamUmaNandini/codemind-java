import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(y<=x*5){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}