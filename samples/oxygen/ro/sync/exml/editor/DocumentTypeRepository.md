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

**Parameters:**
- `arg0` ([`ro.sync.exml.editor.DocumentTypeRepository`](./DocumentTypeRepository.md))

**Returns:** `void`

### `reload(ro.sync.options.NotifyableMap arg0)`

**Parameters:**
- `arg0` (`ro.sync.options.NotifyableMap`)

**Returns:** `void`

### `n()`

**Returns:** `void`

### `e(ro.sync.options.NotifyableMap arg0)`

**Parameters:**
- `arg0` (`ro.sync.options.NotifyableMap`)

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO[]`

### `getDocumentTypeLocation(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.String`

### `reloadFromOptions()`

**Returns:** `void`

### `getInstance()`

**Returns:** [`ro.sync.exml.editor.DocumentTypeRepository`](./DocumentTypeRepository.md)

### `clearInstanceTest()`

**Returns:** `void`

### `store(ro.sync.options.NotifyableMap arg0)`

**Parameters:**
- `arg0` (`ro.sync.options.NotifyableMap`)

**Returns:** `void`

### `getDocumentTypeDescriptor(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `getDocumentTypeDescriptorUntouched(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `getDocumentTypePO(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, org.xml.sax.Attributes arg5, ro.sync.basic.io.NonCloseableReader arg6)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`org.xml.sax.Attributes`)
- `arg6` (`ro.sync.basic.io.NonCloseableReader`)

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `getDocumentTypePO(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, org.xml.sax.Attributes arg5, ro.sync.basic.io.NonCloseableReader arg6, java.util.Map<java.lang.String,java.lang.String> arg7)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`org.xml.sax.Attributes`)
- `arg6` (`ro.sync.basic.io.NonCloseableReader`)
- `arg7` (`java.util.Map<java.lang.String,java.lang.String>`)

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `g(java.lang.String arg0, java.util.Map<java.lang.String,java.lang.String> arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.util.Map<java.lang.String,java.lang.String>`)

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `h(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.lang.String`)

**Returns:** `void`

### `j(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, org.xml.sax.Attributes arg4)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`org.xml.sax.Attributes`)

**Returns:** `void`

### `l(org.xml.sax.Attributes arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)`

**Parameters:**
- `arg0` (`org.xml.sax.Attributes`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

**Returns:** `boolean`

### `f(java.lang.String arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `boolean`

### `m(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, org.xml.sax.Attributes arg5, java.util.Map<java.lang.String,java.lang.String> arg6, java.lang.String arg7, ro.sync.exml.editor.persistance.f arg8, ro.sync.basic.io.NonCloseableReader arg9)`

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

**Returns:** `boolean`

### `d(java.lang.String arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `boolean`

### `k(java.lang.String arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `boolean`

### `b(java.lang.String arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `boolean`

### `addDocumentType(ro.sync.exml.editor.persistance.DocumentTypePO arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO`)

**Returns:** `void`

### `updateDocumentTypeMapping(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

**Returns:** `void`

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

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO[]`)

**Returns:** `void`

### `addDocumentTypeMapping(java.net.URL arg0, java.net.URL arg1, java.lang.String arg2, java.lang.String arg3)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

**Returns:** `void`

### `i(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `int`

### `insertWithPrioritySort(java.util.List<ro.sync.exml.editor.persistance.DocumentTypePO> arg0, ro.sync.exml.editor.persistance.DocumentTypePO arg1)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.exml.editor.persistance.DocumentTypePO>`)
- `arg1` (`ro.sync.exml.editor.persistance.DocumentTypePO`)

**Returns:** `int`

### `shouldMakePathsRelativeToFramework(java.lang.String arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `boolean`

### `o(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `computeBaseStoreLocation(ro.sync.exml.editor.persistance.DocumentTypePO arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO`)

**Returns:** `java.lang.String`

### `getBaseDocumentTypePO(ro.sync.exml.editor.persistance.DocumentTypePO arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO`)

**Returns:** `java.util.Optional<ro.sync.exml.editor.persistance.DocumentTypePO>`

### `getFilePatterns()`

**Returns:** `java.lang.String[]`

### `shouldSkipAddingTemplatesFromDocumentType(ro.sync.exml.editor.persistance.DocumentTypePO arg0, java.util.Set<ro.sync.exml.editor.persistance.DocumentTypeRulePO> arg1)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO`)
- `arg1` (`java.util.Set<ro.sync.exml.editor.persistance.DocumentTypeRulePO>`)

**Returns:** `boolean`

### `reloadExternalActions(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

