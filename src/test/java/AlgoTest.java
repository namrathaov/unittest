package test.java;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	@Before
	public void setUp() throws Exception {
	}
	
	/*
	 * To test bubble sort for different inputs.
	 */
	@Test
	public void test_BubbleSort() {
		Item item1 = new Item(70);
		Item item2 = new Item(50);
		Item item3 = new Item(30);
		Item item4 = new Item(20);
		Item item5 = new Item(10);
		Item unsortedArr[]  = {item1, item2, item3, item4, item5};
		Item sortedArr[] = {item5, item4, item3, item2, item1};
		assertEquals(Arrays.toString(sortedArr),Arrays.toString(SortAlgos.bubbleSort(unsortedArr)));

	}
	
	/*
	 * To test selection sort for different inputs.
	 */
	@Test
	public void test_SelectionSort() {
		Item item1 = new Item(70);
		Item item2 = new Item(50);
		Item item3 = new Item(30);
		Item item4 = new Item(20);
		Item item5 = new Item(10);
		Item unsortedArr[]  = {item1, item2, item3, item4, item5};
		Item sortedArr[] = {item5, item4, item3, item2, item1};
		assertEquals(Arrays.toString(sortedArr),Arrays.toString(SortAlgos.selectionSort(unsortedArr)));
	}
	
	/*
	 * To test insertion sort for different inputs.
	 */
	@Test
	public void test_InsertionSort() {
		Item item1 = new Item(70);
		Item item2 = new Item(50);
		Item item3 = new Item(30);
		Item item4 = new Item(20);
		Item item5 = new Item(10);
		Item unsortedArr[]  = {item1, item2, item3, item4, item5};
		Item sortedArr[] = {item5, item4, item3, item2, item1};
		assertEquals(Arrays.toString(sortedArr),Arrays.toString(SortAlgos.insertionSort(unsortedArr)));

	}
	
	/*
	 * To test merge sort for different inputs.
	 */
	@Test
	public void test_MergeSort() {
		Item item1 = new Item(70);
		Item item2 = new Item(50);
		Item item3 = new Item(30);
		Item item4 = new Item(20);
		Item item5 = new Item(10);
		Item unsortedArr[]  = {item1, item2, item3, item4, item5};
		Item sortedArr[] = {item5, item4, item3, item2, item1};
		assertEquals(Arrays.toString(sortedArr),Arrays.toString(SortAlgos.mergeSort(unsortedArr)));

	}
	
	/*
	 * To test quick sort for different array inputs.
	 */
	@Test
	public void test_QuickSort() {
		Item item1 = new Item(70);
		Item item2 = new Item(50);
		Item item3 = new Item(30);
		Item item4 = new Item(20);
		Item item5 = new Item(10);
		Item unsortedArr[]  = {item1, item2, item3, item4, item5};
		Item sortedArr[] = {item5, item4, item3, item2, item1};
		assertEquals(Arrays.toString(sortedArr),Arrays.toString(SortAlgos.quickSort(unsortedArr)));
	}
	
	/*
	 * To test heap sort for different array inputs.
	 */
	@Test
	public void test_HeapSort() {
		Item item1 = new Item(70);
		Item item2 = new Item(50);
		Item item3 = new Item(30);
		Item item4 = new Item(20);
		Item item5 = new Item(10);
		Item unsortedArr[]  = {item1, item2, item3, item4, item5};
		Item sortedArr[] = {item5, item4, item3, item2, item1};
		assertEquals(Arrays.toString(sortedArr),Arrays.toString(SortAlgos.heapSort(unsortedArr)));

	}




}