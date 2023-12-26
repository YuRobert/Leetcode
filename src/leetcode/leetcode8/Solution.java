package leetcode.leetcode8;

class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        String prefix = "";
        if (s == "" || s.length() < 1 ){
            return 0;
        }
        StringBuilder result = new StringBuilder();

        char[] chars = s.toCharArray();
        int cur = 0;
        if (chars[0] == '-'){
            prefix = "-";
//            result.append(chars[0]);
            cur = 1;
        }else if (chars[0] == '+'){
//            result.append(chars[0]);
            cur = 1;
        }
        if (cur >= chars.length || !Character.isDigit(chars[cur])){
            return 0;
        }
        while (cur < chars.length && Character.isDigit(chars[cur])){
            if (result.length() > 0 && Long.valueOf(result.toString()) == 0){
                result = new StringBuilder();
            }
            if (result.length() > 16){
                break;
            }
            result.append(chars[cur]);
            cur++;

        }
        if (Long.valueOf(prefix + result.toString()) < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else if(Long.valueOf(prefix + result.toString()) > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else {
            return Integer.valueOf(prefix + result.toString());
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.myAtoi("20000000000000000000");
        System.out.println(i);
    }
}