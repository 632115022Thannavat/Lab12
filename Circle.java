public class Circle extends Shape 
{
private double radius;
final double pi = Math.PI;

//Defualt Constructor, calls Shape default constructor
public Circle() 
{
    //Set default value to radius
    this.radius = 1;
}   

public Circle(double radius) 
{
    this.radius = radius;
}

public double getArea() 
{
    //Return πr^2 (area formula)
    //Use Math.pow method (page 141) in order to calculate exponent
    return (pi * Math.pow(radius, 2));
}


}
