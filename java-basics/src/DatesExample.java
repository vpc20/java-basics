void main() {

    LocalDate today = LocalDate.now();
    LocalDateTime now = LocalDateTime.now();
    ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("America/New_York"));

    IO.println(today);
    IO.println(now);
    IO.println(zoned);

    // Quick arithmetic example:
    LocalDate start = LocalDate.of(2024, 1, 15);
    LocalDate end = start.plusMonths(3).minusDays(5); // April 10

    LocalDateTime t1 = LocalDateTime.of(2024, 1, 15, 12, 10, 15);
    LocalDateTime t2 = t1.plusDays(1); // April 10


    IO.println(start.plusDays(4));
    IO.println(start.plusMonths(3));
    IO.println(start.plusYears(3));

    IO.println(start.minusDays(4));
    IO.println(start.minusMonths(3));
    IO.println(start.minusYears(3));

    // How many days/weeks/hours apart?
    long days = ChronoUnit.DAYS.between(start, end);
    IO.println(days);
    long weeks = ChronoUnit.WEEKS.between(start, end);
    IO.println(weeks);
    long hours = ChronoUnit.HOURS.between(t1, t2);
    IO.println(hours);
    // Works with LocalDate, LocalDateTime, ZonedDateTime

    // Human-readable gap
    Period p = Period.between(start, end);
    IO.println(p.getMonths() + " months, " + p.getDays() + " days");

    // comparison
    IO.println(start.isBefore(end));
    IO.println(start.isAfter(end));
    IO.println(start.isEqual(end));
    IO.println(start.compareTo(end));
    IO.println(start.equals(end)); // structural equality test

    // Adjusting to specific points (using TemporalAdjusters):
    LocalDate firstOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
    IO.println(firstOfMonth);
    LocalDate nextMonday = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
    IO.println(nextMonday);
    LocalDate lastOfYear = today.with(TemporalAdjusters.lastDayOfYear());
    IO.println(lastOfYear);

}
