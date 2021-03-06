package org.linuxprobe.luava.proxy;

import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibJoinPoint extends JoinPoint {
    /**
     * 函数代理对象
     */
    private MethodProxy methodProxy;

    public CglibJoinPoint(Object proxy, Method method, MethodProxy methodProxy) {
        super(proxy, method);
        this.methodProxy = methodProxy;
    }

    /**
     * 获取函数代理
     */
    public MethodProxy getMethodProxy() {
        return this.methodProxy;
    }
}
