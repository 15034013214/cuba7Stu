package com.zk.cuba7stu.web.screens.production;

import com.haulmont.cuba.gui.screen.*;
import com.zk.cuba7stu.entity.Production;

@UiController("cuba7stu_Production.edit")
@UiDescriptor("production-edit.xml")
@EditedEntityContainer("productionDc")
@LoadDataBeforeShow
public class ProductionEdit extends StandardEditor<Production> {
}