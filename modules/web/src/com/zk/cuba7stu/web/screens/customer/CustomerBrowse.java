package com.zk.cuba7stu.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.zk.cuba7stu.entity.Customer;

@UiController("cuba7stu_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}