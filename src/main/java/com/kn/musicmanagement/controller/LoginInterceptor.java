package com.kn.musicmanagement.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String path = request.getServletPath();
        Result result = new Result();
        if (path.matches(Const.NO_INTERCEPTOR_PATH)) {
            return true;
        } else {
            result.setCode(404);
            return true;
        }

    }
}
