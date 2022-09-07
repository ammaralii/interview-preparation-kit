package string_manipulation;

public class AlternatingCharacters {
    public static int alternatingCharacters(String s) {
        int count = 0;
        char[] sChar = s.toCharArray();
        for(int i=1;i<sChar.length;i++){
            if(sChar[i] == sChar[i-1]){
                count++;
            }
        }
        return count;
    }
}
