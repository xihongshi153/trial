import java.util.Scanner;
class Account {
    String name;
    double money;

    public void setAccount(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public void show()
    {
        System.out.println("账户名称：" + name + ",账户余额：" + money);
    }
}
public class task_6 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("请输入账户名称。");
        String name = in.nextLine();
        System.out.println("请输入余额。");
        double money = in.nextDouble();
        Account aco = new Account();
        aco.setAccount(name,money);
        aco.show();
    }
}
