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

import java.util.Scanner;

/**
 * 3. 가위 바위 보
 * 설명
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 * 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * 예를 들어 N=5이면
 *
 *   회수    1  2  3  4  5
 * A의 정보  2  3  3  1  3
 * B의 정보  1  1  2  2  3
 *   승자    A  B  A  B  D
 *
 * 두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 게임 횟수인 자연수 N(1 <= N <= 100)이 주어집니다.
 * 두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 * 세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.
 *
 * 출력
 * 각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 */
public class Array3 {
  public String solution(int n, int[] a, int[] b){
    String answer = ""; // 응답값 문자열 초기화
    for(int i = 0; i < n; i++) { // 게임 횟수만큼 반복문 실행
      if(a[i] == b[i]) { // A와 B가 낸 가위, 바위, 보 가 같다면
        answer+="D"; // 응답값에 D 추가
      }
      else if(a[i] == 1 && b[i] == 3) { // a가 가위이고 b가 보 라면
        answer+="A"; // A가 이김
      }
      else if(a[i] == 2 && b[i] == 1) { // a가 바위이고 b가 가위 라면
        answer+="A"; // A가 이김
      }
      else if(a[i] == 3 && b[i] == 2) { // a가 보 이고 b가 바위 라면
        answer+="A"; // A가 이김
      }
      else { // 나머지의 경우
        answer+="B"; // B가 이김
      }
    }
    return answer;
  }
  public static void main(String[] args){
    Array3 T = new Array3();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();

    int[] a = new int[n];
    int[] b = new int[n];

    for(int i = 0; i < n; i++) {
      a[i] = kb.nextInt();
    }
    for(int i = 0; i<n; i++){
      b[i] = kb.nextInt();
    }
    for(char x : T.solution(n, a, b).toCharArray()) {
      System.out.println(x);
    }
  }
}
