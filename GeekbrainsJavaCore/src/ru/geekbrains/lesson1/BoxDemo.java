package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

        } else {
            System.out.println("Коробки не равны по весу");
            System.out.println("Вес первой: " + boxApple1.getWeiht());
            System.out.println("Вес второй: " + boxApple2.getWeiht());
        }
        if (boxApple1.compare(boxOrange)) {
            System.out.println("Коробки равны по весу");
        } else {
            System.out.println("Коробки не равны по весу");
            System.out.println("Вес коробки с яблоками: " + boxApple1.getWeiht());
            System.out.println("Вес второй с апельсинами: " + boxApple2.getWeiht());
        }
        boxApple1.move(new Box<Apple>());
        String []list1 = {"Первый","Второй","Третий","Четвертый","Пятый","Первый","Второй","Третий"};
        Integer[] list2 = {1, 2, 3, 4, 5, 1, 2, 5};

        changeArea(list1, "2" , "10");
        changeArea(list1,"Второй", "Пятый");
        changeArea(list2, 2, 4);
        display(transfer(list1));
        display(transfer(list2));


    }

    public static <E> void changeArea(E[] list, E elem1, E elem2) {
        int first = 0;
        int second = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(elem1)) {
                first = i;
                break;
            }
        }
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(elem2)) {
                second = i;
                break;
            }
        }
        if (first == 0 || second == 0) {
            System.out.println("Как минимум, одного из элемента в массиве нет!");
        } else {
            list[first] = elem2;
            list[second] = elem1;
            display(list);
        }
    }

    public static <E> ArrayList<E> transfer(E[] mas) {
        ArrayList<E> list = new ArrayList<>();
        Collections.addAll(list, mas);
        return list;
    }

    public static <T> void  display(T[] list){
        for (int i =0; i < list.length; i++){
            System.out.print(list[i]+" ");
        }
        System.out.println();
    }
    public static <T> void  display(ArrayList<T> list){
        System.out.println("Элементы  ArrayList после преобразования массива:");
       for(T elem : list){
           System.out.print(elem +" ");
       }
        System.out.println();
    }
}
