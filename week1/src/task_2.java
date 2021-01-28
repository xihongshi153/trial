public class task_2 {
    public static void main(String[] args) {
        int j=0;
        for (int i = 100; i <1000 ; i++) {
            int a=i/100,b=i/10%10,c=i%10;
            if(i==a*a*a+b*b*b+c*c*c)
                j++;
        }
        System.out.println(j);
    }
}
