import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Task_4 {
    public static void main(String[] args) {
        int[] list={1,2,5,9,5,9,5,5,5};
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:list){
            map.put(i,0);
        }
        for(int i:list){
            map.put(i,map.get(i)+1);
        }

        Collection<Integer> l=  map.values();

        int max= 0;
        for(Integer num:l){
            if(num>max){
                max=num;
            }
        }
        int key=0;
        for (int get_key:map.keySet()
             ) {
            if(map.get(get_key)==max){
                key=get_key;
            }
        }
        if(max>map.size()){
            System.out.println(key+"");
        }
        else{
            System.out.println(-1);
        }
    }
}
