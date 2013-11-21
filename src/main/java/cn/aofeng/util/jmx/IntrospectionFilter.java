/**
 * 建立时间：2008-9-10
 */
package cn.aofeng.util.jmx;

/**
 * 内省过滤器.
 * 
 * @author 聂勇 <a href="mailto:nieyongemail@126.com">nieyongemail@126.com</a>
 */
public interface IntrospectionFilter {

    /**
     * 检测当前名称是否需要过滤.
     * 
     * @param name 属性名或方法名
     * @return 如果属于需要过滤的名称或者传入的name为null,返回true,否则返回false.
     */
    boolean filter(String name);
}
