# Class: `ECSortCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.commons.sort`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.sort.ECSortCustomizerDialog`

**Implements:** [`ro.sync.ecss.extensions.commons.sort.SortCustomizer`](./SortCustomizer.md), [`ro.sync.ecss.extensions.commons.sort.KeysController`](./KeysController.md)

## Fields

### `sortSelectedElementsRadio`

**Type:** `org.eclipse.swt.widgets.Button`

### `criteriaInformation`

**Type:** `java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

### `hasSelectedSortableElements`

**Type:** `boolean`

### `cannotSortAllElements`

**Type:** `boolean`

### `firstCriterionComposite`

**Type:** [`ro.sync.ecss.extensions.commons.sort.CriterionComposite`](./CriterionComposite.md)

### `secondCriterionComposite`

**Type:** [`ro.sync.ecss.extensions.commons.sort.CriterionComposite`](./CriterionComposite.md)

### `thirdCriterionComposite`

**Type:** [`ro.sync.ecss.extensions.commons.sort.CriterionComposite`](./CriterionComposite.md)

### `info`

**Type:** `java.util.ArrayList<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`

### `onlySelectedEntries`

**Type:** `boolean`

### `authorResourceBundle`

**Type:** [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md)

### `selectedElemensString`

**Type:** `java.lang.String`

### `allElementsString`

**Type:** `java.lang.String`

### `helpPageID`

**Type:** `java.lang.String`

## Constructors

### `<init>(org.eclipse.swt.widgets.Shell arg0, ro.sync.ecss.extensions.api.AuthorResourceBundle arg1, java.lang.String arg2, java.lang.String arg3)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Shell`)
- `arg1` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md))
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

### `<init>(org.eclipse.swt.widgets.Shell arg0, ro.sync.ecss.extensions.api.AuthorResourceBundle arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Shell`)
- `arg1` ([`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../api/AuthorResourceBundle.md))
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)

## Methods

### `createDialogArea(org.eclipse.swt.widgets.Composite arg0)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Composite`)

**Returns:** `org.eclipse.swt.widgets.Control`

### `configureShell(org.eclipse.swt.widgets.Shell arg0)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Shell`)

**Returns:** `void`

### `getSortInformation(java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation> arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.ecss.extensions.commons.sort.CriterionInformation>`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** [`ro.sync.ecss.extensions.commons.sort.SortCriteriaInformation`](./SortCriteriaInformation.md)

### `okPressed()`

**Returns:** `void`

### `createSection(org.eclipse.swt.widgets.Composite arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`org.eclipse.swt.widgets.Composite`)
- `arg1` (`java.lang.String`)

**Returns:** `org.eclipse.swt.widgets.Composite`

### `isResizable()`

**Returns:** `boolean`

### `selectionChanged(java.lang.String arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

