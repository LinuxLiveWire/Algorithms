/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.livewire.algo;

/**
 *
 * @author sergey
 */
public class BubbleSort extends SortingAbstract {
    public BubbleSort() {
        super();
    }
    
    public BubbleSort(int size) {
        super(size);
    }

    public BubbleSort(Comparable[] init) {
        super(init);
    }
    
    public void sort() {
        counter = 0;
        int limiter = 0;
        int cur;
        while (++limiter<array.length) {
            cur = limiter;
            while (cur!=0) {
                if (array[cur].compareTo(array[cur-1])<0) {
                    exch(cur-1, cur);
                } else {
                    break;
                }
                --cur;
            }
        }
    }
}
