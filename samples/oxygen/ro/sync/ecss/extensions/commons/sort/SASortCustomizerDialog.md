# Class: `SASortCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.commons.sort`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.sort.SASortCustomizerDialog`

**Extends:** [`ro.sync.ecss.extensions.commons.ui.OKCancelDialog`](../ui/OKCancelDialog.md)

**Implements:** [`ro.sync.ecss.extensions.commons.sort.SortCustomizer`](./SortCustomizer.md), [`ro.sync.ecss.extensions.commons.sort.KeysController`](./KeysController.md)

## Fields

### `firstCriterion`

**Type:** [`ro.sync.ecss.extensions.commons.sort.CriterionPanel`](./CriterionPanel.md)

### `secondCriterion`

**Type:** [`ro.sync.ecss.extensions.commons.sort.CriterionPanel`](./CriterionPanel.md)

### `thirdCriterion`

**Type:** [`ro.sync.ecss.extensions.commons.sort.CriterionPanel`](./CriterionPanel.md)

### `numberOfCriteria`

**Type:** `int`

### `authorResourceBundle`

**Type:** [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md)

### `criteriaInformation`

**Type:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

### `selElems`

**Type:** `java.lang.String`

### `allElems`

**Type:** `java.lang.String`

## Constructors

### `<init>(`java.awt.Frame` arg0, [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md) arg1, `java.lang.String` arg2, `java.lang.String` arg3)`

## Methods

### `addSection(`java.awt.GridBagConstraints` arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `getSortInformation(`java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>` arg0, `boolean` arg1, `boolean` arg2)`

**Returns:** [`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md)

### `selectionChanged(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `void`

