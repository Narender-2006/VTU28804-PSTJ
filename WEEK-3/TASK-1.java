//TASK-1.1(JAVA DATE AND TIME)
class Result{
 public static String findDay(int month, int day, int year) {
          LocalDate ld=LocalDate.of(year, month, day);
          return ld.getDayOfWeek().toString(); }}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);
        String res = Result.findDay(month, day, year);
        bufferedWriter.write(res);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close(); }}
//TASK-1.2(NO.OF DAYS BETWEEN TWO DATES)
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        DateTimeFormatter fmt=DateTimeFormatter.ofPattern("yyyy-mm-dd");
        LocalDate dates1=LocalDate.parse(date1);
        LocalDate dates2=LocalDate.parse(date2);
        int difference=(int)ChronoUnit.DAYS.between(dates2, dates1);
        return Math.abs((int) difference);
    }
    public static void main(String a[]){
        Solution obj=new Solution();
        System.out.println(obj.daysBetweenDates("2019-06-29","2019-06-30"));
    }
}
