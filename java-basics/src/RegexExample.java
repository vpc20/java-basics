import java.util.regex.*;

public class RegexExample {
    public static void main(String[] args) {
        String text = "My email is hello@example.com and phone is 123-456-7890";

        // 1. TEST - check if pattern exists
        boolean hasEmail = text.matches(".*[\\w.]+@[\\w.]+\\.\\w+.*");
        System.out.println("Has email: " + hasEmail); // true

        // 2. FIND - extract first match
        Pattern emailPattern = Pattern.compile("[\\w.]+@[\\w.]+\\.\\w+");
        Matcher matcher = emailPattern.matcher(text);
        if (matcher.find()) {
            System.out.println("Email: " + matcher.group()); // hello@example.com
        }

        // 3. FIND ALL - extract all matches
        Pattern phonePattern = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");
        Matcher m = phonePattern.matcher(text);
        while (m.find()) {
            System.out.println("Phone: " + m.group()); // 123-456-7890
        }

        // 4. REPLACE
        String cleaned = text.replaceAll("\\d{3}-\\d{3}-\\d{4}", "XXX-XXX-XXXX");
        System.out.println(cleaned);

        // 5. SPLIT
        String csv = "one,two,,three";
        String[] parts = csv.split(",+"); // split on one or more commas
        for (String p : parts) System.out.println(p);

        // 6. GROUPS - capture parts of a match
        Pattern datePattern = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        Matcher dm = datePattern.matcher("Date: 2024-03-15");
        if (dm.find()) {
            System.out.println("Year: "  + dm.group(1)); // 2024
            System.out.println("Month: " + dm.group(2)); // 03
            System.out.println("Day: "   + dm.group(3)); // 15
        }
    }
}