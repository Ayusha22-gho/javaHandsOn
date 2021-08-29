package Shape_area_volume;

public class Triangle extends Shape
{
    private double base;
    private double height;
    
//    public Triangle(double base, double height){
//        this.base = base;
//        this.height = height;
//    }
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double area(){
       return (base*height)/2;
       //return getHeight()*getBase()/2
    }
    
    public double volume(){
        return -1;
    }
}