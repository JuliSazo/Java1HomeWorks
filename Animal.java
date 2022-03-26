package les1;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private String color;
    private int age;
    private int swimmingSpeed;
    private int passing;

    public Animal(String name, String color, int age, int swimmingSpeed, int passing)  {
        this.name = name;
        this.color = color;
        this.setAge(age);
        this.swimmingSpeed = swimmingSpeed;
        this.setPassing(passing);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age + '\'' +
                ", swimLimit=" + swimmingSpeed + '\'' +
                ", passing=" + passing + '}';
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal cat = (Animal) o;
        return age == cat.getAge() && Objects.equals(name, cat.getName()) && Objects.equals(color, cat.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=0) this.age = age;
    }

    public  abstract void voice();

    public void info() {
        System.out.println(name +" "+swimmingSpeed+" "+ passing);
    }

    public int getPassing() {
        return passing;
    }

    public boolean run(int length) {
        return swimmingSpeed >= length;
    }

    public void setPassing(int passing){
        this.passing = passing;
    }

}
