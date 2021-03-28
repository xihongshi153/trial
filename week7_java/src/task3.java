import java.util.HashMap;

public  class task3{
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(int j:map.keySet()){
            if(map.get(j) == 1){
                sum += j;
            }
        }
        return sum;
    }
}