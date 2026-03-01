# Interface: `GroupChangesForMultiplePeersStrategy`

**Package:** [`ro.sync.ecss.extensions.api.webapp.ce`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.ce.GroupChangesForMultiplePeersStrategy`

**Extends:** [`ro.sync.ecss.extensions.api.webapp.ce.SaveStrategy`](./SaveStrategy.md)

## Description

Used to write a single snapshot of the document with changes made from the last save,
 where the snapshot may be capturing changes made by multiple peers.
 It facilitates a minimum number of writes to the file server per save.

## Methods

### `openConnection(`java.net.URL` documentUrl, [`ro.sync.ecss.extensions.api.webapp.ce.PeerContext`](./PeerContext.md) committer, `java.util.List<ro.sync.ecss.extensions.api.webapp.ce.PeerContext>` authors)`

**Returns:** `java.net.URLConnection`

Called a single time for each document, allowing a minimum number of writes to the file server.
 It facilitates storing a revision for all peers together, writing only once per save to the file server.

