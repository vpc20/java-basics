public class StringsExample {
    static void main() {
        String s = "Hello World!";
        System.out.println(s);
        System.out.println("String length: " + s.length());

        int pos = 1;
        System.out.println("Character at pos 1: " + s.charAt(pos));

        int start = 1;
        int end = 4;
        // the length of the substring is endIndex-beginIndex.
        System.out.println("Substring from position 1 to 3: " +  s.substring(start, end));

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.trim());

        System.out.println("String contains 'asdf': " + s.contains("asdf"));
        System.out.println("String contains 'Worl': " + s.contains("Worl"));

        //  Comparison: == vs. .equals()
        //  == operator: Compares the memory addresses (references).
        //  It checks if two variables point to the exact same object.
        // .equals() method: Compares the actual text content.
        // This is the standard way to check if two strings are "the same".
        System.out.println("String equals 'Hello World!' " + s.equals("Hello World!"));

        System.out.println(s.replace("World", "Earth"));

        // split("\\s+") to match all whitespaces
        for (String e : s.split(" ")){
            System.out.println(e);
        }

        String s1 = " asdf zxcv  ";
        System.out.println(s1.strip());
        System.out.println(s1.stripLeading());
        System.out.println(s1.stripTrailing());

        System.out.println(s.indexOf("World"));
        System.out.println(s.lastIndexOf("o"));

        System.out.println(s.repeat(2));

        System.out.println(s.startsWith("Hello"));
        System.out.println(s.endsWith("World!"));

        System.out.println(s.isBlank());  // empty or whitespaces only
        System.out.println(s.isEmpty());

    }
}
