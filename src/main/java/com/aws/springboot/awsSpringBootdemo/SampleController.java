package com.aws.springboot.awsSpringBootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class SampleController {

    @RequestMapping("/info")
    public String getSampleOutput() {
        return "sample spring boot Application cheking images changes";
    }

}
