# Interface: `TopicRefTargetInfoProvider`

**Package:** [`ro.sync.exml.workspace.api.standalone.ditamap`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.standalone.ditamap.TopicRefTargetInfoProvider`

## Description

## Methods

### `computeTopicRefTargetInfo(java.util.Map<ro.sync.exml.workspace.api.standalone.ditamap.TopicRefInfo,ro.sync.exml.workspace.api.standalone.ditamap.TopicRefTargetInfo> ditaMapTargetReferences)`

**Returns:** `void`

The TopicRefTargetInfo values are initialized but contain no properties inside. 
 After the call back, the map is used by Oxygen to show titles for each topic reference in the DITA Maps Manager view.

**Parameters:**
- `ditaMapTargetReferences` (`java.util.Map<ro.sync.exml.workspace.api.standalone.ditamap.TopicRefInfo,ro.sync.exml.workspace.api.standalone.ditamap.TopicRefTargetInfo>`): A map of topic references.

### `clearCache()`

**Returns:** `void`

Called when the entire cache needs to be invalidated, 
 for example when F5 is pressed in the DITA maps manager view.

