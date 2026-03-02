# Class: `CIValue`

**Package:** [`ro.sync.contentcompletion.xml`](README.md)

**Fully Qualified Name:** `ro.sync.contentcompletion.xml.CIValue`

**Implements:** `java.lang.Comparable<ro.sync.contentcompletion.xml.CIValue>`

## Fields

### `value`

**Type:** `java.lang.String`

### `listValue`

**Type:** `boolean`

### `defaultValue`

**Type:** `boolean`

### `annotation`

**Type:** `java.lang.String`

### `afterInsertCaretPosition`

**Type:** `int`

### `TYPE_PLAIN`

**Type:** `int`

### `TYPE_XSLT_AXIS`

**Type:** `int`

### `TYPE_XSLT_FUNCTION`

**Type:** `int`

### `TYPE_XSLT_ELEMENT`

**Type:** `int`

### `TYPE_XSLT_ATTRIBUTE`

**Type:** `int`

### `TYPE_FOLDER`

**Type:** `int`

### `TYPE_FILE_NAME`

**Type:** `int`

### `TYPE_UNKNOWN`

**Type:** `int`

### `TYPE_ANT_PROPERTY`

**Type:** `int`

### `TYPE_ANT_TARGET`

**Type:** `int`

### `TYPE_ANT_EXTENSION_POINT`

**Type:** `int`

### `TYPE_ANT_REFERENCE`

**Type:** `int`

### `TYPE_XSLT_PARAM`

**Type:** `int`

### `TYPE_XSLT_MODE`

**Type:** `int`

### `TYPE_XSLT_TEMPLATE`

**Type:** `int`

### `TYPE_XSLT_KEY`

**Type:** `int`

### `TYPE_XSLT_OUTPUT`

**Type:** `int`

### `TYPE_XSLT_ATTRIBUTE_SET`

**Type:** `int`

### `TYPE_XSLT_CHARACTER_MAP`

**Type:** `int`

### `TYPE_XSLT_VARIABLE`

**Type:** `int`

### `TYPE_XSD_COMPLEX_TYPE`

**Type:** `int`

### `TYPE_XSD_SIMPLE_TYPE`

**Type:** `int`

### `TYPE_XSD_ATTRIBUTE`

**Type:** `int`

### `TYPE_XSD_ATTRIBUTE_GROUP`

**Type:** `int`

### `TYPE_XSD_ELEMENT`

**Type:** `int`

### `TYPE_XSD_NOTATION`

**Type:** `int`

### `TYPE_XSD_GROUP`

**Type:** `int`

### `TYPE_XSD_SIMPLE_OR_COMPLEX_TYPE`

**Type:** `int`

### `TYPE_WSDL_PORT_TYPE_OPERATION`

**Type:** `int`

### `TYPE_WSDL_PORT_TYPE`

**Type:** `int`

### `TYPE_WSDL_MESSAGE`

**Type:** `int`

### `TYPE_WSDL_OPERATION_INPUT`

**Type:** `int`

### `TYPE_WSDL_OPERATION_OUTPUT`

**Type:** `int`

### `TYPE_WSDL_OPERATION_FAULT`

**Type:** `int`

### `TYPE_WSDL_BINDING`

**Type:** `int`

### `TYPE_WSDL_MESSAGE_PART`

**Type:** `int`

### `TYPE_XSD_CONSTRAINT`

**Type:** `int`

### `TYPE_SCH_VARIABLE`

**Type:** `int`

### `TYPE_SCH_DIAGNOSTIC`

**Type:** `int`

### `TYPE_SCH_PATTERN`

**Type:** `int`

### `TYPE_SCH_PHASE`

**Type:** `int`

### `TYPE_SCH_RULE`

**Type:** `int`

### `TYPE_XSLT_LOCAL_PARAM`

**Type:** `int`

### `TYPE_XSLT_LOCAL_VARIABLE`

**Type:** `int`

### `TYPE_SCH_PROPERTY`

**Type:** `int`

### `TYPE_OXYGEN_XPATH_FUNCTION`

**Type:** `int`

### `TYPE_XSLT_ACCUMULATOR`

**Type:** `int`

### `TYPE_AI_POSITRON_FUNCTION`

**Type:** `int`

### `type`

**Type:** `int`

### `insertString`

**Type:** `java.lang.String`

## Constructors

### `<init>(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

### `<init>(java.lang.String arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

### `<init>(java.lang.String arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `<init>(java.lang.String arg0, java.lang.String arg1, int arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`int`)

