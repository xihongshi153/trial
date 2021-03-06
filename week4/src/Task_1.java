import java.util.Scanner;

public class
Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1=in.nextLine();
        String s2=in.nextLine();
        int flag=-1;
        for(int i=0;i<=s1.length()-s2.length();i++){
            if(s2.equals(s1.substring(i,i+s2.length()))){
                flag=i;
            }
        }
        System.out.println(flag);
    }
}
