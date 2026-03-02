# Interface: `AuthorResourceBundle`

**Package:** [`ro.sync.ecss.extensions.api`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.AuthorResourceBundle`

## Description

The translation files should all be located in a separate directory (usually named "i18n") in the specific framework's directory.
 This particular "i18n" directory should be explicitly added to the document type's class path list in the Document Type Edit dialog. 
 
 Their names should be formatted like this:
 
 **translation*.xml**
 
 Only one translation file will be used to translate the keys to values.
 
 How is this translation file detected?
 
 The first file which matches the same GUI language that Oxygen uses in the Preferences will be used.
 If no such file exists, the first encountered translation will be used.
 If no such file exists, the methods will return the same key which is given for translation.

## Methods

### `getMessage(java.lang.String key)`

**Parameters:**
- `key` (`java.lang.String`): The key for the desired string

**Returns:** `java.lang.String`

### `composeMessage(java.lang.String descriptionWithEditorVariables)`

The key contains "${i18n(key)}" editor variables which will be expanded.

**Parameters:**
- `descriptionWithEditorVariables` (`java.lang.String`): the key for the desired string.
   
   Example:
   
   The description: '${i18n(key1)} and ${i18n(key2)}' will be composed to:
   'value1 and value2' where 'value1' is obtained by calling getMessage('key1').

**Returns:** `java.lang.String`

