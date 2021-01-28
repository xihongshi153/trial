import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("输入体重（kg）:");
        float a=in.nextFloat();
        System.out.println("输入身高（m）：");
        float b=in.nextFloat();
        float c=a/b/b;
        if(c<18.5)
            System.out.println("过轻");
        else if(18.5<c&&c<25)
            System.out.println("正常");
        else if(25<c&&c<28)
            System.out.println("过重");
        else if(28<c&&c<32)
            System.out.println("肥胖");
        else System.out.println("非常肥胖");
    }
}
