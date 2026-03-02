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

### `<init>(java.awt.Frame arg0, ro.sync.ecss.extensions.api.AuthorResourceBundle arg1, java.lang.String arg2, java.lang.String arg3)`

**Parameters:**
- `arg0` (`java.awt.Frame`)
- `arg1` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md))
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

## Methods

### `addSection(java.awt.GridBagConstraints arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.awt.GridBagConstraints`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `getSortInformation(java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation> arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** [`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md)

### `selectionChanged(java.lang.String arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

