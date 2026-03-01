# Interface: `PluginResourceBundle`

**Package:** [`ro.sync.exml.workspace.api`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.PluginResourceBundle`

## Description

The translation file must be located in a directory named "i18n", placed in the plugin's root directory.
 The translation file name must be: **translation*.xml** 
 Here is a small sample of an translation XML file structure: 
 
 

```

 
 <?xml version="1.0" encoding="UTF-8"?>
 <translation>
    <key value="key_name">
       <comment>key description</comment>
      <val lang="en_US">en_US_translation</val>
      <val lang="de_DE">de_DE_translation</val>
      <val lang="fr_FR">fr_FR_translation</val>
      <val lang="ja_JP">ja_JP_translation</val>
      <val lang="nl_NL">nl_NL_translation</val>
  </key>
 </translation>
 
 

```

## Methods

### `getMessage(`java.lang.String` messageKey)`

**Returns:** `java.lang.String`

As a fallback if a message is not found the key value is returned.

### `hasMessage(`java.lang.String` messageKey)`

**Returns:** `boolean`

