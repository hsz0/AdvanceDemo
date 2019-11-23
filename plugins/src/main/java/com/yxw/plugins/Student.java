package com.yxw.plugins;

import java.util.List;

public class Student {

    /**
     * name : 马云
     * age : 12
     * country : 中国
     * address : 北京市朝阳区某某小区
     * family : ["爸爸","妈妈","姐姐","奶奶","爷爷"]
     * grade : {"physical":90,"mathematics":100,"english":89}
     */

    private String name;
    private int age;
    private String country;
    private String address;
    private GradeBean grade;
    private List<String> family;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GradeBean getGrade() {
        return grade;
    }

    public void setGrade(GradeBean grade) {
        this.grade = grade;
    }

    public List<String> getFamily() {
        return family;
    }

    public void setFamily(List<String> family) {
        this.family = family;
    }

    public static class GradeBean {
        /**
         * physical : 90
         * mathematics : 100
         * english : 89
         */

        private int physical;
        private int mathematics;
        private int english;

        public int getPhysical() {
            return physical;
        }

        public void setPhysical(int physical) {
            this.physical = physical;
        }

        public int getMathematics() {
            return mathematics;
        }

        public void setMathematics(int mathematics) {
            this.mathematics = mathematics;
        }

        public int getEnglish() {
            return english;
        }

        public void setEnglish(int english) {
            this.english = english;
        }
    }
}
