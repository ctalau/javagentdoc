# Class: `AuthorTableColumnWidthProviderBase`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorTableColumnWidthProviderBase`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorTableColumnWidthProvider`](./AuthorTableColumnWidthProvider.md)

## Description

It should be implemented when the author extension being developed offers
 support for editing data in tabular form.

## Fields

### `errorsListener`

**Type:** [`ro.sync.ecss.extensions.commons.table.support.errorscanner.TableLayoutErrorsListener`](../commons/table/support/errorscanner/TableLayoutErrorsListener.md)

## Constructors

### `<init>()`

### `<init>(ro.sync.ecss.extensions.commons.table.support.errorscanner.TableLayoutErrorsListener errorsListener)`

**Parameters:**
- `errorsListener` ([`ro.sync.ecss.extensions.commons.table.support.errorscanner.TableLayoutErrorsListener`](../commons/table/support/errorscanner/TableLayoutErrorsListener.md)): Table layout errors listener

## Methods

### `setErrorsListener(ro.sync.ecss.extensions.commons.table.support.errorscanner.TableLayoutErrorsListener errorsListener)`

**Parameters:**
- `errorsListener` ([`ro.sync.ecss.extensions.commons.table.support.errorscanner.TableLayoutErrorsListener`](../commons/table/support/errorscanner/TableLayoutErrorsListener.md)): The table layout errors listener.

**Returns:** `void`

### `getAllColspecWidthRepresentations()`

If a colspec does not specify a width, it is supposed to be 1*.
 If the table group specifies more columns than colspecs, those widths are supposed to be 1*.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.WidthRepresentation>`

### `getErrorsListener()`

**Returns:** [`ro.sync.ecss.extensions.commons.table.support.errorscanner.TableLayoutErrorsListener`](../commons/table/support/errorscanner/TableLayoutErrorsListener.md)

### `isPreferPercentageColumnWidths(java.lang.String tableCellsTagName)`

**Parameters:**
- `tableCellsTagName` (`java.lang.String`): The cell tag name

**Returns:** `boolean`

