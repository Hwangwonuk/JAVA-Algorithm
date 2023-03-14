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
}
