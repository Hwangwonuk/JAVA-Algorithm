/*
 * Created by Wonuk Hwang on 2023/01/24
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/24
 */
package org.string;

/**
 * create on 2023/01/24. create by IntelliJ IDEA.
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
 * 5. 특정 문자 뒤집기
 *
 * 설명
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 *
 * 출력
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 *
 * 예시 입력        ->     예시 출력
 * a#b!GE*T@S              S#T!EG*b@a
 */
public class String5 {
  public String solution(String str){
    String answer;
    char[] s=str.toCharArray(); // 입력받은 str을 char 배열로 변경
    int lt=0, rt=str.length()-1; // 첫번째 index 마지막 index 변수에 설정
    while(lt<rt){ // 같지 않을 경우에
      if(!Character.isAlphabetic(s[lt])) lt++; // 알파벳인지 검사
      else if(!Character.isAlphabetic(s[rt])) rt--; // 알파벳인지 검사
      else{
        char tmp=s[lt]; // 알파벳인 경우에
        s[lt]=s[rt]; // 위치 변환
        s[rt]=tmp;
        lt++;
        rt--;
      }
    }
    answer=String.valueOf(s);
    return answer;
  }

  public static void main(String[] args){
    String5 T = new String5();
    Scanner kb = new Scanner(System.in);
    String str=kb.next();
    System.out.println(T.solution(str));
  }
}
