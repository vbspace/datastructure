package arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = new int[] {0};
		int[] nums2 = new int[] {1};
		int m = 0, n = 1;
		
		merge(nums1, m, nums2, n);
		
		for(int numb : nums1) System.out.print(numb + " ");

	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int j = 0, i = 0;
		
        while(i < m - 1) {
        	if(nums2[j] <= nums1[i]) {
        		shiftToRight(nums1, i, nums2[j]);
        		j++;
        		i++;
        	}
        	
        	i++;
        }
        
        if(j < n) {
        	for(int k = i + 1; k < (m + n); k++) {
        		nums1[k] = nums2[j++];
        	}
        }
    }
	
	public static void shiftToRight(int[] arr, int starting, int toAdd) {
		for(int i = arr.length - 1; i > starting; i--) {
			arr[i] = arr[i - 1];
		}
		
		arr[starting] = toAdd;
	}

}