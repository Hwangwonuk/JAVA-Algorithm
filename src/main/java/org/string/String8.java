/*
 * Created by Wonuk Hwang on 2023/01/27
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/27
 */
package org.string;

/**
 * create on 2023/01/27. create by IntelliJ IDEA.
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
 * 8. 유효한 팰린드롬
 * 설명
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 * 알파벳 이외의 문자들의 무시합니다.
 *
 * 입력
 * 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 * 출력
 * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
 *
 *
 * 예시 입력  ->  found7, time: study; Yduts; emit, 7Dnuof
 * 예시 출력  ->  YES
 */
public class String8 {
  public String solution(String s){
    // NO로 응답값 초기화
    String answer="NO";
    // 입력받은 문자열을 대문자로 변경, 정규식을 사용하여 알파벳이 아니면 삭제
    s=s.toUpperCase().replaceAll("[^A-Z]", "");
    // StringBuilder.reverse()를 사용하여 문자열 뒤집기
    String tmp = new StringBuilder(s).reverse().toString();
    // 입력받은 문자열(알파벳이 아닌것은 제거된)과 reverse()의 결과물이 같으면 answer는 YES
    if(s.equals(tmp)) answer="YES";
    // 출력
    return answer;
  }

  public static void main(String[] args){
    String8 T = new String8();
    Scanner kb = new Scanner(System.in);
    String str=kb.nextLine();
    System.out.print(T.solution(str));
  }
}
