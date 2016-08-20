package parrayandlistutilities;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayAndListUtilitiesTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindMaxA() {
		ArrayAndListUtilities a = new ArrayAndListUtilities();
		int[] nums = {3, 4, 5, 5, 6, 2};
		assertEquals(6, ArrayAndListUtilities.findMax(nums), 0.001);
	}
	
	@Test
	public void testFindMinA() {
		int[] nums = {3, 4, 5, 5, 6, 1};
		assertEquals(1, ArrayAndListUtilities.findMin(nums), 0.001);
	}
	
	@Test
	public void testFindMaxL() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(11);
		nums.add(45);
		nums.add(7);
		nums.add(3);
		assertEquals(45, ArrayAndListUtilities.findMax(nums), 0.001);
	}
	
	@Test
	public void testFindMinL() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(11);
		nums.add(45);
		nums.add(7);
		nums.add(0);
		assertEquals(0, ArrayAndListUtilities.findMin(nums), 0.001);
	}
	
	@Test
	public void testFindItA() {
		int[] nums = {3, 9, 5, 4, 6};
		assertEquals("Found at index, 3", ArrayAndListUtilities.findIt(nums, 4));
		assertEquals("We couldn't find that number", ArrayAndListUtilities.findIt(nums, 11));
	}
	
	@Test
	public void testFindItL() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(5);
		nums.add(11);
		nums.add(45);
		nums.add(7);
		assertEquals("Found at index, 1", ArrayAndListUtilities.findIt(nums, 11));
		assertEquals("We couldn't find that number", ArrayAndListUtilities.findIt(nums, 95));
	}
	
	@Test
	public void testBubbleSortV1() {
		int[] numbers = {56, 10, 23, 43, 65, 32};
		int[] expected = {10, 23, 32, 43, 56, 65};
		ArrayAndListUtilities.bubbleV1(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test
	public void testBubbleSortV2() {
		int[] numbers = {56, 10, 23, 43, 65, 32};
		int[] expected = {10, 23, 32, 43, 56, 65};
		ArrayAndListUtilities.bubbleV2(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test
	public void testBubbleSortV3() {
		int[] numbers = {56, 10, 23, 43, 65, 32};
		int[] expected = {10, 23, 32, 43, 56, 65};
		ArrayAndListUtilities.bubbleV3(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test
	public void testSelectionSort() {
		int[] numbers = {56, 10, 23, 43, 65, 32};
		int[] expected = {10, 23, 32, 43, 56, 65};
		ArrayAndListUtilities.selectionSort(numbers);
		assertArrayEquals(expected, numbers);
	}
	
	@Test
	public void testInsertionSort() {
		int[] numbers = {56, 10, 23, 43, 65, 32};
		int[] expected = {10, 23, 32, 43, 56, 65};
		ArrayAndListUtilities.insertionSort(numbers);
		assertArrayEquals(expected, numbers);
	}

}
