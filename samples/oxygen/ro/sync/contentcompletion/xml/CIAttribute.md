# Class: `CIAttribute`

**Package:** [`ro.sync.contentcompletion.xml`](README.md)

**Fully Qualified Name:** `ro.sync.contentcompletion.xml.CIAttribute`

**Implements:** `java.lang.Comparable<ro.sync.contentcompletion.xml.CIAttribute>`, [`ro.sync.contentcompletion.xml.NodeDescription`](./NodeDescription.md), `java.lang.Cloneable`

## Fields

### `namespace`

**Type:** `java.lang.String`

### `declareXmlns`

**Type:** `boolean`

### `prefix`

**Type:** `java.lang.String`

### `name`

**Type:** `java.lang.String`

### `defaultValue`

**Type:** `java.lang.String`

### `required`

**Type:** `boolean`

### `possibleValues`

**Type:** `java.util.List<java.lang.String>`

### `fixed`

**Type:** `boolean`

### `editableState`

**Type:** `ro.sync.contentcompletion.xml.CIAttribute.EditableState`

### `modelDescription`

**Type:** `java.lang.String`

### `facetLengthValue`

**Type:** `java.lang.String`

### `facetMinLengthValue`

**Type:** `java.lang.String`

### `facetMaxLengthValue`

**Type:** `java.lang.String`

### `facetWhitespaceValue`

**Type:** `java.lang.String`

### `facetMinInclusiveValue`

**Type:** `java.lang.String`

### `facetMinExclusiveValue`

**Type:** `java.lang.String`

### `facetMaxInclusiveValue`

**Type:** `java.lang.String`

### `facetMaxExclusiveValue`

**Type:** `java.lang.String`

### `facetTotalDigitsValue`

**Type:** `java.lang.String`

### `facetFractionDigitsValue`

**Type:** `java.lang.String`

### `facetsPattern`

**Type:** `java.lang.String`

### `annotation`

**Type:** `java.lang.String`

### `facetAssertions`

**Type:** `java.lang.String`

### `openContentMode`

**Type:** `java.lang.String`

### `openContentWildcardDescription`

**Type:** `java.lang.String`

### `defaultValueProvider`

**Type:** `ro.sync.contentcompletion.xml.CIAttribute._b`

## Constructors

### `<init>()`

### `<init>(java.lang.String arg0, boolean arg1, boolean arg2, java.lang.String arg3, java.util.List<java.lang.String> arg4)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)
- `arg2` (`boolean`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.util.List<java.lang.String>`)

### `<init>(java.lang.String arg0, java.lang.String arg1, boolean arg2, boolean arg3, java.lang.String arg4, java.util.List<java.lang.String> arg5)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)
- `arg3` (`boolean`)
- `arg4` (`java.lang.String`)
- `arg5` (`java.util.List<java.lang.String>`)

## Methods

### `getEditableState()`

**Returns:** `ro.sync.contentcompletion.xml.CIAttribute.EditableState`

### `setEditableState(ro.sync.contentcompletion.xml.CIAttribute.EditableState arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.contentcompletion.xml.CIAttribute.EditableState`)

### `isFixed()`

**Returns:** `boolean`

### `getName()`

**Returns:** `java.lang.String`

### `setName(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getNamespace()`

**Returns:** `java.lang.String`

### `isRequired()`

**Returns:** `boolean`

### `getDefaultValue()`

**Returns:** `java.lang.String`

### `hasDefaultValue()`

**Returns:** `boolean`

### `getPossibleValues()`

**Returns:** `java.util.List<java.lang.String>`

### `equals(java.lang.Object arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.Object`)

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `compareTo(ro.sync.contentcompletion.xml.CIAttribute arg0)`

**Returns:** `int`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.CIAttribute`](./CIAttribute.md))

### `getFacetFractionDigitsValue()`

**Returns:** `java.lang.String`

### `setFacetFractionDigitsValue(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getFacetLengthValue()`

**Returns:** `java.lang.String`

### `setFacetLengthValue(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getFacetMaxExclusiveValue()`

**Returns:** `java.lang.String`

### `setFacetMaxExclusiveValue(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getFacetMaxInclusiveValue()`

**Returns:** `java.lang.String`

### `setFacetMaxInclusiveValue(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getFacetMaxLengthValue()`

**Returns:** `java.lang.String`

### `setFacetMaxLengthValue(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getFacetMinExclusiveValue()`

**Returns:** `java.lang.String`

### `setFacetMinExclusiveValue(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getFacetMinInclusiveValue()`

**Returns:** `java.lang.String`

### `setFacetMinInclusiveValue(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getFacetMinLengthValue()`

**Returns:** `java.lang.String`

### `setFacetMinLengthValue(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getFacetTotalDigitsValue()`

**Returns:** `java.lang.String`

### `setFacetTotalDigitsValue(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getFacetWhitespaceValue()`

**Returns:** `java.lang.String`

### `setFacetWhitespaceValue(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getFacetPattern()`

**Returns:** `java.lang.String`

### `setFacetPattern(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getModelDescription()`

**Returns:** `java.lang.String`

### `setModelDescription(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `setDefaultValue(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `setOverridingDefaultValueProvider(ro.sync.contentcompletion.xml.CIAttribute._b arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.contentcompletion.xml.CIAttribute._b`)

### `setPossiblesValues(java.util.List<java.lang.String> arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.util.List<java.lang.String>`)

### `setRequired(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `setNamespace(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `setFixed(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `getAnnotation()`

**Returns:** `java.lang.String`

### `setAnnotation(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `isDeclareXmlns()`

**Returns:** `boolean`

### `setDeclareXmlns(boolean arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)

### `getPrefix()`

**Returns:** `java.lang.String`

### `setPrefix(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `setAssertions(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getAssertions()`

**Returns:** `java.lang.String`

### `setOpenContentMode(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getOpenContentMode()`

**Returns:** `java.lang.String`

### `setOpenContentWildcardDescription(java.lang.String arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getOpenContentWildcardDescription()`

**Returns:** `java.lang.String`

### `isAttributeNameQualified()`

**Returns:** `boolean`

### `clone()`

**Returns:** `java.lang.Object`

