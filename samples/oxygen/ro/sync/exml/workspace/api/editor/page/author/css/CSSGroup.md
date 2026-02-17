# Class: `CSSGroup`

**Package:** [`ro.sync.exml.workspace.api.editor.page.author.css`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.page.author.css.CSSGroup`

## Description

For example if the XML also refers to a CSS directly in the content and the document type configuration states that the directly
 referenced CSS should be merged with the one coming from the document type configuration, the group will contain both of them.

## Fields

### `isMainSource`

**Type:** `boolean`

The Styles drop down allows users to choose only one main source.
 
 `false` if this is an alternate source of CSS styles.
 The Styles drop down allows users to apply multiple alternate styles over a main source.

### `urls`

**Type:** `java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSResource>`

### `title`

**Type:** `java.lang.String`

## Constructors

### `<init>(`java.lang.String` title, `boolean` isMainSource)`

## Methods

### `setTitle(`java.lang.String` title)`

**Returns:** `void`

### `isMainSource()`

**Returns:** `boolean`

### `getTitle()`

**Returns:** `java.lang.String`

### `getUrls()`

**Returns:** `java.util.List<ro.sync.exml.workspace.api.editor.page.author.css.CSSResource>`

### `addURLs([`ro.sync.exml.workspace.api.editor.page.author.css.CSSResource[]`](./CSSResource.md) urlsList)`

**Returns:** `void`

### `addURL([`ro.sync.exml.workspace.api.editor.page.author.css.CSSResource`](./CSSResource.md) cssRes)`

**Returns:** `void`

### `removeURL([`ro.sync.exml.workspace.api.editor.page.author.css.CSSResource`](./CSSResource.md) cssRes)`

**Returns:** `void`

### `setPreferred(`boolean` isMainSource)`

**Returns:** `void`

### `equals(`java.lang.Object` obj)`

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

