# Interface: `TransformationScenarioInvoker`

**Package:** [`ro.sync.exml.workspace.api.editor.transformation`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.editor.transformation.TransformationScenarioInvoker`

## Description

## Methods

### `runTransformationScenarios(String[] scenarioNames, TransformationFeedback transformationFeedback)`

A separate thread is started and runs each scenario sequentially. The method returns immediately.

**Parameters:**
- `scenarioNames` (`java.lang.String[]`): An array of scenario names defined in the document type associated to the current editor.
- `transformationFeedback` ([`ro.sync.exml.workspace.api.editor.transformation.TransformationFeedback`](./TransformationFeedback.md)): An interface through which the user receives feedback from the started transformation process.

**Returns:** `void`

### `runTransformationScenario(String scenarioName, Map<String,String> scenarioParameters, TransformationFeedback transformationFeedback)`

A separate thread is started and runs each scenario sequentially. The method returns immediately.

**Parameters:**
- `scenarioName` (`java.lang.String`): The scenario name defined in the document type associated to the current editor.
- `scenarioParameters` (`java.util.Map<java.lang.String,java.lang.String>`): Pairs of transformation scenario names and values that will be used when running this transformation.
- `transformationFeedback` ([`ro.sync.exml.workspace.api.editor.transformation.TransformationFeedback`](./TransformationFeedback.md)): An interface through which the user receives feedback from the started transformation process.

**Returns:** `void`

### `stopCurrentTransformationScenario()`

**Returns:** `void`

