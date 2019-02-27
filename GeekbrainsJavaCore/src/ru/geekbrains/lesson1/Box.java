package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Box<T extends Fruit> {
    private ArrayList<T> list;

    public Box(ArrayList<T> list) {
        this.list = list;
    }
    public Box() {
        this.list = new ArrayList<T>();
    }
    public Box(T... fruit) {
        this.list = new ArrayList<T>(Arrays.asList(fruit));      ;
    }

    public void add(T fruit) {
        list.add(fruit);
    }

    @Override
    public String toString() {
        return "Box{" +
                "list=" + list +
                '}';
    }

    public double getWeiht() {
        double sum = 0.0;
        for (T fruit : this.list) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    public boolean compare(Box<?> box) {
        return (this.getWeiht() == box.getWeiht());
    }



    public void move(Box<T> box) {
        System.out.println("Пересыпаем в новую коробку");
        for (T fruit : this.getList()) {
            box.add(fruit);
        }
        this.getList().clear();
        System.out.println("В новой корбке; "+box.getList().size());
        System.out.println("В старой корбке осталось; "+this.getList().size());
    }

    public ArrayList<T> getList() {
        return list;
    }
}

