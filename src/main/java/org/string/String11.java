/*
 * Created by Wonuk Hwang on 2023/01/31
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/31
 */
package org.string;

/**
 * create on 2023/01/31. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */

import java.util.Scanner;

/**
 * 11. 문자열 압축
 * 설명
 * 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
 * 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
 * 단 반복횟수가 1인 경우 생략합니다.
 *
 * 입력
 * 첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 첫 줄에 압축된 문자열을 출력한다.
 *
 * 예시 입력 1  ->  KKHSSSSSSSE
 * 예시 출력 1  ->  K2HS7E
 * 예시 입력 2  ->  KSTTTSEEKFKKKDJJGG
 * 예시 출력 2  ->  KST3SE2KFK3DJ2G2
 */
public class String11 {
  public String solution(String s){
    String answer=""; // 응답 값 초기화
    s = s + " "; // 입력받은 문자열의 맨 뒤에 빈 문자 추가
    int cnt = 1; // count값 1로 초기화
    for(int i = 0; i < s.length() - 1; i++) { // 문자열의 길이만큼 반복문
      if(s.charAt(i) == s.charAt(i + 1)) cnt++; // 만약, 해당 인덱스가 다음 인덱스와 같은 char라면 count값에 1 더하기
      else{ // 같지않다면
        answer += s.charAt(i); // 응답값에 해당 문자열 그대로 더하여 출력
        if(cnt > 1) answer += String.valueOf(cnt); // 만약 count값이 1보다 크면 해당 문자 뒤에 숫자 추가
        cnt = 1; // count값 다시 1로 초기화
      }
    }
    return answer;
  }

  public static void main(String[] args){
    String11 T = new String11();
    Scanner kb = new Scanner(System.in);
    String str=kb.next();
    System.out.println(T.solution(str));
  }
}
