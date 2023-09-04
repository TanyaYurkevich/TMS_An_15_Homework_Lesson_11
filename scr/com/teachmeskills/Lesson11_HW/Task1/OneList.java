package com.teachmeskills.Lesson11_HW.Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class OneList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Введите значения. Для завершения ввода нажмите \"exit\"");

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String inputData = scanner.next();
            if (inputData.equalsIgnoreCase("exit")) {
                break;
            }
            int val;
            try {
                val = Integer.parseInt(inputData);
                arrayList.add(val);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат ввода.");
            }
            System.out.println(arrayList);
        }

        for (int even : arrayList) {
            if (even % 2 == 0) {
                System.out.print(even+ " ");
            }
        }
    }
}
