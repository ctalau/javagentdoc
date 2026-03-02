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

### `setKeyNameGenerator(DITAKeyNameGenerator arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dita.DITAKeyNameGenerator`](./DITAKeyNameGenerator.md))

**Returns:** `void`

### `getKeysAttributeValueBasedOnFilename(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.lang.String`

### `createReferencesGraph()`

**Returns:** `java.lang.Object`

### `searchReferences(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `searchReferences(URL arg0, Object arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.Object`)

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `p(boolean arg0, i arg1, Object arg2, boolean arg3, g arg4, URL arg5, boolean arg6, String arg7, b arg8, z arg9, AuthorDocumentController arg10)`

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

**Returns:** `void`

### `insertTopicref(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `handleTopicRefInsertUrl(AuthorAccess arg0, URL arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.net.URL`)

**Returns:** `void`

### `insertTopicgroup(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `getTopicRefInfo(URL arg0, Object arg1, c arg2, j arg3, int arg4, f arg5, c arg6)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.Object`)
- `arg2` (`ro.sync.ecss.contentcompletion.c`)
- `arg3` (`ro.sync.ecss.g.j`)
- `arg4` (`int`)
- `arg5` (`ro.sync.ecss.dita.topic.ref.f`)
- `arg6` (`ro.sync.ecss.dita.topic.ref.c`)

**Returns:** `void`

### `getInsertTopicref(URL arg0, Object arg1, c arg2, AuthorDocumentController arg3, int arg4, String arg5, c arg6, String arg7, boolean arg8)`

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

**Returns:** `void`

### `insertKeydefWithKeyword(Object arg0, c arg1, AuthorDocumentController arg2, int arg3, c arg4, boolean arg5)`

**Parameters:**
- `arg0` (`java.lang.Object`)
- `arg1` (`ro.sync.ecss.contentcompletion.c`)
- `arg2` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg3` (`int`)
- `arg4` (`ro.sync.ecss.dita.topic.ref.c`)
- `arg5` (`boolean`)

**Returns:** `void`

### `insertKeydefWithKeyword(Object arg0, c arg1, AuthorDocumentController arg2, int arg3, c arg4, DITATopicInsertionPosition arg5)`

**Parameters:**
- `arg0` (`java.lang.Object`)
- `arg1` (`ro.sync.ecss.contentcompletion.c`)
- `arg2` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg3` (`int`)
- `arg4` (`ro.sync.ecss.dita.topic.ref.c`)
- `arg5` ([`ro.sync.ecss.dita.DITATopicInsertionPosition`](./DITATopicInsertionPosition.md))

**Returns:** `void`

### `insertKeydefWithKeyword(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `insertTopichead(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `setDitaAccessCustomizer(k arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.dita.k`)

**Returns:** `void`

### `getDitaAccessCustomizer()`

**Returns:** `ro.sync.ecss.dita.k`

### `hasAPIKeysManager()`

**Returns:** `boolean`

### `getAPIKeysManagerDescription()`

**Returns:** `java.lang.String`

