# Class: `DocumentTypeRepository`

**Package:** [`ro.sync.exml.editor`](README.md)

**Fully Qualified Name:** `ro.sync.exml.editor.DocumentTypeRepository`

**Implements:** `ro.sync.exml.editor.bh`

## Fields

### `k`

**Type:** `org.slf4j.Logger`

### `l`

**Type:** `java.lang.String`

### `b`

**Type:** `java.lang.String`

### `j`

**Type:** `java.lang.String`

### `c`

**Type:** `java.lang.String`

### `h`

**Type:** [`ro.sync.exml.editor.DocumentTypeRepository`](./DocumentTypeRepository.md)

### `e`

**Type:** `java.util.List<ro.sync.exml.editor.persistance.DocumentTypePO>`

### `g`

**Type:** `ro.sync.exml.editor.persistance.DocumentTypePO[]`

### `f`

**Type:** `boolean`

### `d`

**Type:** `java.util.Comparator<ro.sync.exml.editor.persistance.DocumentTypePO>`

### `i`

**Type:** `java.lang.String[]`

## Constructors

### `<init>(ro.sync.options.k arg0)`

**Parameters:**
- `arg0` (`ro.sync.options.k`)

## Methods

### `setInstance(ro.sync.exml.editor.DocumentTypeRepository arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.exml.editor.DocumentTypeRepository`](./DocumentTypeRepository.md))

### `reload(ro.sync.options.NotifyableMap arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.options.NotifyableMap`)

### `n()`

**Returns:** `void`

### `e(ro.sync.options.NotifyableMap arg0)`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO[]`

**Parameters:**
- `arg0` (`ro.sync.options.NotifyableMap`)

### `getDocumentTypeLocation(java.lang.String arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)

### `reloadFromOptions()`

**Returns:** `void`

### `getInstance()`

**Returns:** [`ro.sync.exml.editor.DocumentTypeRepository`](./DocumentTypeRepository.md)

### `clearInstanceTest()`

**Returns:** `void`

### `store(ro.sync.options.NotifyableMap arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.options.NotifyableMap`)

### `getDocumentTypeDescriptor(java.lang.String arg0)`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getDocumentTypeDescriptorUntouched(java.lang.String arg0)`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getDocumentTypePO(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, org.xml.sax.Attributes arg5, ro.sync.basic.io.NonCloseableReader arg6)`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`org.xml.sax.Attributes`)
- `arg6` (`ro.sync.basic.io.NonCloseableReader`)

### `getDocumentTypePO(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, org.xml.sax.Attributes arg5, ro.sync.basic.io.NonCloseableReader arg6, java.util.Map<java.lang.String,java.lang.String> arg7)`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`org.xml.sax.Attributes`)
- `arg6` (`ro.sync.basic.io.NonCloseableReader`)
- `arg7` (`java.util.Map<java.lang.String,java.lang.String>`)

### `g(java.lang.String arg0, java.util.Map<java.lang.String,java.lang.String> arg1)`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.util.Map<java.lang.String,java.lang.String>`)

### `h(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.lang.String`)

### `j(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`org.xml.sax.Attributes`)

### `l(org.xml.sax.Attributes arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`org.xml.sax.Attributes`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

### `f(java.lang.String arg0, java.lang.String arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `m(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, org.xml.sax.Attributes arg5, java.util.Map<java.lang.String,java.lang.String> arg6, java.lang.String arg7, ro.sync.exml.editor.persistance.f arg8, ro.sync.basic.io.NonCloseableReader arg9)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`org.xml.sax.Attributes`)
- `arg6` (`java.util.Map<java.lang.String,java.lang.String>`)
- `arg7` (`java.lang.String`)
- `arg8` (`ro.sync.exml.editor.persistance.f`)
- `arg9` (`ro.sync.basic.io.NonCloseableReader`)

### `d(java.lang.String arg0, java.lang.String arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `k(java.lang.String arg0, java.lang.String arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `b(java.lang.String arg0, java.lang.String arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `addDocumentType(ro.sync.exml.editor.persistance.DocumentTypePO arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO`)

### `updateDocumentTypeMapping(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

### `toString()`

**Returns:** `java.lang.String`

### `resetToExternals()`

**Returns:** `void`

### `getDocumentTypesForRestoreDefaults()`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO[]`

### `getDocumentTypeDescriptors()`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO[]`

### `c()`

**Returns:** `void`

### `getClonedDocumentTypeDescriptors()`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO[]`

### `getDocumentEnabledTypeDescriptors()`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO[]`

### `setDocumentTypeDescriptors(ro.sync.exml.editor.persistance.DocumentTypePO[] arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO[]`)

### `addDocumentTypeMapping(java.net.URL arg0, java.net.URL arg1, java.lang.String arg2, java.lang.String arg3)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

### `i(java.lang.String arg0)`

**Returns:** `int`

**Parameters:**
- `arg0` (`java.lang.String`)

### `insertWithPrioritySort(java.util.List<ro.sync.exml.editor.persistance.DocumentTypePO> arg0, ro.sync.exml.editor.persistance.DocumentTypePO arg1)`

**Returns:** `int`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.exml.editor.persistance.DocumentTypePO>`)
- `arg1` (`ro.sync.exml.editor.persistance.DocumentTypePO`)

### `shouldMakePathsRelativeToFramework(java.lang.String arg0, java.lang.String arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `o(java.lang.String arg0)`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

**Parameters:**
- `arg0` (`java.lang.String`)

### `computeBaseStoreLocation(ro.sync.exml.editor.persistance.DocumentTypePO arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO`)

### `getBaseDocumentTypePO(ro.sync.exml.editor.persistance.DocumentTypePO arg0)`

**Returns:** `java.util.Optional<ro.sync.exml.editor.persistance.DocumentTypePO>`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO`)

### `getFilePatterns()`

**Returns:** `java.lang.String[]`

### `shouldSkipAddingTemplatesFromDocumentType(ro.sync.exml.editor.persistance.DocumentTypePO arg0, java.util.Set<ro.sync.exml.editor.persistance.DocumentTypeRulePO> arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO`)
- `arg1` (`java.util.Set<ro.sync.exml.editor.persistance.DocumentTypeRulePO>`)

### `reloadExternalActions(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