### `<init>(java.lang.String arg0, boolean arg1, java.lang.String arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)
- `arg2` (`java.lang.String`)

### `<init>(java.lang.String arg0, boolean arg1, java.lang.String arg2, boolean arg3)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)
- `arg2` (`java.lang.String`)
- `arg3` (`boolean`)

### `<init>(java.lang.String arg0, boolean arg1, java.lang.String arg2, java.lang.String arg3, int arg4)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`int`)

### `<init>(java.lang.String arg0, boolean arg1, java.lang.String arg2, java.lang.String arg3, int arg4, boolean arg5)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`int`)
- `arg5` (`boolean`)

### `<init>(java.lang.String arg0, boolean arg1, java.lang.String arg2, java.lang.String arg3, int arg4, boolean arg5, int arg6)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`int`)
- `arg5` (`boolean`)
- `arg6` (`int`)

### `<init>(java.lang.String arg0, ro.sync.contentcompletion.xml.CIValue arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` ([`ro.sync.contentcompletion.xml.CIValue`](./CIValue.md))

## Methods

### `getValue()`

**Returns:** `java.lang.String`

### `isListValue()`

**Returns:** `boolean`

### `setListValue()`

**Returns:** `void`

### `getAnnotation()`

**Returns:** `java.lang.String`

### `getAnnotationAsPlainText()`

**Returns:** `java.lang.String`

### `setAnnotation(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getCIValues(java.util.Collection<java.lang.String> arg0)`

**Parameters:**
- `arg0` (`java.util.Collection<java.lang.String>`)

**Returns:** [`ro.sync.contentcompletion.xml.CIValue[]`](./CIValue.md)

### `getCIValues(java.util.Collection<java.lang.String> arg0, int arg1)`

**Parameters:**
- `arg0` (`java.util.Collection<java.lang.String>`)
- `arg1` (`int`)

**Returns:** [`ro.sync.contentcompletion.xml.CIValue[]`](./CIValue.md)

### `getCIValues(java.util.Collection<java.lang.String> arg0, int arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.util.Collection<java.lang.String>`)
- `arg1` (`int`)
- `arg2` (`boolean`)

**Returns:** [`ro.sync.contentcompletion.xml.CIValue[]`](./CIValue.md)

### `getCIValues(java.util.Collection<java.lang.String> arg0, int arg1, boolean arg2, boolean arg3)`

**Parameters:**
- `arg0` (`java.util.Collection<java.lang.String>`)
- `arg1` (`int`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)

**Returns:** [`ro.sync.contentcompletion.xml.CIValue[]`](./CIValue.md)

### `getCIFromIDValues(java.util.Collection<ro.sync.xml.parser.IDValue> arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.util.Collection<ro.sync.xml.parser.IDValue>`)
- `arg1` (`boolean`)

**Returns:** [`ro.sync.contentcompletion.xml.CIValue[]`](./CIValue.md)

### `getCIValuesAsList(java.util.Collection<java.lang.String> arg0)`

**Parameters:**
- `arg0` (`java.util.Collection<java.lang.String>`)

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `getCIValuesAsList(java.util.Collection<java.lang.String> arg0, java.lang.String arg1)`

**Parameters:**
- `arg0` (`java.util.Collection<java.lang.String>`)
- `arg1` (`java.lang.String`)

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `getCIValuesAsList(java.util.Collection<java.lang.String> arg0, java.lang.String arg1, int arg2)`

**Parameters:**
- `arg0` (`java.util.Collection<java.lang.String>`)
- `arg1` (`java.lang.String`)
- `arg2` (`int`)

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `equals(java.lang.Object arg0)`

**Parameters:**
- `arg0` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `isDefaultValue()`

**Returns:** `boolean`

### `setDefaultValue()`

**Returns:** `void`

### `toString()`

**Returns:** `java.lang.String`

### `compareTo(ro.sync.contentcompletion.xml.CIValue arg0)`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.CIValue`](./CIValue.md))

**Returns:** `int`

### `isUsedInURLAnchors()`

**Returns:** `boolean`

### `getInsertString()`

**Returns:** `java.lang.String`

### `setInsertString(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getType()`

**Returns:** `int`

### `valueOf(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.Object`

### `getAfterInsertCaretPosition()`

**Returns:** `int`

### `setAfterInsertCaretPosition(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `void`

### `setValue(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setType(int arg0)`

**Parameters:**
- `arg0` (`int`)

**Returns:** `void`

