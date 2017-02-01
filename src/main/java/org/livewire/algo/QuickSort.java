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
public class QuickSort extends SortingAbstract {
    
    public QuickSort() {
        super();
    }
    
    public QuickSort(int size) {
        super(size);
    }

    public QuickSort(Comparable[] init) {
        super(init);
    }
    
    public void sort() {
        counter = 0;
        subsort(0, array.length-1);
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
        super.exch(lo, r);
        subsort(lo, r-1);
        subsort(r+1, hi);
    }

}
