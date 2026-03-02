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

### `setKeyNameGenerator(ro.sync.ecss.dita.DITAKeyNameGenerator arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dita.DITAKeyNameGenerator`](./DITAKeyNameGenerator.md))

### `getKeysAttributeValueBasedOnFilename(java.net.URL arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.net.URL`)

### `createReferencesGraph()`

**Returns:** `java.lang.Object`

### `searchReferences(java.net.URL arg0)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

**Parameters:**
- `arg0` (`java.net.URL`)

### `searchReferences(java.net.URL arg0, java.lang.Object arg1)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.Object`)

### `p(boolean arg0, ro.sync.ecss.dita.reference.i arg1, java.lang.Object arg2, boolean arg3, ro.sync.ecss.dita.reference.g arg4, java.net.URL arg5, boolean arg6, java.lang.String arg7, ro.sync.ecss.dita.topic.ref.b arg8, ro.sync.contentcompletion.z arg9, ro.sync.ecss.extensions.api.AuthorDocumentController arg10)`

**Returns:** `void`

**Parameters:**
- `arg0` (`boolean`)
- `arg1` (`ro.sync.ecss.dita.reference.i`)
- `arg2` (`java.lang.Object`)
- `arg3` (`boolean`)
- `arg4` (`ro.sync.ecss.dita.reference.g`)
- `arg5` (`java.net.URL`)
- `arg6` (`boolean`)
- `arg7` (`java.lang.String`)
- `arg8` (`ro.sync.ecss.dita.topic.ref.b`)
- `arg9` (`ro.sync.contentcompletion.z`)
- `arg10` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))

### `insertTopicref(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `handleTopicRefInsertUrl(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.net.URL arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.net.URL`)

### `insertTopicgroup(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `getTopicRefInfo(java.net.URL arg0, java.lang.Object arg1, ro.sync.ecss.contentcompletion.c arg2, ro.sync.ecss.g.j arg3, int arg4, ro.sync.ecss.dita.topic.ref.f arg5, ro.sync.ecss.dita.topic.ref.c arg6)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.Object`)
- `arg2` (`ro.sync.ecss.contentcompletion.c`)
- `arg3` (`ro.sync.ecss.g.j`)
- `arg4` (`int`)
- `arg5` (`ro.sync.ecss.dita.topic.ref.f`)
- `arg6` (`ro.sync.ecss.dita.topic.ref.c`)

### `getInsertTopicref(java.net.URL arg0, java.lang.Object arg1, ro.sync.ecss.contentcompletion.c arg2, ro.sync.ecss.extensions.api.AuthorDocumentController arg3, int arg4, java.lang.String arg5, ro.sync.ecss.dita.topic.ref.c arg6, java.lang.String arg7, boolean arg8)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.Object`)
- `arg2` (`ro.sync.ecss.contentcompletion.c`)
- `arg3` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg4` (`int`)
- `arg5` (`java.lang.String`)
- `arg6` (`ro.sync.ecss.dita.topic.ref.c`)
- `arg7` (`java.lang.String`)
- `arg8` (`boolean`)

### `insertKeydefWithKeyword(java.lang.Object arg0, ro.sync.ecss.contentcompletion.c arg1, ro.sync.ecss.extensions.api.AuthorDocumentController arg2, int arg3, ro.sync.ecss.dita.topic.ref.c arg4, boolean arg5)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.Object`)
- `arg1` (`ro.sync.ecss.contentcompletion.c`)
- `arg2` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg3` (`int`)
- `arg4` (`ro.sync.ecss.dita.topic.ref.c`)
- `arg5` (`boolean`)

