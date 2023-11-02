class Solution {
    public int[] solution(int[] num_list) {
        int listLeng = num_list.length;
        int[] answer = new int[listLeng];
        
        for(int i = 1; i <= listLeng; i++){
            answer[i - 1] = num_list[listLeng - i];
        }
        
        return answer;
    }
}