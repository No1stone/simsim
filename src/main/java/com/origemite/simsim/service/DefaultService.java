package com.origemite.simsim.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
}
