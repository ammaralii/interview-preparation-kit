# Question 1 (Maximize the value)
## Description
Rearrange an array of integers so that the calculated value U is maximized. Among the arrangements that satisfy that test, choose the array with minimal ordering. The value of U for an array with n elements is calculated as:

    U = arr[1]xarr[2]×(1÷arr[3])×arr[4]×...×arr[n-1] × (1÷arr[n]) if n is odd
    or
    U = arr[1]xarr[2]×(1÷arr[3])×arr[4]×...×(1÷arr[n-1]) × arr[n] if n is even

The sequence of operations is the same in either case, but the length of the array, n, determines whether the calculation ends on arr[n] or (1÷arr[n]).

Arrange the elements to maximize U so the items are in the numerically smallest possible order.

### Example
    arr = [21, 34, 5, 7, 9]

To maximize U and minimize the order, arrange the array as [9, 21, 5, 34, 7] so U = 9 × 21 × (1÷5) × 34 × (1÷7) = 183.6. The same U can be achieved using several other orders, e.g. [21, 9, 7, 34, 5] = 21 × 9 × (1÷7) × 34 × (1÷5) = 183.6, but they are not in the minimum order.

### Function Description
Complete the function rearrange in the editor.

rearrange has the following parameter(s):
    
    int arr[n]: an array of integers

### Returns
    int[n]: the elements of arr rearranged as described

### Constraints
- 1 ≤ n ≤ 10<sup>5</sup>
- 1 ≤ arr[i] ≤ 10<sup>9</sup>

# Question 2 (Team Formation)
## Description
FC Codelona is trying to assemble a team from a roster of available players. They have a minimum number of players they want to sign, and each player needs to have a skill rating within a certain range. Given a list of players' skill levels with desired upper and lower bounds, determine how many teams can be created from the list.

### Example
```
skills = [12, 4, 6, 13, 5, 10]
minPlayers = 3
minLevel = 4
maxLevel = 10
```
- The list includes players with skill levels [12, 4, 6, 13, 5, 10].
- They want to hire at least 3 players with skill levels between 4 and 10, inclusive.
- Four of the players with the following skill levels {4, 6, 5,10} meet the criteria.
- There are 5 ways to form a team of at least 3 players: {4, 5, 6}, {4, 6, 10}, {4, 5,10}, {5, 6, 10}, and {4, 5, 6, 10).
- Return 5.

### Function Description
Complete the function countTeams in the editor below.

count Teams has the following parameter(s):
```
int skills[n]: an array of integers that represent the skill level per player
int minPlayers, the minimum number of team members required 
int minLevel: the lower limit for skill level, inclusive
int-maxLevel: the upper limit for skill level, inclusive
```
### Return
int: the total number of teams that can be formed per the criteria

### Constraints
- 1≤ n ≤20
- 1 ≤ minPlayers ≤n
- 1 ≤ minLevel ≤ maxLevel ≤ 1000
- 1 ≤ skills[i] ≤ 1000

# Question 3 (Characters Swap)
## Description
Given a string s, repeat this operation zero or more times to create the lexicographically smallest string possible.
1. Select two characters that exists in the string, c1, and c2.
2. Replace all occurrences of c1 with c2 and all occurrences of c2 with c1.

Note: For two strings x and y of length n, x is lexicographically smaller than y if the first non-matching character in x is less than the character at that position in y.
### Example
    s="bbcacad"
- Select c1 = 'b' and c2 = 'a', after swapping occurrences, s= "aacbcbd".
- Select c1 = 'b' and c2 = 'c', after swapping occurrences of c1 and c1 we get s = "aabcbcd".

It can be proven that this is the lexicographically smallest string s can be converted to. Return "aabcbcd".

### Function Description
Complete the function getString in the editor below.

getString has the following parameter:
    
    string s: the string to process
### Returns
string: the lexicographically smallest string s can be changed to
### Constraints
- 1 ≤ |s| ≤ 10<sup>5</sup>
- The string s contains lowercase English letters.

# Question 4 (Merging Palindromes)
## Description
Given two strings, find all palindromes that can be formed with the letters of each string. From those palindromes, select one from each set that, when combined and rearranged, produces the longest palindrome possible. If there are multiple palindromes of that length, choose the alphabetically smallest of them.

### Example
    s1 = 'aabbc' 
    s2 = 'ddefefq'

All of the letters of the first string can make a palindrome. The choices using all letters are [abcba, bacab].

All of the letters of the second string can make a palindrome. The choices using all letters are [defqfed, dfeqefd, edfqfde, efdqdfe, fdeqedf, fedqdef].

The two longest results in s1 have a length of 5.

The six longest results in s2 have a length of 6.

From the longest results for s1 and s2, merge the two that form the lowest merged palindrome, alphabetically. In this case, choose abcba and defqfed. The two palindromes can be combined to form a single palindrome if either the cor the qis discarded. The alphabetically smallest combined palindrome is abdefcfedba.

### Function Description
Complete the function mergePalindromes in the editor below. The function must return a string.

mergePalindromes has the following parameter(s):

    string s1: a string
    string s2: a string

### Constraints
- 1 ≤ |s1| ≤ 10<sup>5</sup>
- 1 ≤ |s2| ≤ 10<sup>5</sup>
- s1 and s2 will contain only lowercase English letters in the range
ascii[a-z]