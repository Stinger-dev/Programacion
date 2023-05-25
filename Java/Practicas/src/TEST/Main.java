package TEST;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[]tmp = {1,2,2,2,3,3,4,4};
	
		System.out.println(	removeDuplicates(tmp));
		
	}
	public static int removeDuplicates(int[] nums) {
        System.out.println(Arrays.toString(nums));

	    int i = 0;
	    for (int n : nums)
	        if (i == 0 || n > nums[i-1]) {
	            nums[i++] = n;
	            System.out.println(Arrays.toString(nums));
	        }
	    return i;
	}
	

	  




}
