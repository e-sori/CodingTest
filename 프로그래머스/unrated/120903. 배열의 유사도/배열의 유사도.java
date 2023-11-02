class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for(String s1Str : s1){
            for(String s2Str : s2){
                answer += s1Str.equals(s2Str)? 1 : 0;
            }
        }
        return answer;
    }
}