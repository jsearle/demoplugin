# demo-plugin

Demo plugin

## Install

```bash
npm install demo-plugin
npx cap sync
```

## API

<docgen-index>

* [`echo(...)`](#echo)
* [`getPressure()`](#getpressure)
* [`getLight()`](#getlight)
* [`initPlugin()`](#initplugin)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### echo(...)

```typescript
echo(options: { value: string; }) => Promise<{ value: string; }>
```

| Param         | Type                            |
| ------------- | ------------------------------- |
| **`options`** | <code>{ value: string; }</code> |

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------


### getPressure()

```typescript
getPressure() => Promise<{ pressure: number; }>
```

**Returns:** <code>Promise&lt;{ pressure: number; }&gt;</code>

--------------------


### getLight()

```typescript
getLight() => Promise<{ light: number; }>
```

**Returns:** <code>Promise&lt;{ light: number; }&gt;</code>

--------------------


### initPlugin()

```typescript
initPlugin() => Promise<{ value: string; }>
```

**Returns:** <code>Promise&lt;{ value: string; }&gt;</code>

--------------------

</docgen-api>
