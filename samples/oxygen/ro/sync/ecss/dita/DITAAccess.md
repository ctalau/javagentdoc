# Class: `DITAAccess`

**Package:** [`ro.sync.ecss.dita`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.dita.DITAAccess`

## Fields

### `c`

**Type:** `org.slf4j.Logger`

### `e`

**Type:** `ro.sync.i18n.c`

### `IMPOSED_INSERTION_TYPE`

**Type:** `java.lang.String`

### `FULLY_QUALIFIED_KEYNAME_URL_PARAM`

**Type:** `java.lang.String`

### `REUSABLE_COMPONENT_TARGET_PATH_PARAM`

**Type:** `java.lang.String`

### `REUSABLE_COMPONENT_TARGET_QNAME_PARAM`

**Type:** `java.lang.String`

### `REUSABLE_COMPONENT_ELEMENT_CLASS_PARAM`

**Type:** `java.lang.String`

### `LINK_TYPE_WEB_PAGE`

**Type:** `java.lang.String`

### `LINK_TYPE_NON_DITA_RESOURCE`

**Type:** `java.lang.String`

### `LINK_TYPE_DITA_TOPIC`

**Type:** `java.lang.String`

### `DITA_ROOT_MAP_URL_ATTRIBUTE`

**Type:** `java.lang.String`

### `DITA_VAL_URL_ATTRIBUTE`

**Type:** `java.lang.String`

### `DITA_ROOT_MAP_KEYS_MANAGER_ATTRIBUTE`

**Type:** `java.lang.String`

### `REF_ATTRIBUTES`

**Type:** `java.lang.String[]`

### `d`

**Type:** `ro.sync.ecss.dita.k`

### `DEFAULT_CONKEYREF_CONREFEND`

**Type:** `java.lang.String`

### `KEYREF_TYPE`

**Type:** `int`

### `CONREF_TYPE`

**Type:** `int`

### `CONKEYREF_TYPE`

**Type:** `int`

### `ID_FIRST_TOPIC_ID`

**Type:** `java.lang.String`

### `ID_ANY`

**Type:** `java.lang.String`

### `INHERITANCE_GENERALIZATION`

**Type:** `int`

### `INHERITANCE_SPECIALIZATION`

**Type:** `int`

### `INHERITANCE_SAME`

**Type:** `int`

### `INHERITANCE_NONE`

**Type:** `int`

### `b`

**Type:** `boolean`

## Constructors

### `<init>()`

## Methods

### `setKeyNameGenerator([`ro.sync.ecss.dita.DITAKeyNameGenerator`](./DITAKeyNameGenerator.md) arg0)`

**Returns:** `void`

### `getKeysAttributeValueBasedOnFilename(`java.net.URL` arg0)`

**Returns:** `java.lang.String`

### `createReferencesGraph()`

**Returns:** `java.lang.Object`

### `searchReferences(`java.net.URL` arg0)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `searchReferences(`java.net.URL` arg0, `java.lang.Object` arg1)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `p(`boolean` arg0, `ro.sync.ecss.dita.reference.i` arg1, `java.lang.Object` arg2, `boolean` arg3, `ro.sync.ecss.dita.reference.g` arg4, `java.net.URL` arg5, `boolean` arg6, `java.lang.String` arg7, `ro.sync.ecss.dita.topic.ref.b` arg8, `ro.sync.contentcompletion.z` arg9, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md) arg10)`

**Returns:** `void`

### `insertTopicref([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `handleTopicRefInsertUrl([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.net.URL` arg1)`

**Returns:** `void`

### `insertTopicgroup([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `getTopicRefInfo(`java.net.URL` arg0, `java.lang.Object` arg1, `ro.sync.ecss.contentcompletion.c` arg2, `ro.sync.ecss.g.j` arg3, `int` arg4, `ro.sync.ecss.dita.topic.ref.f` arg5, `ro.sync.ecss.dita.topic.ref.c` arg6)`

**Returns:** `void`

### `getInsertTopicref(`java.net.URL` arg0, `java.lang.Object` arg1, `ro.sync.ecss.contentcompletion.c` arg2, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md) arg3, `int` arg4, `java.lang.String` arg5, `ro.sync.ecss.dita.topic.ref.c` arg6, `java.lang.String` arg7, `boolean` arg8)`

**Returns:** `void`

### `insertKeydefWithKeyword(`java.lang.Object` arg0, `ro.sync.ecss.contentcompletion.c` arg1, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md) arg2, `int` arg3, `ro.sync.ecss.dita.topic.ref.c` arg4, `boolean` arg5)`

**Returns:** `void`

### `insertKeydefWithKeyword(`java.lang.Object` arg0, `ro.sync.ecss.contentcompletion.c` arg1, [`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md) arg2, `int` arg3, `ro.sync.ecss.dita.topic.ref.c` arg4, [`ro.sync.ecss.dita.DITATopicInsertionPosition`](./DITATopicInsertionPosition.md) arg5)`

**Returns:** `void`

### `insertKeydefWithKeyword([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `insertTopichead([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `setDitaAccessCustomizer(`ro.sync.ecss.dita.k` arg0)`

**Returns:** `void`

### `getDitaAccessCustomizer()`

**Returns:** `ro.sync.ecss.dita.k`

### `hasAPIKeysManager()`

**Returns:** `boolean`

### `getAPIKeysManagerDescription()`

**Returns:** `java.lang.String`

### `editProperties(`java.net.URL` arg0, `ro.sync.ecss.contentcompletion.c` arg1, `ro.sync.ecss.g.j` arg2, [`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../extensions/api/node/AuthorElement.md) arg3, `ro.sync.ecss.dita.topic.ref.c` arg4, `java.lang.Object` arg5, `boolean` arg6)`

**Returns:** `void`

### `editProperties([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `e([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>` arg1, `int` arg2, `int` arg3)`

**Returns:** `void`

### `insertHref([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `boolean` arg4, `boolean` arg5, `java.net.URL` arg6, `boolean` arg7)`

**Returns:** `void`

### `g([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `boolean` arg4, `java.lang.String` arg5)`

**Returns:** `void`

### `d([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `boolean` arg4, `java.net.URL` arg5, `boolean` arg6)`

**Returns:** `void`

### `insertHref([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `boolean` arg4, `boolean` arg5)`

**Returns:** `void`

### `insertContentKeyReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `insertContentReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.net.URL` arg1, `boolean` arg2)`

**Returns:** `void`

### `insertTopicref([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.net.URL` arg1, `boolean` arg2)`

**Returns:** `void`

### `insertTopicref([`ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage`](../../exml/workspace/api/editor/page/ditamap/WSDITAMapEditorPage.md) arg0, `java.net.URL` arg1, `java.lang.String` arg2, `boolean` arg3, `boolean` arg4)`

**Returns:** `void`

### `insertTopicref([`ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage`](../../exml/workspace/api/editor/page/ditamap/WSDITAMapEditorPage.md) arg0, `java.net.URL` arg1, `java.lang.String` arg2, [`ro.sync.ecss.dita.DITATopicInsertionPosition`](./DITATopicInsertionPosition.md) arg3, `boolean` arg4)`

**Returns:** `void`

### `insertReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `int` arg1)`

**Returns:** `void`

### `showInsertReferenceDialog(`ro.sync.ecss.contentcompletion.c` arg0, `ro.sync.ecss.g.j` arg1, `int` arg2, `java.lang.Object` arg3, `int` arg4, `boolean` arg5, `ro.sync.ecss.dita.topic.ref.b` arg6)`

**Returns:** `void`

### `showInsertReferenceDialog(`ro.sync.ecss.contentcompletion.c` arg0, `ro.sync.ecss.g.j` arg1, `int` arg2, `java.lang.Object` arg3, `int` arg4, `boolean` arg5, `ro.sync.ecss.dita.topic.ref.b` arg6, [`ro.sync.ecss.dita.IKeyInfoFilter`](./IKeyInfoFilter.md) arg7, `boolean` arg8)`

**Returns:** `void`

### `insertReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3)`

**Returns:** `void`

### `insertReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `int` arg2, `java.lang.String` arg3, `java.lang.String` arg4)`

**Returns:** `void`

### `insertReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `int` arg1, `ro.sync.ecss.component.z` arg2, `ro.sync.ecss.contentcompletion.c` arg3, `ro.sync.ecss.dita.reference.j` arg4)`

**Returns:** `int`

### `getRootMapURL()`

**Returns:** `java.net.URL`

### `resolveKeyRef(`java.lang.String` arg0)`

**Returns:** `java.net.URL`

### `resolveKeyRef(`java.lang.String` arg0, `boolean` arg1)`

**Returns:** `java.net.URL`

### `resolveKeyRef(`java.net.URL` arg0, `java.lang.String` arg1, `boolean` arg2)`

**Returns:** `java.net.URL`

### `checkValidKeyRef(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `resolveKeyRef(`java.net.URL` arg0, `java.lang.String` arg1, [`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md) arg2, `boolean` arg3)`

**Returns:** `java.net.URL`

### `resolveKeyRefToHref(`java.net.URL` arg0, `java.lang.String` arg1, [`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md) arg2, `boolean` arg3)`

**Returns:** `java.lang.String`

### `createReusableComponent([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, [`ro.sync.ecss.extensions.api.DITAUniqueIDAssigner`](../extensions/api/DITAUniqueIDAssigner.md) arg1)`

**Returns:** `void`

### `insertReusableComponent([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `replaceAllConrefs([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `replaceConref([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `expandAllKeyrefs([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, [`ro.sync.ecss.extensions.api.link.LinkTextResolver`](../extensions/api/link/LinkTextResolver.md) arg1)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `removeReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `addEditReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `isGeneralizationOf(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `boolean`

### `getInheritanceType(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `int`

### `parseDITAHref(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

### `parseDITAHref(`java.lang.String` arg0, `java.lang.String` arg1, `boolean` arg2)`

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

### `parseDITAKeyRef(`java.lang.String` arg0)`

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

### `parseDITAKeyRef(`java.net.URL` arg0, `java.lang.String` arg1)`

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

### `parseDITAKeyRef(`java.net.URL` arg0, [`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md) arg1, `java.lang.String` arg2)`

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

### `parseDITAKeyRef(`java.lang.String` arg0, `ro.sync.ecss.dita.reference.keyref.s` arg1)`

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

### `getAutoInsertTopicRefElementName([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `int` arg1)`

**Returns:** `java.lang.String`

### `getAutoInsertTopicRefElementName([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md) arg0, `int` arg1)`

**Returns:** `java.lang.String`

### `getAutoInsertRefElementName([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `int` arg1)`

**Returns:** `java.lang.String`

### `getAutoInsertImageRefElementName([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `int` arg1)`

**Returns:** `java.lang.String`

### `getPossibleElements([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md) arg0, `int` arg1, `java.lang.String` arg2, `java.lang.String[]` arg3)`

**Returns:** [`ro.sync.contentcompletion.xml.CIElement[]`](../../contentcompletion/xml/CIElement.md)

### `getEquivalentChildCIElement([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `int` arg1, `java.lang.String` arg2)`

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../contentcompletion/xml/CIElement.md)

### `getKeys()`

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`

### `getKeys(`java.net.URL` arg0)`

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`

### `getKeysForInsertion(`java.net.URL` arg0)`

**Returns:** `java.util.List<ro.sync.ecss.dita.reference.keyref.KeyInfo>`

### `getKeys(`java.net.URL` arg0, [`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md) arg1)`

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`

### `getURLKeyScopeContexts(`java.net.URL` arg0, [`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md) arg1)`

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`

### `computeFormatForURLPasteAndDnD([`ro.sync.exml.workspace.api.util.UtilAccess`](../../exml/workspace/api/util/UtilAccess.md) arg0, `java.net.URL` arg1, [`ro.sync.ecss.extensions.api.ReferenceType`](../extensions/api/ReferenceType.md) arg2)`

**Returns:** `java.lang.String`

### `computeLinkScope(`java.net.URL` arg0, `java.net.URL` arg1)`

**Returns:** `java.lang.String`

### `pasteAsReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `boolean` arg1)`

**Returns:** `java.lang.String`

### `pasteAsReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `ro.sync.ecss.dita.DITAAccess.PasteInfo` arg1)`

**Returns:** `java.lang.String`

### `pasteClipboardFragmentsAsReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `ro.sync.ecss.dita.DITAAccess.PasteInfo` arg1, [`ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[]`](../component/AuthorDocumentFragmentClipboardObject.md) arg2)`

**Returns:** `boolean`

### `pasteClipboardFragmentsAsReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `ro.sync.ecss.dita.DITAAccess.PasteInfo` arg1, [`ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[]`](../component/AuthorDocumentFragmentClipboardObject.md) arg2, [`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](../extensions/api/SelectionInterpretationMode.md) arg3)`

**Returns:** `boolean`

### `i([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `ro.sync.ecss.strictediting.ContentDescription` arg1, `ro.sync.ecss.dita.DITAAccess.PasteInfo` arg2, `java.lang.String` arg3, `java.lang.String` arg4, `java.lang.String` arg5, `boolean` arg6, `boolean` arg7)`

**Returns:** `boolean`

### `filterAttributeValues(`java.util.List<ro.sync.contentcompletion.xml.CIValue>` arg0, [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md) arg1, `java.lang.String` arg2)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `filterAttributeValues(`java.util.List<ro.sync.contentcompletion.xml.CIValue>` arg0, [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md) arg1, `java.lang.String` arg2, [`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg3)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `filterAttributeValues(`java.util.List<ro.sync.contentcompletion.xml.CIValue>` arg0, [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md) arg1, [`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md) arg2, `java.lang.String` arg3, [`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg4)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `t(`java.util.List<ro.sync.contentcompletion.xml.CIValue>` arg0, [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md) arg1, `java.net.URL` arg2, `java.lang.String` arg3, `boolean` arg4)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `b(`java.util.List<ro.sync.contentcompletion.xml.CIValue>` arg0, `java.lang.String` arg1, `boolean` arg2, `java.util.List<ro.sync.contentcompletion.xml.CIValue>` arg3)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `l(`java.util.List<ro.sync.contentcompletion.xml.CIValue>` arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `j(`java.net.URL` arg0, `java.net.URL` arg1, `java.lang.String` arg2, `ro.sync.ecss.dita.DITAAccess._b` arg3)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `computeElementClazz([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md) arg0)`

**Returns:** `java.lang.String`

### `insertImage([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `insertMedia([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, [`ro.sync.ecss.dita.MediaInfo`](./MediaInfo.md) arg1)`

**Returns:** `void`

### `chooseMediaReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** [`ro.sync.ecss.dita.MediaInfo`](./MediaInfo.md)

### `insertMediaSchemaAware([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, [`ro.sync.ecss.dita.MediaInfo`](./MediaInfo.md) arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../extensions/api/schemaaware/SchemaAwareHandlerResult.md)

### `computeMediaReferenceXMLToInsert([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, [`ro.sync.ecss.dita.MediaInfo`](./MediaInfo.md) arg1)`

**Returns:** `java.lang.String`

### `u([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.util.Map<java.lang.String,java.lang.String>` arg1, `java.lang.String` arg2, `java.lang.StringBuilder` arg3)`

**Returns:** `void`

### `h([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `ro.sync.ecss.g.j` arg1, `java.util.Map<java.lang.String,java.lang.String>` arg2, `java.lang.String` arg3, `java.lang.StringBuilder` arg4)`

**Returns:** `void`

### `insertImage([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, [`ro.sync.ecss.dita.ImageInfo`](./ImageInfo.md) arg1)`

**Returns:** `void`

### `chooseImageReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** [`ro.sync.ecss.dita.ImageInfo`](./ImageInfo.md)

### `insertImageSchemaAware([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../extensions/api/schemaaware/SchemaAwareHandlerResult.md)

### `insertImageSchemaAware([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../extensions/api/schemaaware/SchemaAwareHandlerResult.md)

### `insertImageSchemaAware([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, [`ro.sync.ecss.dita.ImageInfo`](./ImageInfo.md) arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../extensions/api/schemaaware/SchemaAwareHandlerResult.md)

### `c([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `m([`ro.sync.ecss.extensions.api.node.AuthorElement`](../extensions/api/node/AuthorElement.md) arg0)`

**Returns:** `int`

### `computeImageReferenceXMLToInsert([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `java.lang.String`

### `buildFigureHrefImageXMLToInsert([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `java.lang.String`

### `buildFigureKeyrefImageXMLToInsert([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `java.lang.String`

### `getPossibleElementQName([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `java.lang.String`

### `searchReferences([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `computeLinkText(`java.lang.String` arg0, `java.lang.String` arg1)`

**Returns:** `java.lang.String`

### `computeLinkText([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `java.lang.String`

### `computeLinkText([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3)`

**Returns:** `java.lang.String`

### `computeLinkText([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, [`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md) arg4)`

**Returns:** `java.lang.String`

### `filterElements(`java.util.List<ro.sync.contentcompletion.xml.CIElement>` arg0, [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../contentcompletion/xml/WhatElementsCanGoHereContext.md) arg1)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `filterElements(`java.util.List<ro.sync.contentcompletion.xml.CIElement>` arg0, [`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../contentcompletion/xml/WhatElementsCanGoHereContext.md) arg1, `java.lang.String` arg2)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `resolveKeyNotFoundError([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1)`

**Returns:** `void`

### `filterDITAVALAttributeValues(`java.util.List<ro.sync.contentcompletion.xml.CIValue>` arg0, [`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md) arg1)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `createNewTopicReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `k([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md) arg0, [`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](../extensions/api/access/AuthorEditorAccess.md) arg1)`

**Returns:** `void`

### `pushElement([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `isDITA(`org.xml.sax.Attributes` arg0)`

**Returns:** `boolean`

### `isDITA1_3OrNewer(`org.xml.sax.Attributes` arg0)`

**Returns:** `boolean`

### `isDITA1_3OrNewer(`java.lang.String` arg0)`

**Returns:** `boolean`

### `insertLinkReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `boolean` arg4, `java.lang.String` arg5, `java.net.URL` arg6, `boolean` arg7)`

**Returns:** `void`

### `insertLinkReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `boolean` arg4, `java.lang.String` arg5, `java.lang.String` arg6, `java.net.URL` arg7, `boolean` arg8)`

**Returns:** `void`

### `insertLinkReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `boolean` arg4, `java.lang.String` arg5, `java.net.URL` arg6, `boolean` arg7, `ro.sync.ecss.dita.DITAAccess._c` arg8)`

**Returns:** `void`

### `insertLinkReference([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3, `boolean` arg4, `java.lang.String` arg5, `java.lang.String` arg6, `java.net.URL` arg7, `boolean` arg8, `ro.sync.ecss.dita.DITAAccess._c` arg9)`

**Returns:** `void`

### `insertLinkReference(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, [`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg3, `java.lang.String` arg4, `java.lang.String` arg5, `java.lang.String` arg6, `boolean` arg7, `java.lang.String` arg8)`

**Returns:** `void`

### `insertLinkReference(`java.lang.String` arg0, `java.lang.String` arg1, `java.lang.String` arg2, [`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg3, `java.lang.String` arg4, `java.lang.String` arg5, `java.lang.String` arg6, `boolean` arg7, `boolean` arg8, `java.lang.String` arg9)`

**Returns:** `void`

### `rewriteKeyref(`java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>` arg0, `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>` arg1, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg2, `java.lang.String` arg3)`

**Returns:** `java.lang.String`

### `getURLKeyScopeContexts(`java.net.URL` arg0)`

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`

### `editTopicref([`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../extensions/api/node/AuthorElement.md) arg0, [`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg1)`

**Returns:** `void`

### `getDitaReferenceTargets([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.net.URL` arg1)`

**Returns:** `java.util.List<ro.sync.ecss.dita.DitaReferenceTargetDescriptor>`

### `getDitaReferenceTargets(`java.net.URL` arg0, `java.net.URL` arg1)`

**Returns:** `java.util.List<ro.sync.ecss.dita.DitaReferenceTargetDescriptor>`

### `getFormat(`java.lang.String` arg0, `java.lang.String` arg1, `boolean` arg2)`

**Returns:** `java.lang.String`

### `getFormatForLinkCreatedFromGUI(`java.lang.String` arg0, `java.lang.String` arg1, `boolean` arg2)`

**Returns:** `java.lang.String`

### `checkValidKeyName(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `getHrefInformation([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg0)`

**Returns:** [`ro.sync.ecss.dita.HrefInfo`](./HrefInfo.md)

### `getHrefInformation([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg1)`

**Returns:** [`ro.sync.ecss.dita.HrefInfo`](./HrefInfo.md)

### `exportDITAMap(`java.net.URL` arg0, `java.io.File` arg1, `boolean` arg2, `java.lang.String` arg3, [`ro.sync.ecss.dita.mapeditor.actions.export.helper.ExportProgressUpdater`](mapeditor/actions/export/helper/ExportProgressUpdater.md) arg4)`

**Returns:** `void`

### `attachKeyScopeInformation(`java.net.URL` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `java.net.URL`

### `attachKeyScopeInformation(`java.net.URL` arg0, `java.lang.String` arg1, `java.lang.String` arg2, `java.lang.String` arg3)`

**Returns:** `java.net.URL`

### `attachKeyScopeInformation(`java.net.URL` arg0, `java.util.Stack<java.util.Set<java.lang.String>>` arg1, `java.lang.String` arg2)`

**Returns:** `java.net.URL`

### `computeVariableKeyrefElementName([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `java.lang.String`

### `computeVariableKeyrefElementName([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `boolean` arg1)`

**Returns:** `java.lang.String`

### `computeKeyScopeStack([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg0, `java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>` arg1)`

**Returns:** `java.util.Stack<java.util.Set<java.lang.String>>`

### `computeKeyScopeStack([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg0, `java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>` arg1, `java.util.Map<ro.sync.ecss.extensions.api.node.AuthorNode,java.util.Set<java.lang.String>>` arg2)`

**Returns:** `java.util.Stack<java.util.Set<java.lang.String>>`

### `getKeyForUrl([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md) arg0, `java.net.URL` arg1, `java.net.URL` arg2)`

**Returns:** `java.lang.String`

### `getKeyForUrl([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md) arg0, `java.net.URL` arg1, `java.net.URL` arg2, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg3)`

**Returns:** `java.lang.String`

### `getKeyForUrl(`java.net.URL` arg0, `java.net.URL` arg1)`

**Returns:** `java.lang.String`

### `getKeyRefValueForUrl([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md) arg0, `java.net.URL` arg1, `java.net.URL` arg2)`

**Returns:** `java.lang.String`

### `r(`java.net.URL` arg0, `java.lang.String` arg1)`

**Returns:** `java.lang.String`

### `checkConsecutiveInsertionWarning(`int` arg0, `int` arg1, `int` arg2, `ro.sync.ecss.dita.reference.j` arg3, `ro.sync.ecss.dita.reference.j` arg4)`

**Returns:** `int`

### `isKeyReferenceToImage(`ro.sync.ecss.dita.reference.keyref.KeyInfo` arg0)`

**Returns:** `boolean`

### `isGenericMediaContent(`ro.sync.ecss.dita.reference.keyref.KeyInfo` arg0)`

**Returns:** `boolean`

### `detectMediaObjectOutputclass(`ro.sync.ecss.dita.reference.keyref.KeyInfo` arg0)`

**Returns:** `java.lang.String`

### `isReferenceToDITAResource([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg0, `ro.sync.ecss.dita.reference.keyref.KeyInfo` arg1)`

**Returns:** `boolean`

### `isReferenceToDITACompatibleResource([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg0, `ro.sync.ecss.dita.reference.keyref.KeyInfo` arg1)`

**Returns:** `boolean`

### `getConverterFormatForDITACompatibleResource(`java.lang.String` arg0)`

**Returns:** `java.lang.String`

### `isDITACompatileFormat(`java.lang.String` arg0)`

**Returns:** `boolean`

### `convertDitaCompatibleResource(`java.io.Reader` arg0, `java.lang.String` arg1, `java.lang.String` arg2)`

**Returns:** `java.lang.String`

### `isKeyDefToDITAResource(`ro.sync.ecss.dita.reference.keyref.KeyInfo` arg0)`

**Returns:** `boolean`

### `annotateAttributes(`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>` arg0)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `getFragWithMostSuitableTopicrefs([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../extensions/api/node/AuthorDocumentFragment.md) arg1, `int` arg2)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../extensions/api/node/AuthorDocumentFragment.md)

### `getFragWithMostSuitableTopicrefs([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md) arg0, [`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md) arg1, `int` arg2)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../extensions/api/node/AuthorDocumentFragment.md)

### `findSimilarTopics([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0)`

**Returns:** `void`

### `getRelatedLinksFromReltable(`java.net.URL` arg0)`

**Returns:** `java.util.List<ro.sync.ecss.dita.reference.reltable.RelLink>`

### `n([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md) arg0, `boolean` arg1, `boolean` arg2, [`ro.sync.ecss.dita.DitaReferenceTargetDescriptor`](./DitaReferenceTargetDescriptor.md) arg3)`

**Returns:** `boolean`

### `proposeFolderUrlForChildTopicref([`ro.sync.ecss.extensions.api.node.AuthorElement`](../extensions/api/node/AuthorElement.md) arg0)`

**Returns:** `java.net.URL`

### `detectInsertionType(`java.net.URL` arg0)`

**Returns:** [`ro.sync.ecss.dita.DITAImposedReferenceType`](./DITAImposedReferenceType.md)

### `computeQualifiedKeyNames(`java.lang.String` arg0, `java.util.Stack<java.util.Set<java.lang.String>>` arg1)`

**Returns:** `java.util.List<java.lang.String>`

### `preferAddingKeyrefToAlreadyReferencedResource(`java.net.URL` arg0)`

**Returns:** `boolean`

### `showNewFileDialog([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `java.lang.String` arg1)`

**Returns:** `java.net.URL`

### `showKeysAndReusableComponents([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md) arg0, `boolean` arg1, `boolean` arg2)`

**Returns:** `void`

