# Class: `ApplicationDialog`

**Package:** [`ro.sync.ui.application`](README.md)

**Fully Qualified Name:** `ro.sync.ui.application.ApplicationDialog`

**Implements:** `javax.swing.WindowConstants`, `ro.sync.ui.application.ab`, [`ro.sync.ui.application.HelpPageProvider`](./HelpPageProvider.md), [`ro.sync.exml.workspace.api.standalone.ContextDescriptionProvider`](../../exml/workspace/api/standalone/ContextDescriptionProvider.md)

## Fields

### `br`

**Type:** `java.lang.String`

### `pr`

**Type:** `org.slf4j.Logger`

### `qr`

**Type:** `java.awt.Frame`

### `fr`

**Type:** `boolean`

### `ur`

**Type:** `boolean`

### `sr`

**Type:** `java.awt.Rectangle`

### `wq`

**Type:** `ro.sync.ui.application.ec`

### `messages`

**Type:** `ro.sync.i18n.c`

### `mr`

**Type:** `javax.swing.JButton`

### `ir`

**Type:** `javax.swing.JRootPane`

### `or`

**Type:** `boolean`

### `rr`

**Type:** `java.lang.String`

### `yr`

**Type:** `boolean`

### `vr`

**Type:** `int`

### `sq`

**Type:** `javax.swing.JMenuBar`

### `vq`

**Type:** `java.awt.Cursor`

### `tr`

**Type:** `java.util.List<java.awt.event.WindowListener>`

### `zr`

**Type:** `java.util.List<java.awt.event.ComponentListener>`

### `tq`

**Type:** `java.util.List<java.awt.event.KeyListener>`

### `zq`

**Type:** `boolean`

### `er`

**Type:** `java.awt.event.WindowListener`

### `xq`

**Type:** `java.awt.event.ComponentListener`

### `uq`

**Type:** `java.awt.Component`

### `nr`

**Type:** `javax.swing.JLayeredPane`

### `cr`

**Type:** `java.lang.String`

### `xr`

**Type:** `java.awt.FocusTraversalPolicy`

### `lr`

**Type:** `javax.swing.JComponent`

### `as`

**Type:** `ro.sync.ui.application.ApplicationDialog._c`

### `gr`

**Type:** `java.awt.Point`

### `ar`

**Type:** `java.awt.Dimension`

### `hr`

**Type:** `java.awt.Dimension`

### `jr`

**Type:** `boolean`

### `kr`

**Type:** `int`

### `yq`

**Type:** `int`

### `wr`

**Type:** `int`

### `cs`

**Type:** `int`

### `bs`

**Type:** `long`

### `dr`

**Type:** `java.awt.Dialog.ModalExclusionType`

## Constructors

### `<init>(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

## Methods

### `registerListeners(JDialog arg0)`

**Parameters:**
- `arg0` (`javax.swing.JDialog`)

**Returns:** `void`

### `shouldUpdateMnemonics()`

**Returns:** `boolean`

### `doCancel()`

**Returns:** `void`

### `unregister()`

**Returns:** `void`

### `setVisible(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `setFocusTraversalPolicy(FocusTraversalPolicy arg0)`

**Parameters:**
- `arg0` (`java.awt.FocusTraversalPolicy`)

**Returns:** `void`

### `sh()`

**Returns:** `void`

### `clean()`

**Returns:** `void`

### `rh()`

**Returns:** `void`

### `qh()`

**Returns:** `void`

### `vh()`

**Returns:** `void`

### `yh()`

**Returns:** `void`

### `uh()`

**Returns:** `java.awt.Dimension`

### `shouldUpdatePreferredWidth()`

**Returns:** `boolean`

### `shouldIgnoreParent(Window arg0)`

**Parameters:**
- `arg0` (`java.awt.Window`)

**Returns:** `boolean`

### `shouldShowInTaskBar()`

**Returns:** `boolean`

### `xh(Component arg0)`

**Parameters:**
- `arg0` (`java.awt.Component`)

**Returns:** `void`

### `getBounds()`

**Returns:** `java.awt.Rectangle`

### `hasFocus()`

**Returns:** `boolean`

### `isShowing()`

**Returns:** `boolean`

### `isVisible()`

**Returns:** `boolean`

### `isActive()`

**Returns:** `boolean`

### `setLocation(int arg0, int arg1)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)

**Returns:** `void`

### `setLocation(Point arg0)`

**Parameters:**
- `arg0` (`java.awt.Point`)

**Returns:** `void`

### `setSize(int arg0, int arg1)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)

**Returns:** `void`

### `setMinimumWidthForPack(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `void`

### `setMinimumHeightForPack(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `void`

### `setSize(Dimension arg0)`

**Parameters:**
- `arg0` (`java.awt.Dimension`)

**Returns:** `void`

### `getSize()`

**Returns:** `java.awt.Dimension`

