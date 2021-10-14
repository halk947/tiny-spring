package us.codecraft.tinyioc.aop;

import org.aopalliance.intercept.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于jdk的动态代理
 *
 * @author yihua.huang@dianping.com
 */
public class JdkDynamicAopProxy implements AopProxy, InvocationHandler {

    private AdvisedSupport advised;

    public JdkDynamicAopProxy(AdvisedSupport advised) {
        this.advised = advised;
    }

    /**
     * 获取代理之后的对象
     *
     * @return
     */
    @Override
    public Object getProxy() {
        //使用Java内置的Proxy类，创建对象
        return Proxy.newProxyInstance(getClass().getClassLoader(),
                new Class[]{advised.getTargetSource().getTargetClass()},
                this);
    }

    @Override
    public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
        MethodInterceptor methodInterceptor = advised.getMethodInterceptor();
        return methodInterceptor.invoke(new ReflectiveMethodInvocation(advised.getTargetSource().getTarget(), method,
                args));
    }

}
