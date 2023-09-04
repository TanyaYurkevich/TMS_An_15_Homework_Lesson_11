package com.teachmeskills.Lesson11_HW.Task3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoList {
    public static void main(String[] args) {
        System.out.println ("Введите размер массива.");
        try {

            Scanner scanner = new Scanner(System.in);
            int arSize = scanner.nextInt();
            ArrayList<Integer> arrayList = new ArrayList<>(arSize);
            int sum=0;
            for (int i = 0; i < arSize; i++) {
                arrayList.add((int) (Math.random() * 100));
            }
            System.out.println(arrayList);
            for (Integer element:arrayList){
                sum+=element;
            }
            System.out.println(sum/arSize);
        }catch (InputMismatchException e){
            System.out.println("Неверный формат ввода.Введите целочисленное значение.");
        }
        catch (IllegalArgumentException e){
            System.out.println("Значение должно быть положительным.");
        }
        catch (Exception e){
            System.out.println("Некорректный ввод данных.");
        }
    }
}
