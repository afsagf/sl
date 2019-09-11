package com.sy.controller.wzx;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/checkCode")

//优先匹配servlet，如果能够找到servlet则直接执行servlet
//如果没有servlet只有静态资源，则直接返回静态资源
//如果静态资源也没有，则出现404
//@WebServlet("/a.html")
//a.html

public class CheckCodeServlet extends HttpServlet {

    //kaptcha验证码框架
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //验证码的绘制需要借助java   awt包下的一些绘制相关的类
        Random r = new Random();
        //1.先构建一个画板对象--内存中的画板对象，最后需要借助响应流写出到客户端
        BufferedImage bufferedImage = new BufferedImage(100, 30, BufferedImage.TYPE_INT_RGB);
        //2.获取画笔对象
        Graphics g = bufferedImage.getGraphics();
        //设置画笔的颜色
        g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
        //填充背景色
        g.drawRect(0, 0, 100, 30);
        //3.绘制字符串
        //设置画笔颜色
        g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
        //设置字体
        g.setFont(new Font(Font.SERIF, Font.BOLD, 20));
        //将字符串画上去
        g.drawString(getCode(4), 20, 20);

        //4.绘制噪音线和噪音点
        for (int i = 1; i <= 10; i++) {
            g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
            g.drawLine(r.nextInt(100), r.nextInt(30), r.nextInt(100), r.nextInt(30));

        }

        //将字符串写出到响应流中
        res.setContentType("image/jpeg");
        ImageIO.write(bufferedImage, "jpeg", res.getOutputStream());




    }

    private static String getCode(int len) {
        Random r = new Random();
        String strs = "3456789abcdefghjkmnpqrstuvwxy";
        String result = "";
        for (int i = 1; i <= len; i++) {
            result += strs.charAt(r.nextInt(strs.length()));
        }
        return result;
    }


}
