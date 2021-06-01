package com.ibdata.sample.beanscope.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SingletonComponent {

    private int number = 0;

    public void plus() {
        log.debug("number = " + this.number);
        log.debug("plus()");
        number++;
        log.debug("number = " + this.number);
    }

    public void minus() {
        log.debug("number = " + this.number);
        log.debug("minus()");
        number--;
        log.debug("number = " + this.number);
    }

    public void print() {
        log.debug("print()");
        log.debug("number = " + this.number);
    }
}
