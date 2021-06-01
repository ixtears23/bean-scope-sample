package com.ibdata.sample.beanscope.controller;

import com.ibdata.sample.beanscope.component.SingletonComponent;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/bean/scope")
public class BeanScopeController {

    private final SingletonComponent singletonComponent;

    @GetMapping("/plus")
    public void plus() {
        singletonComponent.plus();
    }
    @GetMapping("/minus")
    public void minus() {
        singletonComponent.minus();
    }
    @GetMapping("/print")
    public void print() {
        singletonComponent.print();
    }
}
