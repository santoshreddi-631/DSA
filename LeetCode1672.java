public class LeetCode1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,3,4},{2,0,5}};
        System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts){
        int ans =Integer.MIN_VALUE;
        for(int[] ints : accounts){
            //when ou start a new coloumn you need to reset the sum 
            int sum =0;
            for(int element : ints){
                sum+=element;
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
