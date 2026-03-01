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

### `<init>(`java.lang.String` arg0, [`ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[]`](./AuthorDocumentFragmentClipboardObject.md) arg1, `ro.sync.ecss.dom.z` arg2)`

### `<init>(`java.lang.String` arg0, `java.lang.String` arg1, [`ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[]`](./AuthorDocumentFragmentClipboardObject.md) arg2, [`ro.sync.ecss.component.AuthorContentMetadata`](./AuthorContentMetadata.md) arg3, `ro.sync.ecss.dom.z` arg4, [`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](../extensions/api/SelectionInterpretationMode.md) arg5)`

## Methods

### `getFragments()`

**Returns:** [`ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[]`](./AuthorDocumentFragmentClipboardObject.md)

### `getMetadata()`

**Returns:** [`ro.sync.ecss.component.AuthorContentMetadata`](./AuthorContentMetadata.md)

### `getTextContent()`

**Returns:** `java.lang.String`

### `setTextContent(`java.lang.String` arg0)`

**Returns:** `void`

### `getHtmlContent()`

**Returns:** `java.lang.String`

### `writeObject(`java.io.ObjectOutputStream` arg0)`

**Returns:** `void`

### `readObject(`java.io.ObjectInputStream` arg0)`

**Returns:** `void`

### `setPurposeID(`int` arg0)`

**Returns:** `void`

### `getPurposeID()`

**Returns:** `int`

### `getObjectID()`

**Returns:** `java.lang.String`

### `getVisualRepresentation()`

**Returns:** [`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](../extensions/api/SelectionInterpretationMode.md)

### `getDocumentType()`

**Returns:** [`ro.sync.ecss.extensions.api.AuthorDocumentType`](../extensions/api/AuthorDocumentType.md)

