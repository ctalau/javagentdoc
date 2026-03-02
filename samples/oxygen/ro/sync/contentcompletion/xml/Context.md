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

### `setElementStack(Stack<ContextElement> arg0)`

**Parameters:**
- `arg0` (`java.util.Stack<ro.sync.contentcompletion.xml.ContextElement>`)

**Returns:** `void`

### `getElementStack()`

**Returns:** `java.util.Stack<ro.sync.contentcompletion.xml.ContextElement>`

### `setPrefixNamespaceMapping(ProxyNamespaceMapping arg0)`

**Parameters:**
- `arg0` (`ro.sync.xml.ProxyNamespaceMapping`)

**Returns:** `void`

### `getPrefixNamespaceMapping()`

**Returns:** `ro.sync.xml.ProxyNamespaceMapping`

### `getRootAttributes()`

**Returns:** `ro.sync.outline.xml.Attribute[]`

### `setPreviousSiblingElements(List<ContextElement> arg0)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.ContextElement>`)

**Returns:** `void`

### `getPreviousSiblingElements()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.ContextElement>`

### `setNextSiblingElements(List<ContextElement> arg0)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.ContextElement>`)

**Returns:** `void`

### `getNextSiblingElements()`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.ContextElement>`

### `executeXPath(String arg0, String[] arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String[]`)

**Returns:** `java.util.List<java.lang.String>`

### `executeXPath(String arg0, String[] arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String[]`)
- `arg2` (`boolean`)

**Returns:** `java.util.List`

### `setXMLReader(XMLReader arg0)`

**Parameters:**
- `arg0` (`org.xml.sax.XMLReader`)

**Returns:** `void`

### `setAdditionalContextInformationProvider(o arg0)`

**Parameters:**
- `arg0` (`ro.sync.contentcompletion.xml.o`)

**Returns:** `void`

### `pushContextElement(ContextElement arg0, List<ContextElement> arg1)`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.ContextElement`](./ContextElement.md))
- `arg1` (`java.util.List<ro.sync.contentcompletion.xml.ContextElement>`)

**Returns:** `void`

### `clone()`

**Returns:** `java.lang.Object`

### `setIdValuesList(List<IDValue> arg0)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.xml.parser.IDValue>`)

**Returns:** `void`

### `getIdValuesList()`

**Returns:** `java.util.List<ro.sync.xml.parser.IDValue>`

### `getSystemID()`

**Returns:** `java.lang.String`

### `computeContextXPathExpression()`

**Returns:** `java.lang.String`

### `getDefaultAttributeValue(ContextElement arg0, String arg1)`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.ContextElement`](./ContextElement.md))
- `arg1` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getProxyNamespaceMapping(Context arg0)`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.Context`](./Context.md))

**Returns:** `java.lang.String[]`

### `equals(Object arg0)`

**Parameters:**
- `arg0` (`java.lang.Object`)

**Returns:** `boolean`

### `toString()`

**Returns:** `java.lang.String`

