package us.codecraft.tinyioc;

/**
 * @author yihua.huang@dianping.com
 * <p>
 * >>>
 * 使用BeanDefinition来封装了bean对象，这样可以保存一些额外的元信息
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
