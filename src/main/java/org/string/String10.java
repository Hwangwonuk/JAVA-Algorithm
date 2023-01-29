/*
 * Created by Wonuk Hwang on 2023/01/29
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/29
 */
package org.string;

/**
 * create on 2023/01/29. create by IntelliJ IDEA.
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
 * 10. 가장 짧은 문자거리
 * 설명
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 *
 * 예시 입력  ->  teachermode e
 * 예시 출력  ->  1 0 1 2 1 0 1 2 2 1 0
 */
public class String10 {

  public int[] solution(String s, char t){
    int[] answer = new int[s.length()]; // int 배열을 문자열 길이만큼 생성
    int p = 1000; // 1000으로 p(거리)값 초기화
    for(int i = 0; i < s.length(); i++){ // 문자열의 길이만큼 반복문 실행
      if(s.charAt(i) == t) { // 문자열의 char가 입력받은 t와 같다면
        p = 0; // p, 즉 거리는 0이다.
        answer[i] = p; // 해당 인덱스의 답은 p로 설정
      } else { // 문자열의 char이 입력받은 t와 다르다면
        p++; // 값에 1을 더한다.
        answer[i] = p; // 1을 더한값을 해당 인덱스에 할당한다.
      }
    }
    p = 1000; // p 값을 다시 1000으로 초기화
    for(int i = s.length() - 1; i >= 0; i--) { // 문자열의 뒷부분에서 거리를 재기위해 다시한번 반복문 실행
      if(s.charAt(i) == t) p = 0; // 문자열의 char와 입력받은 t가 같으면 길이 p는 0이다.
      else { // 같지않으면
        p++; // 길이값을 1 더해준다.
        answer[i] = Math.min(answer[i], p); // 해당 응답 배열의 인덱스에 (기존 배열의 값 vs 새로 구한 p값)더 작은값을 비교하여 작은값으로 설정해준다.
      }
    }
    return answer;
  }

  public static void main(String[] args){
    String10 T = new String10();
    Scanner kb = new Scanner(System.in);
    String str = kb.next();
    char c = kb.next().charAt(0);
    for(int x : T.solution(str, c)) {
      System.out.print(x+" ");
    }
  }
}
