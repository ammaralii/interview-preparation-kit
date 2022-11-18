### Question 1
Write a function to check whether two given strings are anagrams of each
other. An anagram of a string is another string that contains the same
characters, only the order of characters can be different. 

**Examples:**
```
Input:
s1="ABCD"
s2="DABC"

Return:
true
```

```
Input:
s1="AABB"
s2="BBAA"

Return:
true
```

```
Input:
s1="AAAB"
s2="AABB"

Return:
false
```

### Question 2
Write an algorithm that given a string containing any combination of the characters
'(', ')', '{', '}', '[' and ']', determines if the input string is valid.

An input string is valid when:

- Opening parentheses are closed by the same type of closing parentheses, and
- Opening parentheses are closed in the correct order.

**Examples:**
```
Input:
string="()"

Return:
true
```

```
Input:
string="()[]{}"

Return:
true
```

```
Input:
string="(]"

Return:
false
```

```
Input:
string="([)])"

Return:
false
```