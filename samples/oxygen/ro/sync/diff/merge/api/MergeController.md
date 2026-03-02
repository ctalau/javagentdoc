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

### `<init>(DiffModel arg0, AuthorDocumentController arg1, AuthorDocumentController arg2)`

**Parameters:**
- `arg0` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))
- `arg1` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../ecss/extensions/api/AuthorDocumentController.md))
- `arg2` ([`ro.sync.ecss.extensions.api.AuthorDocumentController`](../../../ecss/extensions/api/AuthorDocumentController.md))

## Methods

### `copy(ContentInterval arg0, ContentInterval arg1, boolean arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg2` (`boolean`)

**Returns:** `void`

### `copyPromise(ContentInterval arg0, ContentInterval arg1, boolean arg2)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg2` (`boolean`)

**Returns:** `ro.sync.diff.merge.api.MergeController._b`

### `h(MergeController._d arg0, MergeController._d arg1, boolean arg2, DiffModel arg3)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`boolean`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `ro.sync.diff.merge.api.MergeController._b`

### `q(MergeController._d arg0, MergeController._d arg1, boolean arg2, DiffModel arg3)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`boolean`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `void`

### `j(int arg0, List<IntervalsPair> arg1, b arg2, IntervalsPair.Side arg3, DiffModel arg4)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`java.util.List<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg2` (`ro.sync.diff.merge.api.b`)
- `arg3` (`ro.sync.diff.merge.api.IntervalsPair.Side`)
- `arg4` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `void`

### `e(int arg0, DiffModel arg1, IntervalsPair.Side arg2)`

**Parameters:**
- `arg0` (`int`)
- `arg1` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))
- `arg2` (`ro.sync.diff.merge.api.IntervalsPair.Side`)

**Returns:** `java.util.List<ro.sync.diff.merge.api.IntervalsPair>`

### `c(ContentInterval arg0, ContentInterval arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))
- `arg1` ([`ro.sync.ecss.extensions.api.ContentInterval`](../../../ecss/extensions/api/ContentInterval.md))

**Returns:** `boolean`

### `u(MergeController._d arg0, MergeController._d arg1)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)

**Returns:** `boolean`

### `g(MergeController._d arg0)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)

**Returns:** `boolean`

### `l(MergeController._d arg0)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)

**Returns:** `boolean`

### `n(MergeController._d arg0, MergeController._d arg1, List<IntervalsPair> arg2, DiffModel arg3)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`java.util.List<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `ro.sync.diff.merge.api.MergeController._d[]`

### `x(MergeController._d arg0, MergeController._d arg1, List<IntervalsPair> arg2, DiffModel arg3)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`java.util.List<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `ro.sync.diff.merge.api.MergeController._d[]`

### `s(MergeController._d arg0, DiffModel arg1)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `java.util.List<ro.sync.diff.merge.api.IntervalsPair>`

### `b(int arg0, IntervalsPair.Side arg1, DiffModel arg2)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`ro.sync.diff.merge.api.IntervalsPair.Side`)
- `arg2` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `java.util.Optional<ro.sync.diff.merge.api.IntervalsPair>`

### `y(ContentInterval arg0, ContentInterval arg1)`

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

### `t(AuthorElement arg0, AuthorElement arg1)`

**Parameters:**
- `arg0` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../ecss/extensions/api/node/AuthorElement.md))
- `arg1` ([`ro.sync.ecss.extensions.api.node.AuthorElement`](../../../ecss/extensions/api/node/AuthorElement.md))

**Returns:** `java.util.List`

### `r(cc arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.g.cc`)

**Returns:** `boolean`

### `o(cc arg0)`

**Parameters:**
- `arg0` (`ro.sync.ecss.g.cc`)

**Returns:** `java.util.List<ro.sync.diff.merge.api.IntervalsPair>`

### `d(MergeController._d arg0, MergeController._d arg1, List<IntervalsPair> arg2, DiffModel arg3)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`java.util.List<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg3` ([`ro.sync.diff.merge.api.DiffModel`](./DiffModel.md))

**Returns:** `ro.sync.diff.merge.api.MergeController._d[]`

### `w(Iterable<IntervalsPair> arg0, MergeController._d arg1, boolean arg2)`

**Parameters:**
- `arg0` (`java.lang.Iterable<ro.sync.diff.merge.api.IntervalsPair>`)
- `arg1` (`ro.sync.diff.merge.api.MergeController._d`)
- `arg2` (`boolean`)

**Returns:** `java.util.List<ro.sync.diff.merge.api.IntervalsPair>`

### `setSourceSide(IntervalsPair.Side arg0)`

**Parameters:**
- `arg0` (`ro.sync.diff.merge.api.IntervalsPair.Side`)

**Returns:** `void`

### `f(int arg0, int arg1, MergeController._d arg2)`

**Parameters:**
- `arg0` (`int`)
- `arg1` (`int`)
- `arg2` (`ro.sync.diff.merge.api.MergeController._d`)

**Returns:** `ro.sync.diff.merge.api.MergeController._d`

