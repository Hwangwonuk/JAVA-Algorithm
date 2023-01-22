/*
 * Created by Wonuk Hwang on 2023/01/22
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/22
 */
package org.string;

import java.util.Scanner;

/**
 * create on 2023/01/22. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */

/**
 * 3. 문장 속 단어
 *
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 * 입력
 * 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * 첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
 */
public class String3 {
  public String solution(String str){
    String answer="";
    int m=Integer.MIN_VALUE;
    String[] s = str.split(" "); // 문장속의 각 단어는 공백으로 구분된다. split을 사용하여 배열로 만듦
    for(String x : s){
      int len=x.length(); // 각 배열의 length 추출
      if(len>m){ // 처음 추출된 길이는 무조건 크다.
        m=len; // m 값을 새로운 length로 설정한다.
        answer=x; // 그것을 답으로 설정한다.
      }
    }
    return answer;
  }

  public static void main(String[] args){
    String3 T = new String3();
    Scanner kb = new Scanner(System.in);
    String str=kb.nextLine();
    System.out.print(T.solution(str));
  }
}
