package com.company.register.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "REGISTER_SOME_ENTITY")
@Entity(name = "register$SomeEntity")
public class SomeEntity extends StandardEntity {
    private static final long serialVersionUID = 9003709000043726502L;

    @Column(name = "NAME")
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}