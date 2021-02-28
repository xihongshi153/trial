public class Task_10 {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.add(new Mouse());
        computer.add(new keyBoard());
        computer.add(new Microphone());
        computer.powerOn();
        System.out.println("==================");
        computer.powerOff();

    }
}

 interface USB{
    void turnOn();
    void turnOff();
}
 class Mouse implements USB{
    @Override
     public void turnOn(){
        System.out.println("鼠标启动了");
     }
     @Override
     public void turnOff(){
         System.out.println("鼠标关闭了");
     }
 }
 class keyBoard implements USB{
     @Override
     public void turnOff() {
         System.out.println("键盘关闭了");
     }

     @Override
     public void turnOn() {
         System.out.println("键盘开启了");
     }
 }
class Microphone implements USB{
    @Override
    public void turnOff() {
        System.out.println("麦克风关闭了");
    }

    @Override
    public void turnOn() {
        System.out.println("麦克风开启了");
    }
}
class Computer{
    private USB[] usbArr = new USB[4];

    public void add(USB usb){
        for (int i = 0; i < usbArr.length; i++) {
            if(usbArr[i]==null){
                usbArr[i]=usb;
                break;
            }
        }
    }
    public void powerOn(){
        for (int i = 0; i < usbArr.length; i++) {
            if(usbArr[i]!=null){
                usbArr[i].turnOn();
            }
        }
        System.out.println("电脑开机成功");
    }

    public void powerOff(){
        for (int i = 0; i < usbArr.length; i++) {
            if(usbArr[i]!=null){
                usbArr[i].turnOff();
            }
        }
        System.out.println("电脑关机成功");
    }
}