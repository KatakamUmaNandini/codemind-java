import java.util.Scanner;
public class Java{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c=0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)==' '){
                c+=1;
            }
        }
        System.out.print(c+1);
    }
}