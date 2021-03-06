public class task_5 {
    public static void main(String[] args) throws TCPException {
        try{
            int i=3/0;
        }catch (Exception e){
            throw new TCPException("发生除零错误");
        }
    }
}
class TCPException extends Exception{
    public TCPException(String str){
        super(str);
    }
}
