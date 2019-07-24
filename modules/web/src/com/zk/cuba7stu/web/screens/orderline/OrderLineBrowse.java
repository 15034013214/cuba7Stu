package com.zk.cuba7stu.web.screens.orderline;

import com.haulmont.cuba.gui.screen.*;
import com.zk.cuba7stu.entity.OrderLine;

@UiController("cuba7stu_OrderLine.browse")
@UiDescriptor("order-line-browse.xml")
@LookupComponent("orderLinesTable")
@LoadDataBeforeShow
public class OrderLineBrowse extends StandardLookup<OrderLine> {
}