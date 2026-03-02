# Class: `MergeController`

**Package:** [`ro.sync.diff.merge.api`](README.md)

**Fully Qualified Name:** `ro.sync.diff.merge.api.MergeController`

## Fields

### `d`

**Type:** `org.slf4j.Logger`

### `messages`

**Type:** `ro.sync.i18n.c`

### `b`

**Type:** [`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md)

### `f`

**Type:** `ro.sync.diff.merge.api.b`

### `e`

**Type:** `ro.sync.diff.merge.api.b`

### `c`

**Type:** `ro.sync.diff.merge.api.IntervalsPair.Side`

## Constructors

### `<init>(ro.sync.diff.merge.api.DiffModel arg0, ro.sync.ecss.extensions.api.AuthorDocumentController arg1, ro.sync.ecss.extensions.api.AuthorDocumentController arg2)`

**Parameters:**
- `arg0` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))
- `arg1` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../ecss/extensions/api/AuthorDocumentController.md))
- `arg2` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../ecss/extensions/api/AuthorDocumentController.md))

## Methods

### `copy(ro.sync.ecss.extensions.api.ContentInterval arg0, ro.sync.ecss.extensions.api.ContentInterval arg1, boolean arg2)`

**Returns:** `void`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg2` (`boolean`)

### `copyPromise(ro.sync.ecss.extensions.api.ContentInterval arg0, ro.sync.ecss.extensions.api.ContentInterval arg1, boolean arg2)`

**Returns:** `ro.sync.diff.merge.api.MergeController._b`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg2` (`boolean`)

### `h(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.MergeController._d arg1, boolean arg2, ro.sync.diff.merge.api.DiffModel arg3)`

**Returns:** `ro.sync.diff.merge.api.MergeController._b`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`boolean`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

### `q(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.MergeController._d arg1, boolean arg2, ro.sync.diff.merge.api.DiffModel arg3)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`boolean`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

### `j(int arg0, java.util.List<ro.sync.diff.merge.api.IntervalsPair> arg1, ro.sync.diff.merge.api.b arg2, ro.sync.diff.merge.api.IntervalsPair.Side arg3, ro.sync.diff.merge.api.DiffModel arg4)`

**Returns:** `void`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`java.util.List<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg2` (`ro.sync.diff.merge.api.b`)
- `arg3` (`ro.sync.diff.merge.api.IntervalsPair.Side`)
- `arg4` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

### `e(int arg0, ro.sync.diff.merge.api.DiffModel arg1, ro.sync.diff.merge.api.IntervalsPair.Side arg2)`

**Returns:** `java.util.List<ro.sync.diff.merge.api.IntervalsPair>`

**Parameters:**
- `arg0` (`int`)
- `arg1` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))
- `arg2` (`ro.sync.diff.merge.api.IntervalsPair.Side`)

### `c(ro.sync.ecss.extensions.api.ContentInterval arg0, ro.sync.ecss.extensions.api.ContentInterval arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))

### `u(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.MergeController._d arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)

### `g(ro.sync.diff.merge.api.MergeController._d arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)

### `l(ro.sync.diff.merge.api.MergeController._d arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)

### `n(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.MergeController._d arg1, java.util.List<ro.sync.diff.merge.api.IntervalsPair> arg2, ro.sync.diff.merge.api.DiffModel arg3)`

**Returns:** `ro.sync.diff.merge.api.MergeController._d[]`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`java.util.List<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

### `x(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.MergeController._d arg1, java.util.List<ro.sync.diff.merge.api.IntervalsPair> arg2, ro.sync.diff.merge.api.DiffModel arg3)`

**Returns:** `ro.sync.diff.merge.api.MergeController._d[]`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`java.util.List<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

### `s(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.DiffModel arg1)`

**Returns:** `java.util.List<ro.sync.diff.merge.api.IntervalsPair>`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

### `b(int arg0, ro.sync.diff.merge.api.IntervalsPair.Side arg1, ro.sync.diff.merge.api.DiffModel arg2)`

**Returns:** `java.util.Optional<ro.sync.diff.merge.api.IntervalsPair>`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`ro.sync.diff.merge.api.IntervalsPair.Side`)
- `arg2` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

### `y(ro.sync.ecss.extensions.api.ContentInterval arg0, ro.sync.ecss.extensions.api.ContentInterval arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))

### `p(int arg0, int arg1)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)

### `k(int arg0, int arg1)`

**Returns:** `ro.sync.diff.merge.api.MergeController._b`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)

### `t(ro.sync.ecss.extensions.api.node.AuthorElement arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1)`

**Returns:** `java.util.List`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../ecss/extensions/api/node/AuthorElement.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../ecss/extensions/api/node/AuthorElement.md))

### `r(ro.sync.ecss.g.cc arg0)`

**Returns:** `boolean`

**Parameters:**
- `arg0` (`ro.sync.ecss.g.cc`)

### `o(ro.sync.ecss.g.cc arg0)`

**Returns:** `java.util.List<ro.sync.diff.merge.api.IntervalsPair>`

**Parameters:**
- `arg0` (`ro.sync.ecss.g.cc`)

### `d(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.MergeController._d arg1, java.util.List<ro.sync.diff.merge.api.IntervalsPair> arg2, ro.sync.diff.merge.api.DiffModel arg3)`

**Returns:** `ro.sync.diff.merge.api.MergeController._d[]`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`java.util.List<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

### `w(java.lang.Iterable<ro.sync.diff.merge.api.IntervalsPair> arg0, ro.sync.diff.merge.api.MergeController._d arg1, boolean arg2)`

**Returns:** `java.util.List<ro.sync.diff.merge.api.IntervalsPair>`

**Parameters:**
- `arg0` (`java.lang.Iterable<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`boolean`)

### `setSourceSide(ro.sync.diff.merge.api.IntervalsPair.Side arg0)`

**Returns:** `void`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.IntervalsPair.Side`)

### `f(int arg0, int arg1, ro.sync.diff.merge.api.MergeController._d arg2)`

**Returns:** `ro.sync.diff.merge.api.MergeController._d`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)
- `arg2` (`ro.sync.diff.merge.api.MergeController._d`)

