package easy;

public class MergeSortedArray_88 {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int len1=m-1;
        int len2=n-1;
        int index=m+n-1;
        System.out.println(len1+" "+len2+" "+index);
        while(len1>=0&&len2>=0){
        	if(nums1[len1]>nums2[len2]){
        		nums1[index]=nums1[len1];
        		index--;
        		len1--;
        	}
        	else{
        		nums1[index]=nums2[len2];
        		index--;
        		len2--;
        	}
        }
        System.out.println(index);
        while(len2>=0){
            nums1[index] = nums2[len2];
            index--;
            len2--;
        }
    }
}
