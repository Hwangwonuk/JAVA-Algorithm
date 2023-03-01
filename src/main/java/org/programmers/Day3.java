/*
 * Created by Wonuk Hwang on 2023/02/28
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/02/28
 */
package org.programmers;

/**
 * create on 2023/02/28. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */
public class Day3 {

  /**
   * 나머지 구하기
   *
   * 문제 설명
   * 정수 num1, num2가 매개변수로 주어질 때,
   * num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
   *
   * 제한사항
   * 0 < num1 ≤ 100
   * 0 < num2 ≤ 100
   *
   * 입출력 예
   * num1	num2	result
   *   3	 2	    1
   *  10	 5	    0
   *
   * 입출력 예 설명
   *
   * 입출력 예 #1
   * num1이 3, num2가 2이므로 3을 2로 나눈 나머지 1을 return 합니다.
   *
   * 입출력 예 #2
   * num1이 10, num2가 5이므로 10을 5로 나눈 나머지 0을 return 합니다.
   */
  public int solution(int num1, int num2) {
    int answer = -1;
    if(0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100) {
      answer = num1 % num2;
    }
    return answer;
  }

  /**
   * 중앙값 구하기
   *
   * 문제 설명
   * 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때
   * 가장 중앙에 위치하는 값을 의미합니다.
   * 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
   * 정수 배열 array가 매개변수로 주어질 때,
   * 중앙값을 return 하도록 solution 함수를 완성해보세요.
   *
   *
   * 제한사항
   * array의 길이는 홀수입니다.
   * 0 < array의 길이 < 100
   * -1,000 < array의 원소 < 1,000
   *
   * 입출력 예
   * array	           result
   * [1, 2, 7, 10, 11]	 7
   * [9, -1, 0]	         0
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * 본문과 동일합니다.
   *
   * 입출력 예 #2
   * 9, -1, 0을 오름차순 정렬하면 -1, 0, 9이고 가장 중앙에 위치하는 값은 0입니다.
   */
  public int solution2(int[] array) {
    int answer = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = i; j < array.length; j++) {
        if (array[j] < array[i]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }

    answer = array[array.length / 2];

    return answer;
  }
}
