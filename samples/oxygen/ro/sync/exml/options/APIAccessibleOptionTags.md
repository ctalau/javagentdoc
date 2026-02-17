# Interface: `APIAccessibleOptionTags`

**Package:** [`ro.sync.exml.options`](README.md)

**Fully Qualified Name:** `ro.sync.exml.options.APIAccessibleOptionTags`

## Description

## Fields

### `USER_DEFINED_EDITOR_VARIABLES`

**Type:** `java.lang.String`

The value stored for this tag is an array of UserEditorVariablePO.

### `OPEN_MERGED_FILES`

**Type:** `java.lang.String`

### `SHOW_SAVE_AS_IN_NEW_DIALOG`

**Type:** `java.lang.String`

Returns a Boolean value.

### `CREATE_KEYS_ATTRIBUTE_FOR_TOPICREF_BASED_ON_FILENAME`

**Type:** `java.lang.String`

### `AUTO_SYNCHRONIZE_UNMODIFIED_EDITORS`

**Type:** `java.lang.String`

Returns a Boolean value.

### `ENABLE_SYNCHRONIZE_UNMODIFIED_EDITORS`

**Type:** `java.lang.String`

Returns a Boolean value.

### `FILE_TYPES_ASSOCIATION`

**Type:** `java.lang.String`

Returned as an array of "ro.sync.exml.editor.FileTypeAssociation"

### `ADDONS_UPDATE_SITES`

**Type:** `java.lang.String`

Returns an array of java.lang.String.

### `UI_VIEW_TABS_BORDER_COLOR`

**Type:** `java.lang.String`

Return a string containing the color RGB with comma delimiters.

### `UI_SCROLLBARS_CHEVRONS_COLOR`

**Type:** `java.lang.String`

Return a string containing the color RGB with comma delimiters.

### `UI_STATUS_PANEL_BACKGROUND_COLOR`

**Type:** `java.lang.String`

Return a string containing the color RGB with comma delimiters.

### `UI_STATUS_PANEL_FOREGROUND_COLOR`

**Type:** `java.lang.String`

Return a string containing the color RGB with comma delimiters.

### `UI_VIEW_TITLES_FOREGROUND_COLOR`

**Type:** `java.lang.String`

Return a string containing the color RGB with comma delimiters.

### `UI_VIEW_TITLES_FONT`

**Type:** `java.lang.String`

Return a string containing the font properties with comma delimiters.

### `UI_MENUS_TOOLBARS_BACKGROUND_COLOR`

**Type:** `java.lang.String`

Return a string containing the color RGB with comma delimiters.

### `UI_MENUS_TOOLBARS_SELECTION_BACKGROUND_COLOR`

**Type:** `java.lang.String`

Returns a string containing the color RGB with comma delimiters.

### `UI_BACKGROUND_COLOR`

**Type:** `java.lang.String`

### `UI_TEXT_BACKGROUND_COLOR`

**Type:** `java.lang.String`

### `UI_VIEW_TITLES_BACKGROUND_COLOR`

**Type:** `java.lang.String`

Returns a string containing the color RGB with comma delimiters.

### `UI_FOREGROUND_COLOR`

**Type:** `java.lang.String`

Returns a string containing the color RGB with comma delimiters.

### `UI_DISABLED_FOREGROUND_COLOR`

**Type:** `java.lang.String`

Returns a string containing the color RGB with comma delimiters.

### `UI_SELECTION_BACKGROUND_COLOR`

**Type:** `java.lang.String`

Returns a string containing the color RGB with comma delimiters.

### `UI_INACTIVE_SELECTION_BACKGROUND_COLOR`

**Type:** `java.lang.String`

Returns a string containing the color RGB with comma delimiters.

### `UI_SELECTION_FOREGROUND_COLOR`

**Type:** `java.lang.String`

Returns a string containing the color RGB with comma delimiters.

### `UI_LINK_FOREGROUND_COLOR`

**Type:** `java.lang.String`

Returns a string containing the color RGB with comma delimiters.

### `UI_BORDER_COLOR`

