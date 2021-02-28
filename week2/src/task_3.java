import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入字符str=");
        String str=in.nextLine();
        char[] cha=str.toCharArray();
        for (int i = 0; i < cha.length-1; i++) {
            if(cha[i]<'9'&&cha[i]>'0')
                System.out.println(cha[i]);
        }
    }
}
