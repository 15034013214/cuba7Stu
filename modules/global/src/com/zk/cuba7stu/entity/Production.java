package com.zk.cuba7stu.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@NamePattern("%s|productionName")
@Table(name = "CUBA7STU_PRODUCTION")
@Entity(name = "cuba7stu_Production")
public class Production extends StandardEntity {
    private static final long serialVersionUID = 1322999064722405066L;

    @NotNull
    @Column(name = "PRODUCTION_NAME", nullable = false)
    protected String productionName;

    @NotNull
    @Column(name = "PRICE", nullable = false)
    protected BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }
}