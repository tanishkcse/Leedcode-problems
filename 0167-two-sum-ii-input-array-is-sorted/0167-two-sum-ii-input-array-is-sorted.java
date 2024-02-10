class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++){
            int j = BinarySearch(numbers, target - numbers[i]);
            if(j != -1 && j != i){

                // smaller index come first

                while(j<i){
                    int temp =i;
                    i=j;
                    j= temp;
                }
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public static int BinarySearch(int[] numbers, int target){
        int left = 0;
        int right = numbers.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(numbers[mid] == target){
                return mid;
            } else if(numbers[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
