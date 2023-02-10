/*
 * Created by Wonuk Hwang on 2023/02/10
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/02/10
 */
package org.array;

/**
 * create on 2023/02/10. create by IntelliJ IDEA.
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
 * 5. 소수(에라토스테네스 체) 설명 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요. 만약 20이 입력되면 1부터 20까지의 소수는 2,
 * 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * <p>
 * 입력 첫 줄에 자연수의 개수 N(2 <= N <= 200,000)이 주어집니다.
 * <p>
 * 출력 첫 줄에 소수의 개수를 출력합니다.
 * <p>
 * 예시 입력  ->  20
 * 예시 출력  ->  8
 */
public class Array5 {

  public int solution(int n) {
    int cnt = 0; // 응답값 초기화
    int[] ch = new int[n + 1]; // n값이 20인경우 n + 1로 설정해야 인덱스 번호가 20번까지 생김 처음엔 모두 0으로 값이 초기화됨
    for (int i = 2; i <= n; i++) { // 2부터 n까지 반복문 실행
      if (ch[i] == 0) { // 1. 배열 2번 인덱스의 값이 0이면
        // 2. 배열 3번 인덱스의 값이 0이면
        cnt++; // cnt값 ++
        for (int j = i; j <= n; j = j + i) { // j = i와 같은 값으로 설정 및 j + i 로 탈출
          ch[j] = 1; // 1. ch[2] = 1, ch[4] = 1, ch[6] = 1... ch[20] = 1 2를 약수로 가지는것들에 1을 표시 2의 배수 i가 증가
          // 2. [3], [6], [9], [12], [15], [18] = 1 1은 다 걸러줌

        }
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    Array5 T = new Array5();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    System.out.println(T.solution(n));
  }
}
