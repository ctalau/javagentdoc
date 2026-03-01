# Interface: `ReportableDocumentPositionedInfo`

**Package:** [`ro.sync.document`](README.md)

**Fully Qualified Name:** `ro.sync.document.ReportableDocumentPositionedInfo`

## Description

If the selection contains at least one DocumentPositionedInfo that 
 implements this interface, the contextual menu will contain the "Report problem..." 
 action. The text returned by the #getReport() method will be set 
 ad the problem description in the report problem dialog.

## Methods

### `getReport()`

**Returns:** `java.lang.String`

