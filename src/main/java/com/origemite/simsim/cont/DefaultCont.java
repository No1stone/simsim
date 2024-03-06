package com.origemite.simsim.cont;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.origemite.simsim.service.DefaultService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
