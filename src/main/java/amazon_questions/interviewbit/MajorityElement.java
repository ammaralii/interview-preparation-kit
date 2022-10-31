package amazon_questions.interviewbit;

import java.util.List;

public class MajorityElement {
    public static int majorityElement(final List<Integer> A) {
        int maj = A.get(0), maj_count = 1;

        for(int i = 1; i < A.size(); i++){
            if(A.get(i) == maj){
                maj_count++;
            }
            else{
                maj_count--;
                if(maj_count == 0){
                    maj = A.get(i);
                    maj_count = 1;
                }
            }
        }

        return maj;
    }
}
