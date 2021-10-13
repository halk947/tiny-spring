package us.codecraft.tinyioc;

/**
 * @author yihua.huang@dianping.com
 * >> 定义一个BeanReference，来表示这个属性是对另一个bean的引用
 */
public class BeanReference {

    private String name;

    private Object bean;

    public BeanReference(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }
}
