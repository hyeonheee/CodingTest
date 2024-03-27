import java.util.ArrayList;
import java.util.List;

//    class Solution {
//        public List solution(int[] num_list) {
//            List<Integer> answer = new ArrayList<>();
//
//            int last = num_list[num_list.length-1];
//            int lastb = num_list[num_list.length-2];
//
//            for (int i = 0; i< num_list.length; i++){
//                answer.add(num_list[i]);
//            }
//            if(last > lastb){
//                answer.add(last-lastb);
//            }else {
//                answer.add(last * 2);
//            }
//            return answer;
//        }
//    }

    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length+1];

            for(int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[i];
            }

            int last = num_list[num_list.length-1];
            int before = num_list[num_list.length-2];

            answer[answer.length-1] = last > before ? last - before : last*2;

            return answer;
        }
    }