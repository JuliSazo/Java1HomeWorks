package les1;

import static les1.Utils.makeAnimalOlder;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "белый", 1, 10, 10);

        System.out.println(cat1);

        Cat cat2 = new Cat("Морис", "black", 1, 10, 10);

        Cat cat3 = new Cat("Морис", "black", 1, 10, 10);

        System.out.println(cat2.equals(cat3));

        Wolf wolf = new Wolf("Тревор", "Серый", 6, 15, 14);

        Animal cat4 = new Cat("Морис", "red", 10, 12, 13);

        if (cat4 instanceof Wolf) {
            Wolf cat5 = (Wolf) cat4;
        } else {
            System.out.println("Не является волком!");
        }

        Animal cat6 = new Cat("Морис", "red", 10, 14, 12);
        cat6.voice();

        //Создать набор бассейнов и заставить животных проплыть по ним и вывести время на заплыв

        Cat catCompetitor1 = new Cat("Морис", "red", 10, 12, 12 );
        catCompetitor1.setSwimmingSpeed(10);
        Wolf wolfCompetitor1 = new Wolf("Волк", "серый", 12, 16, 13);
        wolfCompetitor1.setSwimmingSpeed(12);
        Turtle turtleCompetitor = new Turtle("Черепаха", "зеленая", 100, 12, 12);
        turtleCompetitor.setSwimmingSpeed(15);

        Pool[] pools = {new Pool(15), new Pool(20), new Pool(35)};

        for (Pool pool : pools) {
            pool.getTimeToOvercomePool(catCompetitor1);
            pool.getTimeToOvercomePool(wolfCompetitor1);
            pool.getTimeToOvercomePool(turtleCompetitor);
        }

        makeAnimalOlder(cat2);
    }
   }

