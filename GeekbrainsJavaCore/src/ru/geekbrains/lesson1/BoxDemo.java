package ru.geekbrains.lesson1;

public class BoxDemo {
    public static void main(String args[]) {
        Apple ap1 = new Apple(1.5);
        Apple ap2 = new Apple(1);
        Apple ap3 = new Apple(0.5);
        Apple ap4 = new Apple(1);
        Orange orange1 = new Orange(2);
        Orange orange2 = new Orange(0.5);
        Orange orange3 = new Orange(1);
        Box<Apple> boxApple1 = new Box<Apple>(ap1, ap2, ap3, ap4);
        Box<Apple> boxApple2 = new Box<>();
        boxApple2.add(new Apple(0.5));
        boxApple2.add(new Apple(1));
        boxApple2.add(new Apple(0.8));
        boxApple2.add(new Apple(0.7));
        boxApple2.add(new Apple(1));
        Box<Orange> boxOrange = new Box<>(orange1, orange2, orange3);
        if (boxApple1.compare(boxApple2)) {
            System.out.println("Коробки с яблоками равны по весу");

        }else {
            System.out.println("Коробки не равны по весу");
            System.out.println("Вес первой: "+boxApple1.getWeiht());
            System.out.println("Вес второй: "+boxApple2.getWeiht());
        }
        if (boxApple1.compare(boxOrange)) {
            System.out.println("Коробки равны по весу");
        }else {
            System.out.println("Коробки не равны по весу");
            System.out.println("Вес коробки с яблоками: "+boxApple1.getWeiht());
            System.out.println("Вес второй с апельсинами: "+boxApple2.getWeiht());
        }
        boxApple1.move(new Box<Apple>());

    }
}
