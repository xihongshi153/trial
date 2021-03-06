import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class list {
    public static void main(String[] args) {
        List<String> all = new ArrayList<String>();
        all.add("hello");
        all.add("-");
        all.add("would");
        ListIterator<String> iter= all.listIterator();
        System.out.println("由前向后输出：");
        while(iter.hasNext()){
            String str=iter.next();
            System.out.print(str+"、");
            iter.set("LI_"+str);
        }
        System.out.println("\n有后向前输出");
        iter.add("LXH");
        while(iter.hasPrevious()){
            String str=iter.previous();
            System.out.print(str+"、");
        }
    }
}
