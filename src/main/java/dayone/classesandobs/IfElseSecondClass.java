package dayone.classesandobs;

public class IfElseSecondClass {
    public static void main(String[] args) {

        int studentsGrade = (int) (Math.random() * 100);

        if (studentsGrade >= 90){
            System.out.println("You got an A!");
        } else if (studentsGrade >= 80 && studentsGrade <= 90){
            System.out.println("You got a B");
        } else if(studentsGrade >= 70 && studentsGrade <= 80){
            System.out.println("You got a C");
        } else if (studentsGrade >= 60 && studentsGrade <= 70){
            System.out.println("You got a D");
        } else {
            System.out.println("You got an F");
        }

    }

}
