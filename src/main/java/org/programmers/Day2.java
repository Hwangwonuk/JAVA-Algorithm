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
}
