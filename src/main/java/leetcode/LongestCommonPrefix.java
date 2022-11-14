package leetcode;

public class LongestCommonPrefix {
    public static String find(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int n = strs.length;

        if (n == 1) {
            return strs[0];
        }

        String result = strs[0];
        for (int i = 1; i < n; i++) {
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.isEmpty())
                    return "";
            }
            System.out.println(result);
        }


        return result;
    }
}
