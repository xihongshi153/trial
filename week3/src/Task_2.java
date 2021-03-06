import java.util.ArrayList;

public class Task_2 {
    public static void main(String[] args) {
        ArrayList<List> table=new ArrayList<>();
        table.add(new List(1,"Joe",70000,"3"));
        table.add(new List(2,"Henry",80000,"4"));
        table.add(new List(3,"Sam",6000,"NULL"));
        table.add(new List(4,"Max",90000,"NULL"));
        for (List list:table){
            System.out.println(list);
        }

    }
}
class List{
    int id;
    String name;
    int salary;
    String managerId;

    public List(int id, String name, int salary, String managerId) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "List{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", managerId='" + managerId + '\'' +
                '}';
    }

}