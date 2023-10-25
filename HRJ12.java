import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Locale;

class Result {
    
    public static String findDay(int month, int day, int year) {
        Calendar cal=Calendar.getInstance();
        cal.set(cal.MONTH,month-1);
        cal.set(cal.DAY_OF_MONTH,day);
        cal.set(cal.YEAR,year);
        String week=cal.getDisplayName(cal.DAY_OF_WEEK,cal.LONG,Locale.US).toUpperCase();
        return week;
    }

}

public class HRJ12 {
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
        bufferedWriter.close();
    }

}
