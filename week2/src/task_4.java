import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("欢迎来到猜数字游戏，请输入一个数");
        Game game= new Game();
        while(true){
            int num=in.nextInt();
            System.out.println(game.guess(num));
            if(game.guess(num).equals("恭喜你，猜对了！"))
                break;
        }

    }

}
class Game{
    int v=100;
    public String guess(int num){
        if(num>v) return "猜的有点大了，再试一下吧！";
        else if(num<v) return "猜的有点小了，再试一下吧！";
        else  return "恭喜你，猜对了！";

    }
}