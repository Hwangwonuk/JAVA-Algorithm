/*
 * Created by Wonuk Hwang on 2023/05/19
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/05/19
 */
package org.programmers;

/**
 * create on 2023/05/19. create by IntelliJ IDEA.
 *
 * <p> </p>
 * <p> {@link } and {@link } </p> *
 *
 * @author wonukHwang
 * @version 1.0
 * @see
 * @since (ex : 5 + 5)
 */
public class Day9 {

  /**
   * 개미 군단
   * 문제 설명
   * 개미 군단이 사냥을 나가려고 합니다. 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
   * 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
   * 예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만,
   * 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
   * 사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에 딱 맞게 최소한의 병력을 구성하려면
   * 몇 마리의 개미가 필요한지를 return하도록 solution 함수를 완성해주세요.
   *
   * 제한사항
   * hp는 자연수입니다.
   * 0 ≤ hp ≤ 1000
   *
   * 입출력 예
   *   hp	     result
   *   23	        5
   *   24	        6
   *   999	      201
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * hp가 23이므로, 장군개미 네마리와 병정개미 한마리로 사냥할 수 있습니다. 따라서 5를 return합니다.
   *
   * 입출력 예 #2
   * hp가 24이므로, 장군개미 네마리 병정개미 한마리 일개미 한마리로 사냥할 수 있습니다. 따라서 6을 return합니다.
   *
   * 입출력 예 #3
   * hp가 999이므로, 장군개미 199 마리 병정개미 한마리 일개미 한마리로 사냥할 수 있습니다. 따라서 201을 return합니다.
   */
  public int solution(int hp) {
    int answer = hp / 5;        // 장군개미의 수
    hp %= 5;                    // 남은 hp

    answer += hp / 3;           // 병정개미의 수
    hp %= 3;                    // 남은 hp

    answer += hp / 1;           // 일개미의 수를 구함

    return answer;
  }

  /**
   * 모스부호 (1)
   * 문제 설명
   * 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
   * 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
   * 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
   * 모스부호는 다음과 같습니다.
   *
   * morse = {
   *     '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
   *     '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
   *     '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
   *     '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
   *     '-.--':'y','--..':'z'
   * }
   *
   * 제한사항
   * 1 ≤ letter의 길이 ≤ 1,000
   * return값은 소문자입니다.
   * letter의 모스부호는 공백으로 나누어져 있습니다.
   * letter에 공백은 연속으로 두 개 이상 존재하지 않습니다.
   * 해독할 수 없는 편지는 주어지지 않습니다.
   * 편지의 시작과 끝에는 공백이 없습니다.
   *
   * 입출력 예
   *        letter	             result
   * ".... . .-.. .-.. ---"	     "hello"
   * ".--. -.-- - .... --- -."	 "python"
   *
   *  입출력 예 설명
   * 입출력 예 #1
   *
   * .... = h
   * . = e
   * .-.. = l
   * .-.. = l
   * --- = o
   *
   * 따라서 "hello"를 return 합니다.
   *
   * 입출력 예 #2
   *
   * .--. = p
   * -.-- = y
   * - = t
   * .... = h
   * --- = o
   * -. = n
   *
   * 따라서 "python"을 return 합니다.
   *
   * a ~ z에 해당하는 모스부호가 순서대로 담긴 배열입니다.
   * {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}
   */
  public String solution(String letter) {

    String[] morseArray = {".-","-...","-.-.","-..",".","..-.",
        "--.","....","..",".---","-.-",".-..","--","-.",
        "---",".--.","--.-",".-.","...","-","..-","...-",
        ".--","-..-","-.--","--.."};

    String[] morseString;
    morseString = letter.split(" ");

    StringBuilder sb = new StringBuilder();
    for (String word : morseString) {
      for (int i = 0; i < morseArray.length; i++) {
        if (word.equals(morseArray[i])) sb.append(Character.toString(i + 'a'));
      }
    }
    return sb.toString();
  }

}
