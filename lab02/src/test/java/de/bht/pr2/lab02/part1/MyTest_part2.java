package de.bht.pr2.lab02.part1;
import org.junit.jupiter.api.Test;
import de.bht.pr2.lab02.part2.BubbleSort;
import de.bht.pr2.lab02.part2.InsertionSort;
import de.bht.pr2.lab02.part2.QuickSort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyTest_part2 {


    @Test
    void test_BubbleSort_sort()  {
        int[] myIntArray = {4, 2, 3};
        BubbleSort init = new BubbleSort();
        int[] expect = {2,3,4};
        assertArrayEquals(expect,init.sort(myIntArray));

    }
    @Test
    void test_InsertionSort()  {
        int[] myIntArray = {4, 2, 3};
        InsertionSort init = new InsertionSort();
        int[] expect = {2,3,4};
        assertArrayEquals(expect,init.sort(myIntArray));

    }
    @Test
    void test_QuickSort()  {
        int[] myIntArray = {4,2, 3};
        QuickSort init = new QuickSort();
        int[] expect = {2,3,4};
        assertArrayEquals(expect,init.sort(myIntArray));

    }
    @Test
    void test_QuickSort_algo()  {
        int[] myIntArray = {4,2, 3};
        QuickSort init = new QuickSort();
        int[] expect = {2,3,4};
        assertArrayEquals(expect,init.sort(myIntArray));

    }
}

