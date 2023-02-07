package com.lavesh.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.lavesh.Proxy;

public class ProxyHandler implements InvocationHandler {

	private Object proxy2;

	public ProxyHandler(Object proxy2) {
		this.proxy2 = proxy2;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		System.out.println(method.getName().equals("open") ? "open beta" : "close beta");

		System.out.println("in handler");
		System.out.println(method.getName());
		return method.invoke(proxy2, args);
	}

}
