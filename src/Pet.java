import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private ColorEnum color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public ColorEnum getColor() {
        return color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        Random random = new Random();
        return random.nextInt(15) + 1;
    }

    public String getinfo() {
        return "Age: " + age +
                "\nColor: " + color +
                "\nShelter name : " + shelter.getName() +
                "\nShelter address: " + shelter.getAddress();
    }

}
