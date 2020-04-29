package com.example.mango3.controller;


import com.example.mango3.utils.IOUtils;
import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

@RestController
@RequestMapping("login")
public class SysLoginController {

    @Autowired
    private Producer producer;

    @GetMapping(value = "captcha.jpg")
    public void captcha (HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Cache-Control", "no-state no-cache");
        response.setContentType("image/jepg");

        String text = producer.createText();
        BufferedImage image = producer.createImage(text);
        ServletOutputStream out =  response.getOutputStream();
        ImageIO.write(image, "jpg", out);
        IOUtils.closeQuietly(out);
    }
}
