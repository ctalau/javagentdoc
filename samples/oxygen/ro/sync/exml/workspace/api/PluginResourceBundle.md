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

### `getMessage(String messageKey)`

As a fallback if a message is not found the key value is returned.

**Parameters:**
- `messageKey` (`java.lang.String`): The key of the message which is accessed.
   In the following translation XML sample, the "messageKey" that you can be used
   to get the message translation is "key_name": 
   
   
  
  ```
  
   
   <?xml version="1.0" encoding="UTF-8"?>
   <translation>
       <languageList>
         <language description="English US" lang="en_US"/>
         <language description="German" lang="de_DE"/>
         <language description="French" lang="fr_FR"/>
      </languageList>
      <key value="key_name1">
         <comment>key description1</comment>
        <val lang="en_US">en_US_translation1</val>
        <val lang="de_DE">de_DE_translation1</val>
        <val lang="fr_FR">fr_FR_translation1</val>
    </key>
     <key value="key_name2">
         <comment>key description2</comment>
        <val lang="en_US">en_US_translation2</val>
        <val lang="de_DE">de_DE_translation2</val>
        <val lang="fr_FR">fr_FR_translation2</val>
    </key>
    ........................
   </translation>
   
   
  
  ```

**Returns:** `java.lang.String`

### `hasMessage(String messageKey)`

**Parameters:**
- `messageKey` (`java.lang.String`): The message key

**Returns:** `boolean`

