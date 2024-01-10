import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int i,a,b,c;
        for(i=0;i<t;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(a+b<c||b+c<a||c+a<b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}