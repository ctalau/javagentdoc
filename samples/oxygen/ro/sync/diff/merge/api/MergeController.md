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

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg2` (`boolean`)

**Returns:** `void`

### `copyPromise(ro.sync.ecss.extensions.api.ContentInterval arg0, ro.sync.ecss.extensions.api.ContentInterval arg1, boolean arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg2` (`boolean`)

**Returns:** `ro.sync.diff.merge.api.MergeController._b`

### `h(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.MergeController._d arg1, boolean arg2, ro.sync.diff.merge.api.DiffModel arg3)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`boolean`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `ro.sync.diff.merge.api.MergeController._b`

### `q(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.MergeController._d arg1, boolean arg2, ro.sync.diff.merge.api.DiffModel arg3)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`boolean`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `void`

### `j(int arg0, java.util.List<ro.sync.diff.merge.api.IntervalsPair> arg1, ro.sync.diff.merge.api.b arg2, ro.sync.diff.merge.api.IntervalsPair.Side arg3, ro.sync.diff.merge.api.DiffModel arg4)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`java.util.List<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg2` (`ro.sync.diff.merge.api.b`)
- `arg3` (`ro.sync.diff.merge.api.IntervalsPair.Side`)
- `arg4` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `void`

### `e(int arg0, ro.sync.diff.merge.api.DiffModel arg1, ro.sync.diff.merge.api.IntervalsPair.Side arg2)`

**Parameters:**
- `arg0` (`int`)
- `arg1` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))
- `arg2` (`ro.sync.diff.merge.api.IntervalsPair.Side`)

**Returns:** `java.util.List<ro.sync.diff.merge.api.IntervalsPair>`

### `c(ro.sync.ecss.extensions.api.ContentInterval arg0, ro.sync.ecss.extensions.api.ContentInterval arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))

**Returns:** `boolean`

### `u(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.MergeController._d arg1)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)

**Returns:** `boolean`

### `g(ro.sync.diff.merge.api.MergeController._d arg0)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)

**Returns:** `boolean`

### `l(ro.sync.diff.merge.api.MergeController._d arg0)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)

**Returns:** `boolean`

### `n(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.MergeController._d arg1, java.util.List<ro.sync.diff.merge.api.IntervalsPair> arg2, ro.sync.diff.merge.api.DiffModel arg3)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`java.util.List<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `ro.sync.diff.merge.api.MergeController._d[]`

### `x(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.MergeController._d arg1, java.util.List<ro.sync.diff.merge.api.IntervalsPair> arg2, ro.sync.diff.merge.api.DiffModel arg3)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`java.util.List<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `ro.sync.diff.merge.api.MergeController._d[]`

### `s(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.DiffModel arg1)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `java.util.List<ro.sync.diff.merge.api.IntervalsPair>`

### `b(int arg0, ro.sync.diff.merge.api.IntervalsPair.Side arg1, ro.sync.diff.merge.api.DiffModel arg2)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`ro.sync.diff.merge.api.IntervalsPair.Side`)
- `arg2` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `java.util.Optional<ro.sync.diff.merge.api.IntervalsPair>`

### `y(ro.sync.ecss.extensions.api.ContentInterval arg0, ro.sync.ecss.extensions.api.ContentInterval arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))

**Returns:** `boolean`

### `p(int arg0, int arg1)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)

**Returns:** `boolean`

### `k(int arg0, int arg1)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)

**Returns:** `ro.sync.diff.merge.api.MergeController._b`

### `t(ro.sync.ecss.extensions.api.node.AuthorElement arg0, ro.sync.ecss.extensions.api.node.AuthorElement arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../ecss/extensions/api/node/AuthorElement.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../ecss/extensions/api/node/AuthorElement.md))

**Returns:** `java.util.List`

### `r(ro.sync.ecss.g.cc arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.g.cc`)

**Returns:** `boolean`

### `o(ro.sync.ecss.g.cc arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.g.cc`)

**Returns:** `java.util.List<ro.sync.diff.merge.api.IntervalsPair>`

### `d(ro.sync.diff.merge.api.MergeController._d arg0, ro.sync.diff.merge.api.MergeController._d arg1, java.util.List<ro.sync.diff.merge.api.IntervalsPair> arg2, ro.sync.diff.merge.api.DiffModel arg3)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`java.util.List<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `ro.sync.diff.merge.api.MergeController._d[]`

### `w(java.lang.Iterable<ro.sync.diff.merge.api.IntervalsPair> arg0, ro.sync.diff.merge.api.MergeController._d arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.lang.Iterable<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`boolean`)

**Returns:** `java.util.List<ro.sync.diff.merge.api.IntervalsPair>`

### `setSourceSide(ro.sync.diff.merge.api.IntervalsPair.Side arg0)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.IntervalsPair.Side`)

**Returns:** `void`

### `f(int arg0, int arg1, ro.sync.diff.merge.api.MergeController._d arg2)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)
- `arg2` (`ro.sync.diff.merge.api.MergeController._d`)

**Returns:** `ro.sync.diff.merge.api.MergeController._d`

