class Solution {
        public String solution(String myString) {
            String answer = "";
            char[] chars = myString.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 'a') {
                    chars[i] = 'A';
                } else if (chars[i]!='A' && Character.isUpperCase(chars[i])) {
                    chars[i] = Character.toLowerCase(chars[i]);
                }
            }
            answer = String.valueOf(chars);
            return answer;
        }
    }