### `insertKeydefWithKeyword(java.lang.Object arg0, ro.sync.ecss.contentcompletion.c arg1, ro.sync.ecss.extensions.api.AuthorDocumentController arg2, int arg3, ro.sync.ecss.dita.topic.ref.c arg4, ro.sync.ecss.dita.DITATopicInsertionPosition arg5)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.Object`)
- `arg1` (`ro.sync.ecss.contentcompletion.c`)
- `arg2` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg3` (`int`)
- `arg4` (`ro.sync.ecss.dita.topic.ref.c`)
- `arg5` ([`ro.sync.ecss.dita.DITATopicInsertionPosition`](./DITATopicInsertionPosition.md))

### `insertKeydefWithKeyword(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `insertTopichead(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `setDitaAccessCustomizer(ro.sync.ecss.dita.k arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.ecss.dita.k`)

### `getDitaAccessCustomizer()`

**Returns:** `ro.sync.ecss.dita.k`

### `hasAPIKeysManager()`

**Returns:** `boolean`

### `getAPIKeysManagerDescription()`

**Returns:** `java.lang.String`

### `editProperties(java.net.URL arg0, ro.sync.ecss.contentcompletion.c arg1, ro.sync.ecss.g.j arg2, ro.sync.ecss.extensions.api.node.AuthorElement[] arg3, ro.sync.ecss.dita.topic.ref.c arg4, java.lang.Object arg5, boolean arg6)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`ro.sync.ecss.contentcompletion.c`)
- `arg2` (`ro.sync.ecss.g.j`)
- `arg3` ([`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../extensions/api/node/AuthorElement.md))
- `arg4` (`ro.sync.ecss.dita.topic.ref.c`)
- `arg5` (`java.lang.Object`)
- `arg6` (`boolean`)

### `editProperties(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `e(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement> arg1, int arg2, int arg3)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `arg2` (`int`)
- `arg3` (`int`)

### `insertHref(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, boolean arg5, java.net.URL arg6, boolean arg7)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)
- `arg6` (`java.net.URL`)
- `arg7` (`boolean`)

### `g(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, java.lang.String arg5)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)
- `arg5` (`java.lang.String`)

### `d(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, java.net.URL arg5, boolean arg6)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)
- `arg5` (`java.net.URL`)
- `arg6` (`boolean`)

### `insertHref(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, boolean arg5)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)

### `insertContentKeyReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)

### `insertContentReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.net.URL arg1, boolean arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.net.URL`)
- `arg2` (`boolean`)

### `insertTopicref(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.net.URL arg1, boolean arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.net.URL`)
- `arg2` (`boolean`)

### `insertTopicref(ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage arg0, java.net.URL arg1, java.lang.String arg2, boolean arg3, boolean arg4)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage`](../../exml/workspace/api/editor/page/ditamap/WSDITAMapEditorPage.md))
- `arg1` (`java.net.URL`)
- `arg2` (`java.lang.String`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)

### `insertTopicref(ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage arg0, java.net.URL arg1, java.lang.String arg2, ro.sync.ecss.dita.DITATopicInsertionPosition arg3, boolean arg4)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage`](../../exml/workspace/api/editor/page/ditamap/WSDITAMapEditorPage.md))
- `arg1` (`java.net.URL`)
- `arg2` (`java.lang.String`)
- `arg3` ([`ro.sync.ecss.dita.DITATopicInsertionPosition`](./DITATopicInsertionPosition.md))
- `arg4` (`boolean`)

### `insertReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)

### `showInsertReferenceDialog(ro.sync.ecss.contentcompletion.c arg0, ro.sync.ecss.g.j arg1, int arg2, java.lang.Object arg3, int arg4, boolean arg5, ro.sync.ecss.dita.topic.ref.b arg6)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.ecss.contentcompletion.c`)
- `arg1` (`ro.sync.ecss.g.j`)
- `arg2` (`int`)
- `arg3` (`java.lang.Object`)
- `arg4` (`int`)
- `arg5` (`boolean`)
- `arg6` (`ro.sync.ecss.dita.topic.ref.b`)

### `showInsertReferenceDialog(ro.sync.ecss.contentcompletion.c arg0, ro.sync.ecss.g.j arg1, int arg2, java.lang.Object arg3, int arg4, boolean arg5, ro.sync.ecss.dita.topic.ref.b arg6, ro.sync.ecss.dita.IKeyInfoFilter arg7, boolean arg8)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.ecss.contentcompletion.c`)
- `arg1` (`ro.sync.ecss.g.j`)
- `arg2` (`int`)
- `arg3` (`java.lang.Object`)
- `arg4` (`int`)
- `arg5` (`boolean`)
- `arg6` (`ro.sync.ecss.dita.topic.ref.b`)
- `arg7` ([`ro.sync.ecss.dita.IKeyInfoFilter`](./IKeyInfoFilter.md))
- `arg8` (`boolean`)

### `insertReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

### `insertReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, int arg2, java.lang.String arg3, java.lang.String arg4)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`int`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)

### `insertReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1, ro.sync.ecss.component.z arg2, ro.sync.ecss.contentcompletion.c arg3, ro.sync.ecss.dita.reference.j arg4)`

**Returns:** `int`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)
- `arg2` (`ro.sync.ecss.component.z`)
- `arg3` (`ro.sync.ecss.contentcompletion.c`)
- `arg4` (`ro.sync.ecss.dita.reference.j`)

### `getRootMapURL()`

**Returns:** `java.net.URL`

### `resolveKeyRef(java.lang.String arg0)`

**Returns:** `java.net.URL`

**Parameters:**
- `arg0` (`java.lang.String`)

### `resolveKeyRef(java.lang.String arg0, boolean arg1)`

**Returns:** `java.net.URL`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

### `resolveKeyRef(java.net.URL arg0, java.lang.String arg1, boolean arg2)`

**Returns:** `java.net.URL`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)

### `checkValidKeyRef(java.lang.String arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)

### `resolveKeyRef(java.net.URL arg0, java.lang.String arg1, ro.sync.ecss.dita.ContextKeyManager arg2, boolean arg3)`

**Returns:** `java.net.URL`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)
- `arg2` ([`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md))
- `arg3` (`boolean`)

### `resolveKeyRefToHref(java.net.URL arg0, java.lang.String arg1, ro.sync.ecss.dita.ContextKeyManager arg2, boolean arg3)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)
- `arg2` ([`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md))
- `arg3` (`boolean`)

### `createReusableComponent(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.DITAUniqueIDAssigner arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.DITAUniqueIDAssigner`](../extensions/api/DITAUniqueIDAssigner.md))

### `insertReusableComponent(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `replaceAllConrefs(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `replaceConref(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `expandAllKeyrefs(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.extensions.api.link.LinkTextResolver arg1)`

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.link.LinkTextResolver`](../extensions/api/link/LinkTextResolver.md))

### `removeReference(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `addEditReference(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `isGeneralizationOf(java.lang.String arg0, java.lang.String arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `getInheritanceType(java.lang.String arg0, java.lang.String arg1)`

**Returns:** `int`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `parseDITAHref(java.lang.String arg0, java.lang.String arg1)`

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `parseDITAHref(java.lang.String arg0, java.lang.String arg1, boolean arg2)`

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)

### `parseDITAKeyRef(java.lang.String arg0)`

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

**Parameters:**
- `arg0` (`java.lang.String`)

### `parseDITAKeyRef(java.net.URL arg0, java.lang.String arg1)`

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)

### `parseDITAKeyRef(java.net.URL arg0, ro.sync.ecss.dita.ContextKeyManager arg1, java.lang.String arg2)`

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` ([`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md))
- `arg2` (`java.lang.String`)

### `parseDITAKeyRef(java.lang.String arg0, ro.sync.ecss.dita.reference.keyref.s arg1)`

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`ro.sync.ecss.dita.reference.keyref.s`)

### `getAutoInsertTopicRefElementName(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)

### `getAutoInsertTopicRefElementName(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, int arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg1` (`int`)

### `getAutoInsertRefElementName(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)

### `getAutoInsertImageRefElementName(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)

### `getPossibleElements(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, int arg1, java.lang.String arg2, java.lang.String[] arg3)`

**Returns:** [`ro.sync.contentcompletion.xml.CIElement[]`](../../contentcompletion/xml/CIElement.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg1` (`int`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String[]`)

### `getEquivalentChildCIElement(ro.sync.ecss.extensions.api.AuthorAccess arg0, int arg1, java.lang.String arg2)`

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../contentcompletion/xml/CIElement.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)
- `arg2` (`java.lang.String`)

### `getKeys()`

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`

### `getKeys(java.net.URL arg0)`

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`

**Parameters:**
- `arg0` (`java.net.URL`)

### `getKeysForInsertion(java.net.URL arg0)`

**Returns:** `java.util.List<ro.sync.ecss.dita.reference.keyref.KeyInfo>`

**Parameters:**
- `arg0` (`java.net.URL`)

### `getKeys(java.net.URL arg0, ro.sync.ecss.dita.ContextKeyManager arg1)`

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` ([`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md))

