package syz;

import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
@TableName("user")//指定映射的表名
public class User implements Serializable {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String password;

    @Override
    public String toString() {
        return "syz.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}