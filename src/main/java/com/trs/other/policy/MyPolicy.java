package com.trs.other.policy;

import com.trs.other.pojo.MyTicket;
import com.trs.other.pojo.Ticket;

/*方法内部多行注释 使用注释，注意与代码对齐。方法内部单行注释，在被注释语句上方另起一行，使用//注释。*/
/*类、类属性、类方法的注释必须使用 Javadoc 规范*/

/**
 * Title:
 * Description:
 * Copyright: 2017 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: HaierFramework
 * Author: E_wind
 * Create Time:2017/10/12 09:25
 */

/*类名使用 UpperCamelCase 风格，必须遵从驼峰形式，
 但以下情形例外：（领域模型 的相关命名）DO / BO / DTO / VO 等*/
public class MyPolicy {
    /*代码中的命名严禁使用拼音与英文混合或直接使用拼音的方式，更不允许直接使用中文的方式。
     地名、国际通用的汉语拼音、国际通用的名称等可视同英文。*/
    /*杜绝完全不规范的缩写，避免望文不知义。*/
    /*每行最多写一个语句，利于写注释，并且提高易读性。*/

    /*在spring的环境中，bean中不要声明类属性，单例模式下会产生数据污染。*/
    Ticket ticket;  //票

    /*中括号是数组类型的一部分*/
    public String[] customers;  //顾客

    /*POJO 类中布尔类型的变量，都不要加 is，否则部分框架解析会引起序列化错误*/
    public Boolean success;  //出售成功

    public Long count = 0L;  //出售计数

    /*常量命名全部大写，单词间用下划线隔开，力求语义表达完整清楚，不要嫌名字长。*/
    /*long 或者 Long 初始赋值时，必须使用大写的 L，不能是小写的 l，小写容易跟数字 1 混淆，造成误解*/
    /*不要使用一个常量类维护所有常量，应该按常量功能进行归类，分开维护。*/
    /*不需要重新赋值的变量，包括类属性、局部变量。*/
    public final Long MAX_COUNT = 1000000L;  //总票数

    public static Long count2 = 0L;

    /*对象参数前加 final，表示不允许修改引用的指向*/
    final MyTicket myTicket = new MyTicket(2, 234, 333d, "我的票");

    /*左括号和后一个字符之间不出现空格；同样，右括号和前一个字符之间也不出现空格。*/
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String[] getCustomers() {
        return customers;
    }

    public void setCustomers(String[] customers) {
        this.customers = customers;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    /*如果是大括号内为空，则简洁地写成{}即可，不需要换行；
     如果，是非空代码块则：
     左大括号前不换行。
     左大括号后换行。
     右大括号前换行。
     右大括号后还有 else 等代码则不换行；表示终止右大括号后必须换行。*/
    public void checkTicket() {
    }

    /*左括号和后一个字符之间不出现空格；同样，右括号和前一个字符之间也不出现空格。*/
    /*任何运算符左右必须加一个空格。*/
    public void bookTicket(String customer) {

        /*所有的相同类型的包装类对象之间值的比较，全部使用 equals 方法比较。*/
        /*在 if/else/for/while/do 语句中必须使用大括号，即使只有一行代码*/
        if ("".equals(customer)) {
            MyPolicy.count2 = count;
        } else {
            customers[0] = customer;

            count++;

            /*避免通过一个类的对象引用访问此类的静态变量或静态方法，无谓增加编译器解析成 本，直接用类名来访问即可*/
            MyPolicy.count2++;
        }
    }

    /*单行字符数限制不超过 120 个，超出需要换行，换行时遵循如下原则：

     第二行相对第一行缩进 4 个空格，从第三行开始，不再继续缩进，参考示例。
     运算符与下文一起换行。
     方法调用的点符号与下文一起换行。
     在多个参数超长，逗号后进行换行。
     在括号前不要换行，见反例。*/
    /*方法体内的执行语句组、变量的定义语句组、不同的业务逻辑之间或者不同的语义 之间插入一个空行。
     相同业务逻辑和语义之间不需要插入空行。 说明：没有必要插入多行空格进行隔开。*/
    /*类方法确定不允许被重写*/
    public final void stringDeal() {
        StringBuffer sb = new StringBuffer();

        sb.append("zi").append("xin")
                .append("huang")
                .append("huang")
                .append("huang");

        /*setter 方法中，参数名称与类成员变量名称一致，this.成员名 = 参数名。
         在 getter/setter 方法中，不要增加业务逻辑，增加排查问题的难度。*/
        for (int i = 0; i < 100; i++) {
            sb.append("hello");
        }

        /*在一个 switch 块内，每个 case 通过 break或return 来终止。
         每个switch必须包含默认的default执行语句，并且位于最后*/
        int fieldName = 1;
        String methodName;

        switch (fieldName) {
            case 1:
                methodName = "getPlateformBigType";
                break;
            case 2:
                methodName = "getPrice";
                break;
            case 3:
                methodName = "getPlateFormType";
                break;
            default:
                methodName = "getPlateFormType";
        }
    }

    /*特殊注释标记，请注明标记人与标记时间。
     注意及时处理这些标记，通过标记扫描， 经常清理此类标记。
     线上故障有时候就是来源于这些标记处的代码。*/
    // TODO 我将实现的事情 by E_wind on 2017-10-12 12:00
    public void myThing() {
        String sUserAge = "23";
        int nUserAge;

        /*捕获异常是为了处理它，不要捕获了却什么都不处理而抛弃。*/
        /*对于不能处理的异常，抛出给上层调用者。Controller层的异常不得再抛出，必须转换成可理解的信息返回给调用者。*/
        try {
            nUserAge = Integer.parseInt(sUserAge);
        } catch (Exception e) {
            nUserAge = 23;
        }
    }
}
