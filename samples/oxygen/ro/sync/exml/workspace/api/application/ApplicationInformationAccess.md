# Interface: `ApplicationInformationAccess`

**Package:** [`ro.sync.exml.workspace.api.application`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.application.ApplicationInformationAccess`

## Description

One way to obtain an implementation from a plugin is:
 

```

 ApplicationInformationAccess info = PluginWorkspaceProvider.getPluginWorkspace();
 

```

## Methods

### `getLicenseInformationProvider()`

**Returns:** `ro.sync.exml.workspace.api.license.LicenseInformationProvider`

### `getPreferencesDirectory()`

Can be used to save additional user data there.

**Returns:** `java.lang.String`

### `getUserInterfaceLanguage()`

Examples of format: **en_US**, **fr_FR**, **de_DE**, **jp_JP**, **it_IT**, **nl_NL**

**Returns:** `java.lang.String`

### `getVersion()`

Can be used to decide if some extension functions are available or not.

**Returns:** `java.lang.String`

### `getVersionBuildID()`

It is a string with a format like "YYYYMMDDHH".
 Example: "2013110816".
 This is the same information present in the Help menu -> About dialog.

**Returns:** `java.lang.String`

### `getApplicationType()`

**Returns:** [`ro.sync.exml.workspace.api.application.ApplicationType`](./ApplicationType.md)

### `getApplicationName()`

**Returns:** `java.lang.String`

### `getPlatform()`

**Returns:** [`ro.sync.exml.workspace.api.Platform`](../Platform.md)

