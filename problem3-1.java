  
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        char arrayString [] = s.toCharArray();
        HashSet <Character> longSub = new HashSet <Character>();
        for(int i=0;i<arrayString.length && arrayString.length - i > max;i++) {
            for(int j=i;j < arrayString.length;j++) {
                if(longSub.contains(arrayString[j]) == false) {
                    longSub.add(arrayString[j]);
                    max = Math.max(max, longSub.size());
                }
                else {
                    longSub.remove(arrayString[i++]);
                    j--;
                }
            }
        }
        return max;
    }
}
