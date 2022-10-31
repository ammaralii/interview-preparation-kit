package amazon_questions.interviewbit;

import java.util.List;

public class GasStation {
    public static int canCompleteCircuit(final List<Integer> gas, final List<Integer> cost) {
        int fuel = 0, start_i = 0, sum = 0;

        for(int i = 0; i < gas.size(); i++){
            sum = sum + (gas.get(i) - cost.get(i));
            fuel = fuel + (gas.get(i) - cost.get(i));
            if(fuel < 0){
                fuel = 0;
                start_i = i+1;
            }
        }

        if(sum >= 0){
            return start_i%(gas.size());
        }

        return -1;
    }
}
