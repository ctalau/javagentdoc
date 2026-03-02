# Class: `TransformOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.TransformOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `CURRENT_ELEMENT_LOCATION`

**Type:** `java.lang.String`

This can be accessed in the script to perform context sensitive actions.

### `ACTION_REPLACE`

**Type:** `java.lang.String`

### `ACTION_AT_CARET`

**Type:** `java.lang.String`

### `ACTION_INSERT_BEFORE`

**Type:** `java.lang.String`

### `ACTION_INSERT_AFTER`

**Type:** `java.lang.String`

### `ACTION_INSERT_AS_FIRST_CHILD`

**Type:** `java.lang.String`

### `ACTION_INSERT_AS_LAST_CHILD`

**Type:** `java.lang.String`

### `CARET_POSITION_PRESERVE`

**Type:** `java.lang.String`

### `CARET_POSITION_BEFORE`

**Type:** `java.lang.String`

### `CARET_POSITION_START`

**Type:** `java.lang.String`

### `CARET_POSITION_EDITABLE`

**Type:** `java.lang.String`

### `CARET_POSITION_END`

**Type:** `java.lang.String`

### `CARET_POSITION_AFTER`

**Type:** `java.lang.String`

### `ARGUMENT_XPATH_SOURCE`

**Type:** `java.lang.String`

Empty/null for the current element.
 The value is `sourceLocation`.

### `ARGUMENT_XPATH_TARGET`

**Type:** `java.lang.String`

This target is the reference for the action that will be executed with 
 the transformation result.
 Empty/null for the current node.
 The value is `targetLocation`.

### `ARGUMENT_SCRIPT`

**Type:** `java.lang.String`

The value is `script`.

### `ARGUMENT_ACTION`

**Type:** `java.lang.String`

The value is `action`.

### `ARGUMENT_CARET_POSITION`

**Type:** `java.lang.String`

The value is `caretPosition`.

### `ARGUMENT_EXPAND_EDITOR_VARIABLES`

**Type:** `java.lang.String`

`true` by default 
 The value is `expandEditorVariables`.

### `ARGUMENT_SUSPEND_TRACK_CHANGES`

**Type:** `java.lang.String`

When the values is `true`, the "Track Changes" action will be disabled, user's action is 
 executed and the Track Changes state is restored to it's initial value.

### `ARGUMENT_ALWAYS_PRESERVE_TRACKED_CHANGES_BEFORE_PROCCESSING`

**Type:** `java.lang.String`

### `ARGUMENT_ESCAPE_ENTITY_REFS`

**Type:** `java.lang.String`

### `ARGUMENT_SCRIPT_PARAMETERS`

**Type:** `java.lang.String`

Pairs key=value separated by comma or new line.

### `SPLITTER_ON_COMMA_OR_END_LINE`

**Type:** `com.google.common.base.Splitter`

### `SPLITTER_ON_EQUALS`

**Type:** `com.google.common.base.Splitter`

### `externalArguments`

**Type:** `java.util.Map`

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

## Constructors

### `<init>()`

## Methods

### `doOperation(AuthorAccess authorAccess, ArgumentsMap args)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

**Returns:** `void`

### `canTreatAsScript(String script)`

**Parameters:**
- `script` (`java.lang.String`): The value of the script parameter.

**Returns:** `boolean`

### `createTransformer(AuthorAccess authorAccess, Source scriptSrc)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to different Author resources.
- `scriptSrc` (`javax.xml.transform.Source`): The XSLT or XQuery script.

**Returns:** `javax.xml.transform.Transformer`

### `createTransformer(AuthorAccess authorAccess, Source scriptSrc, ElementLocationPath location)`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md)): Access to different Author resources.
- `scriptSrc` (`javax.xml.transform.Source`): The XSLT or XQuery script.
- `location` ([`ro.sync.ecss.extensions.commons.operations.ElementLocationPath`](./ElementLocationPath.md)): The location of the "current" element.

**Returns:** `javax.xml.transform.Transformer`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

