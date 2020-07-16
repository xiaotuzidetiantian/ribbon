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
    @TableName("hg_brand")
    public class Brand extends Model<Brand> {

    private static final long serialVersionUID = 1L;

            @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

            /**
            * 品牌名称
            */
    private String name;

            /**
            * 品牌首字母
            */
    private String firstChar;

            /**
            * 删除标识
            */
    private Boolean deletedFlag;

        public Integer getId() {
        return id;
        }

            public void setId(Integer id) {
        this.id = id;
        }
        public String getName() {
        return name;
        }

            public void setName(String name) {
        this.name = name;
        }
        public String getFirstChar() {
        return firstChar;
        }

            public void setFirstChar(String firstChar) {
        this.firstChar = firstChar;
        }
        public Boolean getDeletedFlag() {
        return deletedFlag;
        }

            public void setDeletedFlag(Boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
        }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
    return "Brand{" +
            "id=" + id +
            ", name=" + name +
            ", firstChar=" + firstChar +
            ", deletedFlag=" + deletedFlag +
    "}";
    }
}
