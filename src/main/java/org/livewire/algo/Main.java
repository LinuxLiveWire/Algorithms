package org.livewire.algo;

import org.livewire.algo.QuickSort;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuickSort qsort = new QuickSort(50000);
        qsort.stats();
        qsort.sort();
        qsort.stats();
    }
}