### `editProperties(URL arg0, c arg1, j arg2, AuthorElement[] arg3, c arg4, Object arg5, boolean arg6)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`ro.sync.ecss.contentcompletion.c`)
- `arg2` (`ro.sync.ecss.g.j`)
- `arg3` ([`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../extensions/api/node/AuthorElement.md))
- `arg4` (`ro.sync.ecss.dita.topic.ref.c`)
- `arg5` (`java.lang.Object`)
- `arg6` (`boolean`)

**Returns:** `void`

### `editProperties(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `e(AuthorAccess arg0, List<AuthorElement> arg1, int arg2, int arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.util.List<ro.sync.ecss.extensions.api.node.AuthorElement>`)
- `arg2` (`int`)
- `arg3` (`int`)

**Returns:** `void`

### `insertHref(AuthorAccess arg0, String arg1, String arg2, String arg3, boolean arg4, boolean arg5, URL arg6, boolean arg7)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)
- `arg6` (`java.net.URL`)
- `arg7` (`boolean`)

**Returns:** `void`

### `g(AuthorAccess arg0, String arg1, String arg2, String arg3, boolean arg4, String arg5)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)
- `arg5` (`java.lang.String`)

**Returns:** `void`

### `d(AuthorAccess arg0, String arg1, String arg2, String arg3, boolean arg4, URL arg5, boolean arg6)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)
- `arg5` (`java.net.URL`)
- `arg6` (`boolean`)

**Returns:** `void`

### `insertHref(AuthorAccess arg0, String arg1, String arg2, String arg3, boolean arg4, boolean arg5)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)
- `arg5` (`boolean`)

**Returns:** `void`

### `insertContentKeyReference(AuthorAccess arg0, String arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `insertContentReference(AuthorAccess arg0, URL arg1, boolean arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.net.URL`)
- `arg2` (`boolean`)

**Returns:** `void`

### `insertTopicref(AuthorAccess arg0, URL arg1, boolean arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.net.URL`)
- `arg2` (`boolean`)

**Returns:** `void`

### `insertTopicref(WSDITAMapEditorPage arg0, URL arg1, String arg2, boolean arg3, boolean arg4)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage`](../../exml/workspace/api/editor/page/ditamap/WSDITAMapEditorPage.md))
- `arg1` (`java.net.URL`)
- `arg2` (`java.lang.String`)
- `arg3` (`boolean`)
- `arg4` (`boolean`)

**Returns:** `void`

### `insertTopicref(WSDITAMapEditorPage arg0, URL arg1, String arg2, DITATopicInsertionPosition arg3, boolean arg4)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.editor.page.ditamap.WSDITAMapEditorPage`](../../exml/workspace/api/editor/page/ditamap/WSDITAMapEditorPage.md))
- `arg1` (`java.net.URL`)
- `arg2` (`java.lang.String`)
- `arg3` ([`ro.sync.ecss.dita.DITATopicInsertionPosition`](./DITATopicInsertionPosition.md))
- `arg4` (`boolean`)

**Returns:** `void`

### `insertReference(AuthorAccess arg0, int arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)

**Returns:** `void`

### `showInsertReferenceDialog(c arg0, j arg1, int arg2, Object arg3, int arg4, boolean arg5, b arg6)`

**Parameters:**
- `arg0` (`ro.sync.ecss.contentcompletion.c`)
- `arg1` (`ro.sync.ecss.g.j`)
- `arg2` (`int`)
- `arg3` (`java.lang.Object`)
- `arg4` (`int`)
- `arg5` (`boolean`)
- `arg6` (`ro.sync.ecss.dita.topic.ref.b`)

**Returns:** `void`

### `showInsertReferenceDialog(c arg0, j arg1, int arg2, Object arg3, int arg4, boolean arg5, b arg6, IKeyInfoFilter arg7, boolean arg8)`

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

**Returns:** `void`

### `insertReference(AuthorAccess arg0, String arg1, String arg2, String arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

**Returns:** `void`

### `insertReference(AuthorAccess arg0, String arg1, int arg2, String arg3, String arg4)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`int`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)

**Returns:** `void`

### `insertReference(AuthorAccess arg0, int arg1, z arg2, c arg3, j arg4)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)
- `arg2` (`ro.sync.ecss.component.z`)
- `arg3` (`ro.sync.ecss.contentcompletion.c`)
- `arg4` (`ro.sync.ecss.dita.reference.j`)

**Returns:** `int`

### `getRootMapURL()`

**Returns:** `java.net.URL`

### `resolveKeyRef(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.net.URL`

### `resolveKeyRef(String arg0, boolean arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`boolean`)

**Returns:** `java.net.URL`

### `resolveKeyRef(URL arg0, String arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)

**Returns:** `java.net.URL`

### `checkValidKeyRef(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.String`

### `resolveKeyRef(URL arg0, String arg1, ContextKeyManager arg2, boolean arg3)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)
- `arg2` ([`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md))
- `arg3` (`boolean`)

**Returns:** `java.net.URL`

### `resolveKeyRefToHref(URL arg0, String arg1, ContextKeyManager arg2, boolean arg3)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)
- `arg2` ([`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md))
- `arg3` (`boolean`)

**Returns:** `java.lang.String`

### `createReusableComponent(AuthorAccess arg0, DITAUniqueIDAssigner arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.DITAUniqueIDAssigner`](../extensions/api/DITAUniqueIDAssigner.md))

**Returns:** `void`

### `insertReusableComponent(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `replaceAllConrefs(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `replaceConref(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `expandAllKeyrefs(AuthorAccess arg0, LinkTextResolver arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.extensions.api.link.LinkTextResolver`](../extensions/api/link/LinkTextResolver.md))

**Returns:** `java.util.List<ro.sync.document.DocumentPositionedInfo>`

### `removeReference(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `addEditReference(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `isGeneralizationOf(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `boolean`

### `getInheritanceType(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `int`

### `parseDITAHref(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

### `parseDITAHref(String arg0, String arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

### `parseDITAKeyRef(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

### `parseDITAKeyRef(URL arg0, String arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

### `parseDITAKeyRef(URL arg0, ContextKeyManager arg1, String arg2)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` ([`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md))
- `arg2` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

### `parseDITAKeyRef(String arg0, s arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`ro.sync.ecss.dita.reference.keyref.s`)

**Returns:** [`ro.sync.ecss.dita.Reference`](./Reference.md)

### `getAutoInsertTopicRefElementName(AuthorAccess arg0, int arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)

**Returns:** `java.lang.String`

### `getAutoInsertTopicRefElementName(AuthorDocumentController arg0, int arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg1` (`int`)

**Returns:** `java.lang.String`

### `getAutoInsertRefElementName(AuthorAccess arg0, int arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)

**Returns:** `java.lang.String`

### `getAutoInsertImageRefElementName(AuthorAccess arg0, int arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)

**Returns:** `java.lang.String`

### `getPossibleElements(AuthorDocumentController arg0, int arg1, String arg2, String[] arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg1` (`int`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String[]`)

**Returns:** [`ro.sync.contentcompletion.xml.CIElement[]`](../../contentcompletion/xml/CIElement.md)

### `getEquivalentChildCIElement(AuthorAccess arg0, int arg1, String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`int`)
- `arg2` (`java.lang.String`)

**Returns:** [`ro.sync.contentcompletion.xml.CIElement`](../../contentcompletion/xml/CIElement.md)

### `getKeys()`

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`

### `getKeys(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`

### `getKeysForInsertion(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.util.List<ro.sync.ecss.dita.reference.keyref.KeyInfo>`

### `getKeys(URL arg0, ContextKeyManager arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` ([`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md))

**Returns:** `java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`

### `getURLKeyScopeContexts(URL arg0, ContextKeyManager arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` ([`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md))

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`

### `computeFormatForURLPasteAndDnD(UtilAccess arg0, URL arg1, ReferenceType arg2)`

**Parameters:**
- `arg0` ([`ro.sync.exml.workspace.api.util.UtilAccess`](../../exml/workspace/api/util/UtilAccess.md))
- `arg1` (`java.net.URL`)
- `arg2` ([`ro.sync.ecss.extensions.api.ReferenceType`](../extensions/api/ReferenceType.md))

**Returns:** `java.lang.String`

### `computeLinkScope(URL arg0, URL arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)

**Returns:** `java.lang.String`

### `pasteAsReference(AuthorAccess arg0, boolean arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`boolean`)

**Returns:** `java.lang.String`

### `pasteAsReference(AuthorAccess arg0, DITAAccess.PasteInfo arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`ro.sync.ecss.dita.DITAAccess.PasteInfo`)

**Returns:** `java.lang.String`

### `pasteClipboardFragmentsAsReference(AuthorAccess arg0, DITAAccess.PasteInfo arg1, AuthorDocumentFragmentClipboardObject[] arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`ro.sync.ecss.dita.DITAAccess.PasteInfo`)
- `arg2` ([`ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[]`](../component/AuthorDocumentFragmentClipboardObject.md))

**Returns:** `boolean`

### `pasteClipboardFragmentsAsReference(AuthorAccess arg0, DITAAccess.PasteInfo arg1, AuthorDocumentFragmentClipboardObject[] arg2, SelectionInterpretationMode arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`ro.sync.ecss.dita.DITAAccess.PasteInfo`)
- `arg2` ([`ro.sync.ecss.component.AuthorDocumentFragmentClipboardObject[]`](../component/AuthorDocumentFragmentClipboardObject.md))
- `arg3` ([`ro.sync.ecss.extensions.api.SelectionInterpretationMode`](../extensions/api/SelectionInterpretationMode.md))

**Returns:** `boolean`

### `i(AuthorAccess arg0, ContentDescription arg1, DITAAccess.PasteInfo arg2, String arg3, String arg4, String arg5, boolean arg6, boolean arg7)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`ro.sync.ecss.strictediting.ContentDescription`)
- `arg2` (`ro.sync.ecss.dita.DITAAccess.PasteInfo`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`java.lang.String`)
- `arg6` (`boolean`)
- `arg7` (`boolean`)

**Returns:** `boolean`

### `filterAttributeValues(List<CIValue> arg0, WhatPossibleValuesHasAttributeContext arg1, String arg2)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))
- `arg2` (`java.lang.String`)

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `filterAttributeValues(List<CIValue> arg0, WhatPossibleValuesHasAttributeContext arg1, String arg2, AuthorAccess arg3)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))
- `arg2` (`java.lang.String`)
- `arg3` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `filterAttributeValues(List<CIValue> arg0, WhatPossibleValuesHasAttributeContext arg1, ContextKeyManager arg2, String arg3, AuthorAccess arg4)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))
- `arg2` ([`ro.sync.ecss.dita.ContextKeyManager`](./ContextKeyManager.md))
- `arg3` (`java.lang.String`)
- `arg4` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `t(List<CIValue> arg0, WhatPossibleValuesHasAttributeContext arg1, URL arg2, String arg3, boolean arg4)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))
- `arg2` (`java.net.URL`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `b(List<CIValue> arg0, String arg1, boolean arg2, List<CIValue> arg3)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)
- `arg3` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `l(List<CIValue> arg0, String arg1)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `j(URL arg0, URL arg1, String arg2, DITAAccess._b arg3)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)
- `arg2` (`java.lang.String`)
- `arg3` (`ro.sync.ecss.dita.DITAAccess._b`)

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `computeElementClazz(WhatPossibleValuesHasAttributeContext arg0)`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))

**Returns:** `java.lang.String`

### `insertImage(AuthorAccess arg0, String arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `insertMedia(AuthorAccess arg0, MediaInfo arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.dita.MediaInfo`](./MediaInfo.md))

**Returns:** `void`

### `chooseMediaReference(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** [`ro.sync.ecss.dita.MediaInfo`](./MediaInfo.md)

### `insertMediaSchemaAware(AuthorAccess arg0, MediaInfo arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.dita.MediaInfo`](./MediaInfo.md))

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../extensions/api/schemaaware/SchemaAwareHandlerResult.md)

