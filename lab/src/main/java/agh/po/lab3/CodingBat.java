package agh.po.lab3;

public class CodingBat {
    public boolean array123(int[] nums) {
        for (int i=0; i < (nums.length-2); i++) {
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }

    public boolean lucky13(int[] nums) {
        for(int i = 0; i<nums.length;i++)
        {
            if(nums[i]==1 ||nums[i]==3)
                return false;
        }
        return true;
    }


    public static void  main(String[] args){
        CodingBat codingBat = new CodingBat();
        System.out.println("wynik "+codingBat.array123(new int[]{2,2,3,4,2}));
        System.out.println("wynik "+codingBat.array123(new int[]{2,1,2,3,2}));
        System.out.println("wynik "+codingBat.array123(new int[]{2,2,3,4,2}));

        System.out.println("wynik "+codingBat.lucky13(new int[]{2,2,3,4,2}));


    }

}


