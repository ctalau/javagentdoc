# Interface: `GroupChangesForMultiplePeersStrategy`

**Package:** [`ro.sync.ecss.extensions.api.webapp.ce`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.ce.GroupChangesForMultiplePeersStrategy`

**Extends:** [`ro.sync.ecss.extensions.api.webapp.ce.SaveStrategy`](./SaveStrategy.md)

## Description

Used to write a single snapshot of the document with changes made from the last save,
 where the snapshot may be capturing changes made by multiple peers.
 It facilitates a minimum number of writes to the file server per save.

## Methods

### `openConnection(URL documentUrl, PeerContext committer, List<PeerContext> authors)`

Called a single time for each document, allowing a minimum number of writes to the file server.
 It facilitates storing a revision for all peers together, writing only once per save to the file server.

**Parameters:**
- `documentUrl` (`java.net.URL`): The document URL.
      May be used to directly open a connection to the CMS on behalf of the committer.
      Note that it has the UserInfo of the committer.
- `committer` ([`ro.sync.ecss.extensions.api.webapp.ce.PeerContext`](./PeerContext.md)): The context of the peer that triggered either a save or a auto-save.
- `authors` (`java.util.List<ro.sync.ecss.extensions.api.webapp.ce.PeerContext>`): The context of peers whose changes are about to be saved onto the URL connection.
      Note that committer may or may not be an author.

**Returns:** `java.net.URLConnection`

