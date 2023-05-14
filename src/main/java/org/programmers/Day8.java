/*
 * Created by Wonuk Hwang on 2023/05/10
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/05/10
 */
package org.programmers;

import java.util.Arrays;

/**
 * create on 2023/05/10. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */
public class Day8 {

  /**
   * 배열 자르기
   * 문제 설명
   * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
   * numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을
   * return 하도록 solution 함수를 완성해보세요.
   *
   * 제한사항
   * 2 ≤ numbers의 길이 ≤ 30
   * 0 ≤ numbers의 원소 ≤ 1,000
   * 0 ≤ num1 < num2 < numbers의 길이
   *
   * 입출력 예
   *        numbers	        num1	        num2	      result
   *     [1, 2, 3, 4, 5]     1             3	      [2, 3, 4]
   *      [1, 3, 5]	         1	           2	      [3, 5]
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * [1, 2, 3, 4, 5]의 1번째 인덱스 2부터 3번째 인덱스 4 까지 자른 [2, 3, 4]를 return 합니다.
   *
   * 입출력 예 #2
   * [1, 3, 5]의 1번째 인덱스 3부터 2번째 인덱스 5까지 자른 [3, 5]를 return 합니다.
   */
  public int[] solution(int[] numbers, int num1, int num2) {

    int[] answer = new int [num2 - num1 + 1]; // index + 1개를 초기화

    int index = 0; // for문의 조건을 분리..! 이생각을 하자
    for(int i = num1; i <= num2; i++) {
      answer[index] = numbers[i];
      index++;
    }

    return answer;
  }

  public int[] solution2(int[] numbers, int num1, int num2) {
    int[] answer = new int[numbers.length];

    answer = Arrays.copyOfRange(numbers, num1, num2 + 1);

    return answer;
  }

  /**
   * 외계행성의 나이
   * 문제 설명
   * 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
   * 입국심사에서 나이를 말해야 하는데,
   * PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
   * a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
   * 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
   *
   *
   * 제한사항
   * age는 자연수입니다.
   * age ≤ 1,000
   *
   * PROGRAMMERS-962 행성은 알파벳 소문자만 사용합니다.
   *
   * 입출력 예
   * age	result
   * 23	   "cd"
   * 51	   "fb"
   * 100	 "baa"
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * age가 23이므로 "cd"를 return합니다.
   *
   * 입출력 예 #2
   * age가 51이므로 "fb"를 return합니다.
   *
   * 입출력 예 #3
   * age가 100이므로 "baa"를 return합니다.
   */
  public String solution(int age) {
    String answer="";
    String temp = Integer.toString(age);
    for(int i = 0; i < temp.length(); i++) {
      answer += (char)(temp.charAt(i) + 49);
    }
    return answer;
  }

  public String solution2(int age) {
    String answer = "";
    String[] alpha = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

    while(age > 0){
      answer = alpha[age % 10] + answer;
      age /= 10;
    }

    return answer;
  }

}
