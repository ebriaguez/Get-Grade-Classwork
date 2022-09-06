package dayone.classesandobs;

public class Zoo {
    public static void main(String[] args) {
        //datatype of thing we want to create
        // 'new' is given to create an object
//        Animal animal1 = new Animal();

        Animal animal1 = new Animal("dog", 2, "woof woof");
        Animal animal2 = new Animal("spider", 4, "silent killer");
        Animal animal3 = new Animal("fish");

//        String result = animal1.printNameAndMakeNoise();//because datatype is String
//        animal1.printNameAndMakeNoise();
//        //won't print anything because its returning nothing
        //or
        System.out.println(animal1.printNameAndMakeNoise());
        animal1.printNameAndMakeNoise();//because no arguments

        System.out.println(animal2.getNumberOfEyes()); //use get

    }
}