**Type:** `java.lang.String`

Returns a string containing the color RGB with comma delimiters.

### `UI_SEPARATOR_COLOR`

**Type:** `java.lang.String`

Returns a string containing the color RGB with comma delimiters.

### `UI_DARK_THEME`

**Type:** `java.lang.String`

Returns a boolean.

### `UI_TEXT_COMPONENTS_BORDER_COLOR`

**Type:** `java.lang.String`

Returns a string containing the color RGB with comma delimiters.

### `DITA_SHOW_CONSOLE_OUTPUT`

**Type:** `java.lang.String`

Returns an integer property, one of the constants APIOptionConstants#ALWAYS_SHOW_CONSOLE. APIOptionConstants#SHOW_CONSOLE_WHEN_BUILD_FAILS

### `DITA_OT_DIRECTORY`

**Type:** `java.lang.String`

Returns a String representing the directory path to the default DITA OT directory.

### `TRACK_CHANGES_INITIAL_STATE`

**Type:** `java.lang.String`

Returns an integer value. One of the constants "APIOptionConstants.TRACK_CHANGES_*".

### `TRACK_CHANGES_INITIAL_DISPLAY_MODE`

**Type:** `java.lang.String`

### `PROFILING_SHOW_ATTRIBUTES_COLORS`

**Type:** `java.lang.String`

Returns an ProfilingAttributesPresentingColorsPO object.

### `PROFILING_CONDITIONS_SET_LIST`

**Type:** `java.lang.String`

Returns an array of ProfileConditionsSetInfoPO objects.

### `PROFILING_CONDITIONS_LIST`

**Type:** `java.lang.String`

Returns an array of ProfileConditionInfoPO objects.
 
 You can set these from a plugin like this:
 
 

```
    ProfileConditionInfoPO[] conditions = new ro.sync.ecss.conditions.ProfileConditionInfoPO[]{
        new ProfileConditionInfoPO("dummy", "Dummy", true, new ro.sync.ecss.conditions.ProfileConditionValuePO[]{
            new ProfileConditionValuePO("external", "External"),
            new ProfileConditionValuePO("guest", "Guest"),
            new ProfileConditionValuePO("internal", "Internal"),
        }, " ", "*DITA*")
    };
    PluginWorkspaceProvider.getPluginWorkspace().setGlobalObjectProperty("profiling.conditions.list", conditions); 
```


    The constructor of the ProfileConditionInfoPO persistent object looks like:
  

```

  public static ProfileConditionInfoPO createDefaultProfileConditionInfoPO(String attributeName, String attributeRenderName,
      boolean allowsMultipleValues, String[] allowedValues, String valuesSeparator, String documentTypePattern) {
      
```

### `PROFILING_STYLES`

**Type:** `java.lang.String`

Returns an array of ProfilingAttributeStylePO objects.
 You can set these from a plugin like this:
 
 

```
    PluginWorkspaceProvider.getPluginWorkspace().setGlobalObjectProperty("author.profiling.styles", new ProfilingAttributeStylePO[]{
        new ProfilingAttributeStylePO("#DITA*", "dummy", "External", Color.BLUE.getRGB(), ProfilingAttributeStylePO.NO_COLOR, ProfilingAttributeStylePO.UNDERLINE, false, false),
        new ProfilingAttributeStylePO("#DITA*", "dummy", "Guest", Color.RED.getRGB(), ProfilingAttributeStylePO.NO_COLOR, ProfilingAttributeStylePO.DOUBLE_UNDERLINE, false, false),
    }); 
```


    The constructor of the ProfilingAttributeStylePO looks like this:

    

```
public ProfilingAttributeStylePO(String framework, String attributeName,
      String attributeValue, int foreground, int background, String textDecoration,
      boolean bold, boolean italic)
```

### `CAN_EDIT_READ_ONLY_FILES`

**Type:** `java.lang.String`

Returns a Boolean flag.

### `CATALOGS`

**Type:** `java.lang.String`