### `computeMediaReferenceXMLToInsert(AuthorAccess arg0, MediaInfo arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.dita.MediaInfo`](./MediaInfo.md))

**Returns:** `java.lang.String`

### `u(AuthorAccess arg0, Map<String,String> arg1, String arg2, StringBuilder arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.util.Map<java.lang.String,java.lang.String>`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.StringBuilder`)

**Returns:** `void`

### `h(AuthorAccess arg0, j arg1, Map<String,String> arg2, String arg3, StringBuilder arg4)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`ro.sync.ecss.g.j`)
- `arg2` (`java.util.Map<java.lang.String,java.lang.String>`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.StringBuilder`)

**Returns:** `void`

### `insertImage(AuthorAccess arg0, ImageInfo arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.dita.ImageInfo`](./ImageInfo.md))

**Returns:** `void`

### `chooseImageReference(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** [`ro.sync.ecss.dita.ImageInfo`](./ImageInfo.md)

### `insertImageSchemaAware(AuthorAccess arg0, String arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../extensions/api/schemaaware/SchemaAwareHandlerResult.md)

### `insertImageSchemaAware(AuthorAccess arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../extensions/api/schemaaware/SchemaAwareHandlerResult.md)

### `insertImageSchemaAware(AuthorAccess arg0, ImageInfo arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` ([`ro.sync.ecss.dita.ImageInfo`](./ImageInfo.md))

**Returns:** [`ro.sync.ecss.extensions.api.schemaaware.SchemaAwareHandlerResult`](../extensions/api/schemaaware/SchemaAwareHandlerResult.md)

### `c(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `java.util.Optional<ro.sync.ecss.extensions.api.node.AuthorElement>`

### `m(AuthorElement arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../extensions/api/node/AuthorElement.md))

**Returns:** `int`

### `computeImageReferenceXMLToInsert(AuthorAccess arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `java.lang.String`

### `buildFigureHrefImageXMLToInsert(AuthorAccess arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `java.lang.String`

### `buildFigureKeyrefImageXMLToInsert(AuthorAccess arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getPossibleElementQName(AuthorDocumentController arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `java.lang.String`

### `searchReferences(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `computeLinkText(String arg0, String arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)

**Returns:** `java.lang.String`

### `computeLinkText(AuthorNode arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `java.lang.String`

### `computeLinkText(AuthorNode arg0, String arg1, String arg2, String arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

**Returns:** `java.lang.String`

### `computeLinkText(AuthorNode arg0, String arg1, String arg2, String arg3, KeysManagerBase arg4)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` ([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md))

**Returns:** `java.lang.String`

### `filterElements(List<CIElement> arg0, WhatElementsCanGoHereContext arg1)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../contentcompletion/xml/WhatElementsCanGoHereContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `filterElements(List<CIElement> arg0, WhatElementsCanGoHereContext arg1, String arg2)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIElement>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatElementsCanGoHereContext`](../../contentcompletion/xml/WhatElementsCanGoHereContext.md))
- `arg2` (`java.lang.String`)

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIElement>`

### `resolveKeyNotFoundError(AuthorAccess arg0, String arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)

**Returns:** `void`

### `filterDITAVALAttributeValues(List<CIValue> arg0, WhatPossibleValuesHasAttributeContext arg1)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIValue>`)
- `arg1` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIValue>`

### `createNewTopicReference(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `k(AuthorDocumentController arg0, AuthorEditorAccess arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.access.AuthorEditorAccess`](../extensions/api/access/AuthorEditorAccess.md))

**Returns:** `void`

### `pushElement(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `isDITA(Attributes arg0)`

**Parameters:**
- `arg0` (`org.xml.sax.Attributes`)

**Returns:** `boolean`

### `isDITA1_3OrNewer(Attributes arg0)`

**Parameters:**
- `arg0` (`org.xml.sax.Attributes`)

**Returns:** `boolean`

### `isDITA1_3OrNewer(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `boolean`

### `insertLinkReference(AuthorAccess arg0, String arg1, String arg2, String arg3, boolean arg4, String arg5, URL arg6, boolean arg7)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`boolean`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.net.URL`)
- `arg7` (`boolean`)

**Returns:** `void`

### `insertLinkReference(AuthorAccess arg0, String arg1, String arg2, String arg3, boolean arg4, String arg5, String arg6, URL arg7, boolean arg8)`

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

**Returns:** `void`

### `insertLinkReference(AuthorAccess arg0, String arg1, String arg2, String arg3, boolean arg4, String arg5, URL arg6, boolean arg7, DITAAccess._c arg8)`

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

**Returns:** `void`

### `insertLinkReference(AuthorAccess arg0, String arg1, String arg2, String arg3, boolean arg4, String arg5, String arg6, URL arg7, boolean arg8, DITAAccess._c arg9)`

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

**Returns:** `void`

### `insertLinkReference(String arg0, String arg1, String arg2, AuthorAccess arg3, String arg4, String arg5, String arg6, boolean arg7, String arg8)`

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

**Returns:** `void`

### `insertLinkReference(String arg0, String arg1, String arg2, AuthorAccess arg3, String arg4, String arg5, String arg6, boolean arg7, boolean arg8, String arg9)`

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

**Returns:** `void`

### `rewriteKeyref(LinkedHashMap<URL,List<Stack<Set<String>>>> arg0, LinkedHashMap<String,KeyInfo> arg1, AuthorNode arg2, String arg3)`

**Parameters:**
- `arg0` (`java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`)
- `arg1` (`java.util.LinkedHashMap<java.lang.String,ro.sync.ecss.dita.reference.keyref.KeyInfo>`)
- `arg2` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg3` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getURLKeyScopeContexts(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`

### `editTopicref(AuthorElement[] arg0, AuthorAccess arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement[]`](../extensions/api/node/AuthorElement.md))
- `arg1` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `getDitaReferenceTargets(AuthorAccess arg0, URL arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.net.URL`)

**Returns:** `java.util.List<ro.sync.ecss.dita.DitaReferenceTargetDescriptor>`

### `getDitaReferenceTargets(URL arg0, URL arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)

**Returns:** `java.util.List<ro.sync.ecss.dita.DitaReferenceTargetDescriptor>`

### `getFormat(String arg0, String arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)

**Returns:** `java.lang.String`

### `getFormatForLinkCreatedFromGUI(String arg0, String arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.lang.String`)
- `arg2` (`boolean`)

**Returns:** `java.lang.String`

### `checkValidKeyName(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.String`

### `getHrefInformation(AuthorNode arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))

**Returns:** [`ro.sync.ecss.dita.HrefInfo`](./HrefInfo.md)

### `getHrefInformation(KeysManagerBase arg0, AuthorNode arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))

**Returns:** [`ro.sync.ecss.dita.HrefInfo`](./HrefInfo.md)

### `exportDITAMap(URL arg0, File arg1, boolean arg2, String arg3, ExportProgressUpdater arg4)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.io.File`)
- `arg2` (`boolean`)
- `arg3` (`java.lang.String`)
- `arg4` ([`ro.sync.ecss.dita.mapeditor.actions.export.helper.ExportProgressUpdater`](mapeditor/actions/export/helper/ExportProgressUpdater.md))

**Returns:** `void`

### `attachKeyScopeInformation(URL arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `java.net.URL`

### `attachKeyScopeInformation(URL arg0, String arg1, String arg2, String arg3)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)

**Returns:** `java.net.URL`

### `attachKeyScopeInformation(URL arg0, Stack<Set<String>> arg1, String arg2)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.util.Stack<java.util.Set<java.lang.String>>`)
- `arg2` (`java.lang.String`)

**Returns:** `java.net.URL`

### `computeVariableKeyrefElementName(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `java.lang.String`

### `computeVariableKeyrefElementName(AuthorAccess arg0, boolean arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`boolean`)

**Returns:** `java.lang.String`

### `computeKeyScopeStack(AuthorNode arg0, LinkedHashMap<URL,List<Stack<Set<String>>>> arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`)

**Returns:** `java.util.Stack<java.util.Set<java.lang.String>>`

### `computeKeyScopeStack(AuthorNode arg0, LinkedHashMap<URL,List<Stack<Set<String>>>> arg1, Map<AuthorNode,Set<String>> arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`java.util.LinkedHashMap<java.net.URL,java.util.List<java.util.Stack<java.util.Set<java.lang.String>>>>`)
- `arg2` (`java.util.Map<ro.sync.ecss.extensions.api.node.AuthorNode,java.util.Set<java.lang.String>>`)

**Returns:** `java.util.Stack<java.util.Set<java.lang.String>>`

### `getKeyForUrl(KeysManagerBase arg0, URL arg1, URL arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md))
- `arg1` (`java.net.URL`)
- `arg2` (`java.net.URL`)

**Returns:** `java.lang.String`

### `getKeyForUrl(KeysManagerBase arg0, URL arg1, URL arg2, AuthorNode arg3)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md))
- `arg1` (`java.net.URL`)
- `arg2` (`java.net.URL`)
- `arg3` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))

