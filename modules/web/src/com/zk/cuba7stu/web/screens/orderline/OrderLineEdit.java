package com.zk.cuba7stu.web.screens.orderline;

import com.haulmont.cuba.gui.screen.*;
import com.zk.cuba7stu.entity.OrderLine;

@UiController("cuba7stu_OrderLine.edit")
@UiDescriptor("order-line-edit.xml")
@EditedEntityContainer("orderLineDc")
@LoadDataBeforeShow
public class OrderLineEdit extends StandardEditor<OrderLine> {

}