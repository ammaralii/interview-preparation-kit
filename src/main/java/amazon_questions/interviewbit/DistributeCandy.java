package amazon_questions.interviewbit;

import java.util.List;

public class DistributeCandy {

    /**
     * <b>Single Pass Approach with Constant Space</b>
     * <br/>
     * This approach depends on the observations. In order to distribute candies according to the problem statement, always distribute candies in terms of increments of 1. The minimum number of candies each child will get is 1. So, in this case, the distribution may take the form like 1, 2, 3, …., n or n, …. , 3, 2, 1. We can add these number of candies that gives the minimum number of candies to distribute. The same can be achieved by using the following mathematical formula:
     * <br/>
     * <b>n(n+1)/2</b>
     * <br/><br/>
     * Candy Distribution Problem in Java
     * Now, we can see the given ranking that may either in increasing or decreasing order. Whenever the ranking slope will rise, the distribution will take the form 1, 2, 3, …., m. on the other hand, falling slope will take the form k, …. , 3, 2, 1.
     * <br/><br/>
     * Here, a challenge arises that the local peak point can be included in only one of the slopes either in rising or falling slope. So, we have to decide in which slope we must include local peak point (n).
     * <br/><br/>
     * The peak point should be max of the count determine by the rising and falling slope that satisfies both left and right neighbor criteria. In order to determine the number of candies required for distribution, the peak point should be included in the slope which contains a greater number of points.
     * <br/><br/>
     * Let's see the implementation of the approach.
     * <br/><br/>
     * In the following Java program, we have used two variables <b>oldSlope</b> and <b>newSlope</b> that is used to determine the occurrence of the peak and valley. For tracing the count of elements on rising and falling slope, we have defined two other variables <b>up and down</b>, respectively. Note that here, we have not included the peak element.
     * <br/><br/>
     * Update the total count of candies at the end of a falling slope. If the ranks are in a level of the point, means end of mountains in the graph. While, we reach at the end of the mountain, determine where we have to include peak point. It can be determined by comparing the variables <b>up</b> and <b>down</b> together and up to that point.
     * <br/><br/>
     * Thus, the count assigned to the peak element becomes <b>max(up, down) + 1</b>. At this point, reset up and down variables indicating the start of a new mountain.
     * <br/><br/>
     * The following figure shows the cases that need to be handled for this example:
     * <br/>
     * rankings: [1 2 3 4 5 3 2 1 2 6 5 4 3 3 2 1 1 3 3 3 4 2]
     * <br/>
     * <a href="https://static.javatpoint.com/coding-problems/images/candy-distribution-problem-in-java19.png">Ratings Graph for above array</a>
     * @param ratings
     * @return
     */
    public static int distribute(List<Integer> ratings) {
        if (ratings.size() <= 1) {
            return ratings.size();
        }
        int candies = 0;
        int up = 0;
        int down = 0;
        int oldSlope = 0;
        for (int i = 1; i < ratings.size(); i++) {
            int newSlope = (ratings.get(i) > ratings.get(i - 1)) ? 1 : (ratings.get(i) < ratings.get(i - 1) ? -1 : 0);
            if ((oldSlope > 0 && newSlope == 0) || (oldSlope < 0 && newSlope >= 0)) {
                candies = candies + count(up) + count(down) + Math.max(up, down);
                up = 0;
                down = 0;
            }
            if (newSlope > 0) {
                up++;
            } else if (newSlope < 0) {
                down++;
            } else {
                candies++;
            }
            oldSlope = newSlope;
        }
        candies = candies + count(up) + count(down) + Math.max(up, down) + 1;
        return candies;
    }

    private static int count(int n) {
        return (n * (n + 1)) / 2;
    }
}
