import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            String b = sc.next();
            //String f = Integer.toString(b);
            int ans = Integer.parseInt(b,2);
            System.out.println(Integer.toString(ans,8));
        }
        
    }
}