Returns an array of Strings, each string being an URL-like path to a catalog file.
 PLEASE DO NOT CHANGE THE KEY NAME, LOTS OF CUSTOMIZERS (IXIASOFT FOR EXAMPLE) USE THIS KEY TO IMPOSE CATALOGS.

### `RECENTLY_USED_CHARACTERS`

**Type:** `java.lang.String`

It's a Java String in which each char is one of the characters.

### `RECENTLY_USED_CHARACTERS_SIZE`

**Type:** `java.lang.String`

It is an integer property.

### `TAGS_DISPLAY_MODE`

**Type:** `java.lang.String`

It is an integer property, one of the constants in the ro.sync.exml.workspace.api.editor.page.author.DisplayModeConstants interface.

### `AUTOMATICALLY_ACCEPT_CERTIFICATES`

**Type:** `java.lang.String`

### `ADDITIONAL_FRAMEWORKS_DIRECTORIES`

**Type:** `java.lang.String`

Returns an array of java.lang.String objects representing paths to the additional frameworks folders, paths which may also 
 contain editor variables.

### `FRAMEWORKS_DIRECTORY_URL`

**Type:** `java.lang.String`

It has a string value.

### `USE_CUSTOM_FRAMEWORKS_DIRECTORY_URL`

**Type:** `java.lang.String`

It has a boolean value.

### `SYNTAX_HIGHLIGHT_PROXY_MAP_COLORS`

**Type:** `java.lang.String`

It takes a string containing color RGB values having the pattern: "R1,G1,B1;R2,G2,B2". 
 Sample value for 3 colors: "10,10,20;20,20,30;30,31,32"

### `SYNTAX_HIGHLIGHT_PROXY_MAP_BG_COLORS`

**Type:** `java.lang.String`

It takes a string containing color RGB values having the pattern: "R1,G1,B1;R2,G2,B2". 
 Sample value for 2 colors: "255,255,255;255,255,255"

### `SYNTAX_HIGHLIGHT_PROXY_MAP_PROXIES`

**Type:** `java.lang.String`

Its value is a String array like for example: new String[]{"p1", "p2", "p3"}.
 Example of how such option tags can be set:
 

```

    //Foreground colors
     pluginWorkspaceAccess.setGlobalObjectProperty("sh.proxy.map.colors.second", "10,10,20;20,20,30;30,31,32");
     //Background colors, same syntax, all white
     pluginWorkspaceAccess.setGlobalObjectProperty("sh.proxy.map.bg.colors.second", "255,255,255;255,255,255;255,255,255");
     //The set of prefixes...
     pluginWorkspaceAccess.setGlobalObjectProperty("sh.proxy.map.proxies", new String[]{"p1", "p2", "p3"});
 
```

### `XML_DTD_AUTOMATIC_QUICK_FIX_SUPPORT`

**Type:** `java.lang.String`

### `XML_RNG_AUTOMATIC_QUICK_FIX_SUPPORT`

**Type:** `java.lang.String`

It has a boolean value.

### `XML_XSD_AUTOMATIC_QUICK_FIX_SUPPORT`

**Type:** `java.lang.String`

It has a boolean value.

### `XSL_AUTOMATIC_QUICK_FIX_SUPPORT`

**Type:** `java.lang.String`

It has a boolean value.

### `SQF_QUICK_FIX_SUPPORT`

**Type:** `java.lang.String`

It has a boolean value.

### `BULK_APPLY_ONLY_QUICK_FIXES_MARKED_VIA_DEFAULT_FIX_ATTRIBUTE`

**Type:** `java.lang.String`

It has a boolean value.

### `AUTHOR_FORMAT_COMPATIBILITY`

**Type:** `java.lang.String`

Returns an integer property, one of the constants AuthorFormatCompatibilityModeConstants#FORMAT_COMPATIBILITY_BREAKS_LINES_ONLY_BLOCKS_DO_NO_INDENT,
  AuthorFormatCompatibilityModeConstants#FORMAT_COMPATIBILITY_DO_NOT_BREAK_LINES_DO_NO_INDENT, AuthorFormatCompatibilityModeConstants#FORMAT_COMPATIBILITY_NONE,

