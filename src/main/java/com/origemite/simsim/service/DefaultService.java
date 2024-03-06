package com.origemite.simsim.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Stack;

@Service
@Slf4j
@RequiredArgsConstructor
public class DefaultService {

    //prefixSum
    public void defa1(int[] input) throws JsonProcessingException {
        int n = input.length + 1;
        log.info("n = {}", n);
        int[] preSum = new int[n];
        log.info("{}", new ObjectMapper().writeValueAsString(preSum));

        for (int i = 1; i < n; i++) {
            log.info("i = {}", i);
            preSum[i] = preSum[i - 1] + input[i - 1];
//            log.info("{}", new ObjectMapper().writeValueAsString(preSum));
            log.info("{}", input[i - 1]);
        }
        log.info("{}", new ObjectMapper().writeValueAsString(preSum));
        log.info("{}", new ObjectMapper().writeValueAsString(preSum[4]));
        log.info("{}", new ObjectMapper().writeValueAsString(preSum[2]));
        log.info("{}", new ObjectMapper().writeValueAsString(preSum[4] - preSum[2 - 1]));

    }

    //stack
    public void defa2(String s) {
        String answer = "";
        Stack<String> st = new Stack<>();
        for (Character x : s.toCharArray()) {
            if (x == ')') {
                String tmp = "";
                while (!st.empty()) {
                    String c = st.pop();
                    log.info(c);
                    if (c.equals("(")) {
                        String num = "";
                        while (!st.empty() && Character.isDigit(st.peek().charAt(0))) {
                            num = st.pop() + num;
                        }
                        String res = "";
                        int cnt = 0;
                        if (num.equals("")) cnt = 1;
                        else cnt = Integer.parseInt(num);
                        for (int i = 0; i < cnt; i++) res += tmp;
                        st.push(res);

                        break;
                    }
                    tmp = c + tmp;
                }
            } else {
                st.push(String.valueOf(x));
                log.info(st.peek());
            }
        }
        for (String x : st) answer += x;
        log.info(answer);
    }

    //graph
    public void defa20000(int[][] input) {
    }
}
