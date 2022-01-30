package com.edu.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * User
 *
 * GenerationType.IDENTITY：使用在mysql数据库
 * GenerationType.SEQUENCE:使用oracle
 *
 * 如果属性跟数据库里面的表里面的字段如果完全一致，就不需要写列
 */
@Entity
@Table(name = "tb_user")
public class User implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) // 主要用在mysql
   private Integer id	;
   private String username	;
   private String password	;
   private String name	;
   private Integer age	;
   private Integer sex	;
   private Date birthday	;
   private Date created	;
   private Date updated	;
   private String note	;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", created=" + created +
                ", updated=" + updated +
                ", note='" + note + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}