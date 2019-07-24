package com.zk.cuba7stu.web.screens.production;

import com.haulmont.cuba.gui.screen.*;
import com.zk.cuba7stu.entity.Production;

@UiController("cuba7stu_Production.browse")
@UiDescriptor("production-browse.xml")
@LookupComponent("productionsTable")
@LoadDataBeforeShow
public class ProductionBrowse extends StandardLookup<Production> {
}