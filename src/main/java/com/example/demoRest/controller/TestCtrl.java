package com.example.demoRest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoRest.vo.ResponseVO;

@RestController
public class TestCtrl {

	@GetMapping("/test")
	public ResponseVO test() {
		return new ResponseVO(1,"El servicio está activo");
	}
}
