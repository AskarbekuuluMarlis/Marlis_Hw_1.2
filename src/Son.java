public class Son extends Father {
    private String school;

    public Son(String name, Address address, HairColor hairColor, String gender,
                int age, String school) {
        super(name,  hairColor, gender, age,address);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public void work() {
        System.out.println(" Son  is studying ");
    }
    @Override
    public String getInfo() {
        return super.getInfo() + " School: " + school;
    }




}
