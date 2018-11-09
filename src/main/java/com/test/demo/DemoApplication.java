package com.test.demo;

import org.apache.commons.lang3.StringUtils;
import org.mockito.internal.util.StringUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	/**
	 * /**
     * 检查字符串是否为空 ("") 或 null
     * StringUtils.isEmpty(null)      = true
     * StringUtils.isEmpty("")        = true
     * StringUtils.isEmpty(" ")       = false
     * StringUtils.isEmpty("bob")     = false
     * StringUtils.isEmpty("  bob  ") = false
	 */
	public static void isEmpty() {
		String str = " ";
		boolean empty = StringUtils.isEmpty(str);
		System.out.println(empty);//false
	}
	/**
	 * /**
     *  检查字符串是否不为空
     * StringUtils.isNotEmpty(null)      = false
     * StringUtils.isNotEmpty("")        = false
     * StringUtils.isNotEmpty(" ")       = true
     * StringUtils.isNotEmpty("bob")     = true
     * StringUtils.isNotEmpty("  bob  ") = true
	 */
	public static void isNotEmpty() {
		String str = " ";
		boolean empty = StringUtils.isNotEmpty(str);
		System.out.println(empty);//true
	}
	/**
	 * 检验字符串是否是null，空或空格
     * StringUtils.isBlank(null)      = true
     * StringUtils.isBlank("")        = true
     * StringUtils.isBlank(" ")       = true
     * StringUtils.isBlank("bob")     = false
     * StringUtils.isBlank("  bob  ") = false
	 */
	public static void isBlank() {
		String str = " ";
		boolean empty = StringUtils.isBlank(str);
		System.out.println(empty);//true
		
	}
	/**
	 * * 检验字符串是否是非null，非空且非空格
     * StringUtils.isNotBlank(null)      = false
     * StringUtils.isNotBlank("")        = false
     * StringUtils.isNotBlank(" ")       = false
     * StringUtils.isNotBlank("bob")     = true
     * StringUtils.isNotBlank("  bob  ") = true
	 */
	public static void isNotBlank() {
		String str = "";
		boolean empty = StringUtils.isNotBlank(str);
		System.out.println(empty);//false
	}
	/**
	 * 从该字符串的两端删除控制字符，返回值为null则处理为null，返回值为（""）则处理为（""）
     * StringUtils.trim(null)          = null
     * StringUtils.trim("")            = ""
     * StringUtils.trim("     ")       = ""
     * StringUtils.trim("abc")         = "abc"
     * StringUtils.trim("    abc    ") = "abc"
	 */
	public static void trim() {
		String str = null;
		String empty = StringUtils.trim(str);
		System.out.println(empty);//null
	}
	/**
	 * 从该字符串的两端删除控制字符，返回值为null或（""）则处理为null
     * StringUtils.trimToNull(null)          = null
     * StringUtils.trimToNull("")            = null
     * StringUtils.trimToNull("     ")       = null
     * StringUtils.trimToNull("abc")         = "abc"
     * StringUtils.trimToNull("    abc    ") = "abc"
	 */
	public static void trimToNull() {
		String str = null;
		String empty = StringUtils.trimToNull(str);
		System.out.println(empty);//null
	}
	/**
	 * 从该字符串的两端删除控制字符，返回值为null则处理为("")，返回值为（""）则处理为（""）
     * StringUtils.trimToEmpty(null)          = ""
     * StringUtils.trimToEmpty("")            = ""
     * StringUtils.trimToEmpty("     ")       = ""
     * StringUtils.trimToEmpty("abc")         = "abc"
     * StringUtils.trimToEmpty("    abc    ") = "abc"
	 */
	public static void trimToEmpty() {
		String str = null;
		String empty = StringUtils.trimToEmpty(str);
		System.out.println(empty);//""
	}
	/**
	 * 从字符串的开头和结尾删除空格,返回值为null则处理为null，返回值为（""）则处理为（""）
     * StringUtils.strip(null)     = null
     * StringUtils.strip("")       = ""
     * StringUtils.strip("   ")    = ""
     * StringUtils.strip("abc")    = "abc"
     * StringUtils.strip("  abc")  = "abc"
     * StringUtils.strip("abc  ")  = "abc"
     * StringUtils.strip(" abc ")  = "abc"
     * StringUtils.strip(" ab c ") = "ab c"
	 */
	public static void strip() {
		String str = null;
		String empty = StringUtils.strip(str);
		System.out.println(empty); //null
		
		/**
		 * 从一个字符串的开始和结束中删除任何一组字符。这与{@link String＃trim（）}类似，但允许控制字符的去除。
	     * StringUtils.strip(null, *)          = null
	     * StringUtils.strip("", *)            = ""
	     * StringUtils.strip("abc", null)      = "abc"
	     * StringUtils.strip("  abc", null)    = "abc"
	     * StringUtils.strip("abc  ", null)    = "abc"
	     * StringUtils.strip(" abc ", null)    = "abc"
	     * StringUtils.strip("  abcyx", "xyz") = "  abc"
		 */
		String strip = StringUtils.strip("  abcyx", "xz");
		System.out.println(strip+"========");// abcy前边有空格
	}
	/**
	 * 从一个字符串的开始和结束中删除任何一组字符，去除前端的控制符。
     * StringUtils.stripStart(null, *)          = null
     * StringUtils.stripStart("", *)            = ""
     * StringUtils.stripStart("abc", "")        = "abc"
     * StringUtils.stripStart("abc", null)      = "abc"
     * StringUtils.stripStart("  abc", null)    = "abc"
     * StringUtils.stripStart("abc  ", null)    = "abc  "
     * StringUtils.stripStart(" abc ", null)    = "abc "
     * StringUtils.stripStart("yxabc  ", "xyz") = "abc  "
	 */
	public static void stripStart() {
		String stripStart = StringUtils.stripStart("yxabc  ", "y");
		System.out.println("-------stripStart------"+stripStart);//xabc
	}
	/**
	 * 从一个字符串的开始和结束中删除任何一组字符，去除后端的控制符。
     * StringUtils.stripEnd(null, *)          = null
     * StringUtils.stripEnd("", *)            = ""
     * StringUtils.stripEnd("abc", "")        = "abc"
     * StringUtils.stripEnd("abc", null)      = "abc"
     * StringUtils.stripEnd("  abc", null)    = "  abc"
     * StringUtils.stripEnd("abc  ", null)    = "abc"
     * StringUtils.stripEnd(" abc ", null)    = " abc"
     * StringUtils.stripEnd("  abcyx", "xyz") = "  abc"
     * StringUtils.stripEnd("120.00", ".0")   = "12"
	 */
	public static void stripEnd() {
		String stripEnd = StringUtils.stripEnd("  abcyx", "xyz");
		System.out.println("-------stripEnd------"+stripEnd); // (有空格)acb
	}
	/**
	 * 将数组中的每个字符串两端的空格删除。
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     * StringUtils.stripAll(null)             = null
     * StringUtils.stripAll([])               = []
     * StringUtils.stripAll(["abc", "  abc"]) = ["abc", "abc"]
     * StringUtils.stripAll(["abc  ", null])  = ["abc", null]
	 */
	public static void stripAll() {
		String[] str = {"abc", "  abc"};
		String[] stripAll = StringUtils.stripAll(str);
		for (String string : stripAll) {
			System.out.println("-------stripAll------"+string);//abc abc没有空格
		}
		
		String[] strip = StringUtils.stripAll(str,"a");
		for (String string : strip) {
			System.out.println("-------stripAll-删除-----"+string);//cb abc
		}
	}
	/**
	 * 从字符串的开头和结尾删除空格,返回值为null则处理为null，返回值为（""）则处理为null
     * StringUtils.stripToNull(null)     = null
     * StringUtils.stripToNull("")       = null
     * StringUtils.stripToNull("   ")    = null
     * StringUtils.stripToNull("abc")    = "abc"
     * StringUtils.stripToNull("  abc")  = "abc"
     * StringUtils.stripToNull("abc  ")  = "abc"
     * StringUtils.stripToNull(" abc ")  = "abc"
     * StringUtils.stripToNull(" ab c ") = "ab c"
	 */
	public static void stripToNull() {
		String str = null;
		String empty = StringUtils.stripToNull(str);
		System.out.println(empty); //null
	}
	/**
	 * 从字符串的开头和结尾删除空格,返回值为null则处理为("")，返回值为（""）则处理为（""）
     * StringUtils.stripToEmpty(null)     = ""
     * StringUtils.stripToEmpty("")       = ""
     * StringUtils.stripToEmpty("   ")    = ""
     * StringUtils.stripToEmpty("abc")    = "abc"
     * StringUtils.stripToEmpty("  abc")  = "abc"
     * StringUtils.stripToEmpty("abc  ")  = "abc"
     * StringUtils.stripToEmpty(" abc ")  = "abc"
     * StringUtils.stripToEmpty(" ab c ") = "ab c"
	 */
	public static void stripToEmpty() {
		String str = null;
		String empty = StringUtils.stripToEmpty(str);
		System.out.println(empty+"--------");//""
	}
	/**
	 * 部分截取字符串
	 * 在str中取得header和tail之间的字符串。不存在则返回空.
	 * 多个header和tail  header 表示开始字符串 tail 开始字符串
	 */
	public static void substringBetween() {
		String str = "aaahaaaheaderbbbbbbtailhcccccc";
		String substringBetween = StringUtils.substringBetween(str,"a","c");
		System.out.println("--------substringBetween---------"+substringBetween);//aahaaaheaderbbbbbbtailh
		//取得指定字符串后的字符串 多个重复，从第一个出现开始
		System.out.println(StringUtils.substringAfter(str,"h"));//aaaheaderbbbbbbtailhcccccc
		//取得指定字符串之前的字符串 多个重复，从第一个出现开始
		System.out.println(StringUtils.substringBefore(str,"h"));//aaa
		//取得最后一个指定字符串之前的字符串
		System.out.println(StringUtils.substringBeforeLast( str,"h"));//aaahaaaheaderbbbbbbtail
		//取得最后一个指定字符串之后的字符串
		System.out.println(StringUtils.substringAfterLast(str,"h"));//cccccc
	}
	/**
	 * 取得字符串的缩写
	 * 在给定的width内取得str的缩写,当testString的长度小于width则返回原字符串. 
	 */
	public static void abbreviate() {
		String test = "This is a test of the abbreviation.";
	    String test2 = "Test";
	    System.out.println( StringUtils.abbreviate( test, 15 ) );  //返回This is a te...
	    System.out.println( StringUtils.abbreviate( test, 5,15 ) ); //返回...is a test...
	    System.out.println( StringUtils.abbreviate( test2, 10 ) );  //返回Test
	}
	/**
	 * 去除尾部换行符 
	 * 去除str尾部的换行符\n
	 */
	public static void chomp() {
		String test = "This\n";
		System.out.println(StringUtils.chomp(test));//返回Tihs
		System.out.println("dsfaf");
	}
	/**
	 * 重复字符串 
	 * 得到将str重复count次后的字符串
	 */
	public static void repeat() {
		System.out.println( StringUtils.repeat( "*", 10)); //**********
		System.out.println( StringUtils.repeat( "China ", 5));//China China China China China 
		/**
		 * StringUtils.center( str, count,repeatString ); 
		 * 把str插入将repeatString重复多次后的字符串中间,得到字符串的总长为count
		 */
		System.out.println( StringUtils.center( "China", 11,"*"));
		//默认以空格填充 
		System.out.println( StringUtils.center( "China", 11)); //   China  
		//左侧空格填充
		System.out.println(StringUtils.leftPad("China", 11));  //      China
		//左侧字符串填充
		System.out.println(StringUtils.leftPad("China", 11,"-"));  //------China
		//右侧空格填充
		System.out.println(StringUtils.rightPad("China", 11));  //China      
		//右侧字符串填充
		System.out.println(StringUtils.rightPad("China", 11,"-"));  //China------
	}
	/**
	 * 颠倒字符串 
	 */
	public static void reverse() {
		System.out.println( StringUtils.reverse("ABCDE"));//EDCBA
	}
	/**
	 * 判断字符串内容的类型
	 */
	public static void strContentType() {
		
		//如果str全由数字组成返回True.
		System.out.println(StringUtils.isNumeric("1213a314"));//false

		//如果str全由字母组成返回True.
		System.out.println(StringUtils.isAlpha("zxscsdfsd")); //true
		
		//TODO
		//如果str全由数字或字符组成返回True.
		System.out.println(StringUtils.isAlphanumeric("222ww")); //true
		
		//如果str全由字母或空格组成返回True.
		System.out.println(StringUtils.isAlphaSpace("")); //true
		
		//只由字母数字和空格组成
		System.out.println(StringUtils.isAlphanumericSpace("")); //true
		
		//只由数字和空格组成
		System.out.println(StringUtils.isNumericSpace("3445345")); //true
		
	}
	/**
	 * 取得某字符串在另一字符串中出现的次数
	 */
	public static void countMatches() {
		System.out.println(StringUtils.countMatches( "Chinese People", "e"));//4
	}
	/**
	 * 首字母大小写
	 */
	public static void capitalize() {
		//首字母大写
		System.out.println(StringUtils.capitalize("avvbbbbbcd"));//Avvbbbbbcd
		//首字母小写
		System.out.println(StringUtils.uncapitalize("ANDRTEFDS"));//aNDRTEFDS
		//是否全是大写
		System.out.println(StringUtils.isAllUpperCase("sSFAF"));//false
		//是否全是小写
		System.out.println(StringUtils.isAllLowerCase("sSFAF"));//false
		//大小写转换，空格不动
		System.out.println(StringUtils.swapCase("I am a-A*a"));
		
		String[] s={"a","b","c"};
		System.out.println(StringUtil.convString(s));

		//String[] s={"a","b","c"} ;
		//StringUtil.convString（s,"@")="a@b@c";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		isEmpty();
		isNotEmpty();
		isBlank();
		isNotBlank();
		trim();
		trimToNull();
		trimToEmpty();
		strip();
		stripStart();
		stripEnd();
		stripAll();
		stripToNull();
		stripToEmpty();
		substringBetween();
		abbreviate();
		chomp();
		repeat();
		reverse();
		strContentType();
		countMatches();
		capitalize();
	}
}
