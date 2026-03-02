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

### `getDPILocations(List<DocumentPositionedInfo> dpInfo)`

**Parameters:**
- `dpInfo` (`java.util.List<ro.sync.document.DocumentPositionedInfo>`): The list of document position info.

**Returns:** `java.util.List<ro.sync.ecss.extensions.api.webapp.DPILocation>`

### `getValidationScenarios()`

**Returns:** `java.util.List<ro.sync.exml.editor.scenario.BaseScenario>`

### `getSchematronPhases(String systemId)`

**Parameters:**
- `systemId` (`java.lang.String`): The system ID of the Schematron file.

**Returns:** `java.util.List<java.lang.String>`

### `setSchematronPhaseChooser(WebappSchematronPhaseChooser phaseChooser)`

**Parameters:**
- `phaseChooser` ([`ro.sync.ecss.extensions.api.webapp.WebappSchematronPhaseChooser`](./WebappSchematronPhaseChooser.md)): The phase chooser.

**Returns:** `void`

