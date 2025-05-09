package baekjoon;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

// Date 객체는 옛날 API이기 때문에 메서드도 부족하고 가변객체이기 때문에 멀티스레드 환경에서 thread-safe하지 않기 때문에 사용 지양해야 한다.
// LocalDateTime에는 TimeZone 관련 정보가 포함되어 있지 않다.
// 동시에 공유 자원에 접근하는 상황일 때, 원본 객체를 임의로 변경해버리면 변경된 상태가 다른 스레드에게도 영향을 미칠 수 있다.
public class Problem10699_answer_r1 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Seoul"));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        String format = df.format(zonedDateTime);
        System.out.println(format);
    }
}
