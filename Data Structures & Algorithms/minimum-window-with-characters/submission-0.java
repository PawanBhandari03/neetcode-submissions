class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left = 0;
        int count = 0;
        int minLength = Integer.MAX_VALUE;
        int startIndex = 0;
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            if (map.containsKey(rightChar)) {
                if (map.get(rightChar) > 0) {
                    count++;
                }
                map.put(rightChar, map.get(rightChar) - 1);
            }
            while (count == t.length()) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    startIndex = left;
                }
                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) {
                        count--;
                    }
                }
                left++;
            }
        }
        if (minLength == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(startIndex, startIndex + minLength);
    }
}