package dev.haenara.mailprogramming.solution.y2019.aug;

import dev.haenara.mailprogramming.solution.Solution;

/**
 * 매일프로그래밍 2019. 08. 04
 * 0, 1, 2로 이루어진 배열을 가장 효율적으로 정렬 하시오. 시간복잡도 O(n).
 * Given an array consisting of 0, 1 and 2s, sort this array.
 * Input: [0, 1, 2, 2, 0, 0, 0, 1]
 * Output: [0, 0, 0, 0, 1, 1, 2, 2]
 *
 * 풀이
 * 퀵소트마냥 양쪽에서 진행하면서 0과 2로만 채워진 정렬된 배열을 우선 만든다.
 * 즉 좌측피벗이 2를 찾을때까지, 우측피벗이 0을 찾을때까지 진행하면서 정렬 되지 않은 0과 2를 찾으면 바꿔서 정렬하는 식이다.
 * 최종적으로 좌측에는 0만, 우측에는 2만 모조리 채워넣고 정렬이 끝난 뒤 1의 갯수만큼 중간에 삽입한다.
 */

public class Solution190804 implements Solution<Integer[], Integer[]> {
    @Override
    public Integer[] solution(Integer[] input) {
        return sort(input.clone());
    }

    private Integer[] sort(Integer[] arr){
        int left = 0;
        int right = arr.length - 1;
        int oneCount = 0;
        // 퀵소트마냥 양쪽에서 진행하며 교차되면 정렬이 끝난 것이다.
        // 좌측에는 0만, 우측에는 2만 모조리 채워넣고 정렬이 끝난 뒤 1의 갯수만큼 중간에 삽입한다.
        while (left < right) {
            while (arr[left] != 2 && left < right){
                if (arr[left] == 1) {
                    arr[left] = 0; // 좌측은 무조건 0
                    oneCount++; // 1은 갯수만 세두었다가 마지막에 채운다.
                }
                left++;
            }
            while(arr[right] != 0 && left < right ) {
                if (arr[right] == 1) {
                    arr[right] = 2; // 우측은 무조건 2
                    oneCount++; // 1은 갯수만 세두었다가 마지막에 채운다.
                }
                right--;
            }

            if (left < right) {
                swap(arr, left, right);
            } else {
                if (left == right) {
                    switch (arr[left]) {
                        case 0:
                            left++;
                            break;
                        case 1:
                            oneCount++;
                            break;
                        case 2:
                            right--;
                            break;
                    }
                }
                if ((right+1) - oneCount >= 0) {
                    for (int i = 0; i < oneCount; i++) {
                        arr[right - i] = 1;
                    }
                } else {
                    for (int i = 0; i < oneCount; i++) {
                        arr[left + i] = 1;
                    }
                }
                break;
            }
        }
        return arr;
    }

    private void swap(Integer[] arr, int left, int right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }
}