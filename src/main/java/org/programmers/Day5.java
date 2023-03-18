/*
 * Created by Wonuk Hwang on 2023/03/13
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/03/13
 */
package org.programmers;

import java.util.Scanner;

/**
 * create on 2023/03/13. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */
public class Day5 {

  /**
   * 옷가게 할인 받기
   * 문제 설명
   * 머쓱이네 옷가게는
   * 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
   * 구매한 옷의 가격 price가 주어질 때,
   * 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
   *
   * 제한사항
   * 10 ≤ price ≤ 1,000,000
   *
   * price는 10원 단위로(1의 자리가 0) 주어집니다.
   * 소수점 이하를 버린 정수를 return합니다.
   *
   * 입출력 예
   *     price	     result
   *    150,000	    142,500
   *    580,000	    464,000
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * 150,000원에서 5%를 할인한 142,500원을 return 합니다.
   *
   * 입출력 예 #2
   * 580,000원에서 20%를 할인한 464,000원을 return 합니다.
   */
  public int solution(int price) {
    int answer = 0;

    if (price >= 500000) { // 50만원 이상
      answer = (int) (price * 0.8); // 20% 할인
    } else if (price >= 300000) { // 30만원 이상
      answer = (int) (price * 0.9); // 10% 할인
    } else if (price >= 100000) { // 10만원 이상
      answer = (int) (price * 0.95); // 5% 할인
    } else { // 아니라면
      answer = price; // 원가
    }
    return answer;
  }

  /**
   * 아이스 아메리카노
   * 문제 설명
   * 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다.
   * 아이스 아메리카노는 한잔에 5,500원입니다.
   * 머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때,
   * 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와
   * 남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
   *
   * 제한사항
   * 0 < money ≤ 1,000,000
   *
   * 입출력 예
   *     money	   result
   *     5,500	   [1, 0]
   *     15,000	   [2, 4000]
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * 5,500원은 아이스 아메리카노 한 잔을 살 수 있고 잔돈은 0원입니다.
   *
   * 입출력 예 #2
   * 15,000원은 아이스 아메리카노 두 잔을 살 수 있고 잔돈은 4,000원입니다.
   */
  public int[] solution2(int money) {
    int[] answer = new int[2];

    answer[0] = money / 5500; // 5500원 아메리카노 잔수
    answer[1] = money % 5500; // 아메리카노 사고 남은 잔돈
    return answer;
  }

  /**
   * 나이 출력
   * 문제 설명
   * 머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
   * 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
   *
   * 제한사항
   * 0 < age ≤ 120
   *
   * 나이는 태어난 연도에 1살이며 1년마다 1씩 증가합니다.
   *
   * 입출력 예
   *     age	    result
   *     40	       1983
   *     23	       2000
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * 2022년 기준 40살이므로 1983년생입니다.
   *
   * 입출력 예 #2
   * 2022년 기준 23살이므로 2000년생입니다.
   */
  public int solution3(int age) {
    int answer = 2022 - age + 1; // 2022년 기준. 나이 구하는 공식.
    return answer;
  }

  /**
   * 배열 뒤집기
   * 문제 설명
   * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
   * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
   *
   * 제한사항
   * 1 ≤ num_list의 길이 ≤ 1,000
   * 0 ≤ num_list의 원소 ≤ 1,000
   *
   * 입출력 예
   *       num_list	              result
   * [1, 2, 3, 4, 5]	        [5, 4, 3, 2, 1]
   * [1, 1, 1, 1, 1, 2]	      [2, 1, 1, 1, 1, 1]
   * [1, 0, 1, 1, 1, 3, 5]	  [5, 3, 1, 1, 1, 0, 1]
   *
   * 입출력 예 설명
   *
   * 입출력 예 #1
   * num_list가 [1, 2, 3, 4, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 4, 3, 2, 1]을 return합니다.
   *
   * 입출력 예 #2
   * num_list가 [1, 1, 1, 1, 1, 2]이므로 순서를 거꾸로 뒤집은 배열 [2, 1, 1, 1, 1, 1]을 return합니다.
   *
   * 입출력 예 #3
   * num_list가 [1, 0, 1, 1, 1, 3, 5]이므로 순서를 거꾸로 뒤집은 배열 [5, 3, 1, 1, 1, 0, 1]을 return합니다.
   */
  public int[] solution(int[] num_list) {
    int[] answer = new int[num_list.length]; // 입력받은 배열의 길이만큼 index 생성(원본 + 1)
    for(int i = 0; i < num_list.length; i++) { // 입력받은 배열의 인덱스만큼
      answer[i] = num_list[num_list.length - i - 1]; // 배열 뒤집기
    }
    return answer;
  }

  /**
   * 문자열 뒤집기
   * 문제 설명
   * 문자열 my_string이 매개변수로 주어집니다.
   * my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
   *
   * 제한사항
   * 1 ≤ my_string의 길이 ≤ 1,000
   *
   * 입출력 예
   *     my_string	      return
   *     "jaron"	        "noraj"
   *     "bread"	        "daerb"
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * my_string이 "jaron"이므로 거꾸로 뒤집은 "noraj"를 return합니다.
   *
   * 입출력 예 #2
   * my_string이 "bread"이므로 거꾸로 뒤집은 "daerb"를 return합니다.
   */
  public String solution5(String my_string) {
    String answer = "";

    for (int i = my_string.length() - 1; i >= 0; i--) {
      answer += my_string.substring(i, i + 1);
    }
    return answer;
  }

  /**
   * 직각삼각형 출력하기
   * 문제 설명
   * "*"의 높이와 너비를 1이라고 했을 때,
   * "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
   * 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
   *
   * 제한사항
   * 1 ≤ n ≤ 10
   *
   * 입출력 예
   * 입력 #1
   * 3
   *
   * 출력 #1
   * *
   * **
   * ***
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * n이 3이므로 첫째 줄에 * 1개, 둘째 줄에 * 2개, 셋째 줄에 * 3개를 출력합니다.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String x = "*";
    for(int i = 0; i<n; i++) {
      for(int j = 0; j<=i; j++) {
        System.out.print(x);
      }
      System.out.println();
    }
  }



}
