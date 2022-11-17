### Question 1
Amazon Shopping recently launched a new item whose daily customer ratings for n days is represented by the array ratings. They monitor these ratings to identify products that are not performing well. Find the number of groups that can be formed consisting of 1 or more consecutive days such that the rating continuously decreases over the days.

The rating is consecutively decreasing if it has the form: r, 1-1, r - 2... and so on, where r is the rating on the first day of the group being considered. Two groups are considered different if they contain the ratings of different consecutive days. 

**Example**

ratings = [4, 3, 5, 4, 3]

There are 9 periods in which the rating consecutively decreases.

**5 one day periods:** [4], [3], [5], [4], [3] 

**3 two day periods:** [4, 3], [5,4], [4, 3] 

**1 three-day period:** [5, 4, 3]

These can be visualized in the figure shown below.

![img.png](question1_example.png)

**Tests Cases Examples:**
```
Input:
{2,1,3}

Return:
4
```

```
Input:
{4,3,5,4,3}

Return:
9
```

### Question 2