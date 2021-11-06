public class Circle
{
    private int r;
    public Circle(int r)
    {
        this.r=r;
    }
    public int getR()
    {
        return r;
    }
    public double area()
    {
        return(Math.PI*Math.pow(r,2));
    }
}
class Cylinder extends Circle{
    private int h;
    public Cylinder(int r,int h)
    {
        super(r);
        this.h=h;
    }
    public double area()
    {
        return(2*Math.PI*getR()*h)+(2*super.area());
    }
    public double volume()
    {
        return(super.area()*h);
    }
}
