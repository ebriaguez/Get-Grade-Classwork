package dayone.classesandobs;
//class is a blueprint for making objects
public class Animal {

    //we have a default constructor, we lose it once we create a parameterized constructor
    //we didn't have to write the default constructor, it's just there
    // instance variable
    public String animalName;
    public int eyes;

    public String animalSound;



    //constructor - help constructor objects in main
    public Animal(String animalName, int eyes, String animalSound){ // you could do String name
        this.animalName = animalName; // = name
        this.eyes = eyes;
        this.animalSound = animalSound;

    }

    //Overloaded constructor - create another constructor to use in different name
    public Animal(String animalName){
        this.animalName = animalName;
    }

    //concatenate is to add "+" in String

    //METHOD - actions, objects can do
    /*
    accessModifier | return Datatype = void | name of method | name() | {}
    this is the syntax
    to return, remove void and add Datatype
    void returns nothing, so you need to print out something
     */
    public String printNameAndMakeNoise(){
        return animalName + "====" + this.animalSound; //return a datatype value that
        //either work but use this.variableName

    }

    //create method to return number of eyes
    public int getNumberOfEyes(){
        return eyes; //correct but use this.eyes
    }

//    //incomplete
//    public static int something(){ //static
//        return 5;
//    }
}
