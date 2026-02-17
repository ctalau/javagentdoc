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

**Returns:** [`ro.sync.exml.workspace.api.license.LicenseInformationProvider`](../license/LicenseInformationProvider.md)

### `getPreferencesDirectory()`

**Returns:** `java.lang.String`

Can be used to save additional user data there.

### `getUserInterfaceLanguage()`

**Returns:** `java.lang.String`

Examples of format: **en_US**, **fr_FR**, **de_DE**, **jp_JP**, **it_IT**, **nl_NL**

### `getVersion()`

**Returns:** `java.lang.String`

Can be used to decide if some extension functions are available or not.

### `getVersionBuildID()`

**Returns:** `java.lang.String`

It is a string with a format like "YYYYMMDDHH".
 Example: "2013110816".
 This is the same information present in the Help menu -> About dialog.

### `getApplicationType()`

**Returns:** [`ro.sync.exml.workspace.api.application.ApplicationType`](./ApplicationType.md)

### `getApplicationName()`

**Returns:** `java.lang.String`

### `getPlatform()`

**Returns:** [`ro.sync.exml.workspace.api.Platform`](../Platform.md)