### `getURLKeyScopeContexts(java.net.URL arg0, ro.sync.ecss.dita.ContextKeyManager arg1)`

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` ([`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md))

### `computeFormatForURLPasteAndDnD(ro.sync.exml.workspace.api.util.UtilAccess arg0, java.net.URL arg1, ro.sync.ecss.extensions.api.ReferenceType arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.util.UtilAccess`](../../exml/workspace/api/util/UtilAccess.md))
- `arg1` (`java.net.URL`)
- `arg2` ([`ro.sync.ecss.extensions.api.ReferenceType`](../extensions/api/ReferenceType.md))

### `computeLinkScope(java.net.URL arg0, java.net.URL arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)

### `pasteAsReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, boolean arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`boolean`)

### `pasteAsReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.dita.DITAAccess.PasteInfo arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`ro.sync.ecss.dita.DITAAccess.PasteInfo`)

### `pasteClipboardFragmentsAsReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.dita.DITAAccess.PasteInfo arg1, ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[] arg2)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`ro.sync.ecss.dita.DITAAccess.PasteInfo`)
- `arg2` ([`ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[]`](../component/AuthorDocumentFragmentClipboardObject.md))

### `pasteClipboardFragmentsAsReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.dita.DITAAccess.PasteInfo arg1, ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[] arg2, ro.sync.ecss.extensions.api.SelectionInterpretationMode arg3)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`ro.sync.ecss.dita.DITAAccess.PasteInfo`)
- `arg2` ([`ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[]`](../component/AuthorDocumentFragmentClipboardObject.md))
- `arg3` ([`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](../extensions/api/SelectionInterpretationMode.md))

### `i(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.strictediting.ContentDescription arg1, ro.sync.ecss.dita.DITAAccess.PasteInfo arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, boolean arg6, boolean arg7)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`ro.sync.ecss.strictediting.ContentDescription`)
- `arg2` (`ro.sync.ecss.dita.DITAAccess.PasteInfo`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`java.lang.String`)
- `arg6` (`boolean`)
- `arg7` (`boolean`)

### `filterAttributeValues(java.util.List<ro.sync.contentcompletion.xml.CIValue> arg0, ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext arg1, java.lang.String arg2)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))
- `arg2` (`java.lang.String`)

### `filterAttributeValues(java.util.List<ro.sync.contentcompletion.xml.CIValue> arg0, ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext arg1, java.lang.String arg2, ro.sync.ecss.extensions.api.AuthorAccess arg3)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))
- `arg2` (`java.lang.String`)
- `arg3` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `filterAttributeValues(java.util.List<ro.sync.contentcompletion.xml.CIValue> arg0, ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext arg1, ro.sync.ecss.dita.ContextKeyManager arg2, java.lang.String arg3, ro.sync.ecss.extensions.api.AuthorAccess arg4)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))
- `arg2` ([`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md))
- `arg3` (`java.lang.String`)
- `arg4` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `t(java.util.List<ro.sync.contentcompletion.xml.CIValue> arg0, ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext arg1, java.net.URL arg2, java.lang.String arg3, boolean arg4)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))
- `arg2` (`java.net.URL`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)

### `b(java.util.List<ro.sync.contentcompletion.xml.CIValue> arg0, java.lang.String arg1, boolean arg2, java.util.List<ro.sync.contentcompletion.xml.CIValue> arg3)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)
- `arg3` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)

