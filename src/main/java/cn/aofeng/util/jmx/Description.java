/**
 * 建立时间：2008-9-8
 */
package cn.aofeng.util.jmx;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * mbean类或mbean方法的描述.
 * 
 * @author 聂勇 <a href="mailto:nieyongemail@126.com">nieyongemail@126.com</a>
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Description {

    public String value();
}
