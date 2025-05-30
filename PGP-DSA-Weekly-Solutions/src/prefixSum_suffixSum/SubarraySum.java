package prefixSum_suffixSum;
//https://leetcode.com/problems/subarray-sum-equals-k/
import java.util.HashMap;

class SubarraySum {
    public int subarraySum(int[] nums, int k) {

    //BF: TC O(n^2),SC O(1);
    // int n = nums.length;
    // int count=0;
    // for(int i =0;i<n;i++){
    //     int sum=0;
    //     for(int j=i;j<n;j++){
    //         sum = sum+nums[j];
    //            if(sum==k){
    //             count++;
    //             }
    //         }
    //     }
    //     return count;
    // }

    int prefixSum = 0;
    int count = 0;

    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1); //base elements;

    for(int num : nums){

        prefixSum +=num;
        if(map.containsKey(prefixSum-k)){
            count += map.get(prefixSum-k);

        }
        map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
    }
    return count;
    }
}