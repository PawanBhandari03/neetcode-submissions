class Solution {
    public int characterReplacement(String s, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxfrequency = 0;
        int maxlength = 0;

        for(int right =0 ; right < s.length(); right++){
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
            maxfrequency = Math.max(maxfrequency ,map.get(c));

            while((right - left + 1) - maxfrequency > k){
                char leftchar = s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                left++;
            }
            maxlength = Math.max(maxlength, right - left + 1);
    }    
        return maxlength;
    }
}
