package dayone.classesandobs.shapes;

public class ShapeFactory {
    public static void main(String[] args) {

        Circle circle = new Circle(30.0);
        //invoke or call the method
//        circle.calculateArea(); won't return anything so need to print it out
        System.out.println(circle.calculateArea());



        //create a square class = give it a property and a method
        //create a square object in main and invoke the method to calculatearea on the object
        //hide the code

        Square square = new Square(4.5);
        System.out.println(square.squareArea());

        //postfix - CHECK IT AGAIN
//        int counter1 = 2;
//        counter1++;
//        System.out.println(counter1);

        //prefix - CHECK AGAIN/ REVIEW
//        int counter2 = 2;
//        System.out.println(++counter2);


    }
}
