package les1;

public class Cat extends Animal implements CanSwim {

    private boolean isWild;
    private double swimmingSpeed;

    public Cat() {
        super("Барсик", "White", 12, 14, 10);
    }

    public  void voice() {
        System.out.println("Кот мяукает");
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Cat(String name, String color, int age, int swimmingSpeed, int passing) {
        super(name, color, age, swimmingSpeed, passing);
        this.setName(name);
        this.setColor(color);
        this.setAge(age);
        this.setSwimmingSpeed(swimmingSpeed);
        this.setPassing(passing);
    }
    public double swim(Pool pool) {
        System.out.println("Я кот, я плыву!");
        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
    }
    }