### `setTitleTag(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setTitle(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `getDialogTag()`

**Returns:** `java.lang.String`

### `th(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getCursor()`

**Returns:** `java.awt.Cursor`

### `setCursor(Cursor arg0)`

**Parameters:**
- `arg0` (`java.awt.Cursor`)

**Returns:** `void`

### `toFront()`

**Returns:** `void`

### `getFocusManagerTopWindow()`

**Returns:** `java.awt.Window`

### `getTopWindow()`

**Returns:** `java.awt.Window`

### `addComponentListener(ComponentListener arg0)`

**Parameters:**
- `arg0` (`java.awt.event.ComponentListener`)

**Returns:** `void`

### `removeComponentListener(ComponentListener arg0)`

**Parameters:**
- `arg0` (`java.awt.event.ComponentListener`)

**Returns:** `void`

### `addWindowListener(WindowListener arg0)`

**Parameters:**
- `arg0` (`java.awt.event.WindowListener`)

**Returns:** `void`

### `removeWindowListener(WindowListener arg0)`

**Parameters:**
- `arg0` (`java.awt.event.WindowListener`)

**Returns:** `void`

### `addKeyListener(KeyListener arg0)`

**Parameters:**
- `arg0` (`java.awt.event.KeyListener`)

**Returns:** `void`

### `removeKeyListener(KeyListener arg0)`

**Parameters:**
- `arg0` (`java.awt.event.KeyListener`)

**Returns:** `void`

### `enableEvents(long arg0)`

**Parameters:**
- `arg0` (`long`)

**Returns:** `void`

### `setDefaultCloseOperation(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `void`

### `getDefaultCloseOperation()`

**Returns:** `int`

### `setJMenuBar(JMenuBar arg0)`

**Parameters:**
- `arg0` (`javax.swing.JMenuBar`)

**Returns:** `void`

### `getRootPane()`

**Returns:** `javax.swing.JRootPane`

### `getMainContentPane()`

**Returns:** `ro.sync.ui.application.ec`

### `getContentPane()`

**Returns:** `java.awt.Container`

### `getNeverShowCheckBox()`

**Returns:** `javax.swing.JCheckBox`

### `setModal(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `setResizable(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `setUndecorated(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `isUndecorated()`

**Returns:** `boolean`

### `pack()`

**Returns:** `void`

### `setMinimumSize(Dimension arg0)`

**Parameters:**
- `arg0` (`java.awt.Dimension`)

**Returns:** `void`

### `getMinimumSize()`

**Returns:** `java.awt.Dimension`

### `setMaximumWidthForPack(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `void`

### `setMaximumHeightForPack(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `void`

### `getRealDialogForTCs()`

**Returns:** `javax.swing.JDialog`

### `resetLocation()`

**Returns:** `void`

### `getLocation()`

**Returns:** `java.awt.Point`

### `getGraphicsConfiguration()`

**Returns:** `java.awt.GraphicsConfiguration`

### `getContentPanePreferredSize()`

**Returns:** `java.awt.Dimension`

### `getDefaultInsets()`

**Returns:** `java.awt.Insets`

### `getDefaultInsetsMiddleOfLine()`

**Returns:** `java.awt.Insets`

### `getDefaultInsetsLastOnLine()`

**Returns:** `java.awt.Insets`

### `getDefaultInsetsLastLineMiddle()`

**Returns:** `java.awt.Insets`

### `getDefaultInsetsLastLineLastOnLine()`

**Returns:** `java.awt.Insets`

### `getNoInsets()`

**Returns:** `java.awt.Insets`

### `getWrapperDialog()`

**Returns:** `ro.sync.ui.application.ApplicationDialog._c`

### `getTitle()`

**Returns:** `java.lang.String`

### `isModal()`

**Returns:** `boolean`

### `processEscapeKeyEvent()`

**Returns:** `boolean`

### `isPopupShownFromThisDialog(qb arg0)`

**Parameters:**
- `arg0` (`ro.sync.ui.application.qb`)

**Returns:** `boolean`

### `wh()`

**Returns:** `void`

### `invalidate()`

**Returns:** `void`

### `validate()`

**Returns:** `void`

### `setDefaultFocusedComponent(JComponent arg0)`

**Parameters:**
- `arg0` (`javax.swing.JComponent`)

**Returns:** `void`

### `setModalExclusionType(Dialog.ModalExclusionType arg0)`

**Parameters:**
- `arg0` (`java.awt.Dialog.ModalExclusionType`)

**Returns:** `void`

### `getModalExclusionType()`

**Returns:** `java.awt.Dialog.ModalExclusionType`

### `getContextDescription()`

**Returns:** `java.lang.String`

### `getAttributeEditingContextDescription()`

**Returns:** [`ro.sync.exml.workspace.api.standalone.AttributeEditingContextDescription`](../../exml/workspace/api/standalone/AttributeEditingContextDescription.md)

