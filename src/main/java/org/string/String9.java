/*
 * Created by Wonuk Hwang on 2023/01/28
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/28
 */
package org.string;

/**
 * create on 2023/01/28. create by IntelliJ IDEA.
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
 * 9. 숫자만 추출
 * 설명
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 * 추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
 *
 * 입력
 * 첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
 *
 * 출력
 * 첫 줄에 자연수를 출력합니다.
 *
 * 예시 입력  ->  g0en2T0s8eSoft
 * 예시 출력  ->  208
 */
public class String9 {
  public int solution(String s){
    //int answer=0;
    String answer="";
    for(char x : s.toCharArray()) { // 입력받은 문자열을 Char 배열로 만들어 foreach문에 넣는다.
      //if(x > = 48 && x < = 57) answer = answer * 10 + (x - 48); // 숫자인지 검사
			/*if(Character.isDigit(x)){ // 숫자인지 검사
				answer=answer * 10 + Character.getNumericValue(x); // 숫자만 추출
			}*/
      if(Character.isDigit(x)) answer+=x; // 숫자인지 검사하는 메소드
    }
    return Integer.parseInt(answer);
  }

  public static void main(String[] args){
    String9 T = new String9();
    Scanner kb = new Scanner(System.in);
    String str=kb.next();
    System.out.print(T.solution(str));
  }
}
