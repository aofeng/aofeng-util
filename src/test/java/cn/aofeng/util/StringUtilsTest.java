/**
 * 建立时间:2009-12-28
 */
package cn.aofeng.util;

import java.io.File;
import java.io.UnsupportedEncodingException;

import junit.framework.TestCase;

/**
 * 
 *
 * @author 聂勇 <a href="mailto:nieyong@asiainfo.com">nieyong@asiainfo.com</a>
 */
public class StringUtilsTest extends TestCase {

	/*
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/*
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link cn.aofeng.util.StringUtils#gbkToUnicode(java.lang.String)}.
	 */
	public void testGbkToUnicode() {
		System.out.println(StringUtils.gbkToUTF8("abc123"));
	}

	/**
	 * Test method for {@link cn.aofeng.util.StringUtils#unicodeToGbk(java.lang.String)}.
	 * @throws UnsupportedEncodingException 
	 */
	public void testUnicodeToGbk() throws UnsupportedEncodingException {
	    System.out.println(StringUtils.unicodeToGbk("br>\r\n</pre>\r\n</div><pre><span style=\"font-family: Arial,Verdana,Helvetica,Sans-Serif;\"><span style=\"font-family: monospace;\">\u770B\u6765\uFF0C\u6570\u636E\u5E93\u662F\u6CA1\u6709\u95EE\u9898\u7684\uFF0C\u90A3\u95EE\u9898\u5E94\u8BE5\u51FA\u5728\u4E86\u76D1\u542C\u5668\u4E0A\u3002<br><br>3\u3001\u6253\u5F00Oracle\u7684 </span></span>listener.ora \u6587\u4EF6\uFF1A</pre><div"));
		StringUtils.unicodeToGbk(new File("E:/blog.html"), "UTF-8", new File("E:/blog-gbk.html"), "UTF-8");
	}

	/**
	 * Test method for {@link cn.aofeng.util.StringUtils#gbkToUTF8(java.lang.String)}.
	 */
	public void testGbkToUTF8() {
		System.out.println(StringUtils.gbkToUTF8("abc123"));
	}

	public void testGbkToUTF16LE() {
		System.out.println(StringUtils.gbkToUTF16LE("韩雪123456abc"));
	}
	
	public void testAssemblePath() {
		String fullPath = "mainPath/subPath";
		assertEquals(fullPath, StringUtils.assemblePath("mainPath/", "subPath"));
		assertEquals(fullPath, StringUtils.assemblePath("mainPath/", "/subPath"));
		assertEquals(fullPath, StringUtils.assemblePath("mainPath", "subPath"));
		assertEquals(fullPath, StringUtils.assemblePath("mainPath", "/subPath"));
	}
}
