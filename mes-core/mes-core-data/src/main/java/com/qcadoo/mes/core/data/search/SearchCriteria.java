package com.qcadoo.mes.core.data.search;

import java.util.Set;

/**
 * Object represents the criteria for listing entities. Together with definition -
 * {@link com.qcadoo.mes.core.data.definition.DataDefinition} - and grip - optionally
 * {@link com.qcadoo.mes.core.data.definition.GridDefinition} - it is used for building SQL query.
 * 
 * Order can be build only using orderable fields - {@link com.qcadoo.mes.core.data.types.FieldType#isOrderable()}.
 * 
 * @apiviz.owns com.qcadoo.mes.core.data.search.Restriction
 * @apiviz.has com.qcadoo.mes.core.data.search.Order
 */
public interface SearchCriteria {

    String getEntityName();

    String getGridName();

    int getMaxResults();

    int getFirstResult();

    Order getOrder();

    Set<Restriction> getRestrictions();

}
