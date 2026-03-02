# Interface: `WebappSchematronPhaseChooser`

**Package:** [`ro.sync.ecss.extensions.api.webapp`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.api.webapp.WebappSchematronPhaseChooser`

## Description

## Methods

### `choosePhase(java.lang.String schematronSystemId)`

In order to obtain the available phases in that Schematron file, one can 
 use WebappDocumentValidator#getSchematronPhases(String). Note that
 a call to this method needs to parse the file. Caching the phases is recommended.

**Parameters:**
- `schematronSystemId` (`java.lang.String`): The system ID of the Schematron file.

**Returns:** `java.lang.String`

