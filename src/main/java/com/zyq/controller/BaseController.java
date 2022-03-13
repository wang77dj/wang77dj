package com.zyq.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zyq.vo.JsonResult;
import lombok.SneakyThrows;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author WangDZz
 * @Description：
 * @date 2022/3/13 - 19:44
 */
@RestControllerAdvice(basePackages = "com.zyq.controller")
public class BaseController implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @SneakyThrows
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if (body instanceof String) {
            JsonResult<Object> res = new JsonResult<>(1, body);
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(res);
        }
        if (body instanceof JsonResult) return body;
        return new JsonResult<>(1, body);
    }
}
