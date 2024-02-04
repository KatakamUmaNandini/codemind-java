import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.print((z-y)/x);
    }
}