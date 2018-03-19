package com.tianyongwei.config.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * 参考：https://www.google.com/search?q=%E5%AE%9E%E7%8E%B0xss+%E8%BF%87%E6%BB%A4&oq=%E5%AE%9E%E7%8E%B0xss+%E8%BF%87%E6%BB%A4&aqs=chrome..69i57.10513j1j7&sourceid=chrome&ie=UTF-8
 */

public class XssHttpservletRequestWrapper extends HttpServletRequestWrapper {
    /**
     * Constructs a request object wrapping the given request.
     *
     * @param request The request to wrap
     * @throws IllegalArgumentException if the request is null
     */
    public XssHttpservletRequestWrapper(HttpServletRequest request) {
        super(request);
    }
}
