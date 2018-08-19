package com.example.multiConfig.steps;

import com.example.multiConfig.SampleService;
import lombok.Getter;


@Getter
public class SampleTestContext {
    private SampleService sampleService;

    public SampleTestContext(SampleService sampleService) {
        this.sampleService = sampleService;
    }
}
