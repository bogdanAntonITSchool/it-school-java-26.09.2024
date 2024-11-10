import model.Animal;
import model.Dog;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Dog", 5);
        animal.printDetails();

        String animalName = animal.getName();
        animalName = "Cat";

        animal.printDetails();

        animal.setName("Cow");
        animal.printDetails();

        System.out.println("-----------------");

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("Dog", 5);
        animals[1] = new Animal("Cat", 3);
        animals[2] = new Animal("Cow", 7);

        for (Animal animalInArray : animals) {
            if (animalInArray.getAge() < 5) {
                System.out.println(animalInArray.getName() + " is young.");
            } else {
                System.out.println(animalInArray.getName() + " is old.");
            }
        }

        Dog dog = new Dog("Rex", 3, "German Shepherd");
        dog.printDetails();
    }

}