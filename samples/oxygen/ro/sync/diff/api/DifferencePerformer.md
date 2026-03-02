# Interface: `DifferencePerformer`

**Package:** [`ro.sync.diff.api`](README.md)

**Fully Qualified Name:** `ro.sync.diff.api.DifferencePerformer`

## Methods

### `performDiff(java.io.Reader arg0, java.io.Reader arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, ro.sync.diff.api.DiffOptions arg5, ro.sync.diff.api.DiffProgressListener arg6)`

**Parameters:**
- `arg0` (`java.io.Reader`)
- `arg1` (`java.io.Reader`)
- `arg2` (`java.lang.String`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` ([`ro.sync.diff.api.DiffOptions`](./DiffOptions.md))
- `arg6` ([`ro.sync.diff.api.DiffProgressListener`](./DiffProgressListener.md))

**Returns:** `java.util.List<ro.sync.diff.api.Difference>`

### `performDiff(java.io.Reader arg0, java.io.Reader arg1, java.io.Reader arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6, ro.sync.diff.api.DiffOptions arg7, ro.sync.diff.api.DiffProgressListener arg8)`

**Parameters:**
- `arg0` (`java.io.Reader`)
- `arg1` (`java.io.Reader`)
- `arg2` (`java.io.Reader`)
- `arg3` (`java.lang.String`)
- `arg4` (`java.lang.String`)
- `arg5` (`java.lang.String`)
- `arg6` (`java.lang.String`)
- `arg7` ([`ro.sync.diff.api.DiffOptions`](./DiffOptions.md))
- `arg8` ([`ro.sync.diff.api.DiffProgressListener`](./DiffProgressListener.md))

**Returns:** `java.util.List<ro.sync.diff.api.Difference>`

### `stop()`

**Returns:** `void`

