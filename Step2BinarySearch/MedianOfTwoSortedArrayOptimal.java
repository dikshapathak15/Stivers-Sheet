package Step2BinarySearch;

public class MedianOfTwoSortedArrayOptimal {
    public static double findMedianSortedArrays(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;
        
        // Ensure first array is the smaller one
        if (n1 > n2) {
            return findMedianSortedArrays(b, a);
        }
        
        int low = 0, high = n1;
        int totalLeft = (n1 + n2 + 1) / 2;
        
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = totalLeft - mid1;
            
            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : a[mid1 - 1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : b[mid2 - 1];
            int r1 = (mid1 == n1) ? Integer.MAX_VALUE : a[mid1];
            int r2 = (mid2 == n2) ? Integer.MAX_VALUE : b[mid2];
            
            // Valid partition condition
            if (l1 <= r2 && l2 <= r1) {
                // If total length is even
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                } else { // Odd length
                    return Math.max(l1, l2);
                }
            } 
            // Move left in a[]
            else if (l1 > r2) {
                high = mid1 - 1;
            } 
            // Move right in a[]
            else {
                low = mid1 + 1;
            }
        }
        
        return 0.0; // Should never reach here
    }
    public static void main(String[] args) {
        int a[] = {2,3,5,7};
        int b[] = {11,12,15,17};
        double result = findMedianSortedArrays(a,b);
        System.out.println("The median is: " + result);
    }
}
//tc = 0(n)
//tc = 0(1)