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

### `detectXMLLangFrom(AuthorNode parent)`

**Parameters:**
- `parent` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../../api/node/AuthorNode.md)): The current node.

**Returns:** `java.lang.String`

### `parseXsdDatetime(AuthorOperationException[] error, String dateString)`

**Parameters:**
- `error` ([`ro.sync.ecss.extensions.api.AuthorOperationException[]`](../../api/AuthorOperationException.md)): The errors array.
- `dateString` (`java.lang.String`): The string representing a date.

**Returns:** `java.util.Date`

### `parseDate(AuthorOperationException[] error, String dateString, DateFormat dateTimeFormatter, DateFormat dateFormatter, DateFormat timeFormatter)`

**Parameters:**
- `error` ([`ro.sync.ecss.extensions.api.AuthorOperationException[]`](../../api/AuthorOperationException.md)): The errors array.
- `dateString` (`java.lang.String`): The string representing a date.
- `dateTimeFormatter` (`java.text.DateFormat`): The date time formatter.
- `dateFormatter` (`java.text.DateFormat`): The date formatter.
- `timeFormatter` (`java.text.DateFormat`): The time formatter.

**Returns:** `java.util.Date`

### `parseNumber(AuthorOperationException[] error, String number)`

**Parameters:**
- `error` ([`ro.sync.ecss.extensions.api.AuthorOperationException[]`](../../api/AuthorOperationException.md)): The errors array.
- `number` (`java.lang.String`): The string representing a number.

**Returns:** `java.lang.Double`

