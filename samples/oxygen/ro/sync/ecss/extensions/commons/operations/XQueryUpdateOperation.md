# Class: `XQueryUpdateOperation`

**Package:** [`ro.sync.ecss.extensions.commons.operations`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.operations.XQueryUpdateOperation`

**Implements:** [`ro.sync.ecss.extensions.api.AuthorOperation`](../../api/AuthorOperation.md)

## Description

The changes are performed directly over the Author nodes model.
 
 The script will be executed in the context of the caret node. 
 If the XQuery script declares the selection variable (see the following code snippet), 
 it will also receive the selected nodes (assuming that the selection consists entirely of nodes).
 
 THe following code snippet converts the selected paragraphs in a list.
 
 

```

 declare namespace oxyxq = "http://www.oxygenxml.com/ns/xqu";
(: This variable will be linked to the selected nodes assuming that there are 
actually fully selected nodes. For example this selection will return null: 

{SEL_START}text{SEL_END} in para
but this will give two "p" elements:
{SEL_END}
text
text2{SEL_END}

If a multiple selection exists it will also be processed and forwarded. 
Again, only fully selected nodes will be passed.
:)
declare variable $oxyxq:selection external;

(: We will process either the selection or the context node :)
let $toProcess := if (empty($oxyxq:selection)) then
    (.)
else
    ($oxyxq:selection)

return
    if (not(empty($toProcess))) then
        (
        (: Create the list :)
        let $ul :=
        <ul>
            {
                for $sel in $toProcess
                return
                    <li>{$sel}</li>
            }
        </ul>

        return
            (
            (: Delete the processed nodes :)
            for $sel in $toProcess
            return
                delete node $sel,
            (: Inserts the constructed list :)
            insert node $ul
                before $toProcess[1]
            )
        )
    else
        ()
  
```

## Fields

### `logger`

**Type:** `org.slf4j.Logger`

### `ARGUMENT_SCRIPT`

**Type:** `java.lang.String`

The value is `script`.

### `ARGUMENT_SCRIPT_PARAMETERS`

**Type:** `java.lang.String`

### `ARGUMENT_EXPAND_XINCLUDE_REFERENCES`

**Type:** `java.lang.String`

### `TOKEN_COMMA_END_LINE`

**Type:** `java.lang.String`

### `TOKEN_EQUALS`

**Type:** `java.lang.String`

### `arguments`

**Type:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `externalArguments`

**Type:** `java.util.Map<java.lang.String,java.lang.String>`

## Constructors

### `<init>()`

## Methods

### `doOperation(ro.sync.ecss.extensions.api.AuthorAccess authorAccess, ro.sync.ecss.extensions.api.ArgumentsMap args)`

**Returns:** `void`

**Parameters:**
- `authorAccess` ([`ro.sync.ecss.extensions.api.AuthorAccess`](../../api/AuthorAccess.md))
- `args` ([`ro.sync.ecss.extensions.api.ArgumentsMap`](../../api/ArgumentsMap.md))

### `getArguments()`

**Returns:** [`ro.sync.ecss.extensions.api.ArgumentDescriptor[]`](../../api/ArgumentDescriptor.md)

### `getDescription()`

**Returns:** `java.lang.String`

