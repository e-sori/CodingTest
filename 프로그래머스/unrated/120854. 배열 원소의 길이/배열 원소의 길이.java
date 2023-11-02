class Solution {
    public int[] solution(String[] strlist) {
        int listLength = strlist.length;
        int[] answer = new int[listLength];
        
        for(int i = 0; i < listLength; i++){
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}