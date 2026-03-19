import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DatesExample {
    static void main() {

        LocalDate today = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("America/New_York"));

        System.out.println(today);
        System.out.println(now);
        System.out.println(zoned);

        // Quick arithmetic example:
        LocalDate start = LocalDate.of(2024, 1, 15);
        LocalDate end = start.plusMonths(3).minusDays(5); // April 10

        LocalDateTime t1 = LocalDateTime.of(2024, 1, 15, 12, 10, 15);
        LocalDateTime t2 = t1.plusDays(1); // April 10


        System.out.println(start.plusDays(4));
        System.out.println(start.plusMonths(3));
        System.out.println(start.plusYears(3));

        System.out.println(start.minusDays(4));
        System.out.println(start.minusMonths(3));
        System.out.println(start.minusYears(3));

        // How many days/weeks/hours apart?
        long days = ChronoUnit.DAYS.between(start, end);
        System.out.println(days);
        long weeks = ChronoUnit.WEEKS.between(start, end);
        System.out.println(weeks);
        long hours = ChronoUnit.HOURS.between(t1, t2);
        System.out.println(hours);
        // Works with LocalDate, LocalDateTime, ZonedDateTime

        // Human-readable gap
        Period p = Period.between(start, end);
        System.out.println(p.getMonths() + " months, " + p.getDays() + " days");

        // comparison
        System.out.println(start.isBefore(end));
        System.out.println(start.isAfter(end));
        System.out.println(start.isEqual(end));
        System.out.println(start.compareTo(end));
        System.out.println(start.equals(end)); // structural equality test

        // Adjusting to specific points (using TemporalAdjusters):
        LocalDate firstOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstOfMonth);
        LocalDate nextMonday = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(nextMonday);
        LocalDate lastOfYear = today.with(TemporalAdjusters.lastDayOfYear());
        System.out.println(lastOfYear);

    }

}
