package com.example.demo.diceGame.leeyonggeun;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/leeyonggeun")
public class LeeYongGeunController {

    @GetMapping("/test")
