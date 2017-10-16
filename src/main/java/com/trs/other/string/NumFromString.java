package com.trs.other.string;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Title:截取拼接字符串中的数字
 * Description:
 * Copyright: 2017 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: HaierFramework
 * Author: E_wind
 * Create Time:2017/10/11 09:19
 */
public class NumFromString {

    private static Log log = LogFactory.getLog(NumFromString.class);

    //方法1
    public static void main(String[] args) {

        String string = "1o2j3n45b6vgg7s8ds9";
        string = string.trim();

        StringBuilder stringBuilder = new StringBuilder(string);
        StringBuilder stringBuilder2 = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (stringBuilder.charAt(i) >= 48 && stringBuilder.charAt(i) <= 57) {
                stringBuilder2.append(stringBuilder.charAt(i));
            }
        }

        String string2 = stringBuilder2.toString();

        log.info(string2);

    }

    /*注释掉的代码尽量要配合说明，而不是简单的注释掉。*/

    //方法2
    /*public static void main(String[] args) {

        String a = "1o2j3n45b6vgg7s8ds9";

        String regEx = "[^0-9]";
        Pattern p = Pattern.compile(regEx);

        Matcher m = p.matcher(a);

        System.out.println(m.replaceAll("").trim());
    }*/

    //方法3
    /*public static void main(String[] args) {
        String a="1o2j3n45b6vgg7s8ds9";
        List<String> digitList = new ArrayList<String>();
        Pattern p = Pattern.compile("[^0-9]");
        Matcher m = p.matcher(a);
        String result = m.replaceAll("");
        for (int i = 0; i < result.length(); i++) {
            digitList.add(result.substring(i, i+1));
        }
        System.out.println(digitList);*/

    //方法4
    /*public static void main(String[] args) {
        String a="1o2j3n45b6vgg7s8ds9";
        List<String> ss = new ArrayList<String>();
        for(String sss:a.replaceAll("[^0-9]", ",").split(",")){
            if (sss.length()>0)
                ss.add(sss);
        }
        System.out.print(ss);
    }*/

    //方法5
    /*public static void main(String[] args){
        String text="1o2j3n45b6vgg7s8ds9";
        List<Long> digitList =new ArrayList<Long>();
        Pattern p= Pattern.compile("(\\d+)");
        Matcher m= p.matcher(text);
        while (m.find()) {
            String find= m.group(1).toString();
            digitList.add(Long.valueOf(find));
        }
        System.out.println(digitList);
    }*/
}
