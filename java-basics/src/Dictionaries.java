void main() {

//  HashMap — fastest, unordered
    Map<String, Integer> map = new HashMap<>();
    map.put("apple", 1);
    map.put("banana", 2);

    System.out.println(map.get("apple"));  // → 1
    System.out.println(map.containsKey("banana"));  // → true
    map.remove("apple");
    System.out.println(map.size());  // → 1

//    LinkedHashMap — maintains insertion order
    Map<String, Integer> lmap = new LinkedHashMap<>();

//    TreeMap — sorted by key
    Map<String, Integer> tmap = new TreeMap<>();
// keys will always be in alphabetical/natural order


//    Common Operations
    Map<String, String> dict = new HashMap<>();

// Add / update
    dict.put("key", "value");

// Read
    System.out.println(dict.get("key"));                      // "value", or null if missing
    System.out.println(dict.getOrDefault("missing", "N/A"));  // safe fallback

// Check existence
    System.out.println(dict.containsKey("key"));   // true
    System.out.println(dict.containsValue("value")); // true

// Delete
    dict.remove("key");

// Iterate
    dict.put("a", "apple");
    dict.put("b", "bananna");
    dict.put("c", "cherry");
    for (Map.Entry<String, String> entry : dict.entrySet()) {
        System.out.println(entry.getKey() + " = " + entry.getValue());
    }

// Keys / values only
    System.out.println(dict.keySet());    // Set of keys
    System.out.println(dict.values());    // Collection of values

    for (String s : dict.keySet()) {
        System.out.println(dict.get(s));
    }

}