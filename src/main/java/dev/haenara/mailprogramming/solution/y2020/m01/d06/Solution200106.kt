import dev.haenara.mailprogramming.solution.Solution
import kotlin.math.max
import kotlin.math.min

/**
 * 매일프로그래밍 2020. 01. 06
 * 간격(interval)로 이루어진 배열이 주어지면, 겹치는 간격 원소들을 합친 새로운 배열을 만드시오.
 * 간격은 시작과 끝으로 이루어져 있으며 시작은 끝보다 작거나 같습니다.
 * Given a list of intervals, merge intersecting intervals.
 *
 * Input: {{2,4}, {1,5}, {7,9}}
 * Output: {{1,5}, {7,9}}
 * Input: {{3,6}, {1,3}, {2,4}}
 * Output: {{1,6}}
 *
 * 풀이 :
 *
 */

class Solution200106 : Solution<Array<Pair<Int, Int>>, Array<Pair<Int, Int>>> {
    override fun solution(input: Array<Pair<Int, Int>>): Array<Pair<Int, Int>> {
        val sum = arrayListOf<Pair<Int, Int>>()
        for ((index, toMerge) in input.withIndex()) {
            sum.merge(toMerge)
        }
        return sum.toTypedArray()
    }

    private fun ArrayList<Pair<Int, Int>>.merge(input: Pair<Int, Int>) {
        var toMerge = input
        if (isEmpty()) {
            add(toMerge)
            return
        }
        // TO REFACTORING
        // 처음부터 하나하나 비교하는 대신 binary search 하여 성능 개선할 여지가 있다.
        for ((index, summed) in this.withIndex()) {
            if (summed == toMerge) {
                return
            }
            val left = left(summed, toMerge)
            val right = right(summed, toMerge)
            if (left == right) {
                remove(summed)
                // TO REFACTORING
                // 재귀적 호출로 성능이 너무 떨어질 수 있다.
                merge(left)
                return
            }
            if (isOverlapped(left, right)) {
                remove(toMerge)
                remove(summed)
                // TO REFACTORING
                // 재귀적 호출로 성능이 너무 떨어질 수 있다.
                merge(Pair(min(left.first, right.first), max(left.second, right.second)))
                return
            }
        }
        add(toMerge)
    }


    private fun left(first : Pair<Int, Int>, second : Pair<Int, Int>) : Pair<Int, Int>{
        return if (first.first < second.first) {
            first
        } else {
            second
        }
    }

    private fun right(first : Pair<Int, Int>, second : Pair<Int, Int>) : Pair<Int, Int>{
        return if (first.second >= second.second) {
            first
        } else {
            second
        }
    }

    private fun isOverlapped(left : Pair<Int, Int>, right : Pair<Int, Int>) : Boolean {
        return left.second >= right.first || left.first == right.first || left.second == right.second
    }


}