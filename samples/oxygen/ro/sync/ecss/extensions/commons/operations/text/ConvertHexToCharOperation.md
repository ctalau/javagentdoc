# Class: `ConvertHexToCharOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations.text`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.text.ConvertHexToCharOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../../api/AuthorOperation.md)

## Description

Note that the longest valid hexadecimal sequence will be converted and the length of that sequence 
 is less or equal than 4, excluding the hexadecimal prefix such as **'0x'** or **'0X'** 
 which could precede that sequence or not.
 It also works on selected text consisting of valid hexadecimal characters (max 6, including prefix).

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `MAX_NUMBER_OF_HEX_DIGITS_TO_CONVERT`

**Type:** `int`

## Constructors

### `<init>()`

## Methods

### `doOperation([`ro.sync.ecss.extensions.api.AuthorAccess`](../../../api/AuthorAccess.md) authorAccess, [`ro.sync.ecss.extensions.api.ArgumentsMap`](../../../api/ArgumentsMap.md) args)`

**Returns:** `void`

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

### `getErrorMessage()`

**Returns:** `java.lang.String`

