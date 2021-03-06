import com.sun.deploy.util.StringUtils;

import java.util.HashSet;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        HashSet has=new HashSet();
        String[] list=str.split("");
        for (String c:list
             ) {
            has.add(c);
        }
        String str2= StringUtils.join(has,"");
        System.out.println(str2);
    }
}
