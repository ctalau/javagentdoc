# Interface: `WebappDocumentValidator`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.WebappDocumentValidator`

## Description

## Fields

### `SCHEMATRON_IMPOSED_PHASE_ATTR_NAME`

**Type:** `java.lang.String`

Its value would be used to impose a phase with that name in any Schematron file used for validation.

## Methods

### `getValidationTask()`

**Returns:** `java.util.concurrent.Callable<java.util.List<ro.sync.document.DocumentPositionedInfo>>`

### `getDPILocations(java.util.List<ro.sync.document.DocumentPositionedInfo> dpInfo)`

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.DPILocation>`

**Parameters:**
- `dpInfo` (`java.util.List<ro.sync.document.DocumentPositionedInfo>`): The list of document position info.

### `getValidationScenarios()`

**Returns:** `java.util.List<ro.sync.exml.editor.scenario.BaseScenario>`

### `getSchematronPhases(java.lang.String systemId)`

**Returns:** `java.util.List<java.lang.String>`

**Parameters:**
- `systemId` (`java.lang.String`): The system ID of the Schematron file.

### `setSchematronPhaseChooser(ro.sync.ecss.extensions.api.webapp.WebappSchematronPhaseChooser phaseChooser)`

**Returns:** `void`

**Parameters:**
- `phaseChooser` ([`ro.sync.ecss.extensions.api.webapp.WebappSchematronPhaseChooser`](./WebappSchematronPhaseChooser.md)): The phase chooser.

