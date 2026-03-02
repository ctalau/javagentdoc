# Class: `OKCancelDialog`

**Package:** [`ro.sync.exml.workspace.api.standalone.ui`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ui.OKCancelDialog`

**Extends:** `javax.swing.JDialog`

**Implements:** [`ro.sync.ui.application.HelpPageProvider`](../../../../../ui/application/HelpPageProvider.md)

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `RESULT_CANCEL`

**Type:** `int`

### `RESULT_OK`

**Type:** `int`

### `result`

**Type:** `int`

### `okButton`

**Type:** `javax.swing.JButton`

### `cancelButton`

**Type:** `javax.swing.JButton`

### `contentPanel`

**Type:** `javax.swing.JPanel`

### `buttonsSize`

**Type:** `java.awt.Dimension`

### `helpButton`

**Type:** `javax.swing.JButton`

### `messages`

**Type:** `ro.sync.i18n.c`

## Constructors

### `<init>(JFrame arg0, String arg1, boolean arg2)`

**Parameters:**
- `arg0` (`javax.swing.JFrame`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)

### `<init>(Frame arg0, String arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.awt.Frame`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)

## Methods

### `detectParentFrame(Window arg0)`

**Parameters:**
- `arg0` (`java.awt.Window`)

**Returns:** `java.awt.Window`

### `doOK()`

**Returns:** `void`

### `enterKeyPressed()`

**Returns:** `void`

### `doCancel()`

**Returns:** `void`

### `getResult()`

**Returns:** `int`

### `setOkButtonText(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setCancelButtonText(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getContentPane()`

**Returns:** `java.awt.Container`

### `setButtonText(JButton arg0, String arg1)`

**Parameters:**
- `arg0` (`javax.swing.JButton`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `getOkButton()`

**Returns:** `javax.swing.JButton`

### `getCancelButton()`

**Returns:** `javax.swing.JButton`

### `setVisible(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `setDialogLocation()`

**Returns:** `void`

### `getHiDPIAwareDimension(Dimension arg0)`

**Parameters:**
- `arg0` (`java.awt.Dimension`)

**Returns:** `java.awt.Dimension`

### `getHelpPageID()`

**Returns:** `java.lang.String`

