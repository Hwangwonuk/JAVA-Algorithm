/*
 * Created by Wonuk Hwang on 2023/02/03
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/02/03
 */
package org.array;

/**
 * create on 2023/02/03. create by IntelliJ IDEA.
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
 * 1. 두 배열 합치기
 * 설명
 * 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째. 줄에 첫 번째 배열의 크기 N(1 <= N <= 100)이 주어집니다.
 * 두 번째. 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 * 세 번째. 줄에 두 번째 배열의 크기 M(1 <= M <= 100)이 주어집니다.
 * 네 번째. 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 * 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
 *
 * 출력
 * 오름차순으로 정렬된 배열을 출력합니다.
 *
 *
 * 예시 입력        ->      예시 출력
 * 3                      1 2 3 3 5 6 7 9
 * 1 3 5
 * 5
 * 2 3 6 7 9
 */
public class Array1 {
  public ArrayList<Integer> solution(int n, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>(); // ArrayList 빈배열로 응답값 초기화
    answer.add(arr[0]); // 배열에 int배열 0번째 index add
    for(int i = 1; i < n; i++) { // 입력된 1번째 인덱스부터(이전값과 비교하기위해) 배열의 숫자 -1 만큼 반복
      if(arr[i] > arr[i-1]) { // 이전의 배열보다 뒤의 배열이 크다면
        answer.add(arr[i]); // 응답 배열에 해당 배열 인덱스 배열값 추가
      }
    }
    return answer;
  }

  public static void main(String[] args){
    Array1 T = new Array1();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }
    for(int x : T.solution(n, arr)) {
      System.out.print(x+" ");
    }
  }
}
