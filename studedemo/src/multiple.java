public class multiple {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Cat cat=(Cat)animal;
        animal.eat();
        cat.catchMouse();
    }
}
 abstract class Animal{
    public void eat(){
    }
 }
 class Cat extends Animal{
    @Override
     public void eat(){
        System.out.println("猫吃鱼");

        }
     public void catchMouse(){
         System.out.println("猫抓老鼠");
    }
 }