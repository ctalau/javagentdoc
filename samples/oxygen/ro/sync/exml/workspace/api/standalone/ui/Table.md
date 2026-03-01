# Class: `Table`

**Package:** [`ro.sync.exml.workspace.api.standalone.ui`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ui.Table`

**Extends:** [`ro.sync.ui.application.ApplicationTable`](../../../../../ui/application/ApplicationTable.md)

## Description

## Constructors

### `<init>()`

### `<init>(`javax.swing.table.TableModel` tableModel)`

### `<init>(`java.util.Vector` rowData, `java.util.Vector` columnNames)`

The column names are given by `columnNames`. The
 `Vectors` contained in `rowData`
 should contain the values for one row. In other words,
 the value of the cell at row 1, column 5 can be obtained
 with the following code:

 

```
((Vector)rowData.elementAt(1)).elementAt(5);
```

