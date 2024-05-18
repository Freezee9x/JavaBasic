import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static java.util.Calendar.*;

public class TestDate {
    public static void main(String[] args) {

        //In ra ngày giờ hiện tại
        java.util.Date date = getInstance().getTime();
        System.out.println(date);

        //In ra ngày giờ sau ngày giờ hiện tại 2 tháng
        Calendar date2m = getInstance();
        date2m.add(MONTH, 2);
        System.out.println(date2m.getTime());

        //In ra ngày giờ trước ngày giờ hiện tại 1 tháng
        Calendar date1m = getInstance();
        date1m.add(MONTH, -1);
        System.out.println(date1m.getTime());

        //Tính và in ra thời gian cuối cùng trong ngày hiện tại (không cộng chuỗi)
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        calendar.set(Calendar.MILLISECOND, 0);
        System.out.printf("%1$tY-%1$tm-%1$td %1$tT%n",calendar);
        //Tính và in ra thời gian đầu tiên trong ngày hiện tại (không cộng chuỗi)
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.HOUR_OF_DAY, 0);
        calendar1.set(Calendar.MINUTE,0 );
        calendar1.set(Calendar.SECOND, 0);
        calendar1.set(Calendar.MILLISECOND, 0);
        System.out.printf("%1$tY-%1$tm-%1$td %1$tT%n",calendar1);

    }
}