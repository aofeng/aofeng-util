/**
 * 建立时间：2008-9-10
 */
package cn.aofeng.util.jmx;

/**
 * 内省方法过滤器.
 * 
 * @author 聂勇 <a href="mailto:nieyongemail@126.com">nieyongemail@126.com</a>
 */
public class MethodFilter extends AbstractFilter {

    public MethodFilter() {
        filterNames.add("registerSelf");
        filterNames.add("unRegisterSelf");
    }

}
