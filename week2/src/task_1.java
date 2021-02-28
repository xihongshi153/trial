import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("请输入N");
        n=in.nextInt();
        int[][] list_1=new int[n][n];
        for(int i=0;i<n;i++){
            System.out.println("请输入第"+(i+1)+"行");
            for(int j=0;j<n;j++){
                list_1[i][j]=in.nextInt();
            }
        }
        int[][] list_2=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list_2[j][n-i-1]=list_1[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(list_1[i][j]+" ");
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                System.out.print(list_2[i][j]+" ");
            }
        }

    }
}
