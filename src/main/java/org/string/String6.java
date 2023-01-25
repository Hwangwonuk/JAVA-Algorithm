/*
 * Created by Wonuk Hwang on 2023/01/25
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/25
 */
package org.string;

/**
 * create on 2023/01/25. create by IntelliJ IDEA.
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
 * 6. 중복문자제거
 * 설명
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 *
 * 입력
 * 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력
 * 첫 줄에 중복문자가 제거된 문자열을 출력합니다.
 *
 * 예시 입력 -> ksekkest
 * 예시 출력 -> kset
 */
public class String6 {
  public String solution(String str){
    String answer="";
    for(int i=0; i < str.length(); i++) { // index로 찾기 때문에 length - 1
      //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
      if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i); // 중복 되었으면 출력문자인 answer에 병합
    }
    return answer;
  }

  public static void main(String[] args){
    String6 T = new String6();
    Scanner kb = new Scanner(System.in);
    String str=kb.next();
    System.out.print(T.solution(str));
  }
}
