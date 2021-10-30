package homework;

public class Main {
    public static void main(String[] args) {
        Human man1 = new Human();
        Human woman1 = new Human();
        Human man2 = new Human();
        Human woman2 = new Human();
        Human man3 = new Human();

        man1.name = "Ivan";
        man1.age = 22;
        man1.weight = 87.5F;
        woman1.name = "Olga";
        woman1.age = 55;
        woman1.weight = 64;
        man2.name = "Alex";
        man2.age = 24;
        man2.weight = 88F;
        woman2.name = "Anna";
        woman2.age = 19;
        woman2.weight = 50;
        man3.name = "Ilya";
        man3.age = 25;
        man3.weight = 56.6F;

        System.out.println(woman2.name);
    }
}
