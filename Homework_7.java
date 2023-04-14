/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework_7;

/**
 *
 * @author 467
 */
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.concurrent.*;

public class Homework_7 {

    public static void main(String[] args) {
        System.out.println("Практическая работа № 11, Вариант 5, Панкратов Максим Максимович, РИБО-02-21");
//        NumbersRunnable nr = new NumbersRunnable();
//        Thread numbers = new Thread(nr,"Поток чисел");
//        numbers.start();
        NumbersRunnable sr = new SorterRunnable();
        Thread sortedNumbers = new Thread(sr,"Поток чисел отсортировка ");
        sortedNumbers.start();
    }
}
