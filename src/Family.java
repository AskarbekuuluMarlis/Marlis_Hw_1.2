import java.util.Arrays;

public class Family {
    private String name;
    private String gender;
    private HairColor hairColor;


    public Family(String name, HairColor hairColor, String gender) {
        this.name = name;
        this.hairColor = hairColor;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public HairColor getHairColor() {
        return hairColor;
    }



    public String getInfo () {
        return  " name " + name + " gender " + gender + " hairColor " + hairColor ;

    }
}
