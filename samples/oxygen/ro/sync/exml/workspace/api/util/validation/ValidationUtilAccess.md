# Interface: `ValidationUtilAccess`

**Package:** [`ro.sync.exml.workspace.api.util.validation`](README.md)

**Fully Qualified Name:** `ro.sync.exml.workspace.api.util.validation.ValidationUtilAccess`

## Description

## Methods

### `validateResources(java.util.Iterator<java.net.URL> resourcesIterator, boolean validateOnlyXMLResources, ro.sync.exml.workspace.api.util.validation.ValidatorProblemCollector problemsCollector)`

**Returns:** `void`

**Parameters:**
- `resourcesIterator` (`java.util.Iterator<java.net.URL>`): Iterator over the resources which need to be validated. Never `null`.
- `validateOnlyXMLResources` (`boolean`): `true` to validate only XML resources.
- `problemsCollector` ([`ro.sync.exml.workspace.api.util.validation.ValidatorProblemCollector`](./ValidatorProblemCollector.md)): The problems collector.  Never `null`.

### `validateResources(java.util.Iterator<java.net.URL> resourcesIterator, java.util.function.Function<java.net.URL,java.lang.String> contentProvider, boolean validateOnlyXMLResources, ro.sync.exml.workspace.api.util.validation.ValidatorProblemCollector problemsCollector)`

**Returns:** `void`

**Parameters:**
- `resourcesIterator` (`java.util.Iterator<java.net.URL>`): Iterator over the resources which need to be validated. Never `null`.
- `contentProvider` (`java.util.function.Function<java.net.URL,java.lang.String>`): Provides content to validate for a certain URL.
- `validateOnlyXMLResources` (`boolean`): `true` to validate only XML resources.
- `problemsCollector` ([`ro.sync.exml.workspace.api.util.validation.ValidatorProblemCollector`](./ValidatorProblemCollector.md)): The problems collector.  Never `null`.

