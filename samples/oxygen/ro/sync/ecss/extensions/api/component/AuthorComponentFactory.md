# Class: `AuthorComponentFactory`

**Package:** [`ro.sync.ecss.extensions.api.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.component.AuthorComponentFactory`

**Implements:** [`ro.sync.exml.workspace.api.standalone.ReferencesCustomizer`](../../../../exml/workspace/api/standalone/ReferencesCustomizer.md), [`ro.sync.exml.workspace.api.math.MathFlowConfigurator`](../../../../exml/workspace/api/math/MathFlowConfigurator.md)

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `FRAMEWORKS_DIR_NAME`

**Type:** `java.lang.String`

### `licenseChecker`

**Type:** `ro.sync.exml.k.g`

### `BUNDLE_DESCRIPTOR`

**Type:** `ro.sync.g.e.b.d`

### `instance`

**Type:** [`ro.sync.ecss.extensions.api.component.AuthorComponentFactory`](./AuthorComponentFactory.md)

### `parentFrame`

**Type:** `java.awt.Frame`

### `parentFrameForceSet`

**Type:** `boolean`

### `fromTests`

**Type:** `boolean`

### `customizers`

**Type:** `ro.sync.exml.workspace.b.i.c`

### `ditaMapTreeCustomizers`

**Type:** `ro.sync.exml.workspace.b.i.d`

### `accessUtil`

**Type:** `ro.sync.exml.workspace.b.d.b`

### `pluginsLayoutCustomizer`

**Type:** `ro.sync.exml.workspace.b.j.b`

### `wsUtilities`

**Type:** [`ro.sync.exml.workspace.api.WorkspaceUtilities`](../../../../exml/workspace/api/WorkspaceUtilities.md)

### `testExtentions`

**Type:** `java.util.List<ro.sync.exml.plugin.PluginDescriptor.PluginExtensionDescription>`

### `authorCompPluginWorkspace`

**Type:** `ro.sync.exml.workspace.b.b.o`

### `avoidDumpOptionsOnDispose`

**Type:** `java.lang.Boolean`

### `initialized`

**Type:** `boolean`

### `editorManager`

**Type:** `ro.sync.exml.workspace.b.i.f`

### `ditaMapEditorManager`

**Type:** `ro.sync.exml.workspace.b.i.e`

## Constructors

### `<init>()`

## Methods

### `getInstance()`

**Returns:** [`ro.sync.ecss.extensions.api.component.AuthorComponentFactory`](./AuthorComponentFactory.md)

### `registerLicenseKey(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `dispose()`

**Returns:** `void`

### `startWorkspaceAccessPlugins()`

**Returns:** `void`

### `stopWorkspaceAccessPlugins()`

**Returns:** `void`

### `registerLicenseServer(bb arg0)`

**Parameters:**
- `arg0` (`ro.sync.g.b.bb`)

**Returns:** `void`

### `init(File arg0, URL arg1, URL arg2, String arg3, String arg4, String arg5, String arg6)`

**Parameters:**
- `arg0` (`java.io.File`)
- `arg1` (`java.net.URL`)
- `arg2` (`java.net.URL`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.lang.String`)

**Returns:** `void`

### `init(URL[] arg0, URL arg1, URL arg2, String arg3, String arg4, String arg5, String arg6)`

**Parameters:**
- `arg0` (`java.net.URL[]`)
- `arg1` (`java.net.URL`)
- `arg2` (`java.net.URL`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.lang.String`)

**Returns:** `void`

### `init(URL[] arg0, File arg1, URL arg2, URL arg3, String arg4, String arg5, bb arg6)`

**Parameters:**
- `arg0` (`java.net.URL[]`)
- `arg1` (`java.io.File`)
- `arg2` (`java.net.URL`)
- `arg3` (`java.net.URL`)
- `arg4` (`java.lang.String`)
- `arg5` (`java.lang.String`)
- `arg6` (`ro.sync.g.b.bb`)

**Returns:** `void`

### `setAppletFrameAsParentFrame()`

**Returns:** `void`

### `setDefaultOptions()`

**Returns:** `void`

### `setObjectProperty(String arg0, Object arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.Object`)

**Returns:** `void`

### `createEditorComponentProvider(String[] arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String[]`)
- `arg1` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.extensions.api.component.EditorComponentProvider`](./EditorComponentProvider.md)

### `createEditorComponentProvider(String[] arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` (`java.lang.String[]`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.extensions.api.component.EditorComponentProvider`](./EditorComponentProvider.md)

### `createEditorManager()`

**Returns:** `void`

### `createDITAMapTreeComponentProvider()`

**Returns:** `ro.sync.ecss.extensions.api.component.ditamap.DITAMapTreeComponentProvider`

### `disposeEditorComponentProvider(EditorComponentProvider arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.component.EditorComponentProvider`](./EditorComponentProvider.md))

**Returns:** `void`

### `disposeDITAMapComponentProvider(DITAMapTreeComponentProvider arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.extensions.api.component.ditamap.DITAMapTreeComponentProvider`)

**Returns:** `void`

### `getPreferencesPathForApplet(URL arg0, String arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getSpellCheckOptions()`

**Returns:** `ro.sync.azcheck.ui.SpellCheckOptions`

### `setSpellCheckOptions(SpellCheckOptions arg0)`

**Parameters:**
- `arg0` (`ro.sync.azcheck.ui.SpellCheckOptions`)

**Returns:** `void`

### `setAutoCorrectState(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `setOpenURLHandler(OpenURLHandler arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.component.listeners.OpenURLHandler`](listeners/OpenURLHandler.md))

**Returns:** `void`

### `addInputURLChooserCustomizer(InputURLChooserCustomizer arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.standalone.InputURLChooserCustomizer`](../../../../exml/workspace/api/standalone/InputURLChooserCustomizer.md))

**Returns:** `void`

### `addRelativeReferencesResolver(String arg0, RelativeReferenceResolver arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.exml.workspace.api.util.RelativeReferenceResolver`](../../../../exml/workspace/api/util/RelativeReferenceResolver.md))

**Returns:** `void`

### `addDITAMapTreeTargetInformationProvider(String arg0, TopicRefTargetInfoProvider arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.exml.workspace.api.standalone.ditamap.TopicRefTargetInfoProvider`](../../../../exml/workspace/api/standalone/ditamap/TopicRefTargetInfoProvider.md))

**Returns:** `void`

### `setMathFlowFixedLicenseKeyForEditor(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setMathFlowFixedLicenseKeyForComposer(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setMathFlowFixedLicenseFile(File arg0)`

**Parameters:**
- `arg0` (`java.io.File`)

**Returns:** `void`

### `setMathFlowInstallationFolder(File arg0)`

**Parameters:**
- `arg0` (`java.io.File`)

**Returns:** `void`

### `getXMLUtilAccess()`

**Returns:** [`ro.sync.exml.workspace.api.util.XMLUtilAccess`](../../../../exml/workspace/api/util/XMLUtilAccess.md)

### `getUtilAccess()`

**Returns:** [`ro.sync.exml.workspace.api.util.UtilAccess`](../../../../exml/workspace/api/util/UtilAccess.md)

### `getPluginToolbarCustomizers()`

**Returns:** `java.util.List<ro.sync.exml.workspace.api.standalone.ToolbarComponentsCustomizer>`

### `getPluginViewCustomizers()`

**Returns:** `java.util.List<ro.sync.exml.workspace.api.standalone.ViewComponentCustomizer>`

### `getPluginMenubarCustomizers()`

**Returns:** `java.util.List<ro.sync.exml.workspace.api.standalone.MenuBarCustomizer>`

### `setDITAKeyDefinitionManager(KeyDefinitionManager arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionManager`](../../../../exml/workspace/api/editor/page/ditamap/keys/KeyDefinitionManager.md))

**Returns:** `void`

### `getWorkspaceUtilities()`

**Returns:** [`ro.sync.exml.workspace.api.WorkspaceUtilities`](../../../../exml/workspace/api/WorkspaceUtilities.md)

### `getPluginWorkspace()`

**Returns:** [`ro.sync.exml.workspace.api.PluginWorkspace`](../../../../exml/workspace/api/PluginWorkspace.md)

### `setParentFrame(Frame arg0)`

**Parameters:**
- `arg0` (`java.awt.Frame`)

**Returns:** `void`

