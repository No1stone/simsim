package com.origemite.simsim.cont;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.origemite.simsim.service.DefaultService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.coyote.http11.Constants.a;

@RestController
@RequestMapping("/defa")
@Slf4j
@RequiredArgsConstructor
public class DefaultCont {
    private final DefaultService defaultService;

    @GetMapping("/1")
    public void defa1() throws JsonProcessingException {
        int[] input = {1, 3, 11, 6, 7, 10, 14, 9, 18, 16, 5, 4, 2, 8, 19};
        defaultService.defa1(input);
    }

    @GetMapping("/2")
    public void defa2() throws JsonProcessingException {
        String s = "2(a2(abc))ef";
        defaultService.defa2(s);
    }

    public void defa20000() throws JsonProcessingException {
        int[][] input = {{0, 1, 10}, {1, 2, 20}, {0, 2, 70}, {0, 3, 70}, {0, 3, 100}, {1, 3, 80}, {2, 3, 10}, {2, 4, 30}, {3, 4, 10}};
        defaultService.defa20000(input);
    }
}
