package com.wxf.sc.entity;

    import com.baomidou.mybatisplus.activerecord.Model;
    import com.baomidou.mybatisplus.annotations.TableId;
    import com.baomidou.mybatisplus.annotations.TableName;
    import com.baomidou.mybatisplus.enums.IdType;

    import java.time.LocalDate;

    import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author zhuzhiguang
* @since 2020-07-16
*/
    @TableName("hg_user")
    public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

            @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private String username;

    private String password;

    private String name;

    private String email;

    private String telephone;

    private LocalDate birthday;

    private String sex;

    private Integer state;

    private String code;

        public Integer getUid() {
        return uid;
        }

            public void setUid(Integer uid) {
        this.uid = uid;
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
        public String getEmail() {
        return email;
        }

            public void setEmail(String email) {
        this.email = email;
        }
        public String getTelephone() {
        return telephone;
        }

            public void setTelephone(String telephone) {
        this.telephone = telephone;
        }
        public LocalDate getBirthday() {
        return birthday;
        }

            public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        }
        public String getSex() {
        return sex;
        }

            public void setSex(String sex) {
        this.sex = sex;
        }
        public Integer getState() {
        return state;
        }

            public void setState(Integer state) {
        this.state = state;
        }
        public String getCode() {
        return code;
        }

            public void setCode(String code) {
        this.code = code;
        }

    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

    @Override
    public String toString() {
    return "User{" +
            "uid=" + uid +
            ", username=" + username +
            ", password=" + password +
            ", name=" + name +
            ", email=" + email +
            ", telephone=" + telephone +
            ", birthday=" + birthday +
            ", sex=" + sex +
            ", state=" + state +
            ", code=" + code +
    "}";
    }
}
