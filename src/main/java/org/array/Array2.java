/*
 * Created by Wonuk Hwang on 2023/02/04
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/02/04
 */
package org.array;

/**
 * create on 2023/02/04. create by IntelliJ IDEA.
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
 * 2. 보이는 학생
 * 설명
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
 * 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 *
 * 입력
 * 첫 줄에 정수 N(5 <= N <= 100,000)이 입력된다. 그 다음줄에 N명의 학생의 키가 앞에서부터 순서대로 주어진다.
 *
 * 출력
 * 선생님이 볼 수 있는 최대학생수를 출력한다.
 *
 * 예시 입력                             예시출력
 *    8                                     5
 *    130 135 148 140 145 150 150 153
 */
public class Array2 {
  public int solution(int n, int[] arr){
    int answer = 1, max = arr[0]; // max값에 첫번째 인덱스(학생)의 키를 초기화 및 응답값 1로 초기화(맨앞은 무조건 볼 수 있음)
    for(int i = 1; i < n; i++) { // 입력받은 n명의 학생의 수만큼 반복문 실행
      if(arr[i] > max) { // 이전에 설정된 max보다 다음 인덱스의 값이 크다면.
        max = arr[i]; // max값을 해당 배열의 값으로 설정
        answer++; // answer값에 1을 더해준다.
      }
    }
    return answer; // 출력
  }
  public static void main(String[] args){
    Array2 T = new Array2();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i]=kb.nextInt();
    }
    System.out.print(T.solution(n, arr));
  }
}
