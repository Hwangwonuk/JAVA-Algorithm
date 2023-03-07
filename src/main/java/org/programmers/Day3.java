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

import java.util.HashMap;
import java.util.Map;

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
   * <p>
   * 문제 설명 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.
   * <p>
   * 제한사항 0 < num1 ≤ 100 0 < num2 ≤ 100
   * <p>
   * 입출력 예 num1	num2	result 3	 2	    1 10	 5	    0
   * <p>
   * 입출력 예 설명
   * <p>
   * 입출력 예 #1 num1이 3, num2가 2이므로 3을 2로 나눈 나머지 1을 return 합니다.
   * <p>
   * 입출력 예 #2 num1이 10, num2가 5이므로 10을 5로 나눈 나머지 0을 return 합니다.
   */
  public int solution(int num1, int num2) {
    int answer = -1;
    if (0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100) {
      answer = num1 % num2;
    }
    return answer;
  }

  /**
   * 중앙값 구하기
   * <p>
   * 문제 설명 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다.
   * 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.
   * <p>
   * <p>
   * 제한사항 array의 길이는 홀수입니다. 0 < array의 길이 < 100 -1,000 < array의 원소 < 1,000
   * <p>
   * 입출력 예 array	           result [1, 2, 7, 10, 11]	 7 [9, -1, 0]	         0
   * <p>
   * 입출력 예 설명 입출력 예 #1 본문과 동일합니다.
   * <p>
   * 입출력 예 #2 9, -1, 0을 오름차순 정렬하면 -1, 0, 9이고 가장 중앙에 위치하는 값은 0입니다.
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

  /**
   * 최빈값 구하기
   * <p>
   * 문제 설명 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를
   * 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
   * <p>
   * 제한사항 0 < array의 길이 < 100 0 ≤ array의 원소 < 1000
   * <p>
   * 입출력 예 array	               result [1, 2, 3, 3, 3, 4]	         3 [1, 1, 2, 2]	              -1
   * [1]	                   1
   * <p>
   * 입출력 예 설명 입출력 예 #1 [1, 2, 3, 3, 3, 4]에서 1은 1개 2는 1개 3은 3개 4는 1개로 최빈값은 3입니다.
   * <p>
   * 입출력 예 #2 [1, 1, 2, 2]에서 1은 2개 2는 2개로 최빈값이 1, 2입니다. 최빈값이 여러 개이므로 -1을 return 합니다.
   * <p>
   * 입출력 예 #3 [1]에는 1만 있으므로 최빈값은 1입니다.
   */
  public int solution3(int[] array) {
    int answer = array[0]; // 첫번째 값으로 초기화
    int max = 0; // max값 초기화
    int frequent[] = new int[1000]; // 제한사항 배열 크기 초기화

    for (int i = 0; i < array.length; i++) {
      frequent[array[i]]++; // 입력받은 0부터 length까지 반복문. 해당 인덱스로 ++1

      if (max < frequent[array[i]]) { // max값이 frequent의 인덱스 값보다 크면
        max = frequent[array[i]]; // max = frequent
        answer = array[i]; // 답 = array[i]
      }
    }

    // 중복검사
    int temp = 0;
    for (int j = 0; j < 1000; j++) {
      if (max == frequent[j]) { // max값과 같은 frequent가 있다면
        temp++; // temp ++
      }
      if (temp > 1) { // 중복된 값이 존재한다면
        answer = -1; // 답 = -1
      }
    }

    return answer;
  }

  /**
   * 최빈값 구하기
   *
   * map 사용
   */
  public int solution4(int[] array) {
    int maxCount = 0;
    int answer = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int number : array) {
      int count = map.getOrDefault(number, 0) + 1;
      if (count > maxCount) {
        maxCount = count;
        answer = number;
      } else if (count == maxCount) {
        answer = -1;
      }
      map.put(number, count);
    }
    return answer;
  }

  /**
   * 짝수는 싫어요
   * 문제 설명
   * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
   *
   * 제한사항
   * 1 ≤ n ≤ 100
   *
   * 입출력 예
   *   n	            result
   *  10	       [1, 3, 5, 7, 9]
   *  15	 [1, 3, 5, 7, 9, 11, 13, 15]
   *
   * 입출력 예 설명
   *
   * 입출력 #1
   * 10 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9]를 return합니다.
   *
   * 입출력 #1
   * 15 이하의 홀수가 담긴 배열 [1, 3, 5, 7, 9, 11, 13, 15]를 return합니다.
   */
  public int[] solution5(int n) {
    int[] answer;
    int num = 0;

    if (n % 2 == 0) { // 2로 나눈 나머지가 0이면 == 짝수이면
      answer = new int[n / 2];
    } else { // 홀수이면
      answer = new int[n / 2 + 1];
    }

    for (int i = 0; i <= n; i++) {
      if (i % 2 == 1) {
        answer[num] = i;
        num++;
      }
    }
    return answer;
  }

}
