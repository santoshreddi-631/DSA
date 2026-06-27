public class LeetCode1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,1745};
        System.out.println(evenDigits(nums));
        System.out.println(digitsOptimized(85264));
    }
    static int evenDigits(int[] nums){
        int count =0;
        for(int ele : nums){
            if(even(ele)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int number = digits(num);
        if(number%2==0){
            return true;
        }
        return false;
        //return number%2==0;
    }

    static int digits(int num){
        if(num<0){
            num = num * -1;
        }
        if(num==0){
            return 1;
        }
        int count =0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }


    //optimized solution Here
    static int digitsOptimized(int num){
        if(num<0){
            num = num * -1;  // for converting neg to pov
        }
        if(num==0){
            return 1;
        }
        return (int)(Math.log10(num))+1;
    }
}
