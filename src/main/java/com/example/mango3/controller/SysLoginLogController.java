package com.example.mango3.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

import com.example.mango3.utils.IOUtils;
import com.example.mango3.domain.SysLoginLog;
import com.example.mango3.http.HttpResult;
import com.example.mango3.page.PageRequest;
import com.example.mango3.service.SysLoginLogService;
import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录日志控制器
 * @author Louis
 * @date Jan 13, 2019
 */
@RestController
@RequestMapping("loginlog")
public class SysLoginLogController {

	@Autowired
	private SysLoginLogService sysLoginLogService;

	// 验证码生成器
	@Autowired
	private Producer producer;

	@PostMapping(value="/findPage")
	public HttpResult findPage(@RequestBody PageRequest pageRequest) {
		return HttpResult.ok(sysLoginLogService.findPage(pageRequest));
	}
	
	@PostMapping(value="/delete")
	public HttpResult delete(@RequestBody List<SysLoginLog> records) {
		return HttpResult.ok(sysLoginLogService.delete(records));
	}

	@GetMapping(value = "/captcha.jpg")
	public void captcha(HttpServletResponse response, HttpServletRequest request)
	throws ServletException, IOException {
		response.setHeader("Cache-Control", "no-state, no-cache");
		response.setContentType("image/jpeg");

		String text = producer.createText();
		BufferedImage image = producer.createImage(text);
		request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, text);
		ServletOutputStream out = response.getOutputStream();
		ImageIO.write(image, "jpg", out);
		IOUtils.closeQuietly(out);
	}
}
