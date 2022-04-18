package com.company;

public class Main {

    public static void main(String[] args) {

            int array[] = new int[] {2,3,4,5};
            int proizv = 1;
            for (int i = 0; i < array.length; i++) {
                proizv=array[i] * proizv;
            }
            System.out.println("Произведение элементов массива = " + proizv);




    }
}
