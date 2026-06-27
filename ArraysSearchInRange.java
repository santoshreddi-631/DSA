public class ArraysSearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,3,45,67,890,23,45,22};
        int target = 23;
        int s =1 , e = 4;
        System.err.println(search(arr, target, s, e));
    }

    static int search(int[] arr , int target,int s ,int e){
        if(arr.length ==0)
            return Integer.MAX_VALUE;

        for(int i = s;i<=e;i++){
        if(target==arr[i])
            return i;
        }
        return Integer.MAX_VALUE;
    }
    
    
}
