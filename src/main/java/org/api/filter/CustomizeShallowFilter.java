package org.api.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

import java.io.IOException;

/**
 * This class is to customize Shallow filter to generate a Etag hash value
 * by consuming more secure algorithm
 */
public class CustomizeShallowFilter extends ShallowEtagHeaderFilter {
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

//        response.addHeader("Etag","testetag");
//
//        filterChain.doFilter(request, response);


    }


}
