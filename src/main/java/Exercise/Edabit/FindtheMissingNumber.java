package Exercise.Edabit;

import java.util.Arrays;
//todo
public class FindtheMissingNumber {
    public static void main(String[] args) {
        int[] nums = {7, 2, 3, 6, 5, 9, 1, 4, 8};
        System.out.println(missingNums(nums));

    }
    public static int missingNums(int[] nums) {
        int[] newNums = Arrays.stream(nums).sorted().toArray();
        int result =0;
        int[] testArray = {1,2,3,4,5,6,7,8,9,10};
        for(int i =0; i < newNums.length; i++){
            for (int j =0; j<testArray.length; j++){
            if(testArray[j]!=newNums[i]){
                result = testArray[i];
            }
            }
        }
return result;
    }
}
