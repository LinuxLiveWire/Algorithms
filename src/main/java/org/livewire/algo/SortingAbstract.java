/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.livewire.algo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author sergey
 */
public abstract class SortingAbstract implements SortingInterface {
    final private int defaultSize = 100;
    final private int MAX_INT = 99;
    protected Comparable []  array;
    protected long counter = 0;
    Random rand;
    
    public SortingAbstract() {
        array = new Integer[defaultSize];
        for(int i = 0; i<defaultSize; ++i) {
            array[i] = new Integer(defaultSize-i);
        }
    }
    
    public SortingAbstract(int size) {
        array = new Integer[size];
        rand = new Random();
        for(int i = 0; i<size; ++i) {
            array[i] = rand.nextInt(MAX_INT);
        }
    }
    
    public SortingAbstract(Comparable[] init) {
        array = init.clone();
    }
    
    protected void exch(int i, int j) {
        Object swap = array[i];
        array[i] = array[j];
        array[j] = (Comparable)swap;
        ++counter;
    }
    
    public boolean isSorted() {
        for(int i=0; i<array.length-1; ++i) {
            if (array[i].compareTo(array[i+1])>0)
                return false;
        }
        return true;
    }
    
    public void stats() {
        System.out.println(String.format("Len: %d; Ord: %b; Exch: %d",
                array.length, isSorted(), counter));
    }
    
    public void print() {
        System.out.println(String.format("%d: %s", counter, Arrays.toString(array)));
    }
}
