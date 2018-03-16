package JavaProgram2;

import java.time.LocalDate;

public class GetDayOfWeek {

	public static void main(String[] args) {

		LocalDate dt = LocalDate.of(2017, 12, 31);
		System.out.println(dt.getDayOfWeek());
}
}