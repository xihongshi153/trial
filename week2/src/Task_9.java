public class Task_9 {
    public static void main(String[] args) {

        Star star=new Star();
        star.shine();
        System.out.println("===========");
        Universe Uni=new Sun();
        Uni.doAnything();
        Sun sun=(Sun)Uni;
        sun.shine();

    }
}
interface Universe{
     void doAnything();
}
class Star{
    public void shine(){
        System.out.println("star:星星一闪一闪亮晶晶");
    }
}
class Sun extends Star implements Universe{
    @Override
    public void doAnything(){
    System.out.println("sun:太阳吸引着9大行星旋转");
}
    @Override
    public void shine(){
    System.out.println("sun:光照八分钟");
}

}