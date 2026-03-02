# Interface: `GroupChangesForSinglePeerStrategy`

**Package:** [`ro.sync.ecss.extensions.api.webapp.ce`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.ce.GroupChangesForSinglePeerStrategy`

**Extends:** [`ro.sync.ecss.extensions.api.webapp.ce.SaveStrategy`](./SaveStrategy.md)

## Description

Used to write document snapshots with changes made from the last save,
 where each snapshot is capturing changes made by a single peer.
 It facilitates tracking precise authorship of changes, each written revision containing changes by only one author.

## Methods

### `openConnection(java.net.URL documentUrl, ro.sync.ecss.extensions.api.webapp.ce.PeerContext author)`

**Returns:** `java.net.URLConnection`

It facilitates storing revisions for each peer individually.

**Parameters:**
- `documentUrl` (`java.net.URL`): The document URL.
    Note that it has the UserInfo stripped.
- `author` ([`ro.sync.ecss.extensions.api.webapp.ce.PeerContext`](./PeerContext.md)): The context of peer whose only changes are about to be saved onto the URL connection.

