public class splitArray {
    public static void main(String[] args) {
        int[] arr = {4,6,7,1,9,12,13,15,10};
        System.out.println(splitArray(arr,3));
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i=0;i<nums.length;i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }

        while(start<end){
            int mid = start + (end-start)/2 ;

            int sum = 0;
            int pieces =1;

            for(int num:nums){
                if(sum + num >mid){

                    sum=num;
                    pieces++;
                }
                else{
                    sum += num;
                }
            }
            if(pieces > k){
                start = mid + 1;
            } else{
                end = mid;
            }
        }

        return end; // or return start;
    }

}
