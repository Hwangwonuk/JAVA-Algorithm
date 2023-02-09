/*
 * Created by Wonuk Hwang on 2023/02/09
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/02/09
 */
package org.array;

/**
 * create on 2023/02/09. create by IntelliJ IDEA.
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
 * 4. 피보나치 수열
 * 설명
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 *
 * 입력
 * 첫 줄에 총 항수 N(3 <= N <= 45)이 입력된다.
 *
 * 출력
 * 첫 줄에 피보나치 수열을 출력합니다.
 *
 * 예시 입력  ->  10
 * 예시 출력  ->  1 1 2 3 5 8 13 21 34 55
 */
public class Array4 {
  public int[] solution(int n) {
    int[] answer = new int[n]; // 입력받은 n개만큼 배열 생성
    answer[0] = 1; // 인덱스 0 에는 1을 미리 세팅
    answer[1] = 1; // 인덱스 1 에는 1을 미리 세팅 (첫 두개는 값이 중복되기 때문)
    for(int i = 2; i < n; i++) { // 2번 인덱스부터 배열의 수만큼 반복문
      answer[i] = answer[i-2] + answer[i-1]; // 인덱스2번 = 인덱스 0 + 인덱스1 의 형식으로 반복문을 사용하여 배열에 추가.
    }
    return answer;
  }

  public void solution2(int n){
    int a = 1, b = 1, c; // int a, b에 1을 초기화
    System.out.print(a + " " + b + " "); // print 1 1
    for(int i = 2; i < n; i++) { // 2번 인덱스부터 배열의 수만큼 반복문
      c = a + b; // int c = a + b 로 시작
      System.out.print(c + " "); // pinrt 2
      a = b; // a의 값을 다음 값인 b로 세팅
      b = c; // b의 값을 다음 값인 c로 세팅
      // 전체 반복
    }
  }

  public static void main(String[] args){
    Array4 T = new Array4();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    for(int x :T.solution(n)) {
      System.out.print(x+" ");
    }
    T.solution2(n);
  }
}
