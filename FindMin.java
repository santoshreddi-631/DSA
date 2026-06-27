
public class FindMin {
    public static void main(String[] args) {
        int[][] arr = {{2, 45, 67},
                      {4, 5, 69, 87},
                      {45, 89, 65, 66, 54}};
        // int target = 66;
        // int[] ans = search(arr, target);
        // System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    // static int min(int[] arr){
    //     int minV = arr[0];
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]<minV){
    //             minV = arr[i];
    //         }
    //     }
    //     return minV;
    // }

    // static int[] search(int[][] arr, int target) {
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr[i].length; j++) {
    //             if (arr[i][j] == target) {
    //                 return new int[] {i, j};
    //             }
    //         }
    //     }
    //     return new int[] {-1, -1};
    // }

    static int max(int[][] arr) {
        int maxValue = arr[0][0];
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         if (arr[i][j] > maxValue) {
        //             maxValue = arr[i][j];
        //         }
        //     }
        // }


        for(int[] row:arr){
            for(int element : row){
                if(element > maxValue)
                    maxValue =element;
            }
        }
        return maxValue;
    }
}
