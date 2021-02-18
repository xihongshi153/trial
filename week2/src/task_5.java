
class Monkey{
    Monkey(){}
    public Monkey(String s){

    }
    public void speak(){
        System.out.println("咿咿呀呀。。。");
    }
}
class People extends Monkey{
    public void think(){
        System.out.println("别说话，认真思考");
    }
    @Override
    public void speak(){
        System.out.println("小样的，不错嘛，会说话了");
    }

}
public class task_5 {

    public static void main(String[] args) {
        Monkey mon = new Monkey();
        mon.speak();
        People peo = new People();
        peo.speak();
        peo.think();
    }
}