# Interface: `ValidationScenarioInvoker`

**Package:** [`ro.sync.exml.workspace.api.editor.validation`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.validation.ValidationScenarioInvoker`

## Description

## Methods

### `runValidationScenarios(java.lang.String[] scenarioNames)`

A separate thread is started and runs each scenario sequentially. The method returns immediately.

**Parameters:**
- `scenarioNames` (`java.lang.String[]`): An array of scenario names defined in the document type associated to the current editor.

**Returns:** `java.lang.Thread`

