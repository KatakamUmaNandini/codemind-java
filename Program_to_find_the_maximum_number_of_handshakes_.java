import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a==2){
            System.out.print(1);
        }
        else{
            System.out.print((a*(a-1))/2);
        }
    }
}