import java.util.Scanner;

public class java_task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        int i=str.length();
        if(str.charAt(0)=='-') {
            System.out.print('-');
            i--;

        int m=1;
        while(str.charAt(str.length()-m)=='0')
        {
            i--;
            m++;
        }
        for(int j=i;j>0;j--)
            System.out.print(str.charAt(j));
    }
        else {
            int m=1;
            while(str.charAt(str.length()-m)=='0')
            {
                i--;
                m++;
            }
            for(int j=i-1;j>=0;j--)
                System.out.print(str.charAt(j));
        }
    }
}
