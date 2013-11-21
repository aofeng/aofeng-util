/**
 * 建立时间：2008-9-11
 */
package cn.aofeng.util.jmx;

/**
 * 内省属性过滤器.
 * 
 * @author 聂勇 <a href="mailto:nieyongemail@126.com">nieyongemail@126.com</a>
 */
public class AttributeFilter extends AbstractFilter {

    public AttributeFilter() {
        filterNames.add("Name");
        filterNames.add("ObjectName");
        filterNames.add("Type");
    }
}
