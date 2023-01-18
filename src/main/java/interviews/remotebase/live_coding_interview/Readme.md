### Question 1 (Pattern Searching)

#### Description

Suppose that we have a text and a pattern. We need to determine if the pattern exists in the text or not. 	

For example:
```
+-------+---+---+---+---+---+---+---+---+
| Index | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
+-------+---+---+---+---+---+---+---+---+
| Text  | a | b | c | b | c | g | l | x |
+-------+---+---+---+---+---+---+---+---+
+---------+---+---+---+---+
| Index | 0 | 1 | 2 |
+---------+---+---+---+---+
| Pattern | g | l | x |
+---------+---+---+---+---+
```
The algorithm that you are going to write searches for occurrences of a "Pattern" within a main "Text" by employing the observation that when a mismatch occurs, the word itself embodies sufficient information to determine where the next match could begin, thus bypassing re-examination of previously matched characters. Give me a detailed pseudo code of how it will work and what is its time complexity of worst case and best case? What about the space complexity?

### Sample Test Cases
#### Test Case 1:
##### Sample Input
```
text = "abcbcglx"
pattern = "glx"
```

##### Sample Output
```
Found pattern at index 5
```

#### Test Case 2:
##### Sample Input
```
text = "abcabcxyzabcxxyzyxyz"
pattern = "xyz"
```

##### Sample Output
```
Found pattern at index 6
Found pattern at index 13
Found pattern at index 17
```

#### Test Case 3:
##### Sample Input
```
text = "abcdef ghijkl"
pattern = "xyz"
```

##### Sample Output
```
No Pattern Found
```