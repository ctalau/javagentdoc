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

### `<init>(k arg0)`

**Parameters:**
- `arg0` (`ro.sync.options.k`)

## Methods

### `setInstance(DocumentTypeRepository arg0)`

**Parameters:**
- `arg0` ([`ro.sync.exml.editor.DocumentTypeRepository`](./DocumentTypeRepository.md))

**Returns:** `void`

### `reload(NotifyableMap arg0)`

**Parameters:**
- `arg0` (`ro.sync.options.NotifyableMap`)

**Returns:** `void`

### `n()`

**Returns:** `void`

### `e(NotifyableMap arg0)`

**Parameters:**
- `arg0` (`ro.sync.options.NotifyableMap`)

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO[]`

### `getDocumentTypeLocation(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.String`

### `reloadFromOptions()`

**Returns:** `void`

### `getInstance()`

**Returns:** [`ro.sync.exml.editor.DocumentTypeRepository`](./DocumentTypeRepository.md)

### `clearInstanceTest()`

**Returns:** `void`

### `store(NotifyableMap arg0)`

**Parameters:**
- `arg0` (`ro.sync.options.NotifyableMap`)

**Returns:** `void`

### `getDocumentTypeDescriptor(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `getDocumentTypeDescriptorUntouched(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `getDocumentTypePO(String arg0, String arg1, String arg2, String arg3, String arg4, Attributes arg5, NonCloseableReader arg6)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`org.xml.sax.Attributes`)
- `arg6` (`ro.sync.basic.io.NonCloseableReader`)

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `getDocumentTypePO(String arg0, String arg1, String arg2, String arg3, String arg4, Attributes arg5, NonCloseableReader arg6, Map<String,String> arg7)`

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

### `g(String arg0, Map<String,String> arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.util.Map<java.lang.String,java.lang.String>`)

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `h(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.lang.String`)

**Returns:** `void`

### `j(String arg0, String arg1, String arg2, String arg3, Attributes arg4)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`org.xml.sax.Attributes`)

**Returns:** `void`

### `l(Attributes arg0, String arg1, String arg2, String arg3)`

**Parameters:**
- `arg0` (`org.xml.sax.Attributes`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

**Returns:** `boolean`

### `f(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `boolean`

### `m(String arg0, String arg1, String arg2, String arg3, String arg4, Attributes arg5, Map<String,String> arg6, String arg7, f arg8, NonCloseableReader arg9)`

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

### `d(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `boolean`

### `k(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `boolean`

### `b(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `boolean`

### `addDocumentType(DocumentTypePO arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO`)

**Returns:** `void`

### `updateDocumentTypeMapping(String arg0, String arg1, String arg2, String arg3)`

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

### `setDocumentTypeDescriptors(DocumentTypePO[] arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO[]`)

**Returns:** `void`

### `addDocumentTypeMapping(URL arg0, URL arg1, String arg2, String arg3)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

**Returns:** `void`

### `i(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `int`

### `insertWithPrioritySort(List<DocumentTypePO> arg0, DocumentTypePO arg1)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.exml.editor.persistance.DocumentTypePO>`)
- `arg1` (`ro.sync.exml.editor.persistance.DocumentTypePO`)

**Returns:** `int`

### `shouldMakePathsRelativeToFramework(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `boolean`

### `o(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `computeBaseStoreLocation(DocumentTypePO arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO`)

**Returns:** `java.lang.String`

### `getBaseDocumentTypePO(DocumentTypePO arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO`)

**Returns:** `java.util.Optional<ro.sync.exml.editor.persistance.DocumentTypePO>`

### `getFilePatterns()`

**Returns:** `java.lang.String[]`

### `shouldSkipAddingTemplatesFromDocumentType(DocumentTypePO arg0, Set<DocumentTypeRulePO> arg1)`

**Parameters:**
- `arg0` (`ro.sync.exml.editor.persistance.DocumentTypePO`)
- `arg1` (`java.util.Set<ro.sync.exml.editor.persistance.DocumentTypeRulePO>`)

**Returns:** `boolean`

### `reloadExternalActions(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

