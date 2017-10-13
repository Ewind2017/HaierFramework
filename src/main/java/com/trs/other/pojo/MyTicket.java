package com.trs.other.pojo;

/**
 * Title:
 * Description:
 * Copyright: 2017 北京拓尔思信息技术股份有限公司 版权所有.保留所有权
 * Company:北京拓尔思信息技术股份有限公司(TRS)
 * Project: HaierFramework
 * Author: E_wind
 * Create Time:2017/10/12 10:20
 */
public class MyTicket extends Ticket {
    private Integer id;
    private Integer num;
    private Double price;
    private String description;

    /*构造方法里面禁止加入任何业务逻辑，如果有初始化逻辑，请放在 init 方法中。*/
    public MyTicket(){}

    public MyTicket(Integer id, Integer num, Double price, String description) {
        this.id = id;
        this.num = num;
        this.price = price;
        this.description = description;
    }

    public void init(){
        this.id = 1;
        this.num = 123;
        this.price = 222d;
        this.description = "我的票";
    }

    /*所有的覆写方法，必须加@Override 注解*/
    /*setter 方法中，参数名称与类成员变量名称一致，this.成员名 = 参数名。
     在 getter/setter 方法中，不要增加业务逻辑，增加排查问题的难度。*/
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getNum() {
        return num;
    }

    @Override
    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
