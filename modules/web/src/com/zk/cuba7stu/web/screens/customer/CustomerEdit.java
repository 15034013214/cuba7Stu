package com.zk.cuba7stu.web.screens.customer;

import com.haulmont.cuba.gui.model.CollectionLoader;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.model.InstanceLoader;
import com.haulmont.cuba.gui.screen.*;
import com.zk.cuba7stu.entity.Customer;
import com.zk.cuba7stu.entity.Order;

import javax.inject.Inject;

@UiController("cuba7stu_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
public class CustomerEdit extends StandardEditor<Customer> {
    @Inject
    private InstanceContainer<Customer> customerDc;
    @Inject
    private InstanceLoader<Customer> customerDl;
    @Inject
    private CollectionLoader<Order> ordersDl;

    @Subscribe
    private void onBeforeShow(BeforeShowEvent event) {
        customerDl.load();
        ordersDl.setParameter("customer" , customerDc.getItem());
        ordersDl.load();
    }

}