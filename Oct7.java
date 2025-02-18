package JavaInterview;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

public class Oct7 {
	public static void main(String[] args) throws IOException {
		//2024 revamp week 8 after 15th invoice payment
		//Humayoon demoing inerviewQIntersection between two arrays
		//Gave Ying Dell
		int[] nums1 = {1,2,3,4,5};
		int[] nums2 = {4,5,6,7,3};
		//Oct11 Friday 
		System.out.println("2nd week Oct 2024 Back on G60 " +findIntersection(nums1,nums2));
		System.out.println("used TreeMap to return hashCode " +findMajority(nums1));
		System.out.println("correct function HashMap " +findMajorityArray(nums2));
	}
	public static HashMap<Integer,Integer> findMajorityArray(int[] c) throws RuntimeException {
	//public static Set<Integer> findMajorityArray(Integer c) {
		//the debugger asked to change return to [] - HashMap
		// throws IOException not allowed on funciton?
		HashMap<Integer, Integer> tem = new HashMap<>();
		int count = 0;
		for (int i:c) {
			tem.put(i,i^2+2);
		}
		// debugger added "cast" 10/7
			return (HashMap<Integer, Integer>) tem.clone();
	}
	
	public static int findMajority(int[] c) throws NoSuchElementException {
		TreeMap<Integer,Integer> temp = new TreeMap<>();
		temp.clear();
		temp.values();
		//return temp.firstKey();
		return temp.hashCode();  
	}
	
	public static ArrayList<Integer> findIntersection(int[]a, int[]b) {
		//do nothing first try
		ArrayList<Integer> res = new ArrayList<>();
		for (int i:a) {
			for (int j:b) {
				if (i==j) { 
					res.add(i);
					}
			}
		}
		return res;
	}
}
