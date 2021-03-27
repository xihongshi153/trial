import java.util.Stack;

public class task2 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int length = pushed.length;
        Stack<Integer> stack = new Stack<>();
        int index=0;
        for (int i : pushed) {
            stack.push(i);
            while (!stack.isEmpty() && index<length && stack.peek()==popped[index]){
                stack.pop();
                index++;
            }
        }
        return index==length;
    }
}