### `l(java.util.List<ro.sync.contentcompletion.xml.CIValue> arg0, java.lang.String arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` (`java.lang.String`)

### `j(java.net.URL arg0, java.net.URL arg1, java.lang.String arg2, ro.sync.ecss.dita.DITAAccess._b arg3)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)
- `arg2` (`java.lang.String`)
- `arg3` (`ro.sync.ecss.dita.DITAAccess._b`)

### `computeElementClazz(ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))

### `insertImage(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)

### `insertMedia(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.dita.MediaInfo arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.dita.MediaInfo`](./MediaInfo.md))

### `chooseMediaReference(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** [`ro.sync.ecss.dita.MediaInfo`](./MediaInfo.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `insertMediaSchemaAware(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.dita.MediaInfo arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../extensions/api/schemaaware/SchemaAwareHandlerResult.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.dita.MediaInfo`](./MediaInfo.md))

### `computeMediaReferenceXMLToInsert(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.dita.MediaInfo arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.dita.MediaInfo`](./MediaInfo.md))

### `u(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.util.Map<java.lang.String,java.lang.String> arg1, java.lang.String arg2, java.lang.StringBuilder arg3)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.util.Map<java.lang.String,java.lang.String>`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.StringBuilder`)

### `h(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.g.j arg1, java.util.Map<java.lang.String,java.lang.String> arg2, java.lang.String arg3, java.lang.StringBuilder arg4)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`ro.sync.ecss.g.j`)
- `arg2` (`java.util.Map<java.lang.String,java.lang.String>`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.StringBuilder`)

### `insertImage(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.dita.ImageInfo arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.dita.ImageInfo`](./ImageInfo.md))

### `chooseImageReference(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** [`ro.sync.ecss.dita.ImageInfo`](./ImageInfo.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `insertImageSchemaAware(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../extensions/api/schemaaware/SchemaAwareHandlerResult.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)

### `insertImageSchemaAware(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../extensions/api/schemaaware/SchemaAwareHandlerResult.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `insertImageSchemaAware(ro.sync.ecss.extensions.api.AuthorAccess arg0, ro.sync.ecss.dita.ImageInfo arg1)`

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../extensions/api/schemaaware/SchemaAwareHandlerResult.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.dita.ImageInfo`](./ImageInfo.md))

### `c(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorElement>`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `m(ro.sync.ecss.extensions.api.node.AuthorElement arg0)`

**Returns:** `int`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../extensions/api/node/AuthorElement.md))

### `computeImageReferenceXMLToInsert(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `buildFigureHrefImageXMLToInsert(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `buildFigureKeyrefImageXMLToInsert(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `getPossibleElementQName(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `searchReferences(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `computeLinkText(java.lang.String arg0, java.lang.String arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

### `computeLinkText(ro.sync.ecss.extensions.api.node.AuthorNode arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `computeLinkText(ro.sync.ecss.extensions.api.node.AuthorNode arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

### `computeLinkText(ro.sync.ecss.extensions.api.node.AuthorNode arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, ro.sync.ecss.dita.KeysManagerBase arg4)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` ([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md))

### `filterElements(java.util.List<ro.sync.contentcompletion.xml.CIElement> arg0, ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext arg1)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../contentcompletion/xml/WhatElementsCanGoHereContext.md))

### `filterElements(java.util.List<ro.sync.contentcompletion.xml.CIElement> arg0, ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext arg1, java.lang.String arg2)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../contentcompletion/xml/WhatElementsCanGoHereContext.md))
- `arg2` (`java.lang.String`)

### `resolveKeyNotFoundError(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)

### `filterDITAVALAttributeValues(java.util.List<ro.sync.contentcompletion.xml.CIValue> arg0, ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext arg1)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))

### `createNewTopicReference(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `k(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, ro.sync.ecss.extensions.api.access.AuthorEditorAccess arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](../extensions/api/access/AuthorEditorAccess.md))

### `pushElement(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `isDITA(org.xml.sax.Attributes arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`org.xml.sax.Attributes`)

### `isDITA1_3OrNewer(org.xml.sax.Attributes arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`org.xml.sax.Attributes`)

### `isDITA1_3OrNewer(java.lang.String arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.String`)

### `insertLinkReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, java.lang.String arg5, java.net.URL arg6, boolean arg7)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.net.URL`)
- `arg7` (`boolean`)

### `insertLinkReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, java.lang.String arg5, java.lang.String arg6, java.net.URL arg7, boolean arg8)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.lang.String`)
- `arg7` (`java.net.URL`)
- `arg8` (`boolean`)

### `insertLinkReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, java.lang.String arg5, java.net.URL arg6, boolean arg7, ro.sync.ecss.dita.DITAAccess._c arg8)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.net.URL`)
- `arg7` (`boolean`)
- `arg8` (`ro.sync.ecss.dita.DITAAccess._c`)

### `insertLinkReference(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, boolean arg4, java.lang.String arg5, java.lang.String arg6, java.net.URL arg7, boolean arg8, ro.sync.ecss.dita.DITAAccess._c arg9)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.lang.String`)
- `arg7` (`java.net.URL`)
- `arg8` (`boolean`)
- `arg9` (`ro.sync.ecss.dita.DITAAccess._c`)

### `insertLinkReference(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, ro.sync.ecss.extensions.api.AuthorAccess arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, boolean arg7, java.lang.String arg8)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg4` (`java.lang.String`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.lang.String`)
- `arg7` (`boolean`)
- `arg8` (`java.lang.String`)

### `insertLinkReference(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, ro.sync.ecss.extensions.api.AuthorAccess arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, boolean arg7, boolean arg8, java.lang.String arg9)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg4` (`java.lang.String`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.lang.String`)
- `arg7` (`boolean`)
- `arg8` (`boolean`)
- `arg9` (`java.lang.String`)

### `rewriteKeyref(java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>> arg0, java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo> arg1, ro.sync.ecss.extensions.api.node.AuthorNode arg2, java.lang.String arg3)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`)
- `arg1` (`java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`)
- `arg2` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg3` (`java.lang.String`)

### `getURLKeyScopeContexts(java.net.URL arg0)`

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`

**Parameters:**
- `arg0` (`java.net.URL`)

### `editTopicref(ro.sync.ecss.extensions.api.node.AuthorElement[] arg0, ro.sync.ecss.extensions.api.AuthorAccess arg1)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../extensions/api/node/AuthorElement.md))
- `arg1` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `getDitaReferenceTargets(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.net.URL arg1)`

**Returns:** `java.util.List<ro.sync.ecss.dita.DitaReferenceTargetDescriptor>`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.net.URL`)

### `getDitaReferenceTargets(java.net.URL arg0, java.net.URL arg1)`

**Returns:** `java.util.List<ro.sync.ecss.dita.DitaReferenceTargetDescriptor>`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)

### `getFormat(java.lang.String arg0, java.lang.String arg1, boolean arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)

### `getFormatForLinkCreatedFromGUI(java.lang.String arg0, java.lang.String arg1, boolean arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)

### `checkValidKeyName(java.lang.String arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)

### `getHrefInformation(ro.sync.ecss.extensions.api.node.AuthorNode arg0)`

**Returns:** [`ro.sync.ecss.dita.HrefInfo`](./HrefInfo.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))

### `getHrefInformation(ro.sync.ecss.dita.KeysManagerBase arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1)`

**Returns:** [`ro.sync.ecss.dita.HrefInfo`](./HrefInfo.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))

### `exportDITAMap(java.net.URL arg0, java.io.File arg1, boolean arg2, java.lang.String arg3, ro.sync.ecss.dita.mapeditor.actions.export.helper.ExportProgressUpdater arg4)`

**Returns:** `void`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.io.File`)
- `arg2` (`boolean`)
- `arg3` (`java.lang.String`)
- `arg4` ([`ro.sync.ecss.dita.mapeditor.actions.export.helper.ExportProgressUpdater`](mapeditor/actions/export/helper/ExportProgressUpdater.md))

### `attachKeyScopeInformation(java.net.URL arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** `java.net.URL`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `attachKeyScopeInformation(java.net.URL arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3)`

**Returns:** `java.net.URL`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

### `attachKeyScopeInformation(java.net.URL arg0, java.util.Stack<java.util.Set<java.lang.String>> arg1, java.lang.String arg2)`

**Returns:** `java.net.URL`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.util.Stack<java.util.Set<java.lang.String>>`)
- `arg2` (`java.lang.String`)

### `computeVariableKeyrefElementName(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `computeVariableKeyrefElementName(ro.sync.ecss.extensions.api.AuthorAccess arg0, boolean arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`boolean`)

### `computeKeyScopeStack(ro.sync.ecss.extensions.api.node.AuthorNode arg0, java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>> arg1)`

**Returns:** `java.util.Stack<java.util.Set<java.lang.String>>`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`)

### `computeKeyScopeStack(ro.sync.ecss.extensions.api.node.AuthorNode arg0, java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>> arg1, java.util.Map<ro.sync.ecss.extensions.api.node.AuthorNode,java.util.Set<java.lang.String>> arg2)`

**Returns:** `java.util.Stack<java.util.Set<java.lang.String>>`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`)
- `arg2` (`java.util.Map<ro.sync.ecss.extensions.api.node.AuthorNode,java.util.Set<java.lang.String>>`)

### `getKeyForUrl(ro.sync.ecss.dita.KeysManagerBase arg0, java.net.URL arg1, java.net.URL arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md))
- `arg1` (`java.net.URL`)
- `arg2` (`java.net.URL`)

### `getKeyForUrl(ro.sync.ecss.dita.KeysManagerBase arg0, java.net.URL arg1, java.net.URL arg2, ro.sync.ecss.extensions.api.node.AuthorNode arg3)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md))
- `arg1` (`java.net.URL`)
- `arg2` (`java.net.URL`)
- `arg3` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))

### `getKeyForUrl(java.net.URL arg0, java.net.URL arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)

### `getKeyRefValueForUrl(ro.sync.ecss.dita.KeysManagerBase arg0, java.net.URL arg1, java.net.URL arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md))
- `arg1` (`java.net.URL`)
- `arg2` (`java.net.URL`)

### `r(java.net.URL arg0, java.lang.String arg1)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)

### `checkConsecutiveInsertionWarning(int arg0, int arg1, int arg2, ro.sync.ecss.dita.reference.j arg3, ro.sync.ecss.dita.reference.j arg4)`

**Returns:** `int`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)
- `arg2` (`int`)
- `arg3` (`ro.sync.ecss.dita.reference.j`)
- `arg4` (`ro.sync.ecss.dita.reference.j`)

### `isKeyReferenceToImage(ro.sync.ecss.dita.reference.keyref.KeyInfo arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

### `isGenericMediaContent(ro.sync.ecss.dita.reference.keyref.KeyInfo arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

### `detectMediaObjectOutputclass(ro.sync.ecss.dita.reference.keyref.KeyInfo arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

### `isReferenceToDITAResource(ro.sync.ecss.extensions.api.node.AuthorNode arg0, ro.sync.ecss.dita.reference.keyref.KeyInfo arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

### `isReferenceToDITACompatibleResource(ro.sync.ecss.extensions.api.node.AuthorNode arg0, ro.sync.ecss.dita.reference.keyref.KeyInfo arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

### `getConverterFormatForDITACompatibleResource(java.lang.String arg0)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.lang.String`)

### `isDITACompatileFormat(java.lang.String arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.lang.String`)

### `convertDitaCompatibleResource(java.io.Reader arg0, java.lang.String arg1, java.lang.String arg2)`

**Returns:** `java.lang.String`

**Parameters:**
- `arg0` (`java.io.Reader`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

### `isKeyDefToDITAResource(ro.sync.ecss.dita.reference.keyref.KeyInfo arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

### `annotateAttributes(java.util.List<ro.sync.contentcompletion.xml.CIAttribute> arg0)`

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`)

### `getFragWithMostSuitableTopicrefs(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, ro.sync.ecss.extensions.api.node.AuthorDocumentFragment arg1, int arg2)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../extensions/api/node/AuthorDocumentFragment.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../extensions/api/node/AuthorDocumentFragment.md))
- `arg2` (`int`)

### `getFragWithMostSuitableTopicrefs(ro.sync.ecss.extensions.api.AuthorDocumentController arg0, ro.sync.ecss.extensions.api.node.AuthorNode arg1, int arg2)`

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../extensions/api/node/AuthorDocumentFragment.md)

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg2` (`int`)

### `findSimilarTopics(ro.sync.ecss.extensions.api.AuthorAccess arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

### `getRelatedLinksFromReltable(java.net.URL arg0)`

**Returns:** `java.util.List<ro.sync.ecss.dita.reference.reltable.RelLink>`

**Parameters:**
- `arg0` (`java.net.URL`)

### `n(ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext arg0, boolean arg1, boolean arg2, ro.sync.ecss.dita.DitaReferenceTargetDescriptor arg3)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))
- `arg1` (`boolean`)
- `arg2` (`boolean`)
- `arg3` ([`ro.sync.ecss.dita.DitaReferenceTargetDescriptor`](./DitaReferenceTargetDescriptor.md))

### `proposeFolderUrlForChildTopicref(ro.sync.ecss.extensions.api.node.AuthorElement arg0)`

**Returns:** `java.net.URL`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../extensions/api/node/AuthorElement.md))

### `detectInsertionType(java.net.URL arg0)`

**Returns:** [`ro.sync.ecss.dita.DITAImposedReferenceType`](./DITAImposedReferenceType.md)

**Parameters:**
- `arg0` (`java.net.URL`)

### `computeQualifiedKeyNames(java.lang.String arg0, java.util.Stack<java.util.Set<java.lang.String>> arg1)`

**Returns:** `java.util.List<java.lang.String>`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.util.Stack<java.util.Set<java.lang.String>>`)

### `preferAddingKeyrefToAlreadyReferencedResource(java.net.URL arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`java.net.URL`)

### `showNewFileDialog(ro.sync.ecss.extensions.api.AuthorAccess arg0, java.lang.String arg1)`

**Returns:** `java.net.URL`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)

### `showKeysAndReusableComponents(ro.sync.ecss.extensions.api.AuthorAccess arg0, boolean arg1, boolean arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`boolean`)
- `arg2` (`boolean`)

