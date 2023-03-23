//package com.soa.demo.security;
//
//import jakarta.servlet.*;
//import jakarta.servlet.annotation.WebFilter;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.net.URL;
//
//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
//@WebFilter("/*")
//public class CorsFilter implements Filter {
//
//    public CorsFilter() {
//    }
//
//    @Override
//    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
//        final HttpServletResponse response = (HttpServletResponse) res;
//        final HttpServletRequest request = (HttpServletRequest) req;
////        String URL = "http://localhost:5173";
////        String OTHER_URL = "https://accounts.google.com";
////        System.out.println(request.getHeader("Origin"));
////        if (URL.equals(request.getHeader("Origin"))) {
////            response.setHeader("Access-Control-Allow-Origin", URL);
////        } else if (OTHER_URL.equals(request.getHeader("Origin"))) {
////            response.setHeader("Access-Control-Allow-Origin", OTHER_URL);
////        }
//        response.setHeader("Access-Control-Allow-Origin", "http://localhost:5173");
//        response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
//        response.setHeader("Access-Control-Allow-Headers", "x-requested-with, authorization");
//        response.setHeader("Access-Control-Allow-Credentials", "true");
//        response.setHeader("Access-Control-Max-Age", "3600");
//        if ("OPTIONS".equalsIgnoreCase(((HttpServletRequest) req).getMethod())) {
//            response.setStatus(HttpServletResponse.SC_OK);
//        } else {
//            chain.doFilter(req, res);
//        }
//    }
//
//    @Override
//    public void destroy() {
//    }
//
//    @Override
//    public void init(FilterConfig config) throws ServletException {
//    }
//}
//
