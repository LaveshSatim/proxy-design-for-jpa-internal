package com.lavesh;

import java.lang.reflect.Array;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.UUID;

import com.lavesh.handler.ProxyHandler;

public class App {
	public static void main(String[] args) {
		com.lavesh.Proxy newProxyInstance = (com.lavesh.Proxy) Proxy.newProxyInstance(
				com.lavesh.Proxy.class.getClassLoader(), new Class[] { com.lavesh.Proxy.class },
				new ProxyHandler(new com.lavesh.Proxy() {

					@Override
					public String open(String str) {
						return str + " open " + UUID.randomUUID().toString();
					}

					@Override
					public String close(String str) {
						return str + " close " + UUID.randomUUID().toString();
					}
				}));

		System.out.println(newProxyInstance.open("d"));

	}
}
