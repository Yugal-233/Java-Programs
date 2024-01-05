package com.java.programs;

public class TripletArray {
            public static void main(String[] args) {

                int [] nums = {1, 3, 2, 7, 4, 0, 9, 5};
                int target = 9;
                for (int i = 0; i < nums.length-2; i++) {
                    for (int j = i+1; j < nums.length-1; j++) {
                        for (int k = j+1; k < nums.length; k++) {
                            if(nums[i]+nums[j]+nums[k]==target){
                                System.out.println(nums[i]+" "+nums[j]+" "+nums[k]);
                            }
                        }
                    }
                }
    }
}
