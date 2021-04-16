import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.*;
//找出1000个数中重复次数最多的10个
public class task_1 {
    static int[] nums=new int[]{1,2,5,6,1,2,3,5,9,9,9,5,6,3,3,5,11,12,
            12,12,5,6,1,3,3,7,7,8,9,12,15,11,22,23,
            23,12,5,32,11,1,2,7,3,7,6,9,5,8,2,3,11,
            13,15,19,19,22,13,12,17,19,18,5,6,1,22,
            12,1,5,2,19,9,1,15,13,17,1,7,13,6,5,19};
    public static void main(String[] args) {
        System.out.println(findRepeatNumber(nums));
    }

    public static List<Integer> findRepeatNumber(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else {
                int count = map.get(nums[i]);
                map.put(nums[i],++count);
            }
        }

        //对map进行排序：按照value从大到小排
        List<Map.Entry<Integer, Integer>> entries=new ArrayList<>(map.entrySet());
        entries.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();//倒序排序
            }
        });

        List<Integer> res=new ArrayList<>();
        int index=0;
        for (Map.Entry<Integer, Integer> entry : entries) {
            if(index++<10) {
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
