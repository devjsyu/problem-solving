package baekjoon;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

// Date, DateFormat(추상클래스), SimpleDateFormat(구현체), TimeZome 객체 이용해서 최대한 문제와 가깝게 풀이해보기
public class Problem10699_answer {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        df.setTimeZone(TimeZone.getTimeZone("Seoul/Asia"));
        System.out.println(df.format(date));
    }
}
