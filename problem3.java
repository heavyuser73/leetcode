class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        char [] strArray = s.toCharArray();
        HashSet<Character> arraySet = new HashSet<>();
        char currentChar;
        for(int i=0;i<strArray.length;i++) {
            for(int j=i;j<strArray.length;j++) {
                currentChar = strArray[j];
                if(arraySet.contains(currentChar) == false) {
                    arraySet.add(currentChar);
                    max = Math.max(max, arraySet.size());
                }
                else {
                    arraySet.clear();
                    break;
                }
            }
        }
        
        return max;
    }
}
