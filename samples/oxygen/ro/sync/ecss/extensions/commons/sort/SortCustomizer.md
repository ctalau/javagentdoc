# Interface: `SortCustomizer`

**Package:** [`ro.sync.ecss.extensions.commons.sort`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.sort.SortCustomizer`

## Description

## Methods

### `getSortInformation(java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation> criteriaInformation, boolean hasSelectedSortableElements, boolean cannotSortAllElements)`

**Parameters:**
- `criteriaInformation` (`java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`): The information about the available sorting criteria.
- `hasSelectedSortableElements` (`boolean`): `true` when elements selected in the document can be sorted.
- `cannotSortAllElements` (`boolean`): `true` when all the elements from the parent of the sort operation cannot be sorted.
   for example when the selected rows from a table can be sorted but the whole table cannot because it contains, outside the selected rows,
   some rows with multiple rowspan cells.

**Returns:** [`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md)

