import java.util.Arrays;

public class java_task {
    public static void main(String[] args) {
        int[] num={5,6,3,5,96,7,8,9,4,1,65,4,25,4,5,55,5};
        System.out.println(Arrays.toString(charu(num)));

    }
    public static int[] maopao(int[] num){
        int n=num.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1-i ; j++) {
                if(num[j]>num[j+1]){
                    int t=num[j];
                    num[j]=num[j+1];
                    num[j+1]=t;
                }
            }
        }
        return num;
    }
    public static int[] charu(int[] num){
        int n=num.length;
        for (int i = 1; i < n; i++) {
            int key=num[i];
            for (int j = i; j > 0; j--) {
                if(key<num[0]&&j==1){
                    num[j]=num[0];
                    num[0]=key;
                    break;
                }
                if(key<num[j-1]) {
                    num[j] = num[j - 1];
                }
                if(key>num[j-1]){
                    num[j]=key;
                    break;
                }
            }
        }
        return num;
    }
}

