# Class: `SADITATableCustomizerDialog`

**Package:** [`ro.sync.ecss.extensions.dita.topic.table`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.dita.topic.table.SADITATableCustomizerDialog`

**Extends:** [`ro.sync.ecss.extensions.commons.table.operations.SATableCustomizerDialog`](../../../commons/table/operations/SATableCustomizerDialog.md)

## Description

It is used on standalone implementation.

## Fields

### `DITA_CONREF`

**Type:** `java.lang.String`

### `TABLE_FRAME_VALUES`

**Type:** `java.lang.String[]`

### `ALIGN_VALUES`

**Type:** `java.lang.String[]`

## Constructors

### `<init>(`java.awt.Frame` parentFrame, [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md) authorResourceBundle, `int` predefinedRowsCount, `int` predefinedColumnsCount, `boolean` insertChoiceTable)`

### `<init>(`java.awt.Frame` parentFrame, [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md) authorResourceBundle, `int` predefinedRowsCount, `int` predefinedColumnsCount, `boolean` insertChoiceTable, `int` defaultTableModel)`

### `<init>(`java.awt.Frame` parentFrame, [`ro.sync.ecss.extensions.api.AuthorResourceBundle`](../../../api/AuthorResourceBundle.md) authorResourceBundle, `int` predefinedRowsCount, `int` predefinedColumnsCount, `boolean` insertChoiceTable, `boolean` isPropertiesTableAccepted, `int` defaultTableModel)`

## Methods

### `getColumnWidthsSpecifications(`int` tableModelType)`

**Returns:** `ro.sync.ecss.extensions.commons.table.operations.TableCustomizerConstants.ColumnWidthsType[]`

### `getFrameValues(`int` tableModelType)`

**Returns:** `java.lang.String[]`

### `createTitleCheckbox()`

**Returns:** `javax.swing.JCheckBox`

### `getDefaultFrameValue(`int` tableModelType)`

**Returns:** `java.lang.String`

### `getRowsepValues(`int` tableModelType)`

**Returns:** `java.lang.String[]`

### `getDefaultRowsepValue(`int` tableModelType)`

**Returns:** `java.lang.String`

### `getColsepValues(`int` tableModelType)`

**Returns:** `java.lang.String[]`

### `getDefaultColsepValue(`int` tableModelType)`

**Returns:** `java.lang.String`

### `getAlignValues(`int` tableModelType)`

**Returns:** `java.lang.String[]`

### `getDefaultAlignValue(`int` tableModelType)`

**Returns:** `java.lang.String`

### `getHelpPageID()`

**Returns:** `java.lang.String`

