package Nihar;
public abstract class GeometricObject{
    //private method
    private String color="White";
    private boolean filled;
    private java.util.Date dateCreated;
    //protected method
    protected GeometricObject(){
        dateCreated=new java.util.Date();
    }
    protected GeometricObject(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    //public method
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public String toString(){
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
    //abstract methods
    public abstract double getArea();
    public abstract double getPerimeter();
}


class Rectangle extends GeometricObject{
    private double width;
    private double height;
    public Rectangle(){}
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }

    @Override
    public double getArea(){
        return height*width;
    }
    public double getPerimeter(){
        return 2*(width*height);
    }
}

class Circle extends GeometricObject{
    private double radius;
    public Circle(){}
    public  Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getDiameter(){
        return 2*radius;
    }

    @Override
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public void printCircle(){
        System.out.println("The Circle is created "+getDateCreated()+" and the radius is"+radius);
    }
}