package com.redhat.camel.sample.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SampleRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("{{route.from}}").to("{{route.to}}");
    }
}