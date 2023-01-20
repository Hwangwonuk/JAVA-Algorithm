/*
 * Created by Wonuk Hwang on 2023/01/20
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/20
 */
package org.string;

import java.util.Scanner;

/**
 * create on 2023/01/20. create by IntelliJ IDEA.
 *
 * <p> 문자 찾기 </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */
public class String1 {

  /**
   * 1. 문자 찾기
   * 설명
   * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
   * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
   *
   * 입력
   * 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.
   *
   * 문자열은 영어 알파벳으로만 구성되어 있습니다.
   *
   * 출력
   * 첫 줄에 해당 문자의 개수를 출력한다.
   */
    public int solution(String str, char t){
      int answer=0;
      str=str.toUpperCase(); // 대소문자를 구분하지 않는다. -> 대문자로 변환 -> 문자열
      t=Character.toUpperCase(t); // 대소문자를 구분하지 않는다. -> 대문자로 변환 -> 입력값
      //System.out.println(str+" "+t);
		/*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
		}*/
      // str.toCharArray() -> String을 Char 배열로 만들어준다.
      for(char x : str.toCharArray()){
        if(x==t) answer++; // 입력값과 동일한 배열이 있으면 count ++
      }
      return answer;
    }

    public static void main(String[] args){
      String1 T = new String1();
      Scanner kb = new Scanner(System.in);
      String str=kb.next();
      char c=kb.next().charAt(0);
      System.out.print(T.solution(str, c));
    }

}
