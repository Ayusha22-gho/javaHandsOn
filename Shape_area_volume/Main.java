package Shape_area_volume;

import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Shape[] shapes = new Shape[5];
        
        
        for(int i=0;i<5;i++){
        	System.out.println("ente shape name");
            String shapeName = sc.next();
            Shape Shape = null;
            
            switch(shapeName){
                case "Triangle":{
                    double base = sc.nextDouble();
                    double height = sc.nextDouble();
                    
                    Shape = new Triangle();
                    ((Triangle) Shape).setBase(base);
                    ((Triangle)Shape).setHeight(height);
                    break;
                }
                case "Rectangle":{
                    double length = sc.nextDouble();
                    double width = sc.nextDouble();
                    
                    Shape = new Rectangle();
                   ((Rectangle) Shape).setLength(length);
                   ((Rectangle)Shape).setWidth(width);
                    break;
                }
                case "Cube":{
                    double length = sc.nextDouble();
                    double width = sc.nextDouble();
                    double height = sc.nextDouble();
                    
                    Shape= new Cube();
                    ((Cube)Shape).setLength(length);
                    ((Cube)Shape).setWidth(width);
                    ((Cube)Shape).setHeight(height);
                    break;
                }
                case "Sphere":{
                    double radius = sc.nextDouble();
                    
                    Shape = new Sphere();
                    ((Sphere)Shape).setRadius(radius);
                    break;
                }
            }
            shapes[i] = Shape;
        }
        
        //System.out.println("Sample Output\n");
        for(Shape shape:shapes)
        {
            System.out.println("Area "+shape.area());
            //sc.nextLine();
            if(shape instanceof Spatial){
                System.out.println("Volume "+shape.volume());
            }
        }
    }
}