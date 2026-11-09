package agh.po.lab3;
import java.util.Map;
import java.util.HashMap;


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

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }


    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String a = map.get("a");
            String b = map.get("b");

            if (a.length() > b.length()) {
                map.put("c", a);
            } else if (b.length() > a.length()) {
                map.put("c", b);
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }
        return map;
    }



    public static void  main(String[] args){
        CodingBat codingBat = new CodingBat();
        System.out.println("wynik "+codingBat.array123(new int[]{2,2,3,4,2}));
        System.out.println("wynik "+codingBat.array123(new int[]{2,1,2,3,2}));
        System.out.println("wynik "+codingBat.array123(new int[]{2,2,3,4,2}));

        System.out.println("wynik "+codingBat.lucky13(new int[]{2,2,3,4,2}));

        System.out.println("wynik "+codingBat.left2("Hello")); 


    }

}


