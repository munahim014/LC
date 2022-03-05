class Solution {
    // the key thing is to use mode for last digit
    // O(n) time since we iterate to length n | O(1) space no additoanal data structures
    public int subtractProductAndSum(int n) {
         int [] arr={5, 7, 4 }; 
        Arrays.sort(arr); 
        System.out.println(Arrays.toString(arr)); 
        
        
        int sum = 0;
        int prod = 1;
        
        while(n>0){ 
            int remainder = n%10; //4, 3
            sum += remainder; //4, 7
            prod *= remainder;//4, 12
            n= n/10;// 23
        }
        return prod-sum;
    }
}