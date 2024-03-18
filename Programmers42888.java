package algorithm;

import java.util.HashMap;
import java.util.Map;

public class Programmers42888 {
    public static void main(String[] args) {
        String[] string = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
//        Solution5.solution(string);
    }
}

class Solution5 {
    Map<String, String> map = new HashMap<>();
    public String[] solution(String[] record) {
        String[] answer = {};
        String[] temp = new String[record.length];

        for (int i = 0; i < record.length; i++) {
             temp = record[i].split(" ");
            // 유저 추가
            if(!map.containsKey(temp[1])) {
                map.put(temp[1], temp[2]);
            }
            // 유저 변경
            if(map.containsKey(temp[1]) && map.get(temp[1]) != temp[2]) {
                map.put(temp[1], temp[2]);
            }
        }
        // 결과 배열에 담기
        for (int i = 0; i < record.length; i++) {
            if (temp[0].equals("Enter")) {
                answer[i] = enter(temp[1]);
            }
            if (temp[0].equals("Leave")) {
                answer[i] = leave(temp[1]);
            }
        }

        return answer;
    }

    public String enter(String uid) {
        return map.get(uid) + "님이 들어왔습니다";
    }
    public String leave(String uid) {
        return map.get(uid) + "님이 나갔습니다.";
    }

}