**Returns:** `java.lang.String`

### `getKeyForUrl(URL arg0, URL arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.net.URL`)

**Returns:** `java.lang.String`

### `getKeyRefValueForUrl(KeysManagerBase arg0, URL arg1, URL arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.dita.KeysManagerBase`](./KeysManagerBase.md))
- `arg1` (`java.net.URL`)
- `arg2` (`java.net.URL`)

**Returns:** `java.lang.String`

### `r(URL arg0, String arg1)`

**Parameters:**
- `arg0` (`java.net.URL`)
- `arg1` (`java.lang.String`)

**Returns:** `java.lang.String`

### `checkConsecutiveInsertionWarning(int arg0, int arg1, int arg2, j arg3, j arg4)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)
- `arg2` (`int`)
- `arg3` (`ro.sync.ecss.dita.reference.j`)
- `arg4` (`ro.sync.ecss.dita.reference.j`)

**Returns:** `int`

### `isKeyReferenceToImage(KeyInfo arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

**Returns:** `boolean`

### `isGenericMediaContent(KeyInfo arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

**Returns:** `boolean`

### `detectMediaObjectOutputclass(KeyInfo arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

**Returns:** `java.lang.String`

### `isReferenceToDITAResource(AuthorNode arg0, KeyInfo arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

