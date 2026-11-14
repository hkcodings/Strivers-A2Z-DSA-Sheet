
import java.util.Arrays;

class Main {

    public static int[] unionArray(int[] nums1, int[] nums2) {

        int[] resarr = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements from both arrays
        while (i < nums1.length && j < nums2.length) {

            int value;

            if (nums1[i] < nums2[j]) {
                value = nums1[i];
                i++;
            }
            else if (nums1[i] > nums2[j]) {
                value = nums2[j];
                j++;
            }
            else {
                value = nums1[i];
                i++;
                j++;
            }

            // Insert only if it is not a duplicate
            if (k == 0 || resarr[k - 1] != value) {
                resarr[k++] = value;
            }
        }

        // Process remaining elements of nums1
        while (i < nums1.length) {

            int value = nums1[i++];

            if (k == 0 || resarr[k - 1] != value) {
                resarr[k++] = value;
            }
        }

        // Process remaining elements of nums2
        while (j < nums2.length) {

            int value = nums2[j++];

            if (k == 0 || resarr[k - 1] != value) {
                resarr[k++] = value;
            }
        }

        // Return only populated elements
        return Arrays.copyOf(resarr, k);
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};

        int[] result1 = unionArray(nums1, nums2);

        System.out.println("Example 1: " + Arrays.toString(result1));

        int[] nums3 = {3, 4, 6, 7, 9, 9};
        int[] nums4 = {1, 5, 7, 8, 8};

        int[] result2 = unionArray(nums3, nums4);

        System.out.println("Example 2: " + Arrays.toString(result2));

        // Additional duplicate test
        int[] nums5 = {1, 1, 2, 3};
        int[] nums6 = {2, 3, 4, 4};

        int[] result3 = unionArray(nums5, nums6);

        System.out.println("Example 3: " + Arrays.toString(result3));
    }
}
