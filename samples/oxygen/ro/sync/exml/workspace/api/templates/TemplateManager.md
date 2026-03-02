# Interface: `TemplateManager`

**Package:** [`ro.sync.exml.workspace.api.templates`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.templates.TemplateManager`

## Description

## Fields

### `SHOW_DEFAULTS`

**Type:** `int`

### `SHOW_FILE_TEMPLATES`

**Type:** `int`

### `SHOW_ARCHIVE_TEMPLATES`

**Type:** `int`

### `SHOW_RECENTLY_USED`

**Type:** `int`

### `SHOW_ECLIPSE_DEFAULTS`

**Type:** `int`

### `SHOW_ONLY_DITA_TEMPLATES`

**Type:** `int`

## Methods

### `getAllTemplatesCategories(int templateToShow)`

**Parameters:**
- `templateToShow` (`int`): Bit level OR between:
                          
  
                            - TemplateManager#SHOW_DEFAULTS
                            - TemplateManager#SHOW_FILE_TEMPLATES
                            - TemplateManager#SHOW_ARCHIVE_TEMPLATES
                            - TemplateManager#SHOW_RECENTLY_USED
                            - TemplateManager#SHOW_ECLIPSE_DEFAULTS
                            - TemplateManager#SHOW_ONLY_DITA_TEMPLATES

**Returns:** `java.util.List<ro.sync.exml.workspace.api.templates.TemplatesCategory>`

### `getTemplatesFromConfigs(java.util.List<ro.sync.exml.workspace.api.options.ConfigResource> configs, int templateToShow)`

**Parameters:**
- `configs` (`java.util.List<ro.sync.exml.workspace.api.options.ConfigResource>`): The config resources to convert to templates.
- `templateToShow` (`int`): Bit level OR between:
                          
  
                            - TemplateManager#SHOW_DEFAULTS
                            - TemplateManager#SHOW_FILE_TEMPLATES
                            - TemplateManager#SHOW_ARCHIVE_TEMPLATES
                            - TemplateManager#SHOW_RECENTLY_USED
                            - TemplateManager#SHOW_ECLIPSE_DEFAULTS
                            - TemplateManager#SHOW_ONLY_DITA_TEMPLATES

**Returns:** `java.util.List<ro.sync.exml.workspace.api.templates.TemplatesCategory>`

