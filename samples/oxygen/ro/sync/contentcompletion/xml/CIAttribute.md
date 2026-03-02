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

**Parameters:**
- `arg0` (`ro.sync.contentcompletion.xml.CIAttribute.EditableState`)

**Returns:** `void`

### `isFixed()`

**Returns:** `boolean`

### `getName()`

**Returns:** `java.lang.String`

### `setName(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

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

**Parameters:**
- `arg0` (`java.lang.Object`)

**Returns:** `boolean`

### `hashCode()`

**Returns:** `int`

### `toString()`

**Returns:** `java.lang.String`

### `compareTo(ro.sync.contentcompletion.xml.CIAttribute arg0)`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.CIAttribute`](./CIAttribute.md))

**Returns:** `int`

### `getFacetFractionDigitsValue()`

**Returns:** `java.lang.String`

### `setFacetFractionDigitsValue(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getFacetLengthValue()`

**Returns:** `java.lang.String`

### `setFacetLengthValue(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getFacetMaxExclusiveValue()`

**Returns:** `java.lang.String`

### `setFacetMaxExclusiveValue(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getFacetMaxInclusiveValue()`

**Returns:** `java.lang.String`

### `setFacetMaxInclusiveValue(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getFacetMaxLengthValue()`

**Returns:** `java.lang.String`

### `setFacetMaxLengthValue(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getFacetMinExclusiveValue()`

**Returns:** `java.lang.String`

### `setFacetMinExclusiveValue(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getFacetMinInclusiveValue()`

**Returns:** `java.lang.String`

### `setFacetMinInclusiveValue(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getFacetMinLengthValue()`

**Returns:** `java.lang.String`

### `setFacetMinLengthValue(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getFacetTotalDigitsValue()`

**Returns:** `java.lang.String`

### `setFacetTotalDigitsValue(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getFacetWhitespaceValue()`

**Returns:** `java.lang.String`

### `setFacetWhitespaceValue(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getFacetPattern()`

**Returns:** `java.lang.String`

### `setFacetPattern(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getModelDescription()`

**Returns:** `java.lang.String`

### `setModelDescription(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setDefaultValue(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setOverridingDefaultValueProvider(ro.sync.contentcompletion.xml.CIAttribute._b arg0)`

**Parameters:**
- `arg0` (`ro.sync.contentcompletion.xml.CIAttribute._b`)

**Returns:** `void`

### `setPossiblesValues(java.util.List<java.lang.String> arg0)`

**Parameters:**
- `arg0` (`java.util.List<java.lang.String>`)

**Returns:** `void`

### `setRequired(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `setNamespace(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setFixed(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `getAnnotation()`

**Returns:** `java.lang.String`

### `setAnnotation(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `isDeclareXmlns()`

**Returns:** `boolean`

### `setDeclareXmlns(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

**Returns:** `void`

### `getPrefix()`

**Returns:** `java.lang.String`

### `setPrefix(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `setAssertions(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getAssertions()`

**Returns:** `java.lang.String`

### `setOpenContentMode(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getOpenContentMode()`

**Returns:** `java.lang.String`

### `setOpenContentWildcardDescription(java.lang.String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `void`

### `getOpenContentWildcardDescription()`

**Returns:** `java.lang.String`

### `isAttributeNameQualified()`

**Returns:** `boolean`

### `clone()`

**Returns:** `java.lang.Object`

