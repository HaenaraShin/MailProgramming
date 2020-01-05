package dev.haenara.mailprogramming.solution.y2019.jul;

import dev.haenara.mailprogramming.solution.Solution;

/**
 * 매일프로그래밍 2019. 07. 21
 * 양수 K가 주어지면 K 길이의 이진법 숫자를 모두 프린트하시오. 단, 연속으로 1이 있으면 안됩니다.
 * Given an integer K, print all binary strings of length K without consecutive 1s.
 * Input:5
 * output: 00000 00001 00010 00100 00101 01000 01001 01010 10000 10001 10010 10100 10101
 *
 * 풀이
 * divide-and-conquer 알고리즘으로, 이전 숫자가 1인지 아닌지에 따라 나누어서 재귀적 호출을 하고 최종적으로 병합한다.
 * 이전 자리수가 1일 경우 1은 연속으로 나오면 안되기 때문에 다음자리수는 0으로 고정한다.
 * 이전 자리수가 0일 경우 0, 1 모두 나올 수 있기 때문에 2개의 경우의 수로 쪼개어 재귀호출한 뒤 병합한다.
 */

public class Solution190721 implements Solution<Integer, String[]> {
    @Override
    public String[] solution(Integer input) {
        return getBinaryK(0, input);
    }

    private String[] getBinaryK(int prev, int n) {
        if (prev == 1) {
            if (n ==1) {
                return new String[]{"0"};
            } else {
                String[] arr = getBinaryK(0, n-1);
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = "0" + arr[i];
                }
                return arr;
            }
        } else {
            if (n ==1) {
                return new String[]{"0", "1"};
            } else {
                String[] arr1 = getBinaryK(0, n-1);
                for (int i = 0; i < arr1.length; i++) {
                    arr1[i] = "0" + arr1[i];
                }
                String[] arr2 = getBinaryK(1, n-1);
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = "1" + arr2[i];
                }
                return mergeArray(arr1, arr2);
            }
        }
    }

    private String[] mergeArray(String[] arr1, String[] arr2) {
        String[] arrSum = new String[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arrSum, 0, arr1.length);
        if (arrSum.length - arr1.length >= 0)
            System.arraycopy(arr2, 0, arrSum, arr1.length, arrSum.length - arr1.length);
        return arrSum;
    }
}