package com.zk.cuba7stu.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.zk.cuba7stu.entity.Order;

@UiController("cuba7stu_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}