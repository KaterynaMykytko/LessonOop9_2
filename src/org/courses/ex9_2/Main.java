package org.courses.ex9_2;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(5);
        myList.add(7);
        myList.add(3);
        System.out.println(myList.getElement(0));
        System.out.println(myList.getSize());
    }
}
