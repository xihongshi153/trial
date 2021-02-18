class Vehicle{
    int wheels;
    double weight;
    public Vehicle(int wheels,double weight){
    this.wheels=wheels;
    this.weight=weight;
}

}
class Car extends Vehicle{
    int loader;
    public Car(int wheels,double weight,int loader){
    super(wheels,weight);
    this.loader=loader;
    }
    public void print(){
        System.out.println("车轮个数是： "+wheels+"  车重： "+weight);
        System.out.print("这是一辆小车，能载5人，实载"+loader+"人");
        if(loader>5)
            System.out.print(",你超员了");
    }

}
class Truck extends Vehicle{
    int loader;
    double payload;
    public Truck(int wheels,double weight,int loader,double payload){
        super(wheels,weight);
        this.loader=loader;
        this.payload=payload;
    }
    public void print(){
        System.out.println("车轮个数是： "+wheels+"  车重： "+weight);
        System.out.print("这是一辆卡车，能载3人，实载"+loader+"人");
        if(loader>3)
            System.out.print(",你超员了");
        System.out.println();
        System.out.print("这是一辆卡车，核载5000kg，你已经装载"+payload);
        if(payload>5000)
            System.out.print(",你超载了！！！");

    }

}



public class task_6 {
    public static void main(String[] args) {
        Car car= new Car(4,1150.0,6);
        Truck tru = new Truck(6,15000.0,1,7000.0);
        car.print();
        System.out.println();
        tru.print();
    }
}
