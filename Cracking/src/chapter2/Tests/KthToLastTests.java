package chapter2.Tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import chapter2.KthToLast;
import chapter2.Node;
import chapter2.RemoveDups;

public class KthToLastTests {

	@Test
	public void test() {
		
		Node list = new Node(0);
		
		int[] arr = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i = 0; i < arr.length; i++){
			list.appendToTail(arr[i]);
		}
		
		
		KthToLast k = new KthToLast();
		
		Node res = k.kThToLast(list, 5);

		Assert.assertEquals(5, res.data);
	}
	
	@Test
	public void test2() {
		
		Node list = new Node(0);
		
		int[] arr = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		
		for(int i = 0; i < arr.length; i++){
			list.appendToTail(arr[i]);
		}
		
		KthToLast k = new KthToLast();
		
		Node res = k.kThToLast(list, 5);

		Assert.assertEquals(15, res.data);
	}
}