/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework_7;

/**
 *
 * @author 467
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class NumbersRunnable implements Runnable{
    List listOfNumbers;
    @Override
    public void run(){
        listOfNumbers = (List) new Random().ints(100, 1, 1000)
        .boxed()
        .collect(Collectors.toList());
        System.out.println(Thread.currentThread().getName() + listOfNumbers);
        //List<Integer> listOfSortedNumbers = (List<Integer>) listOfNumbers.stream().sorted().collect(Collectors.toList());
        //System.out.println(Thread.currentThread().getName() + listOfSortedNumbers);
    }

    public List getListOfNumbers() {
        return listOfNumbers;
    }
    
    
}
