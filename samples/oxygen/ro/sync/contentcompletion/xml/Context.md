# Class: `Context`

**Package:** [`ro.sync.contentcompletion.xml`](README.md)

**Fully Qualified Name:** `ro.sync.contentcompletion.xml.Context`

**Implements:** `java.lang.Cloneable`

## Fields

### `e`

**Type:** `org.slf4j.Logger`

### `b`

**Type:** `java.util.Stack<ro.sync.contentcompletion.xml.ContextElement>`

### `i`

**Type:** `ro.sync.xml.ProxyNamespaceMapping`

### `d`

**Type:** `java.util.List<ro.sync.contentcompletion.xml.ContextElement>`

### `h`

**Type:** `java.util.List<ro.sync.contentcompletion.xml.ContextElement>`

### `g`

**Type:** `org.xml.sax.XMLReader`

### `c`

**Type:** `ro.sync.contentcompletion.xml.o`

### `f`

**Type:** `java.util.List<ro.sync.xml.parser.IDValue>`

## Constructors

### `<init>()`

## Methods

### `setElementStack(`java.util.Stack<ro.sync.contentcompletion.xml.ContextElement>` arg0)`

**Returns:** `void`

### `getElementStack()`

**Returns:** `java.util.Stack<ro.sync.contentcompletion.xml.ContextElement>`

### `setPrefixNamespaceMapping(`ro.sync.xml.ProxyNamespaceMapping` arg0)`

**Returns:** `void`

### `getPrefixNamespaceMapping()`

**Returns:** `ro.sync.xml.ProxyNamespaceMapping`

### `getRootAttributes()`

**Returns:** `ro.sync.outline.xml.Attribute[]`

### `setPreviousSiblingElements(`java.util.List<ro.sync.contentcompletion.xml.ContextElement>` arg0)`

**Returns:** `void`

### `getPreviousSiblingElements()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.ContextElement>`

### `setNextSiblingElements(`java.util.List<ro.sync.contentcompletion.xml.ContextElement>` arg0)`

**Returns:** `void`

### `getNextSiblingElements()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.ContextElement>`

### `executeXPath(`java.lang.String` arg0, `java.lang.String[]` arg1)`

**Returns:** `java.util.List<java.lang.String>`

### `executeXPath(`java.lang.String` arg0, `java.lang.String[]` arg1, `boolean` arg2)`

**Returns:** `java.util.List`

### `setXMLReader(`org.xml.sax.XMLReader` arg0)`

**Returns:** `void`

### `setAdditionalContextInformationProvider(`ro.sync.contentcompletion.xml.o` arg0)`

**Returns:** `void`

### `pushContextElement([`ro.sync.contentcompletion.xml.ContextElement`](./ContextElement.md) arg0, `java.util.List<ro.sync.contentcompletion.xml.ContextElement>` arg1)`

**Returns:** `void`

### `clone()`

**Returns:** `java.lang.Object`

### `setIdValuesList(`java.util.List<ro.sync.xml.parser.IDValue>` arg0)`

**Returns:** `void`

### `getIdValuesList()`

**Returns:** `java.util.List<ro.sync.xml.parser.IDValue>`

### `getSystemID()`

**Returns:** `java.lang.String`

### `computeContextXPathExpression()`

**Returns:** `java.lang.String`

### `getDefaultAttributeValue([`ro.sync.contentcompletion.xml.ContextElement`](./ContextElement.md) arg0, `java.lang.String` arg1)`

**Returns:** `java.lang.String`

### `getProxyNamespaceMapping([`ro.sync.contentcompletion.xml.Context`](./Context.md) arg0)`

**Returns:** `java.lang.String[]`

### `equals(`java.lang.Object` arg0)`

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

