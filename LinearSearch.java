class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {1,23,56,7,76,3,-1,34,67};
        int target = 76;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr , int target){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}