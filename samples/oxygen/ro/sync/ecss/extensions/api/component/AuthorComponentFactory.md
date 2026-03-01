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

### `registerLicenseKey(`java.lang.String` arg0)`

**Returns:** `void`

### `dispose()`

**Returns:** `void`

### `startWorkspaceAccessPlugins()`

**Returns:** `void`

### `stopWorkspaceAccessPlugins()`

**Returns:** `void`

### `registerLicenseServer(`ro.sync.g.b.bb` arg0)`

**Returns:** `void`

### `init(`java.io.File` arg0, `java.net.URL` arg1, `java.net.URL` arg2, `java.lang.String` arg3, `java.lang.String` arg4, `java.lang.String` arg5, `java.lang.String` arg6)`

**Returns:** `void`

### `init(`java.net.URL[]` arg0, `java.net.URL` arg1, `java.net.URL` arg2, `java.lang.String` arg3, `java.lang.String` arg4, `java.lang.String` arg5, `java.lang.String` arg6)`

**Returns:** `void`

### `init(`java.net.URL[]` arg0, `java.io.File` arg1, `java.net.URL` arg2, `java.net.URL` arg3, `java.lang.String` arg4, `java.lang.String` arg5, `ro.sync.g.b.bb` arg6)`

**Returns:** `void`

### `setAppletFrameAsParentFrame()`

**Returns:** `void`

### `setDefaultOptions()`

**Returns:** `void`

### `setObjectProperty(`java.lang.String` arg0, `java.lang.Object` arg1)`

**Returns:** `void`

### `createEditorComponentProvider(`java.lang.String[]` arg0, `java.lang.String` arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.component.EditorComponentProvider`](./EditorComponentProvider.md)

### `createEditorComponentProvider(`java.lang.String[]` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** [`ro.sync.ecss.extensions.api.component.EditorComponentProvider`](./EditorComponentProvider.md)

### `createEditorManager()`

**Returns:** `void`

### `createDITAMapTreeComponentProvider()`

**Returns:** `ro.sync.ecss.extensions.api.component.ditamap.DITAMapTreeComponentProvider`

### `disposeEditorComponentProvider([`ro.sync.ecss.extensions.api.component.EditorComponentProvider`](./EditorComponentProvider.md) arg0)`

**Returns:** `void`

### `disposeDITAMapComponentProvider(`ro.sync.ecss.extensions.api.component.ditamap.DITAMapTreeComponentProvider` arg0)`

**Returns:** `void`

### `getPreferencesPathForApplet(`java.net.URL` arg0, `java.lang.String` arg1)`

**Returns:** `java.lang.String`

### `getSpellCheckOptions()`

**Returns:** `ro.sync.azcheck.ui.SpellCheckOptions`

### `setSpellCheckOptions(`ro.sync.azcheck.ui.SpellCheckOptions` arg0)`

**Returns:** `void`

### `setAutoCorrectState(`boolean` arg0)`

**Returns:** `void`

### `setOpenURLHandler([`ro.sync.ecss.extensions.api.component.listeners.OpenURLHandler`](listeners/OpenURLHandler.md) arg0)`

**Returns:** `void`

### `addInputURLChooserCustomizer([`ro.sync.exml.workspace.api.standalone.InputURLChooserCustomizer`](../../../../exml/workspace/api/standalone/InputURLChooserCustomizer.md) arg0)`

**Returns:** `void`

### `addRelativeReferencesResolver(`java.lang.String` arg0, [`ro.sync.exml.workspace.api.util.RelativeReferenceResolver`](../../../../exml/workspace/api/util/RelativeReferenceResolver.md) arg1)`

**Returns:** `void`

### `addDITAMapTreeTargetInformationProvider(`java.lang.String` arg0, [`ro.sync.exml.workspace.api.standalone.ditamap.TopicRefTargetInfoProvider`](../../../../exml/workspace/api/standalone/ditamap/TopicRefTargetInfoProvider.md) arg1)`

**Returns:** `void`

### `setMathFlowFixedLicenseKeyForEditor(`java.lang.String` arg0)`

**Returns:** `void`

### `setMathFlowFixedLicenseKeyForComposer(`java.lang.String` arg0)`

**Returns:** `void`

### `setMathFlowFixedLicenseFile(`java.io.File` arg0)`

**Returns:** `void`

### `setMathFlowInstallationFolder(`java.io.File` arg0)`

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

### `setDITAKeyDefinitionManager([`ro.sync.exml.workspace.api.editor.page.ditamap.keys.KeyDefinitionManager`](../../../../exml/workspace/api/editor/page/ditamap/keys/KeyDefinitionManager.md) arg0)`

**Returns:** `void`

### `getWorkspaceUtilities()`

**Returns:** [`ro.sync.exml.workspace.api.WorkspaceUtilities`](../../../../exml/workspace/api/WorkspaceUtilities.md)

### `getPluginWorkspace()`

**Returns:** [`ro.sync.exml.workspace.api.PluginWorkspace`](../../../../exml/workspace/api/PluginWorkspace.md)

### `setParentFrame(`java.awt.Frame` arg0)`

**Returns:** `void`

