/*
 * Created by Wonuk Hwang on 2023/02/06
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/02/06
 */
package org.array;

/**
 * create on 2023/02/06. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 6. 뒤집은 소수
 * 설명
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요. 예를 들어 32를 뒤집으면
 * 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다. 첫 자리부터의 연속된 0은 무시한다.
 * <p>
 * 입력 첫 줄에 자연수의 개수 N(3 <= N <= 100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다. 각 자연수의 크기는 100,000를 넘지 않는다.
 * <p>
 * 출력 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 * <p>
 * 예시 입력 9 32 55 62 20 250 370 200 30 100 -> 23, 55, 26, 2, 52, 73, 2, 3, 1
 * <p>
 * 예시 출력 23 2 73 2 3
 */
public class Array6 {

  public boolean isPrime(int num) {
    if (num == 1) { // 1은 소수가 아니다
      return false;
    }
    for (int i = 2; i < num; i++) { // 2부터 num 이전까지 반복문
      if (num % i == 0) { // 약수가 존재한다면
        return false; // 소수가 아니다.
      }
    }
    return true;
  }

  public ArrayList<Integer> solution(int n, int[] arr) { // 자연수 n개 입력, 자연수 배열 입력
    ArrayList<Integer> answer = new ArrayList<>(); // ArrayList 초기화
    for (int i = 0; i < n; i++) { // 자연수의 개수만큼 반복문
      int tmp = arr[i]; // 입력받은 자연수 순서대로
      int res = 0; // 뒤집힌 결과 초기화
      while (tmp > 0) { // 입력받은 자연수가 0보다 크다면
        int t = tmp % 10; // 10으로 나눈 나머지를 구한다.
        res = res * 10 + t; // tmp를 뒤집은 결과
        tmp = tmp / 10; // 10으로 나눈 몫을 구한다.
      }
      if (isPrime(res)) { // 소수인지 아닌지 판별한다.
        answer.add(res); // 소수이면 응답에 추가
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Array6 T = new Array6();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }
    for (int x : T.solution(n, arr)) {
      System.out.print(x + " ");
    }
  }
}
