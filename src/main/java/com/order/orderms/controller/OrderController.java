package com.order.orderms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class OrderController {

    @GetMapping("/order")
    public String getOrder() throws UnknownHostException {
        String ip = InetAddress.getLocalHost().getHostAddress();
        return "My ip: " + ip;
    }

}
