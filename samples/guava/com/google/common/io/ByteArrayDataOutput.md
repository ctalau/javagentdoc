# Interface: `ByteArrayDataOutput`

**Package:** [`com.google.common.io`](README.md)

**Fully Qualified Name:** `com.google.common.io.ByteArrayDataOutput`

**Extends:** [`java.io.DataOutput`](../../../../java/io/DataOutput.md)

## Description

An extension of {@code DataOutput} for writing to in-memory byte arrays; its methods offer
 identical functionality but do not throw {@link IOException}.
@author Jayaprabhakar Kadarkarai
@since 1.0

## Methods

### `write(`int` b)`

**Returns:** `void`

### `write(`byte[]` b)`

**Returns:** `void`

### `write(`byte[]` b, `int` off, `int` len)`

**Returns:** `void`

### `writeBoolean(`boolean` v)`

**Returns:** `void`

### `writeByte(`int` v)`

**Returns:** `void`

### `writeShort(`int` v)`

**Returns:** `void`

### `writeChar(`int` v)`

**Returns:** `void`

### `writeInt(`int` v)`

**Returns:** `void`

### `writeLong(`long` v)`

**Returns:** `void`

### `writeFloat(`float` v)`

**Returns:** `void`

### `writeDouble(`double` v)`

**Returns:** `void`

### `writeChars(`java.lang.String` s)`

**Returns:** `void`

### `writeUTF(`java.lang.String` s)`

**Returns:** `void`

### `writeBytes(`java.lang.String` s)`

**Returns:** `void`

@deprecated This method is dangerous as it discards the high byte of every character. For
     UTF-8, use {@code write(s.getBytes(StandardCharsets.UTF_8))}.

### `toByteArray()`

**Returns:** `byte[]`

Returns the contents that have been written to this instance, as a byte array.

