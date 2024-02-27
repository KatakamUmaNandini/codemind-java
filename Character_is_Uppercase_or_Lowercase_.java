import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        if(x>='A' && x<='Z'){
            System.out.println("uppercase alphabet");
        }
        else if(x>='a' && x<='z'){
            System.out.println("lowercase alphabet");
        }
        else{
            System.out.println("not an alphabet");
        }
    }
}