public class DemoA
{
    public void show()
    {
        System.out.println("Inside A");
    }
}
class DemoB
{
    public void show()
    {
        System.out.println("Inside B");
    }
}
class B extends DemoA{
    public void show()
    {
       super.show();
    }
}