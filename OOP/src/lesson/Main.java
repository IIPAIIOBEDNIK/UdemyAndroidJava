package lesson;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        box1.widht = 14.2;
        box1.hight = 11.5;
        box1.lenght = 15.4;
        box2.hight = 13.4;
        box2.widht = 15.4;
        box2.lenght = 11.9;
        box3.widht = 10.6;
        box3.hight = 16;
        box3.lenght = 14;

        double summary = box1.hight + box1.lenght + box1.widht;

        System.out.println(summary);
    }
}
