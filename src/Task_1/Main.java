package Task_1;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Jack", 3);
        Cat cat2 = new Cat("Jim", 3);
        Cat cat3 = new Cat("Bim", 3);
        Cat cat4 = new Cat("Murka", 3);

        Dog dog1 = new Dog("Bob");
        Dog dog2 = new Dog("Bobik");
        Dog dog3 = new Dog("Spyki");

        Animal.getCountAnimal();
        System.out.println();

        Cat.getCountCat();
        System.out.println();

        Dog.getCountDog();
        System.out.println();

        Cat.getQuantityFood();
        Cat.printFeedCats();
        System.out.println();

        Cat.addFood(2);
        Cat.printFeedCats();


    }
}