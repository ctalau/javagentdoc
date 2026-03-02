# Interface: `ConversionProvider`

**Package:** [`ro.sync.net.protocol.convert`](README.md)

**Fully Qualified Name:** `ro.sync.net.protocol.convert.ConversionProvider`

## Description

## Methods

### `convert(String systemID, String originalSourceSystemID, InputStream is, OutputStream os, LinkedHashMap<String,String> properties)`

**Parameters:**
- `systemID` (`java.lang.String`): The entire URL string.
- `originalSourceSystemID` (`java.lang.String`): The original source system ID
- `is` (`java.io.InputStream`): The input source. The converter should not attempt to close it.
- `os` (`java.io.OutputStream`): The output source The converter should not attempt to close it.
- `properties` (`java.util.LinkedHashMap<java.lang.String,java.lang.String>`): The map of properties.

**Returns:** `void`

