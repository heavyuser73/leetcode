  
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        char arrayString [] = s.toCharArray();
        HashSet <Character> hashSub = new HashSet <Character>();
        for(int i=0;i<arrayString.length && arrayString.length - i > max;i++) {
            for(int j=i;j < arrayString.length;j++) {
                if(hashSub.contains(arrayString[j]) == false) {
                    hashSub.add(arrayString[j]);
                    max = Math.max(max, hashSub.size());
                }
                else {
                    hashSub.remove(arrayString[i++]);
                    j--;
                }
            }
        }
        return max;
    }
}
