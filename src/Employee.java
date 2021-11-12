public class Employee {
    private int age;
    private String name;
    private int id;
    private static int nextId=1;

    public Employee(int a,String n)
    {
        age=a;
        name=n;
        id=nextId++;
    }
    public void show()
    {
        System.out.println(age+","+name+","+id);
    }
    public void shownextId()
    {
        System.out.println("Next Emp id will be "+nextId);
    }

}
