package dayone.classesandobs.shapes;

public class Circle {
    public double radius;

    //goal is to calculate area of circle

    public Circle(double radius){
        this.radius = radius;
    }

    //PI * R * R = formula
    //wrapper class u can use bc same*** check
    public Double calculateArea(){
        return Math.PI * this.radius * this.radius;
                //PI is static variable, belongs to class
    }


}
