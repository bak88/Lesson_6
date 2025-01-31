package Task_1;

public abstract class Animal {

    protected String name;
    private static int countAnimal;

    public Animal(String name) {
        this.name = name;
        countAnimal++;
    }

    public static void getCountAnimal() {
        System.out.println("Количество животных = " + countAnimal);
    }

    public abstract void run(int lenght);

    public abstract void swim(int lenght);
}
