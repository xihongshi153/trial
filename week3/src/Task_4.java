import java.util.Scanner;
import java.util.*;

public class Task_4 {
    public static void main(String[] args) {
        //wordCount（用 hashMap 实现）
        //输入一串由英文单词组成的字符串，现在需要统计出每个英文字母出现的频数。
        Scanner in = new Scanner(System.in);
        String str=in.nextLine();
        Map<Character,Integer> map= wordCount(str);
        for(Character character:map.keySet()){
            System.out.println(character+":"+map.get(character));
        }
    }
    public static Map<Character,Integer> wordCount(String str){
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else {
                int count=map.get(str.charAt(i));
                map.put(str.charAt(i),count+1);
            }
        }
        return map;
    }
}
