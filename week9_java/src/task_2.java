public class task_2 {

    public static void main(String[] args) {

        System.out.println(Fun(17,10));
    }

    public static int Fun(int m,int n){
        int[] list=new int[n+3];
        for(int i = 0; i < n; i++) {
            list[i]=i;
        }
        int k=-1;
        int num=0;
        for(int i=0;;i++){
            if(k>=n-1){k=k-n;}
            k=k+1;
            if(num==n-1){break;}
            while (list[k]==-1){k=k+1;}
            if(i==m-1){list[k]=-1;i=-1;num++;}
        }
        int last=-1;
        for (int i = 0; i < n; i++) {
                if(list[i]!=-1){
                    last=list[i];
                }
        }
        return last;
    }
}
