package com.dsh.designpattern.builder.android;

/**
 * @author DSH
 * @date 2020/7/2
 * @description
 */
public class AppInfo {
    private final String name;//必填字段
    private int versionCode;
    private String versionName;
    private String desption;
    private String author;
    private String company;

    private AppInfo(Builder builder) {
        //通过Builder进行赋值
        name = builder.name;
        versionCode = builder.versionCode;
        versionName = builder.versionName;
        desption = builder.desption;
        author = builder.author;
        company = builder.company;
    }

    public String getName() {
        return name;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public String getDesption() {
        return desption;
    }

    public String getAuthor() {
        return author;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "AppInfo{" +
                "name='" + name + '\'' +
                ", versionCode=" + versionCode +
                ", versionName='" + versionName + '\'' +
                ", desption='" + desption + '\'' +
                ", author='" + author + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static final class Builder {
        private final String name;
        private int versionCode;
        private String versionName;
        private String desption;
        private String author;
        private String company;

        public Builder(String val) {
            //必填字段通过构造函数进行赋值
            name = val;
        }

        public Builder versionCode(int val) {
            versionCode = val;
            return this;
        }

        public Builder versionName(String val) {
            versionName = val;
            return this;
        }

        public Builder desption(String val) {
            desption = val;
            return this;
        }

        public Builder author(String val) {
            author = val;
            return this;
        }

        public Builder company(String val) {
            company = val;
            return this;
        }

        public AppInfo build() {
            return new AppInfo(this);
        }
    }
}