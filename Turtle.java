package les1;

public class Turtle extends Animal implements CanSwim {

    private double swimmingSpeed;

    public Turtle(String name, String color, int age, int swimmingSpeed, int passing) {
        super(name, color, age, swimmingSpeed, passing);
    }

    public void voice() {
        System.out.println("Черепаха издает звук");
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public double swim(Pool pool) {
        System.out.println("Я черепаха, я плыву!");
        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }
    }

