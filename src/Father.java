import java.util.Arrays;

public class Father extends Family {
    private int age;
    private Address address;
    public Father(String name, HairColor hairColor, String gender,
                   int age , Address address) {
        super(name, hairColor, gender);
        this.address = address;
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void work(){
        System.out.println(" Father " + getName() + " is working.");
    }

    public final void HOBBI (){
        System.out.println( getName() + " is HOBBI.");
    }

@Override
    public String getInfo() {
 return super.getInfo() + " age " + age + " address " + address;
}

}
