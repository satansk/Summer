package com.satansk.summer.site.misc;

/**
 * Author:  satansk
 * Email:   satansk@hotmail.com
 * Date:    17/6/10
 *
 * 1. HTTP 方法指示针对特定资源的动作，一共有 8 个：GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE, PATCH。
 * 2. 用在 {@link com.satansk.summer.site.domain.ApiPath} 中指示接口使用的 HTTP 方法类型。
 */
public enum HttpMethod {
    GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE, PATCH
}
