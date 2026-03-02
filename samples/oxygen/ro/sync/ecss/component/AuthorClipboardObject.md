# Class: `AuthorClipboardObject`

**Package:** [`ro.sync.ecss.component`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.component.AuthorClipboardObject`

**Implements:** `java.io.Serializable`

## Fields

### `serialVersionUID`

**Type:** `long`

### `textContent`

**Type:** `java.lang.String`

### `htmlContent`

**Type:** `java.lang.String`

### `fragments`

**Type:** [`ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[]`](./AuthorDocumentFragmentClipboardObject.md)

### `originalDocInfo`

**Type:** `ro.sync.ecss.component.bc`

### `purposeID`

**Type:** `int`

### `objectID`

**Type:** `java.lang.String`

### `visualRepresentation`

**Type:** [`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](../extensions/api/SelectionInterpretationMode.md)

### `metadata`

**Type:** [`ro.sync.ecss.component.AuthorContentMetadata`](./AuthorContentMetadata.md)

## Constructors

### `<init>(String arg0, AuthorDocumentFragmentClipboardObject[] arg1, z arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[]`](./AuthorDocumentFragmentClipboardObject.md))
- `arg2` (`ro.sync.ecss.dom.z`)

### `<init>(String arg0, String arg1, AuthorDocumentFragmentClipboardObject[] arg2, AuthorContentMetadata arg3, z arg4, SelectionInterpretationMode arg5)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` ([`ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[]`](./AuthorDocumentFragmentClipboardObject.md))
- `arg3` ([`ro.sync.ecss.component.AuthorContentMetadata`](./AuthorContentMetadata.md))
- `arg4` (`ro.sync.ecss.dom.z`)
- `arg5` ([`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](../extensions/api/SelectionInterpretationMode.md))

## Methods

### `getFragments()`

**Returns:** [`ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[]`](./AuthorDocumentFragmentClipboardObject.md)

### `getMetadata()`

**Returns:** [`ro.sync.ecss.component.AuthorContentMetadata`](./AuthorContentMetadata.md)

### `getTextContent()`

**Returns:** `java.lang.String`

### `setTextContent(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getHtmlContent()`

**Returns:** `java.lang.String`

### `writeObject(ObjectOutputStream arg0)`

**Parameters:**
- `arg0` (`java.io.ObjectOutputStream`)

**Returns:** `void`

### `readObject(ObjectInputStream arg0)`

**Parameters:**
- `arg0` (`java.io.ObjectInputStream`)

**Returns:** `void`

### `setPurposeID(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `void`

### `getPurposeID()`

**Returns:** `int`

### `getObjectID()`

**Returns:** `java.lang.String`

### `getVisualRepresentation()`

**Returns:** [`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](../extensions/api/SelectionInterpretationMode.md)

### `getDocumentType()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentType`](../extensions/api/AuthorDocumentType.md)

