package xyz.welab.iframe.pojo;

/**
 * @Author: qing
 * @Date: 2018/6/3
 * @Time: 21:03
 * @Description: 学生等级 年龄 人数
 **/
public class MyZt {
    String  dengji;

    String  age;

    Integer shuLiang;

    public String getLevel() {
        return dengji;
    }

    public void setLevel(String dengji) {
        this.dengji = dengji;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getShuLiang() {
        return shuLiang;
    }

    public void setShuLiang(Integer shuLiang) {
        this.shuLiang = shuLiang;
    }
}
