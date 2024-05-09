import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String bread;
    private String[] commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public Dog() {
    }

    public Dog(String name, String bread, String[] commands,
               ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.bread = bread;
        this.commands = commands;
        super.setColor(colorEnum);
        super.setShelter(shelter);
    }

    public Dog(String name, String bread,
               ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.bread = bread;
        super.setColor(colorEnum);
        super.setShelter(shelter);
    }

    public void makeVoice(String voice) {
        System.out.println("собака издает зыук" + voice);
    }

    public void makeVoice() {
        System.out.println("собака издает зыук");
    }

    @Override
    public String getinfo() {
        return super.getinfo() +
                "\nname: " + name +
                "\nBread: " + bread +
                "\ncommands: " + Arrays.toString(commands);
    }
}

