/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework_7;

/**
 *
 * @author 467
 */
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class SorterRunnable extends NumbersRunnable{
    @Override
    public void run(){
        NumbersRunnable nr = new NumbersRunnable();
        Thread numbers = new Thread(nr,"Поток чисел");
        numbers.start();
        try {
            numbers.join();
        } catch (InterruptedException ex) {

        }
        //List listOfSortedNumbers = nr.getListOfNumbers();
        List listOfSortedNumbers = (List) nr.getListOfNumbers().stream().sorted().collect(Collectors.toList());
        System.out.println(Thread.currentThread().getName() + listOfSortedNumbers);
    }
}