### `CODE_INSIGHT_SHOW_ANNOTATIONS`

**Type:** `java.lang.String`

Boolean option.

### `CODE_INSIGHT_SHOW_ANNOTATIONS_TOOLTIP`

**Type:** `java.lang.String`

Boolean option.

### `ARCHIVE_DESCRIPTORS`

**Type:** `java.lang.String`

Its value is an array of "ro.sync.exml.zip.ArchiveDescriptor" objects.
 You can set it to register your own custom archive extension like:
 

```
PluginWorkspaceProvider.getPluginWorkspace().setGlobalObjectProperty(ro.sync.exml.options.APIAccessibleOptionTags.ARCHIVE_DESCRIPTORS, new ArchiveDescriptor[]{new ArchiveDescriptor("EPX files", new String[]{"epx"}, ArchiveDescriptor.ARCHIVE_TYPE_ZIP)}); 
```

### `SPELL_CHECK_OPTIONS`

**Type:** `java.lang.String`

### `PREFER_USING_KEYS_FOR_DITA_REUSE_CONTENT`

**Type:** `java.lang.String`

If `true` the "Reuse content" dialog will have the "Key" radio button selected.

### `PREFER_USING_KEYS_FOR_DITA_CROSS_REF`

**Type:** `java.lang.String`

If `true` the "Cross reference" and "Related link to topic" dialogs 
 will have the "Key" radio button selected.

### `PREFER_USING_KEYS_FOR_DITA_PUSH_CONTENT`

**Type:** `java.lang.String`

If `true` the "Push content" dialog will have the "Key" radio button selected.

### `PREFER_USING_KEYS_FOR_DITA_INSERT_MEDIA`

**Type:** `java.lang.String`

If `true` the "Insert media" dialog will have the "Key" radio button selected.

### `PREFER_USING_KEYS_FOR_DITA_FILE_REFERENCE`

**Type:** `java.lang.String`

If `true` the "File reference" and "Related link to file" dialogs
 will have the "Key" radio button selected.

### `PREFER_USING_KEYS_FOR_DITA_WEB_LINK`

**Type:** `java.lang.String`

If `true` the "Web link" and "Related link to webpage" dialogs
 will have the "Key" radio button selected.

### `DITA_FILL_TOPICREF_FORMAT_ATTR`

**Type:** `java.lang.String`

### `DITA_FILL_TOPICREF_SCOPE_ATTR`

**Type:** `java.lang.String`

### `DITA_FILL_TOPICREF_TYPE_ATTR`

**Type:** `java.lang.String`

### `DITA_FILL_TOPICREF_NAVTITLE_ATTR`

**Type:** `java.lang.String`

### `DITA_FILL_LINK_FORMAT_ATTR`

**Type:** `java.lang.String`

### `DITA_FILL_LINK_SCOPE_ATTR`

**Type:** `java.lang.String`

### `DITA_FILL_LINK_TYPE_ATTR`

**Type:** `java.lang.String`

### `EDITOR_SHOW_TAB_EOL_EOF`

**Type:** `java.lang.String`

### `EDITOR_SHOW_SPACE`

**Type:** `java.lang.String`

### `SHOW_PROFILING_COLORS_AND_STYLES`

**Type:** `java.lang.String`

Returns a Boolean value.

### `SHOW_PROFILING_ATTRIBUTES`

**Type:** `java.lang.String`

Returns a Boolean value.

### `SHOW_EXCLUDED_CONTENT`

**Type:** `java.lang.String`

Returns a Boolean value.

### `CODE_TEMPLATES`

**Type:** `java.lang.String`

Can be used to set or retrieve an array of "ro.sync.contentcompletion.CTItem".

### `REPORT_INVALID_ATTR_VALS_FOUND_IN_DOC`

**Type:** `java.lang.String`

### `CHANGE_TRACKING_AUTHOR`

**Type:** `java.lang.String`

Returns a String value and defaults to the user name set in the system.

### `EDITOR_FONT`

**Type:** `java.lang.String`

