package us.codecraft.tinyioc.aop;

import org.aopalliance.intercept.MethodInterceptor;

/**
 * 代理相关的元数据
 * 包装目标对象和拦截器方法，供aop使用
 *
 * @author yihua.huang@dianping.com
 */
public class AdvisedSupport {

    private TargetSource targetSource;

    /**
     * AOP内部类，对应Advice
     */
    private MethodInterceptor methodInterceptor;

    public TargetSource getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(TargetSource targetSource) {
        this.targetSource = targetSource;
    }

    public MethodInterceptor getMethodInterceptor() {
        return methodInterceptor;
    }

    public void setMethodInterceptor(MethodInterceptor methodInterceptor) {
        this.methodInterceptor = methodInterceptor;
    }
}
