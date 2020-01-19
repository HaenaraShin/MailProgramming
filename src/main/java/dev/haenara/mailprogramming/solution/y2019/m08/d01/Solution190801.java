package dev.haenara.mailprogramming.solution.y2019.m08.d01;

import dev.haenara.mailprogramming.solution.Solution;

/**
 * 매일프로그래밍 2019. 08. 01 (페이스북 추가문제)
 * 주어진 문자 배열의 모든 "A"를 "."으로 바꾸시오
 * Input: "banana"
 * Output: "b.n.n."
 * Input: "aaa"
 * Output: "aaa"
 *
 * 풀이
 * 아스키테이블을 전부 매핑 char배열에 넣어놓고 a와 A만 . 값을 넣어둔다음 그냥 문자열을 매핑 배열의 값을 참조한다.
 * 굳이 이렇게 푸는 이유는 비교하는 로직을 빼서 성능을 최대한 끌어올리기 위해서다.
 */

public class Solution190801 implements Solution<String, String> {

    @Override
    public String solution(String str){
        char[] dic = {
                0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127
        };
        dic['a'] = '.';
        dic['A'] = '.';
        StringBuilder builder = new StringBuilder();
        for (char c : str.toCharArray()){
            builder.append(dic[c]);
        }
        return builder.toString();
    }
}