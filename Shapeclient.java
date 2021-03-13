public class Shapeclient {
    public static void main(String [] args) 
    {
        //Test Triangle
        double base = 6, height = 9;
        Shape triangle = new Triangle(base, height);
        System.out.println("The triangle base is: " + base);
        System.out.println("The height is: " + height);
        System.out.println("The area is: " + triangle.getArea());

        // To test Rectangle...
        double widthh = 13, lengthh = 9;
        Shape rectangle = new Rectangle(widthh, lengthh);
        System.out.println("The rectangle width is: " + widthh);
        System.out.println("The length is: " + lengthh);
        System.out.println("The area is: " + rectangle.getArea());
       
    
        //To test Circle...
        double radius = 3;
        Shape circle = new Circle(radius);
        System.out.println("The radius of the circle is: " + radius);
        System.out.println("The area is: " + circle.getArea());
        
    }
}
