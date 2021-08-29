package Shape_area_volume;

public class Cube extends Shape implements Spatial
{
    private double length;
    private double width;
    private double height;
    

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double area(){
        //double a = 2*getLength()*getWidth() + 2*getLength()*getHeight() + 2*getWidth()*getHeight();
        double a = 2*length*width + 2*length*height + 2*width*height;
        return a;
    }
    
    public double volume(){
        return length*width*height;
        //return getLength()*getWidth()*getHeight();
    }
}
