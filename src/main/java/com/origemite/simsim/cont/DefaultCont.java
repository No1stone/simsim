package com.origemite.simsim.cont;

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
    public void defa1(){
    defaultService.defa1();
    }

}
