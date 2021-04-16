import java.util.HashSet;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashSet<String> set=new HashSet<String>();
        StringBuffer str=new StringBuffer(in.nextLine());
        for(int i=1;i<str.length()+1;i++){
            Fun(set,str,i);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
    public static void Fun(HashSet set,StringBuffer str,int n){

        if(n!=0&&n!=str.length()){
            for(int i=n;i<str.length()+1;i++){
                set.add(str.substring(i-n,i));
            }
        }
        if(n==str.length()){
            set.add(str);
        }
  }
}
