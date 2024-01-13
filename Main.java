public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal kangaroo = animalFactory.createAnimal("Kangaroo");
        kangaroo.create();

        Animal cheetah = animalFactory.createAnimal("Cheetah");
        cheetah.create();

        Animal lion = animalFactory.createAnimal("Lion");
        lion.create();
    }
}

// Changes made:

// Renamed classes to follow the Java naming conventions (capitalized class names).
// Moved each class to its own file for better organization.
// Refactored the AnimalFactory class for better readability.
// Improved variable naming for clarity.
// Encapsulated the logic of creating animals within the AnimalFactory class.