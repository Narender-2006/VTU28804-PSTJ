//TASK-2.1(DAY OF THE YEAR)
import java.time.*;
class Solution {
    public int dayOfYear(String date) {
        LocalDate ld=LocalDate.parse(date);
        return ld.getDayOfYear();
    }
    public static void main(String a[]){
        Solution obj=new Solution();
        int result=obj.dayOfYear("2026-08-04");
        System.out.println(result);
    }
}
//TAASK-2.2(DAY OF THE WEEK)
import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;   
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate ld=LocalDate.of(year,month,day);
        return ld.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
    public static void main(String a[]){
        Solution obj=new Solution();
        String result=obj.dayOfTheWeek(31,8,2019);
        System.out.println(result);
    }
}
