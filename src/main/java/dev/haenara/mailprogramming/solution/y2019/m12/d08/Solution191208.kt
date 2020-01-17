import dev.haenara.mailprogramming.solution.Solution

/**
 * 매일프로그래밍 2019. 12. 08
 * 피보나치 배열은 0과 1로 시작하며, 다음 피보나치 수는 바로 앞의 두 피보나치 수의 합이 된다.
 * 정수 N이 주어지면, N보다 작은 모든 짝수 피보나치 수의 합을 구하여라.
 * Fibonacci sequence starts with 0 and 1 where each fibonacci number is a sum of two previous fibonacci numbers.
 * Given an integer N, find the sum of all even fibonacci numbers.
 *
 * Input: N = 12
 * Output: 10 // 0, 1, 2, 3, 5, 8 중 짝수인 2 + 8 = 10.
 *
 * 풀이 :
 * 재귀로 풀수도 있으나, 성능을 고려하여 반복문을 이용하여 풀었다.
 * 피보나치 수열의 합이 주어진 수보다 작은지 확인하여 짝수면 누적한다.
 */
class Solution191208: Solution<Long, Long> {
    override fun solution(max: Long) : Long {
        var evenSum = 0L
        var `F(n-2)` = 0L
        var `F(n-1)` = 1L
        var `F(n)` = `F(n-1)` + `F(n-2)`

        while (`F(n)` < max ) {
            if (`F(n)` % 2L == 0L) {
                evenSum += `F(n)`
            }
            `F(n-2)` = `F(n-1)`
            `F(n-1)` = `F(n)`
            `F(n)` = `F(n-1)` + `F(n-2)`

        }
        return evenSum
    }
}