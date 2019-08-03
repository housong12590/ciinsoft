package com.ciin.soft;

import com.ciin.soft.utils.JSONUtils;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Index {
    public static void main(String[] args) throws Exception {
//        List<Test> _list = new ArrayList<>();
//        _list.add(new Test("hous", 18));
//        _list.add(new Test("czlyj", 20));
//        Map<Integer, Test> map = BeanUtils.beanToMap(_list, Test::getAge);
//        System.out.println(map);


//        Object o = new Object();
//        Dict<String, Object> tMap = new Dict<>(o);
//        String bool = tMap.getString("name");
//        System.out.println(bool);
//        List<Test> _list = new ArrayList<>();
//        _list.add(new Test("hous", 18));
//        _list.add(new Test("czlyj", 24));
//        Map<String, Test> map = BeanUtils.listToMap(_list, Test::getName);
//        System.out.println(map);

        Test test = new Test("czlyj", 19);
        Sub sub = new Sub();
        sub.setAddress("江苏省南京市");
        sub.setIds(Arrays.asList("3", "5", "7"));
        test.setSub(sub);
        String s = JSONUtils.toJson(test);
        Dict dict = new Dict(s);
        String name = dict.getString("name");
        System.out.println(name);
//
        System.out.println(dict.toJson());
        BigDecimal age = dict.getBigDecimal("age");
        System.out.println(age.intValue());

//        Dict dict = new Dict(test);
//        String name = dict.getString("name");
//        System.out.println(name);
    }

    public static class Test {
        private String name;
        private Integer age;
        private Sub sub;

        public Test(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Sub getSub() {
            return sub;
        }

        public void setSub(Sub sub) {
            this.sub = sub;
        }
    }

    public static class Sub {
        private String address;

        private List<String> ids;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public List<String> getIds() {
            return ids;
        }

        public void setIds(List<String> ids) {
            this.ids = ids;
        }
    }
}
