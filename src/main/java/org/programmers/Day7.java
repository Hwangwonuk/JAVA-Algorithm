/*
 * Created by Wonuk Hwang on 2023/05/06
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/05/06
 */
package org.programmers;

/**
 * create on 2023/05/06. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */
public class Day7 {

  /**
   * 특정 문자 제거하기
   * 문제 설명
   * 문자열 my_string과 문자 letter이 매개변수로 주어집니다.
   * my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
   *
   * 제한사항
   * 1 ≤ my_string의 길이 ≤ 100
   *
   * letter은 길이가 1인 영문자입니다.
   * my_string과 letter은 알파벳 대소문자로 이루어져 있습니다.
   * 대문자와 소문자를 구분합니다.
   *
   * 입출력 예
   *      my_string	     letter	      result
   *      "abcdef"	      "f"	       "abcde"
   *      "BCBdbe"	      "B"	       "Cdbe"
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * "abcdef" 에서 "f"를 제거한 "abcde"를 return합니다.
   *
   * 입출력 예 #2
   * "BCBdbe" 에서 "B"를 모두 제거한 "Cdbe"를 return합니다.
   */
  public String solution(String my_string, String letter) {
    return my_string.replace(letter, "");
  }

}