For example: "MS Gothic,0,15" where "0" style means plain font, "1" means bold font and "2" means italic font. 
 Keep the font used for displaying the documents in the editor panels.

### `FONT_FOR_AUTHOR`

**Type:** `java.lang.String`

A property with a string value of the form "name,style,size".
 For example: "MS Gothic,0,15" where "0" style means plain font, "1" means bold font and "2" means italic font.

### `FONT_FOR_TEXT`

**Type:** `java.lang.String`

A property with a string value of the form "name,style,size".
 For example: "MS Gothic,0,15" where "0" style means plain font, "1" means bold font and "2" means italic font.

### `FONT_FOR_GUI`

**Type:** `java.lang.String`

A property with a string value of the form "name,style,size".
 For example: "MS Gothic,0,15" where "0" style means plain font, "1" means bold font and "2" means italic font.

### `FONT_FOR_SCHEMA`

**Type:** `java.lang.String`

A property with a string value of the form "name,style,size".
 For example: "MS Gothic,0,15" where "0" style means plain font, "1" means bold font and "2" means italic font.

### `KEYS_CONTEXT_MAP`

**Type:** `java.lang.String`

It's value is a string containing an URL-like path.

### `EDITOR_LINE_WIDTH`

**Type:** `java.lang.String`

This value is superseded only if the property "Detect line width on open"
 is enabled. A property which accepts an integer value.

### `EDITOR_FORMAT_INDENT_INLINE_ELEMENTS`

**Type:** `java.lang.String`

Returns a Boolean value.

### `EDITOR_DETECT_INDENT_ON_OPEN`

**Type:** `java.lang.String`

If it is enabled the indenting of the document 
 (use tabs or spaces, indent size) is discovered when the user opens 
 the document for editing in an editor panel and it will be preserved 
 when the user applies the Format and Indent (pretty-print) action.

### `EDITOR_USE_TABS`

**Type:** `java.lang.String`

### `EDITOR_INDENT_SIZE`

**Type:** `java.lang.String`

### `AUTORECOVERY_LOCATION`

**Type:** `java.lang.String`

By default its value is:

 - **Windows Vista/7/8/10:** [user_home_directory]\AppData\Roaming\com.oxygenxml\autorecover

 - **Mac OS X:** [user_home_directory]/Library/Preferences/com.oxygenxml/autorecover

 - **Linux/Unix:** [user_home_directory]/.com.oxygenxml/autorecover

### `AUTOCHECKVERSION_ENABLE`

**Type:** `java.lang.String`

If true the user wants to check automatically if a 
 new version of oXygen was released.

### `CHECK_FOR_NOTIFICATIONS_ENABLE`

**Type:** `java.lang.String`

If true the user wants to check for notifications.

### `ENABLE_DITA_2_X_SUPPORT`

**Type:** `java.lang.String`

### `AUTHOR_EDITING_MODE`

**Type:** `java.lang.String`

Its values are objects of class "ro.sync.ecss.component.AuthorSchemaAwareOptions"

### `EDIT_RESOLVED_REFERRED_CONTENT_IN_AUTHOR`

**Type:** `java.lang.String`

### `RESTRICT_EDITING_REFERRED_CONTENT_TO_LOCAL_FILES_IN_AUTHOR`

**Type:** `java.lang.String`

### `ASK_OPEN_DITA_MAP_IN_DITAMANAGER`

**Type:** `java.lang.String`

### `DIFF_IGNORE_XPATH_EXPRESSION`

**Type:** `java.lang.String`

Its value is a string.

### `DIFF_INFO`

**Type:** `java.lang.String`

Holds a ro.sync.diff.factory.DiffInfo object.

### `AUTO_APPLY_STYLES_DITAVAL_MAIN_FILES`

**Type:** `java.lang.String`

### `AUTHOR_DISPLAY_REFERENCES_EXPANDED`

**Type:** `java.lang.String`

Has boolean value, true by default.

### `TAGS_COMPACT_MODE`

**Type:** `java.lang.String`

Has boolean value, true by default.

