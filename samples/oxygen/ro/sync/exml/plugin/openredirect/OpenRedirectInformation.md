# Class: `OpenRedirectInformation`

**Package:** [`ro.sync.exml.plugin.openredirect`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.openredirect.OpenRedirectInformation`

**Implements:** `ro.sync.basic.contenttypes.ContentTypes`

## Description

## Fields

### `contentType`

**Type:** `java.lang.String`

### `url`

**Type:** `java.net.URL`

## Constructors

### `<init>(java.net.URL url, java.lang.String contentType)`

**Parameters:**
- `url` (`java.net.URL`): The URL to open
- `contentType` (`java.lang.String`): The content type to open as. Can be null for auto open.
 The content type can either be null (and Oxygen will do the default detection) or one of the constant values defined in this class like:
 
 

  - application/zip - To open in the Archive Browser
 
  - application/ditamap - To open in the DITA Maps Manager
 
  - application/image - To open in the Image Previewer
 
  - text/xml - To open in the XML editor

  - text/css - To open in the CSS editor

  - ...

 


## Methods

### `getContentType()`

**Returns:** `java.lang.String`

### `getUrl()`

**Returns:** `java.net.URL`

