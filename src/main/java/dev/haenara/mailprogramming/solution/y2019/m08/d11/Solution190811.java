package dev.haenara.mailprogramming.solution.y2019.m08.d11;

import dev.haenara.mailprogramming.solution.Solution;
import kotlin.Pair;

/**
 * 매일프로그래밍 2019. 08. 11
 * 연결 리스트로 표현된 두 정수 A 와 B 가 있습니다. A 와 B 를 더한 결과를 연결 리스트로 리턴하시오.
 * Given two integers represented as linked lists, return a linked list that is a sum of the two given linked lists.
 * Input: 1->2->3, 1->2->3 // 321 + 321
 * Output: 2->4->6 // 642
 * Input: 1->5->6, 0->0->4 // 651 + 400
 * Output: 1->5->0->1 // 1051
 *
 * 풀이
 * 링크드리스트를 사용하는 대신 배열로 풀었으나, 순차적으로 더해나가므로 어느쪽이든 상관 없다.
 * N자리수의 자연수 합이므로 A1->A2->... , B1->B2->... 을 더하는 경우
 * n번째 항은 An+Bn+(n-1)항의 받아올림(carrier) 으로 표현가능하다.
 * 따라서 이전 carrier만 기억하고 있다면 A와B와 덧셈없이 3차 배열로 값을 구할 수 있다.
 */

public class Solution190811 implements Solution<Pair<String, String>, String> {
    @Override
    public String solution(Pair<String, String> input) {
        return calculeList(input.getFirst().trim().split("->"), input.getSecond().trim().split("->"));
    }

    int[][][] mapSum = {
            {
                    {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
                    {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                    {2, 3, 4, 5, 6, 7, 8, 9, 0, 1},
                    {3, 4, 5, 6, 7, 8, 9, 0, 1, 2},
                    {4, 5, 6, 7, 8, 9, 0, 1, 2, 3},
                    {5, 6, 7, 8, 9, 0, 1, 2, 3, 4},
                    {6, 7, 8, 9, 0, 1, 2, 3, 4, 5},
                    {7, 8, 9, 0, 1, 2, 3, 4, 5, 6},
                    {8, 9, 0, 1, 2, 3, 4, 5, 6, 7},
                    {9, 0, 1, 2, 3, 4, 5, 6, 7, 8}
            },
            {
                    {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                    {2, 3, 4, 5, 6, 7, 8, 9, 0, 1},
                    {3, 4, 5, 6, 7, 8, 9, 0, 1, 2},
                    {4, 5, 6, 7, 8, 9, 0, 1, 2, 3},
                    {5, 6, 7, 8, 9, 0, 1, 2, 3, 4},
                    {6, 7, 8, 9, 0, 1, 2, 3, 4, 5},
                    {7, 8, 9, 0, 1, 2, 3, 4, 5, 6},
                    {8, 9, 0, 1, 2, 3, 4, 5, 6, 7},
                    {9, 0, 1, 2, 3, 4, 5, 6, 7, 8},
                    {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
            }
    };

    int[][][] mapCar = {
            {
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
                    {0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
                    {0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                    {0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                    {0, 0, 0, 1, 1, 1, 1, 1, 1, 1},
                    {0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                    {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            },
            {
                    {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
                    {0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
                    {0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
                    {0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                    {0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                    {0, 0, 0, 1, 1, 1, 1, 1, 1, 1},
                    {0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                    {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            },
    };

    private String calculeList(String[] list1, String[] list2) {
        StringBuffer buffer = new StringBuffer();
        int car = 0; // 받아올림은 이전 싸이클 값을 가지고 있어야 하므로 for 문 밖에서 선언
        for (int i = 0; i < list1.length || i < list2.length || car == 1; i++) {
            int a = 0, b = 0;
            if (i < list1.length) {
                a = Integer.parseInt(list1[i]);
            }
            if (i < list2.length) {
                b = Integer.parseInt(list2[i]);
            }
            int sum = mapSum[car][a][b];
            car = mapCar[car][a][b];
            buffer.append(sum);
            buffer.append("->");
        }
        return buffer.substring(0, buffer.length()-2);
    }

}