**Returns:** `boolean`

### `isReferenceToDITACompatibleResource(AuthorNode arg0, KeyInfo arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg1` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

**Returns:** `boolean`

### `getConverterFormatForDITACompatibleResource(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `java.lang.String`

### `isDITACompatileFormat(String arg0)`

**Parameters:**
- `arg0` (`java.lang.String`)

**Returns:** `boolean`

### `convertDitaCompatibleResource(Reader arg0, String arg1, String arg2)`

**Parameters:**
- `arg0` (`java.io.Reader`)
- `arg1` (`java.lang.String`)
- `arg2` (`java.lang.String`)

**Returns:** `java.lang.String`

### `isKeyDefToDITAResource(KeyInfo arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.dita.reference.keyref.KeyInfo`)

**Returns:** `boolean`

### `annotateAttributes(List<CIAttribute> arg0)`

**Parameters:**
- `arg0` (`java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`)

**Returns:** `java.util.List<ro.sync.contentcompletion.xml.CIAttribute>`

### `getFragWithMostSuitableTopicrefs(AuthorDocumentController arg0, AuthorDocumentFragment arg1, int arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../extensions/api/node/AuthorDocumentFragment.md))
- `arg2` (`int`)

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../extensions/api/node/AuthorDocumentFragment.md)

