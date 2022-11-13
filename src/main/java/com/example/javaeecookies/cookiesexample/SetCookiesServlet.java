package com.example.javaeecookies.cookiesexample;


import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("some_id","123");
        Cookie cookie1 = new Cookie("some_name","123");
        cookie.setMaxAge(24*60*60);
        cookie1.setMaxAge(24*60*60);
        response.addCookie(cookie);
        response.addCookie(cookie1);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
