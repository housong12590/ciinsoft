package com.ciin.soft;

import java.util.*;

public class Index {
    public static void main(String[] args) {
//        List<Test> _list = new ArrayList<>();
//        _list.add(new Test("hous", 18));
//        _list.add(new Test("czlyj", 20));
//        Map<Integer, Test> map = BeanUtils.convertToMap(_list, Test::getAge);
//        System.out.println(map);

        Map<String, Object> map = new HashMap<>();
        map.put("name", "hous");
        map.put("age", 10);
        T_Map<String, Object> t_map = new T_Map<>(map);
        Integer age = t_map.getInteger("age");
        System.out.println(age);
        Map<Integer, Object> _map = new TreeMap<>();
        _map.put(1, true);
        T_Map<Integer, Object> tMap = new T_Map<>(_map);
        Boolean bool = tMap.getBool(1);
        System.out.println(bool);
    }

    public static class Test {
        private String name;
        private Integer age;

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
    }
}
