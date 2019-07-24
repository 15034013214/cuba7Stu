package com.zk.cuba7stu.web.screens.order;

import com.haulmont.cuba.gui.model.CollectionChangeType;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.CollectionPropertyContainer;
import com.haulmont.cuba.gui.screen.*;
import com.zk.cuba7stu.entity.Order;
import com.zk.cuba7stu.entity.OrderLine;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("cuba7stu_Order.edit")
@UiDescriptor("order-edit.xml")
@EditedEntityContainer("orderDc")
@LoadDataBeforeShow
public class OrderEdit extends StandardEditor<Order> {
    @Inject
    private CollectionPropertyContainer<OrderLine> orderOrderLinesDc;

    @Subscribe(id = "orderOrderLinesDc", target = Target.DATA_CONTAINER)
    private void onOrderOrderLinesDcCollectionChange(CollectionContainer.CollectionChangeEvent<OrderLine> event) {
        if(event.getChangeType() != CollectionChangeType.REFRESH){
            changOrderAmount();
        }
    }

    private void changOrderAmount(){
        BigDecimal amount = BigDecimal.ZERO;
        for (OrderLine orderLine : orderOrderLinesDc.getItems()) {
            amount = amount.add(orderLine.getProduction().getPrice().multiply(new BigDecimal(orderLine.getQuantity())));
        }
        getEditedEntity().setQuantity(amount.intValue());
        
    }


}