package com.zk.cuba7stu.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "CUBA7STU_CUSTOMER")
@Entity(name = "cuba7stu_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -5591213150022203449L;

    @Length(message = "字符长度非法", min = 1, max = 6)
    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @Email(message = "邮件格式错误")
    @NotNull
    @Column(name = "EMAIL", nullable = false)
    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}