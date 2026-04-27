class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int toSearch = target - numbers[i];
            int index = -1;
            if (numbers[i] > toSearch) {
                index = binarySearch(numbers, 0, i - 1, toSearch);
            } else {
                index = binarySearch(numbers, i+1, numbers.length-1, toSearch);
            }

            if (index != -1) {
                return new int[] { i + 1, index + 1 };
            }

        }
        return new int[]{-1,-1};
    }

      int binarySearch(int[] num, int l, int r, int val) {
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (num[mid] == val) {
                return mid;
            } else if (num[mid] > val) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
