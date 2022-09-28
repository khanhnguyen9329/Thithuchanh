package OOP;

public class Rectangle {
    double wight;
    double height;

    public Rectangle(double w,double h){
        this.wight = w;
        this.height = h;
    }
    public double getArea(){
        return this.wight* this.height;
    }
    public double getPerimeter(){
        return (this.wight+this.height) *2;
    }
    public String display(){
        return "Rectangle{" + "wight ="+ wight+ ", height=" +height+"}";
    }
}