### `getFragWithMostSuitableTopicrefs(AuthorDocumentController arg0, AuthorNode arg1, int arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../extensions/api/AuthorDocumentController.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorNode`](../extensions/api/node/AuthorNode.md))
- `arg2` (`int`)

**Returns:** [`ro.sync.ecss.extensions.api.node.AuthorDocumentFragment`](../extensions/api/node/AuthorDocumentFragment.md)

### `findSimilarTopics(AuthorAccess arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))

**Returns:** `void`

### `getRelatedLinksFromReltable(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `java.util.List<ro.sync.ecss.dita.reference.reltable.RelLink>`

### `n(WhatPossibleValuesHasAttributeContext arg0, boolean arg1, boolean arg2, DitaReferenceTargetDescriptor arg3)`

**Parameters:**
- `arg0` ([`ro.sync.contentcompletion.xml.WhatPossibleValuesHasAttributeContext`](../../contentcompletion/xml/WhatPossibleValuesHasAttributeContext.md))
- `arg1` (`boolean`)
- `arg2` (`boolean`)
- `arg3` ([`ro.sync.ecss.dita.DitaReferenceTargetDescriptor`](./DitaReferenceTargetDescriptor.md))

**Returns:** `boolean`

### `proposeFolderUrlForChildTopicref(AuthorElement arg0)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../extensions/api/node/AuthorElement.md))

**Returns:** `java.net.URL`

### `detectInsertionType(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** [`ro.sync.ecss.dita.DITAImposedReferenceType`](./DITAImposedReferenceType.md)

### `computeQualifiedKeyNames(String arg0, Stack<Set<String>> arg1)`

**Parameters:**
- `arg0` (`java.lang.String`)
- `arg1` (`java.util.Stack<java.util.Set<java.lang.String>>`)

**Returns:** `java.util.List<java.lang.String>`

### `preferAddingKeyrefToAlreadyReferencedResource(URL arg0)`

**Parameters:**
- `arg0` (`java.net.URL`)

**Returns:** `boolean`

### `showNewFileDialog(AuthorAccess arg0, String arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`java.lang.String`)

**Returns:** `java.net.URL`

### `showKeysAndReusableComponents(AuthorAccess arg0, boolean arg1, boolean arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../extensions/api/AuthorAccess.md))
- `arg1` (`boolean`)
- `arg2` (`boolean`)

**Returns:** `void`

