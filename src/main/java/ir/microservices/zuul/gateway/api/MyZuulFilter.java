package ir.microservices.zuul.gateway.api;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class MyZuulFilter extends ZuulFilter {

	@Override
	public Object run() throws ZuulException {
		System.out.println("Zuul filter before the operation such as check fee token");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
