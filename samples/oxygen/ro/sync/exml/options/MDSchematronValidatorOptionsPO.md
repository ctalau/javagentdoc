# Class: `MDSchematronValidatorOptionsPO`

**Package:** [`ro.sync.exml.options`](README.md)

**Fully Qualified Name:** `ro.sync.exml.options.MDSchematronValidatorOptionsPO`

**Implements:** `ro.sync.options.PersistentObject`

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `mdValidatorOptions`

**Type:** `ro.sync.options.SerializableLinkedHashMap<java.lang.String,ro.sync.exml.options.MDSchematronValidatorTypeOptionsPO>`

## Constructors

### `<init>()`

### `<init>(boolean arg0)`

**Parameters:**
- `arg0` (`boolean`)

## Methods

### `addValidatorTypeOptions(ro.sync.exml.validate.scanners.f.c arg0, ro.sync.exml.options.MDSchematronValidatorTypeOptionsPO arg1)`

**Parameters:**
- `arg0` (`ro.sync.exml.validate.scanners.f.c`)
- `arg1` ([`ro.sync.exml.options.MDSchematronValidatorTypeOptionsPO`](./MDSchematronValidatorTypeOptionsPO.md))

**Returns:** `void`

### `getValidatorTypeOptions(ro.sync.exml.validate.scanners.f.c arg0)`

**Parameters:**
- `arg0` (`ro.sync.exml.validate.scanners.f.c`)

**Returns:** [`ro.sync.exml.options.MDSchematronValidatorTypeOptionsPO`](./MDSchematronValidatorTypeOptionsPO.md)

### `checkValid()`

**Returns:** `void`

### `getNotPersistentFieldNames()`

**Returns:** `java.lang.String[]`

### `clone()`

**Returns:** `java.lang.Object`

