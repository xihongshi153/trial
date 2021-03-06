import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        int[] list=new int[26];
        for (int a:list
             ) {
            a=0;
        }
        for (int i = 0; i < str.length(); i++) {
            list[str.charAt(i)-'a']++;
        }
    }
}
