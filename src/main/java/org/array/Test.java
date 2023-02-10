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

import java.lang.reflect.Array;
import java.math.BigDecimal;

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
public class Test {
  public int solution(int num1, int num2) {
    int answer = -1;
    if(0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100) {
      answer = num1 % num2;
    }
    return answer;
  }
}
