package warm_up_challenges;

import java.util.List;

public class JumpingOnTheClouds {
    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        System.out.println("List is: " + c.toString());
        int jumps = 0;
        int index = 0;
        while (index>=0 && index<c.size()){
            index +=2;
            if (index<c.size() && c.get(index) == 0) {
                System.out.println("Inside first if");
                jumps++;
            } else if (index-1<c.size() && c.get(index -1) == 0){
                System.out.println("Inside second if");
                jumps++;
                index--;
            }
            System.out.println(String.format("Index is: %d, Jumps count: %d", index, jumps));
        }
        return jumps;
    }
}
