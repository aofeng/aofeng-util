/**
 * 建立时间：2008-9-11
 */
package cn.aofeng.util.jmx;

import java.util.ArrayList;
import java.util.List;

/**
 * 内省抽象过滤器.
 * 
 * @author 聂勇 <a href="mailto:nieyongemail@126.com">nieyongemail@126.com</a>
 */
public abstract class AbstractFilter implements IntrospectionFilter {

    protected List<String> filterNames = new ArrayList<String>();
    
    /*
     * @see com.asiainfo.scp4j.jmx.IntrospectionFilter#filter(java.lang.String)
     */
    public boolean filter(String name) {
        if (null == name) {
            return true;
        }
        
        for (String filterName : filterNames) {
            if (filterName.equals(name)) {
                return true;
            }
        }
        
        return false;
    }

}
