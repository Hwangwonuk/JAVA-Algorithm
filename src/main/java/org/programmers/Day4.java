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

}
