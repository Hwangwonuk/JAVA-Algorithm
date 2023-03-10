/*
 * Created by Wonuk Hwang on 2023/03/08
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/03/08
 */
package org.programmers;

/**
 * create on 2023/03/08. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */
public class Day4 {

  /**
   * 피자 나눠 먹기 (1)
   *
   * 문제 설명
   * 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때,
   * 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를
   * return 하는 solution 함수를 완성해보세요.
   *
   * 제한사항
   * 1 ≤ n ≤ 100
   *
   * 입출력 예
   *  n	 result
   *  7	   1
   *  1	   1
   *  15	 3
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * 7명이 최소 한 조각씩 먹기 위해서 최소 1판이 필요합니다.
   *
   * 입출력 예 #2
   * 1명은 최소 한 조각을 먹기 위해 1판이 필요합니다.
   *
   * 입출력 예 #3
   * 15명이 최소 한 조각씩 먹기 위해서 최소 3판이 필요합니다.
   */
  public int solution(int n) {
    int answer = 0;

    if(n % 7 == 0) {
      answer = n / 7;
    } else {
      answer = n / 7 + 1;
    }
    return answer;
  }

  /**
   * 피자 나눠 먹기 (2)
   * 문제 설명
   * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다.
   * 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
   * n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
   * 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
   *
   * 제한사항
   * 1 ≤ n ≤ 100
   *
   * 입출력 예
   *   n	result
   *   6	  1
   *   10	  5
   *   4	  2
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * 6명이 모두 같은 양을 먹기 위해 한 판을 시켜야 피자가 6조각으로 모두 한 조각씩 먹을 수 있습니다.
   *
   * 입출력 예 #2
   * 10명이 모두 같은 양을 먹기 위해 최소 5판을 시켜야 피자가 30조각으로 모두 세 조각씩 먹을 수 있습니다.
   *
   * 입출력 예 #3
   * 4명이 모두 같은 양을 먹기 위해 최소 2판을 시키면 피자가 12조각으로 모두 세 조각씩 먹을 수 있습니다.
   */
  public int solution2(int n) {
    int answer = 0;
    for (int i = 1; i <= 6 * n; i++) {
      if (6 * i % n == 0) {
        answer = i;
        break;
      }
    }
    return answer;
  }

  /**
   * 피자 나눠 먹기 (3)
   * 문제 설명
   * 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
   * 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
   * n명의 사람이 최소 한 조각 이상 피자를 먹으려면
   * 최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
   *
   * 제한사항
   * 2 ≤ slice ≤ 10
   * 1 ≤ n ≤ 100
   *
   * 입출력 예
   * slice	 n	  result
   *   7	  10	    2
   *   4	  12	    3
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * 10명이 7조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 2판을 시켜야 합니다.
   *
   * 입출력 예 #2
   * 12명이 4조각으로 자른 피자를 한 조각 이상씩 먹으려면 최소 3판을 시켜야 합니다.
   */
  public int solution3(int slice, int n) {
    int answer = 0;

    if (n % slice == 0) {
      answer = n / slice;
    } else {
      answer = n / slice + 1;
    }
    return answer;
  }

  /**
   * 배열의 평균값
   * 문제 설명
   * 정수 배열 numbers가 매개변수로 주어집니다.
   * numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
   *
   * 제한사항
   * 0 ≤ numbers의 원소 ≤ 1,000
   * 1 ≤ numbers의 길이 ≤ 100
   *
   * 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
   *
   * 입출력 예
   *           numbers	                              result
   * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]	                 5.5
   * [89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99]	     94.0
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * numbers의 원소들의 평균 값은 5.5입니다.
   *
   * 입출력 예 #2
   * numbers의 원소들의 평균 값은 94.0입니다.
   */
  public double solution4(int[] numbers) {
    double answer = 0;
    double sum = 0;

    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }

    answer = sum / numbers.length;
    return answer;
  }
}
