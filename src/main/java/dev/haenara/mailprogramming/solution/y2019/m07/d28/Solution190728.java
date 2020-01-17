package dev.haenara.mailprogramming.solution.y2019.m07.d28;

import dev.haenara.mailprogramming.solution.Solution;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 * 매일프로그래밍 2019. 07. 28
 * 문자배열이 주어지면, 주어진 문자로 만들수 있는 모든 문자배열 조합을 프린트 하시오.
 * Given a string, print all permutations of characters in the string.
 * input: ABC
 * output: ABC ACB BAC BCA CBA CAB
 *
 * 풀이
 * divide-and-conquer 알고리즘으로 재귀적으로 경우의수를 만들어 나간다.
 * 매 시행마다 문자열 중에 한글자씩 뽑아서 앞의 문자열로 만든 뒤 나머지 문자열을 인자로 들고가서
 * 최종적으로 앞의 문자열(parent)와 나머지 문자열(substring)을 조합하여 경우의 수를 하나씩 재귀적으로 만든다.
 * 단 AAA와 같이 중복된 글자가 안에 들어있을 경우, 중복된 글자는 경우의수를 나누어서는 안되기 때문에
 * 매 시행마다 모든 글자를 뽑아내는 것이 아닌, 중복을 제거한 경우의 수 중에서 뽑아내고 문자열로 구성한다.
 */

public class Solution190728 implements Solution<String, ArrayList<String>> {

    @Override
    public ArrayList<String> solution(String input) {
        ArrayList<String> answer = new ArrayList<>();
        getStringSet(answer, "", input);
        return answer;
    }

    /**
     *
     * @param list
     * @param parent
     * @param subString
     */
    private void getStringSet(ArrayList<String> list, String parent, String subString) {
        if (subString.length() == 1) {
            list.add(parent + subString);
        } else {
            // 이부분이 중요한데, 한글자를 뽑아내어 경우의 수를 가지치기 할 때는 중복을 제거한다.
            String uniqueSubstring = removeDuplicate(subString);
            for (int i = 0; i < uniqueSubstring.length(); i++) {
                getStringSet(list, parent + uniqueSubstring.charAt(i),
                        getSubstringExcept(subString, uniqueSubstring.charAt(i))); // 중복된 문자는 뺴고 substring 구성
            }
        }
    }

    /**
     * 중복문자를 제거한 문자 세트를 구성
     * @param subString
     * @return
     */
    private String removeDuplicate(String subString) {
        LinkedHashMap<Character, String> map = new LinkedHashMap();
        for(char c : subString.toCharArray()) {
            map.put(c, "");
        }
        return charSetToString(map.keySet());
    }

    private String charSetToString(Set<Character> set){
        StringBuilder builder = new StringBuilder();
        for (Character c : set) {
            builder.append(c);
        }
        return builder.toString();
    }

    /**
     * 이미 중복되어 사용된 문자열을 제외한 문자열을 반한한다.
     * 앞에 문자열 (parent)에서 이미 경우의수로 나온 문자열이라면 뒤에서는 무시해도 되기 때문에
     * 해당 문자를 제외한 문자열로 새로 구성.
     * @param original
     * @param c
     * @return
     */
    private String getSubstringExcept(String original, char c) {
        StringBuilder stringbuilder = new StringBuilder();
        boolean flagSkipped = false;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != c || flagSkipped) {
                stringbuilder.append(original.charAt(i));
            } else {
                flagSkipped = true;
            }
        }
        return stringbuilder.toString();

    }
}