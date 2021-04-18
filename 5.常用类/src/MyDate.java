import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {               // Date and Calendar
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd hh:mm:ss");

        System.out.println(sdf.format(new Date()));
        try {
            System.out.println(sdf.parse("21-1-10 1:00:1"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            MyDate.printWorkState(new SimpleDateFormat("yyyy-MM-dd").parse("2020-09-07"));
            MyDate.printWorkState(new SimpleDateFormat("yyyy-MM-dd").parse("2020-09-08"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = new GregorianCalendar();
//        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, 30);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        calendar.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.getTime());
        try {
            calendar.setTime((new SimpleDateFormat("yyyy-MM-dd")).parse("1990-09-21 "));
            System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    private static void printWorkState(Date date) {
        try {
            long time = date.getTime() - new SimpleDateFormat("yyyy-MM-dd").parse("1990-01-01").getTime();

            long last =  time / (1000 * 3600 * 24) % 5 + 1;
            System.out.println(last);
            if(last >= 3) {
                System.out.println("两天晒网");
            } else{
                System.out.println("三天打鱼");
            }
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }
}
