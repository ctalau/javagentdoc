# Interface: `RedirectFollowingURLConnection`

**Package:** [`ro.sync.ecss.extensions.api.webapp.plugin`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.plugin.RedirectFollowingURLConnection`

## Description

Let's assume you want to open a document identified by an URL docURL. If your URLConnection 
 implements this interface, instead of using docURL as the system ID of the edited document, 
 oXygen will call `connection.getURL()` and use that URL instead.
 
 This interface is useful if the URL used to open the document is a proxy URL which will redirect
 to the actual document URL.

