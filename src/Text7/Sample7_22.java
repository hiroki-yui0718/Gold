package Text7;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class Sample7_22 {
	public static void main(String[] args) {
		Instant pointA = Instant.now();
		System.out.println(pointA);
		Instant pointB = Instant.ofEpochSecond(0);
		System.out.println(pointB);
		Instant pointC = ZonedDateTime.now().toInstant();
		System.out.println(pointC);
		System.out.println(ZoneId.systemDefault());
		Temporal t = ChronoUnit.DAYS.addTo(pointA, 5);
		System.out.print(t);
	}
}
