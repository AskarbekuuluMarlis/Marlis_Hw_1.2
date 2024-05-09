public class Main {
    public static void main(String[] args) {
        String[] commands = {"Sidet", "Lai"};
        Shelter shelter = new Shelter("peace", "Lenina1");
        Dog dog = new Dog("Rex", "Ovcharka", commands, ColorEnum.GRAY, shelter);
        System.out.println(dog.getinfo());
        dog.makeVoice();
        dog.makeVoice(" Gav Gav ");

        Father objectA = new Father(" Илья ", HairColor.BLACK, " Мужчина ",
                33, new Address(" Ленинская 13 ", " Бишкек "));

        Son objectB = new Son(" Никита ", new Address(" Ленинская 15 ", " Бишкек "),
                HairColor.BROWN, " Мужчина ",
                18, " МУК ");

        Son objectС = new Son(" Наташа ", new Address(" Первомайская 32 ", " Бишкек "),
                HairColor.ORANGE, " Женщина ",
                20, " КНУ ");

        objectA.work();
        objectA.HOBBI();
        System.out.println(objectA.getInfo());
        objectB.work();
        objectB.HOBBI();
        System.out.println(objectB.getInfo());
        objectС.work();
        objectС.HOBBI();
        System.out.println(objectС.getInfo());



    }
}