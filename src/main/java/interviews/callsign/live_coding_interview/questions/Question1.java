package interviews.callsign.live_coding_interview.questions;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
    private Map<String, Integer> hosts;

    public Question1() {
        hosts = new HashMap<>();
    }

    public String allocate(String hostType) {
        hosts.put(hostType, hosts.getOrDefault(hostType, 0) + 1);
        return hostType + ":" + hosts.get(hostType);
    }

    public void deallocate(String hostname) {
        String[] parts = hostname.split(":");
        String hostType = parts[0];
        int hostNumber = Integer.parseInt(parts[1]);
        hosts.put(hostType, hostNumber - 1);
    }
}


