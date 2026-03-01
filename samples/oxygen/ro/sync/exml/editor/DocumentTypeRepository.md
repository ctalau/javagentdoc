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

### `<init>(`ro.sync.options.k` arg0)`

## Methods

### `setInstance([`ro.sync.exml.editor.DocumentTypeRepository`](./DocumentTypeRepository.md) arg0)`

**Returns:** `void`

### `reload(`ro.sync.options.NotifyableMap` arg0)`

**Returns:** `void`

### `n()`

**Returns:** `void`

### `e(`ro.sync.options.NotifyableMap` arg0)`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO[]`

### `getDocumentTypeLocation(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `reloadFromOptions()`

**Returns:** `void`

### `getInstance()`

**Returns:** [`ro.sync.exml.editor.DocumentTypeRepository`](./DocumentTypeRepository.md)

### `clearInstanceTest()`

**Returns:** `void`

### `store(`ro.sync.options.NotifyableMap` arg0)`

**Returns:** `void`

### `getDocumentTypeDescriptor(`java.lang.String` arg0)`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `getDocumentTypeDescriptorUntouched(`java.lang.String` arg0)`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `getDocumentTypePO(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `java.lang.String` arg4, `org.xml.sax.Attributes` arg5, `ro.sync.basic.io.NonCloseableReader` arg6)`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `getDocumentTypePO(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `java.lang.String` arg4, `org.xml.sax.Attributes` arg5, `ro.sync.basic.io.NonCloseableReader` arg6, `java.util.Map<java.lang.String,java.lang.String>` arg7)`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `g(`java.lang.String` arg0, `java.util.Map<java.lang.String,java.lang.String>` arg1)`

**Returns:** `java.util.Map<java.lang.String,java.lang.String>`

### `h(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `java.lang.String` arg4, `java.lang.String` arg5, `java.lang.String` arg6)`

**Returns:** `void`

### `j(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `org.xml.sax.Attributes` arg4)`

**Returns:** `void`

### `l(`org.xml.sax.Attributes` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3)`

**Returns:** `boolean`

### `f(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `boolean`

### `m(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `java.lang.String` arg4, `org.xml.sax.Attributes` arg5, `java.util.Map<java.lang.String,java.lang.String>` arg6, `java.lang.String` arg7, `ro.sync.exml.editor.persistance.f` arg8, `ro.sync.basic.io.NonCloseableReader` arg9)`

**Returns:** `boolean`

### `d(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `boolean`

### `k(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `boolean`

### `b(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `boolean`

### `addDocumentType(`ro.sync.exml.editor.persistance.DocumentTypePO` arg0)`

**Returns:** `void`

### `updateDocumentTypeMapping(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3)`

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

### `setDocumentTypeDescriptors(`ro.sync.exml.editor.persistance.DocumentTypePO[]` arg0)`

**Returns:** `void`

### `addDocumentTypeMapping(`java.net.URL` arg0, `java.net.URL` arg1, `java.lang.String` arg2, `java.lang.String` arg3)`

**Returns:** `void`

### `i(`java.lang.String` arg0)`

**Returns:** `int`

### `insertWithPrioritySort(`java.util.List<ro.sync.exml.editor.persistance.DocumentTypePO>` arg0, `ro.sync.exml.editor.persistance.DocumentTypePO` arg1)`

**Returns:** `int`

### `shouldMakePathsRelativeToFramework(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `boolean`

### `o(`java.lang.String` arg0)`

**Returns:** `ro.sync.exml.editor.persistance.DocumentTypePO`

### `computeBaseStoreLocation(`ro.sync.exml.editor.persistance.DocumentTypePO` arg0)`

**Returns:** `java.lang.String`

### `getBaseDocumentTypePO(`ro.sync.exml.editor.persistance.DocumentTypePO` arg0)`

**Returns:** `java.util.Optional<ro.sync.exml.editor.persistance.DocumentTypePO>`

### `getFilePatterns()`

**Returns:** `java.lang.String[]`

### `shouldSkipAddingTemplatesFromDocumentType(`ro.sync.exml.editor.persistance.DocumentTypePO` arg0, `java.util.Set<ro.sync.exml.editor.persistance.DocumentTypeRulePO>` arg1)`

**Returns:** `boolean`

### `reloadExternalActions(`java.lang.String` arg0)`

**Returns:** `void`

