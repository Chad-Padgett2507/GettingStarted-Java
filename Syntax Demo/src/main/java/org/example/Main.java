package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        short b = 32767;
        long c = 7;
        byte d = 127;
        byte neg_d = -128;
        short neg_b = -32768;

        double f = 3.1415;
        float g = 3.14f;

        int[] int_array = {1, 2, 3, 5, 6, 7};

        for (int i = 0; i < int_array.length; i++) {
            System.out.println(int_array[i]);
        }

        for (int i : int_array) {
            System.out.println(i);
        }

        ArrayList<Integer> dyn_list = new ArrayList<>();
        dyn_list.add(1);
        dyn_list.add(2);
        dyn_list.add(7);
        dyn_list.add(42);
        dyn_list.add(65);
        dyn_list.add(67);

        for (int i : dyn_list) {
            System.out.println(i);
        }

        for (int i = 0; i < dyn_list.size(); i++) {
            System.out.println(dyn_list.get(i));
        }
    }

}