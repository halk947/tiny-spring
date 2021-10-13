package us.codecraft.tinyioc;

/**
 * 从配置中读取BeanDefinitionReader
 *
 * @author yihua.huang@dianping.com
 */
public interface BeanDefinitionReader {

    /**
     * 从指定位置，加载bean的定义信息
     *
     * @param location
     * @throws Exception
     */
    void loadBeanDefinitions(String location) throws Exception;
}
