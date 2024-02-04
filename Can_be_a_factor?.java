import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 0 ;i<a;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n==m || 2*n<=m){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}