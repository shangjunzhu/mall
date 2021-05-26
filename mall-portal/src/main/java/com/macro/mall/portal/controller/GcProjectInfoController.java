package com.macro.mall.portal.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.portal.service.GcProjectInfoService;

/**
 * 
 * @author zhushangjun
 *
 */
@RestController
@RequestMapping("project")
public class GcProjectInfoController {

	private GcProjectInfoService gcProjectInfoService;
	
	@PostMapping("")
	public CommonResult<?> create() {

		return CommonResult.failed();
	}
}
