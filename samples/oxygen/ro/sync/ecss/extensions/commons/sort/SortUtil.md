# Class: `SortUtil`

**Package:** [`ro.sync.ecss.extensions.commons.sort`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.sort.SortUtil`

## Description

## Fields

### `LOGGER`

**Type:** `org.slf4j.Logger`

## Constructors

### `<init>()`

## Methods

### `detectXMLLangFrom(ro.sync.ecss.extensions.api.node.AuthorNode parent)`

**Returns:** `java.lang.String`

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The current node.

### `parseXsdDatetime(ro.sync.ecss.extensions.api.AuthorOperationException[] error, java.lang.String dateString)`

**Returns:** `java.util.Date`

**Parameters:**
- `error` ([`ro.sync.ecss.extensions.api.AuthorOperationException[]`](../../api/AuthorOperationException.md)): The errors array.
- `dateString` (`java.lang.String`): The string representing a date.

### `parseDate(ro.sync.ecss.extensions.api.AuthorOperationException[] error, java.lang.String dateString, java.text.DateFormat dateTimeFormatter, java.text.DateFormat dateFormatter, java.text.DateFormat timeFormatter)`

**Returns:** `java.util.Date`

**Parameters:**
- `error` ([`ro.sync.ecss.extensions.api.AuthorOperationException[]`](../../api/AuthorOperationException.md)): The errors array.
- `dateString` (`java.lang.String`): The string representing a date.
- `dateTimeFormatter` (`java.text.DateFormat`): The date time formatter.
- `dateFormatter` (`java.text.DateFormat`): The date formatter.
- `timeFormatter` (`java.text.DateFormat`): The time formatter.

### `parseNumber(ro.sync.ecss.extensions.api.AuthorOperationException[] error, java.lang.String number)`

**Returns:** `java.lang.Double`

**Parameters:**
- `error` ([`ro.sync.ecss.extensions.api.AuthorOperationException[]`](../../api/AuthorOperationException.md)): The errors array.
- `number` (`java.lang.String`): The string representing a number.

