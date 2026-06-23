import java.util.*;
class ArraysExample {
  public static  void  main(String[] args){
      Scanner sc = new Scanner(System.in);
    //   int[] arr  = new int[5]; 
    // //input
    //   for(int i=0;i<arr.length;i++){
    //     arr[i] = sc.nextInt();
    //   }
    //   for(int num : arr){
    //     System.out.println(num+" ");
    //   }


      //2D arrays
      // int[][] arr2 = new int[3][2];
      // for(int i=0;i<arr2.length;i++){
      //   for(int j=0;j<arr2[i].length;j++){
      //     arr2[i][j] = sc.nextInt();
      //   }
      // }

      // for(int[] a : arr2){
      //   System.out.print(Arrays.toString(a));
      // }


      //ArraysList
      // ArrayList<Integer> list = new ArrayList<>();
      // list.add(10);
      // System.out.println(list);
      // for(int i=0;i<3;i++){
      //   list.add(sc.nextInt());
      // }
      // System.out.println(list.contains(30));
      // System.out.println(list.get(2));
      // System.out.println(list.remove(3)); // removed element is returned
      // System.out.println(list.set(2, 99)); //replaced element is returned
      // System.out.println(list);

      //2D ArrayList
      // ArrayList<ArrayList<Integer>> list  = new ArrayList<>();
      // for(int i=0;i<3;i++){
      //   list.add(new ArrayList<>());
      // }
      // for(int i=0;i<3;i++){
      //   for(int j=0;j<3;j++){
      //     list.get(i).add(sc.nextInt());
      //   }
      // }

      // System.out.print(list);

      //Q1 Swaping

      // int arr[] = {1,3,56,7,9};
      // swap(arr,1,3);
      // System.out.println(Arrays.toString(arr));

      //Q2 Max Value in an Array
      // int nums[] = {1,3,56,7,9};
      
      // System.out.println(max(nums));


      //Q3 Reverse ana Array by using twoPointers
      int nums[] = {1,3,56,7,9};
      reverse(nums);
      System.out.println(Arrays.toString(nums));


  }

      static void swap(int[] arr , int s , int e){
        int temp = arr[s];
        arr[s] =arr[e];
        arr[e] = temp;
      }


      // static int max(int[] arr){
      //   int maxValue = arr[0];
      //   for(int i=0;i<arr.length;i++){
      //     if(arr[i]>maxValue){
      //       maxValue = arr[i];
      //     }
      //   }
      //   return maxValue;
      // }

      static void reverse(int[] arr){
        int s=0;
        int e  = arr.length-1;
        while(s<e){
          swap(arr ,s,e);
          s++;
          e--;
        }
      }
}
