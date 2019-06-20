package com.melardev.spring.feign.filters;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CatchAllFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        // Useful for debugging you may create a breakpoint here to know if this microservice is ever hit (either with
        // a URL that is not mapped to any controller)
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }
}
