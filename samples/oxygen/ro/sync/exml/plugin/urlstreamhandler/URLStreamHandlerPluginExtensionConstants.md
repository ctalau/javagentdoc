# Interface: `URLStreamHandlerPluginExtensionConstants`

**Package:** [`ro.sync.exml.plugin.urlstreamhandler`](README.md)

**Fully Qualified Name:** `ro.sync.exml.plugin.urlstreamhandler.URLStreamHandlerPluginExtensionConstants`

## Description

## Fields

### `LOCATION_HEADER`

**Type:** `java.lang.String`

When saving the content through an URLConnection you can set the "location" header field
 to a specific value. Together with the "oxygen-action" header field value, this will instruct 
 Oxygen to refresh the editor content from the specified location or to close the editor,
 after performing the save operation.

### `OXYGEN_ACTION_HEADER`

**Type:** `java.lang.String`

Use case: After saving content to certain CMSs, the content may be changed by the CMS or even
 the location can be relocated. After closing the output stream, Oxygen will check the header
 keys of the URLConnection for the "location" and "oxygen-action" keys.
 If the "oxygen-action" key is found and the value is a supported one: "reload" or "close"
 values, Oxygen will act accordingly.

### `ADVICE_RELOAD`

**Type:** `java.lang.String`

### `ADVICE_CLOSE`

**Type:** `java.lang.String`

### `OXYGEN_READ_ONLY_HEADER`

**Type:** `java.lang.String`

### `OXYGEN_READ_ONLY_REASON_HEADER`

**Type:** `java.lang.String`

### `OXYGEN_READ_ONLY_REASON_CODE_HEADER`

**Type:** `java.lang.String`

### `OXYGEN_SAVE_TYPE`

**Type:** `java.lang.String`

If absent, a normal save was 
 performed.

### `SAVE_AS`

**Type:** `java.lang.String`

### `SAVE_AUTO`

**Type:** `java.lang.String`

