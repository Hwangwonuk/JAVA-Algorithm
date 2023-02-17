/*
 * Created by Wonuk Hwang on 2023/02/15
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/02/15
 */
package org.programmers;

/**
 * create on 2023/02/15. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */

/**
 * 두 수의 합
 * 문제 설명
 * 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return하도록 soltuion 함수를 완성해주세요.
합 * 제한사항
 * -50,000 ≤ num1 ≤ 50,000
 * -50,000 ≤ num2 ≤ 50,000
 *
 * 입출력 예
 * num1	num2	result
 *  2	   3	    5
 * 100	 2 	   102
 */
public class Day1 {
  public int solution(int num1, int num2) {
    int answer = 0;
    if(num1 >= -50000 && num1 <= 50000 && num2 >= -50000 && num2 <= 50000) {
      answer = num1 + num2;
    }
    return answer;
  }

  /**
   * 문제 설명
   * 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
   *
   * 제한사항
   * -50000 ≤ num1 ≤ 50000
   * -50000 ≤ num2 ≤ 50000
   */
  public int solution2(int num1, int num2) {
    return num1 - num2;
  }

  /**
   * 두 수의 곱
   * 문제 설명
   * 정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.
   *
   * 제한사항
   * 0 ≤ num1 ≤ 100
   * 0 ≤ num2 ≤ 100
   */
  public int solution3(int num1, int num2) {
    int answer = 0;
    if(0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100) {
      answer = num1 * num2;
    }
    return answer;

  }

  /**
   * 몫 구하기
   * 문제 설명
   * 정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
   *
   * 제한사항
   * 0 < num1 ≤ 100
   * 0 < num2 ≤ 100
   */
  public int solution4(int num1, int num2) {
    int answer = 0;
    if(num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100) {
      answer = num1 / num2;
    }
    return answer;
  }
}
