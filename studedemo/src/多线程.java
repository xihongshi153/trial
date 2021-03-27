public class 多线程 {
    public static void main(String[] args) {
        Person per=new Person();
        per.start();
        for (int i = 0; i < 5; i++){
            System.out.println("main-->"+i);
        }
    }
}

class Person extends Thread {
    private String name1;

    public Person() {
    }

    public Person(String name) {
        this.name1 = name1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("类方法-->"+i);
        }

    }
}