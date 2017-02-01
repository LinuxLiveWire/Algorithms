/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.livewire.algo;

import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author sergey
 */
public class QuickSort {

    final private int defaultSize = 100;
    final private int MAX_INT = 99;
    private Comparable []  array;
    private long counter = 0;
    Random rand;
    
    public QuickSort() {
        array = new Integer[defaultSize];
        for(int i = 0; i<defaultSize; ++i) {
            array[i] = new Integer(defaultSize-i);
        }
    }
    
    public QuickSort(int size) {
        array = new Integer[size];
        rand = new Random();
        for(int i = 0; i<size; ++i) {
            array[i] = rand.nextInt(MAX_INT);
        }
    }
    
    public QuickSort(Comparable[] init) {
        array = init;
    }
    
    public void sort() {
        counter = 0;
        subsort(0, array.length-1);
    }

    private void exch(int i, int j) {
        Object swap = array[i];
        array[i] = array[j];
        array[j] = (Comparable)swap;
        ++counter;
    }

    private void subsort(int lo, int hi) {
        if (lo>=hi)
            return;
        int l = lo, r = hi+1;
        Comparable pivot = array[lo];
        while (true) {
            while(array[++l].compareTo(pivot)<0) if (l>=hi) break;
            while(array[--r].compareTo(pivot)>0) if (r<=lo) break;
            if (l>=r) break;
            exch(l, r);
        }
        exch(lo, r);
        subsort(lo, r-1);
        subsort(r+1, hi);
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
