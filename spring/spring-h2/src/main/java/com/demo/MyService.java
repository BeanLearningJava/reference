package com.demo;

import org.springframework.stereotype.Component;

@Component
public class MyService {
    public Love getString() {
        return new Love();
    }
}

