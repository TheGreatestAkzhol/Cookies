package com.example.javaeecookies.cookiesexample;

import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;

public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("some_id","");
        cookie.setMaxAge(0);//удаляется немедленно
        //cookie.setMaxAge(-1);//при таком раскладе куки удаляется после закрытия браузера
        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
