# Class: `WebappEditingSessionLifecycleListener`

**Package:** [`ro.sync.ecss.extensions.api.webapp.access`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.access.WebappEditingSessionLifecycleListener`

## Description

The lifecycle is influenced by the fact that we cannot safely detect when
 the users closed the application and that the users may have a lot of 
 instances of the application open.
 
 In order to optimize memory consumption, we serialize editing sessions to 
 disk sometimes (after periods of inactivity or if there are too many 
 concurrent sessions). However, the moment when the session gets serialized
 can be configured separately.
 
 This listener can be registered on WebappPluginWorkspace.

## Constructors

### `<init>()`

## Methods

### `editingSessionAboutToBeStarted(java.lang.String editingSessionId, java.lang.String licenseeId, java.net.URL systemId, java.util.Map<java.lang.String,java.lang.Object> options)`

**Returns:** `void`

If it throws a EditingSessionOpenVetoException, the details in the exception
 will be presented to the user.

**Parameters:**
- `editingSessionId` (`java.lang.String`): The id of the editing session in which the editing of the opened 
 document happens.
- `licenseeId` (`java.lang.String`): The id of the user or browser that uses a license. If the application cannot
  authenticate the user, it allocates the license to a specific browser.
- `systemId` (`java.net.URL`): The system id of the XML document about to be opened.
- `options` (`java.util.Map<java.lang.String,java.lang.Object>`): The options containing 
  - the cookies used for the document load request 
    - the key is the cookie name prefixed with 'cookie-'
    - the value is a String
  - the other HTTP headers 
    - the key is the header name prefixed with "header-"
    - the value is a list of strings.
  - the session id set by the Servlet container with the key: "session-id".
  - options set explicitly by the client JS code, the value being a string.

### `editingSessionFailedToStart(java.lang.String editingSessionId, java.lang.String licenseeId, java.net.URL systemId, java.util.Map<java.lang.String,java.lang.Object> options)`

**Returns:** `void`

**Parameters:**
- `editingSessionId` (`java.lang.String`): The id of the editing session in which the editing was supposed to happen.
- `licenseeId` (`java.lang.String`): The licensee id of the user that opened the document.
- `systemId` (`java.net.URL`): The system id of the XML document about to be opened.
- `options` (`java.util.Map<java.lang.String,java.lang.Object>`): The options passed on the #editingSessionAboutToBeStarted(String, String, URL, Map) method.

### `editingSessionStarted(java.lang.String editingSessionId, ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel documentModel)`

**Returns:** `void`

**Parameters:**
- `editingSessionId` (`java.lang.String`): The if of the editing session.
- `documentModel` ([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md)): The model of the edited document. From it one can
 derive the URL and the options used to open it.
 
 For the URL : documentModel.getAuthorDocumentController().getAuthorDocumentNode().getSystemID()
 For the editing session options: documentModel.getAuthorAccess().getEditorAccess().getEditingContext() 
 
 This document model may change during the lifetime of the session as it is
 inactivated and activated back.

### `editingSessionClosed(java.lang.String editingSessionId, ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel documentModel)`

**Returns:** `void`

Note that on some platforms, the user may close the browser without triggering
 this event.

**Parameters:**
- `editingSessionId` (`java.lang.String`): The id of the editing session.
- `documentModel` ([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md)): The model of the edited document.

### `editingSessionAboutToBeSerialized(java.lang.String editingSessionId, ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel documentModel)`

**Returns:** `void`

After this method is called, the document model given as a parameter cannot 
 be used anymore.

**Parameters:**
- `editingSessionId` (`java.lang.String`): The id of the editing session.
- `documentModel` ([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md)): The model of edited document.

### `editingSessionDeserialized(java.lang.String editingSessionId, ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel documentModel)`

**Returns:** `void`

**Parameters:**
- `editingSessionId` (`java.lang.String`): The id of the editing session.
- `documentModel` ([`ro.sync.ecss.extensions.api.webapp.AuthorDocumentModel`](../AuthorDocumentModel.md)): The document model may not be the same as the one 
 created when the editing session was opened.

