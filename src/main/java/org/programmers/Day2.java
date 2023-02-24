/*
 * Created by Wonuk Hwang on 2023/02/22
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/02/22
 */
package org.programmers;

/**
 * create on 2023/02/22. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */
public class Day2 {
  /**
   * 두 수의 나눗셈
   *
   * 문제 설명
   * 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
   *
   * 제한사항
   * 0 < num1 ≤ 100
   * 0 < num2 ≤ 100
   *
   * 입출력 예
   * num1	num2	result
   *  3	   2	   1500
   *  7	   3	   2333
   *  1	   16	    62
   */
  public int solution(int num1, int num2) {
    double answer = (double) num1 / num2 * 1000;
    return (int)answer;
  }

  /**
   * 숫자 비교하기기
   *
   * 문제 설명
   * 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
   *
   * 제한사항
   * 0 ≤ num1 ≤ 10,000
   * 0 ≤ num2 ≤ 10,000
   *
   * 입출력 예
   * num1	num2	result
   *   2	 3	   -1
   *   11	11	    1
   *   7	99	   -1
   */
  public int solution2(int num1, int num2) {
    int answer = 1;
    if (num1 != num2) {
      answer = -1;
    }
    return answer;
  }

  /**
   * 분수의 덧셈
   * 문제 설명
   * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
   * 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
   * 두 분수를 더한 값을 기약 분수로 나타냈을 때
   * 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
   *
   * 제한사항
   * 0 < numer1, denom1, numer2, denom2 < 1,000
   *
   * 입출력 예
   * numer1	denom1	numer2	denom2	result
   *   1	    2	      3	      4	    [5, 4]
   *   9	    2	      1	      3	    [29, 6]
   */
  public int gcd(int num1, int num2) {
    if (num2 == 0) {
      return num1;
    }
    return gcd(num2, num1 % num2);
  }

  public int[] solution3(int numer1, int denom1, int numer2, int denom2) {

    numer1 *= denom2;
    numer2 *= denom1;
    int[] answer = new int[]{numer1 + numer2, denom1 * denom2};
    int max = gcd(answer[0], answer[1]);

    answer[0] /= max;
    answer[1] /= max;

    return answer;
  }

  /**
   * 배열 두배 만들기
   *
   * 문제 설명
   * 정수 배열 numbers가 매개변수로 주어집니다.
   * numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
   *
   * 제한사항
   * -10,000 ≤ numbers의 원소 ≤ 10,000
   * 1 ≤ numbers의 길이 ≤ 1,000
   *
   * 입출력 예
   *    numbers	                       result
   * [1, 2, 3, 4, 5]	            [2, 4, 6, 8, 10]
   * [1, 2, 100, -99, 1, 2, 3]	[2, 4, 200, -198, 2, 4, 6]
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * [1, 2, 3, 4, 5]의 각 원소에 두배를 한 배열 [2, 4, 6, 8, 10]을 return합니다.
   *
   * 입출력 예 #2
   * [1, 2, 100, -99, 1, 2, 3]의 각 원소에 두배를 한 배열 [2, 4, 200, -198, 2, 4, 6]을 return합니다.
   */
  public int[] solution4(int[] numbers) {
    int[] answer = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      answer[i] = numbers[i] * 2;
    }
    return answer;
  }
}
