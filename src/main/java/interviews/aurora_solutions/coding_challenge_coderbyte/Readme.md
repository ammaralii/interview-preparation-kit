# Question 1 (String Challenge)
## Description
Have the function **StringChallenge(str)** take the **str** parameter being passed and determine if exactly three unique, 
single-digit integers occur within each word in the string. The integers can appear anywhere in the word, but they cannot 
be all adjacent to each other. If every word contains exactly 3 unique integers somewhere within it, then return the 
string true, otherwise return the string false. For example: if **str** is `"2hell6o3 wor6l7d2"` then your program 
should return `"true"` but if the string is `"hell268o w6or2l4d"` then your program should return `"false"` because all 
the integers are adjacent to each other in the first word.

### Examples
    Input: "2a3b5 w1o2rl3d g1gg92"
    Output: true

    Input: "21aa3a ggg4g4g6ggg"
    Output: false

# Question 2 (String Challenge)
## Description
Have the function **StringChallenge(str)** insert dashes `('-')` between each two odd numbers in **str**. For example: 
if str is `454793` the output should be `4547-9-3`. Don't count zero as an odd number.

### Examples
    Input: 99946
    Output: 9-9-946
    
    Input: 56730
    Output: 567-30

# Question 3 (Array Challenge)
## Description
Have the function **ArrayChallenge(arr)** take the array of integers stored in **arr**, and for each element in the list, 
search all the previous values for the nearest element that is smaller than (or equal to) the current element and create
a new list from these numbers. If there is no element before a certain position that is smaller, input a -1. For example: 
if **arr** is `[5, 2, 8, 3, 9, 12]` then the nearest smaller values list is `[-1, -1, 2, 2, 3, 9]`. The logic is as follows:

For `5`, there is no smaller previous value so the list so far is `[-1]`. For `2`, there is also no smaller previous 
value, so the list is now `[-1, -1]`. For `8`, the nearest smaller value is `2` so the list is now `[-1, -1, 2]`. For `3`, 
the nearest smaller value is also `2`, so the list is now `[-1, -1, 2, 2]`. This goes on to produce the answer above. 
Your program should take this final list and return the elements as a string separated by a space: `-1 -1 2 2 3 9`

### Examples
    Input: [5, 3, 1, 9, 7, 3, 4, 1]
    Output: -1 -1 -1 1 1 1 3 1
    
    Input: [2, 4, 5, 1, 7]
    Output: -1 2 4 -1 1

# Question 4 (Array Challenge)
## Description
Have the function **ArrayChallenge(arr)** take the array of numbers stored in **arr** and return the string `true` if 
any combination of numbers in the array (excluding the largest number) can be added up to equal the largest number in 
the array, otherwise return the string `false`. For example: if **arr** contains `[4, 6, 23, 10, 1, 3]` the output 
should return `true` because 4 + 6 + 10 + 3 = 23. The array will not be empty, will not contain all the same elements, 
and may contain negative numbers.

### Examples
    Input: [5,7,16,1,2]
    Output: false
    
    Input: [3,5,-1,8,12]
    Output: true
