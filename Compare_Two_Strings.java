import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String e = sc.nextLine();
        if(s.equals(e)==true){
            System.out.print("Strings are Equal");
        }
        else{
            System.out.print("Strings are not Equal");
        }
    }
}