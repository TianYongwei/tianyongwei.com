package com.tianyongwei.utils;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import java.net.MalformedURLException;
import java.net.URL;

public class EmailUtil {

    public static void sendSignupEmail(String destAddress ,String verifyCode) throws EmailException, MalformedURLException {
//        String verifyUrl = "http://localhost:8080/user/verify?email="+destAddress+"&vcode="+verifyCode;
        String verifyUrl = "http://bing.com";

        // Create the email message
        HtmlEmail email = new HtmlEmail();
        email.setHostName("smtp.163.com");
        email.setSmtpPort(25);
        email.setAuthenticator(new DefaultAuthenticator("ityongwei", "-----"));
        email.addTo(destAddress, destAddress);
        email.setFrom("ityongwei@163.com", "tianyongwei");
        email.setSubject("邮箱验证");
        email.setCharset("utf-8");

        // embed the image and get the content id
        URL url = new URL(verifyUrl);
        String cid = email.embed(url, "邮箱验证地址");

        // set the html message
        email.setHtmlMsg("<html>点击该地址进行邮箱验证：<a href='"+verifyUrl+"'>"+verifyUrl+"</a></html>");

        // set the alternative message
        email.setTextMsg("请访问此链接验证您的邮箱：");

        // send the email
        email.send();
    }

    public static void main(String[] args) throws MalformedURLException, EmailException {
        sendSignupEmail("869358189@qq.com","xxxxxx");
    }
}
