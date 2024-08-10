package day06;


import java.time.LocalTime;

public class P06_dateTime {
    public static void main(String[] args) {
        LocalTime bugun=LocalTime.now();

       // System.out.println(bugun.getHour()+":"+bugun.getMinute()+":"+bugun.getSecond());
        System.out.println(bugun);
    }
}
