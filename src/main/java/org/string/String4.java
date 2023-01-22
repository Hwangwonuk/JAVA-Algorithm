/*
 * Created by Wonuk Hwang on 2023/01/23
 * As part of Bigin
 *
 * Copyright (C) Bigin (https://bigin.io/main) - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by infra Team <wonuk_hwang@bigin.io>, 2023/01/23
 */
package org.string;

/**
 * create on 2023/01/23. create by IntelliJ IDEA.
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
 * 4. 단어 뒤집기
 * 설명
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력
 * N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 *
 * 예시 입력      ->      예시 출력
 *     1
 *     good                   doog
 *     Time                   emiT
 *     Big                    giB
 */
class String4 {
//  public ArrayList<String> solution(int n, String[] str){
//    ArrayList<String> answer=new ArrayList<>();
//    for(String x : str){
//      String tmp=new StringBuilder(x).reverse().toString(); // reverse()
//      answer.add(tmp);
//    }
//    return answer;
//  }
//
//  public static void main(String[] args){
//    String4 T = new String4();
//    Scanner kb = new Scanner(System.in);
//    int n=kb.nextInt();
//    String[] str=new String[n];
//    for(int i=0; i<n; i++){
//      str[i]=kb.next();
//    }
//    for(String x : T.solution(n, str)){
//      System.out.println(x);
//    }
//  }
//
  public ArrayList<String> solution(int n, String[] str){
    ArrayList<String> answer = new ArrayList<>();
    for(String x : str){
      char[] s=x.toCharArray(); // 입력받은 문자열을 Char 배열로 변경
      int lt=0, rt=x.length()-1; // index 번호 추출
      while(lt<rt){
        char tmp=s[lt]; // 0번째 index부터
        s[lt]=s[rt]; // 0번째와 마지막 index 치환
        s[rt]=tmp; // 마지막은 첫번째로
        lt++; // 반복문 탈출
        rt--; // 반복문 탈출
      }
      String tmp=String.valueOf(s); // String 으로 변환
      answer.add(tmp); // 배열에 추가
    }
    return answer;
  }

  public static void main(String[] args){
    String4 T = new String4();
    Scanner kb = new Scanner(System.in);
    int n=kb.nextInt();
    String[] str=new String[n];
    for(int i=0; i<n; i++){
      str[i]=kb.next();
    }
    for(String x : T.solution(n, str)){
      System.out.println(x);
    }
  }
}



class Main {

}
