package Task_1;

import java.util.ArrayList;

public class Cat extends Animal {

    private static int countCat;
    private static int quantityFood = 10;
    private static ArrayList<Cat> arrayCats = new ArrayList<Cat>();
    private boolean isFed = false;
    private int wantToEat;

    public Cat(String name, int wantToEat) {
        super(name);
        this.wantToEat = wantToEat;
        arrayCats.add(this);
        countCat++;
    }

    @Override
    public void run(int lenght) {
        if (lenght <= 0 || lenght > 200)
            System.out.println("Кот " + super.getName() + " не может пробежать это растояние " + lenght + " метров");
        else
            System.out.println("Кот " + super.getName() + " пробежал " + lenght + " метров");
    }

    @Override
    public void swim(int lenght) {
        System.out.println("Кот не умеет плавать");
    }


    public void feedCat() {
        int result = quantityFood - wantToEat;

        if (result < 0) {
            System.out.println("Недостаточно еды. Остаток: " + quantityFood);
        } else {
            quantityFood = result;
            isFed = true;
        }

        getIsFed();
    }


    public void getIsFed() {
        System.out.println("Кот " + super.getName() + " сыт = " + isFed);
    }

    public static void getCountCat() {
        System.out.println("Количество котов = " + countCat);
    }

    public static void getQuantityFood() {
        System.out.println("Количество еды в миске = " + quantityFood);
    }

    public static void printFeedCats() {
        for (Cat cat : arrayCats) {
            if(cat.isFed == true)
                continue;

            cat.feedCat();
        }
    }

    public static void addFood(int count){
        quantityFood += count;
        System.out.println("Добавлена еда = " + count);
    }
}
