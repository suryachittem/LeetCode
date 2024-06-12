
    public class infiniteArray {
        public static void main(String[] args) {
            int[] nums = {1, 3, 7, 9, 12, 33, 67, 78,89,90,91,92,95,99};
            int target = 99;
            System.out.println(range(nums, target));

        }

        static int range(int[] nums, int target) {
            int start = 0;
            int end = 1;
            while (target > nums[end]) {
                int newstart = end + 1;
                end = end + (end - start + 1) * 2;
                start = newstart;
            }
            return searchRange(nums, target, start, end);
        }

        static int searchRange(int[] nums, int target, int start, int end) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > nums[mid]) {
                    start = mid + 1;
                } else if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }




