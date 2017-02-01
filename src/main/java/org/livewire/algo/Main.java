package org.livewire.algo;

import org.livewire.algo.QuickSort;
import edu.princeton.cs.algs4.Stopwatch;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QuickSort qsort = new QuickSort(50000);
        qsort.stats();
        //qsort.print();
        Stopwatch m1 = new Stopwatch();
        qsort.sort();
        System.out.println(String.format("Elapse: %f", m1.elapsedTime()));
        qsort.stats();
        //qsort.print();
        
        BubbleSort bsort = new BubbleSort(50000);
        bsort.stats();
        //bsort.print();
        Stopwatch m2 = new Stopwatch();
        bsort.sort();
        System.out.println(String.format("Elapse: %f", m2.elapsedTime()));
        bsort.stats();
        //bsort.print();
    }
}
