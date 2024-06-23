import java.util.Arrays;
import java.util.Comparator;

public class Largestnumber {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 9};
        System.out.print(largestNumber(nums));
    }
    public static String largestNumber(int[] nums) {
        String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(arr,new Comparator<String>()
        {
            public int compare(String a,String b)
            {
                String o1=a+b;
                String o2=b+a;
                return o2.compareTo(o1);
            }
        });
        if(arr[0].equals("0"))
        {
            return "0";
        }
        StringBuilder result=new StringBuilder();
        for(String num : arr)
        {
            result.append(num);
        }
        return result.toString();
    }
}
