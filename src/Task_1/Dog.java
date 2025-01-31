package Task_1;

public class Dog extends Animal{

    private static int countDog;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    public static void getCountDog() {
        System.out.println("Количество собак = " + countDog);
    }

    @Override
    public void run(int lenght) {
        if (lenght <= 0 || lenght > 500)
            System.out.println("Собака " + name + " не может пробежать это растояние " + lenght + " метров");
        else
            System.out.println("Собака " + name + " пробежала " + lenght + " метров");
    }

    @Override
    public void swim(int lenght) {
        if (lenght <= 0 || lenght > 10)
            System.out.println("Собака " + name + " не может проплыть это растояние " + lenght + " метров");
        else
            System.out.println("Собака " + name + " проплыла " + lenght + " метров");
    }
}
