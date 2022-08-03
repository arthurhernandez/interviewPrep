//beatiful solution
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        for(int index = 0; index < Math.min(strs[0].length(),strs[strs.length-1].length()); index++) {
            if(strs[0].charAt(index) != strs[strs.length-1].charAt(index)){
                return strs[0].substring(0, index);
            }
        }
        return strs[0];
    }
}

