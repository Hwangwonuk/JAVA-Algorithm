/*
 * Created by Wonuk Hwang on 2023/01/26
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/26
 */
package org.string;

/**
 * create on 2023/01/26. create by IntelliJ IDEA.
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
 * 7. 회문 문자열
 * 설명
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 *
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 * 출력
 * 첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 *
 * 예시 입력 1  ->  gooG
 * 예시 출력 1  ->  YES
 */
public class String7 {
  public String solution(String str){
    String answer="YES"; // YES로 응답 초기화
    str=str.toUpperCase(); // 대소문자 구분 없으므로 모두 대문자 처리
    int len=str.length(); // 길이 int
    for(int i=0; i < len/2; i++){ // 길이를 2로 나눈값 만큼 == 전체 문자열의 반틈
      if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO"; // charAt으로 첫번째와 마지막 두번째와 마지막 - 1 방식으로 비교 같지 않으면 NO
    }
    return answer; // response
  }

  public String solution2(String str){
    String answer="NO"; // NO로 응답 초기화
    String tmp=new StringBuilder(str).reverse().toString(); // StringBuilder의 reverse()를 사용하여 입력받은 문자열 뒤집기
    if(str.equalsIgnoreCase(tmp)) answer="YES"; // equals비교 IgnoreCase 대소문자 무시 . 같으면 YES
    return answer; // response
  }

  public static void main(String[] args){
    String7 T = new String7();
    Scanner kb = new Scanner(System.in);
    String str=kb.next();
    System.out.print(T.solution(str));
  }

}
