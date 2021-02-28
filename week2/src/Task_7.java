public class Task_7 {

    public static void main(String[] args) {
        Duck duck = new Duck("鸭子","发烧",2,"感冒");
        System.out.println(duck.showMsg());
    }
}
abstract class Poultry{
    private String name;
    private String symptom;
    private int age;
    private  String illness;
    public Poultry(){};
    public Poultry(String name, String symptom, int age, String illness){
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }
    public abstract void showSymptom();


    public String  showMsg(){
        return
                "动物种类：" + name + ", 年龄：" + age +"岁"+"\n"+
                "入院原因:" + illness +"\n"+
                "症状为" + symptom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSymptom() {
        return symptom;
    }

    public String getName() {
        return name;
    }

    public String getIllness() {
        return illness;
    }

    public int getAge() {
        return age;
    }
}
class Duck extends Poultry{
    public Duck(){};
    public Duck(String name, String symptom, int age, String illness) {
        super(name, symptom, age, illness);
    }
    public void showSymptom(){
        System.out.println(getSymptom());
    }


}