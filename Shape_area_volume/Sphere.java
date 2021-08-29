package Shape_area_volume;

import java.lang.Math.*;
public class Sphere extends Shape implements Spatial
{
    private double radius;

    
//    public Sphere(double radius){
//        this.radius = radius;
//    }
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double area(){
        return 4* Math.PI *Math.pow(radius,2);
        
    }
    
    public double volume(){
        return 4*Math.PI*Math.pow(radius,3)/3;
    }
}