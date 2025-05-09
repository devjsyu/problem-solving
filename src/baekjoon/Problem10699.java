package baekjoon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// LocalDate, LocalDateTime, DateTimeFormatter API 사용
// LocalDateTime의 plusHours 메서드 사용
public class Problem10699 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime adjustedDateTime = dateTime.plusHours(9);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        String formattedDate = formatter.format(adjustedDateTime);
        System.out.println(formattedDate);
    }
}
