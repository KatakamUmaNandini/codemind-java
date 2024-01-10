import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int i,a,b,c=0,co;
        for(i=0;i<t;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            c=0;
            co=0;
            while(c!=a)
            {
                if(c==a)
                {
                    break;
                }
                if(c+b>a){
                    c+=1;
                    co+=1;
                }
                else{
                    c+=b;
                    co+=1;
                }
            }
            System.out.println(co);
        }
    }
}