# 🧠 DSA Notes: Two Pointers & HashMap

---

## 1️⃣ Two Pointers Technique

The **Two Pointers** technique is a highly efficient pattern used to solve problems involving arrays or strings. It is typically used to achieve `O(N)` time complexity and `O(1)` space complexity.

### 📌 When to use Two Pointers?
- When dealing with **sorted arrays** or strings.
- When searching for pairs that meet a specific condition (e.g., Target Sum).
- Reversing an array or string.
- Finding palindromes.

### 📌 Common Patterns

**1. Opposite Ends (Left and Right Pointers)**
Used when you need to compare elements from both ends and move inwards.
```java
int left = 0;
int right = arr.length - 1;

while (left < right) {
    if (condition_met) {
        // do something
        left++;
        right--;
    } else if (other_condition) {
        left++; // move left pointer
    } else {
        right--; // move right pointer
    }
}
```
*Examples:* Reverse String, Valid Palindrome, Two Sum (Sorted).

**2. Fast and Slow Pointers (Tortoise and Hare)**
Used for linked lists or cyclic arrays to find loops or the middle element.
```java
int slow = 0;
int fast = 0;
while (fast < arr.length && fast.next != null) {
    slow++;
    fast += 2;
}
```

---

## 2️⃣ HashMap (Hashing)

A **HashMap** is a data structure that implements the Map interface and stores data in **Key-Value pairs**. It uses a technique called hashing to store elements, which provides `O(1)` average time complexity for insertions and lookups.

### 📌 When to use HashMap?
- Counting frequencies (e.g., character frequency in a string, finding duplicates).
- When you need fast `O(1)` lookups for a specific key.
- Mapping relationships (e.g., mapping a Person's Name to their Age).

### 📌 Core Java Methods

```java
HashMap<Character, Integer> map = new HashMap<>();

// 1. Insert a Key-Value pair
map.put('a', 1);

// 2. Get the value for a Key
int count = map.get('a'); // returns 1

// 3. Check if a Key exists (Very Important!)
if (map.containsKey('b')) { ... }

// 4. Update a value
map.put('a', map.get('a') + 1);

// 5. Iterate over a HashMap
for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    System.out.println(entry.getKey() + " : " + entry.getValue());
}
```

### 📌 HashMap vs LinkedHashMap

- **`HashMap`**: Does **NOT** maintain any order. The keys can appear in a random order when you iterate through them.
- **`LinkedHashMap`**: Maintains **Insertion Order**. If you want the keys to stay in the exact order you added them, use `LinkedHashMap`.

*Example of LinkedHashMap (used for Character Frequency):*
```java
LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
// This will keep the characters in the order they appeared in the string!
```
