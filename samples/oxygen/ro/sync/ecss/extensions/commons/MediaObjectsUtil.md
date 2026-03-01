# Class: `MediaObjectsUtil`

**Package:** [`ro.sync.ecss.extensions.commons`](README.md)

**Fully Qualified Name:** `ro.sync.ecss.extensions.commons.MediaObjectsUtil`

## Description

## Fields

### `VIMEO_EMBEDDED_HOST`

**Type:** `java.lang.String`

### `VIDYARD_EMBEDDED_HOST`

**Type:** `java.lang.String`

### `VIMEO_HOST`

**Type:** `java.lang.String`

### `YOUTUBE_HOST`

**Type:** `java.lang.String`

### `REFERENCE_ATTR_DATA`

**Type:** `java.lang.String`

### `REFERENCE_ATTR_DATAKEYREF`

**Type:** `java.lang.String`

### `MEDIA_AUDIO_EXTENSIONS`

**Type:** `java.lang.String[]`

### `MEDIA_VIDEO_EXTENSIONS`

**Type:** `java.lang.String[]`

### `ALLOWED_MEDIA_EXTENSIONS`

**Type:** `java.lang.String[]`

### `RECOGNIZED_MEDIA_HOSTS`

**Type:** `java.lang.String[]`

## Constructors

### `<init>()`

## Methods

### `containsExtension(`java.lang.String` extension, `java.lang.String[]` allowedExtensions)`

**Returns:** `boolean`

### `detectOutputclass(`java.lang.String` href)`

**Returns:** `java.lang.String`

If an extension is not found, the selected type is iFrame.

### `isMediaReference(`java.net.URL` url)`

**Returns:** `boolean`

### `isEmbeddedContent(`java.lang.String` url)`

**Returns:** `boolean`

### `isRecognizedAsMedia(`java.lang.String` hostURL)`

**Returns:** `boolean`

### `correctMediaEmbeddedReference(`java.lang.String` url)`

**Returns:** `java.lang.String`

```

 YouTube: From https://www.youtube.com/watch?v=video_id To https://www.youtube.com/embed/video_id
 Vimeo  : From https://vimeo.com/video_id To https://player.vimeo.com/video/video_id
 
```

### `isAudioReference(`java.lang.String` fileName)`

**Returns:** `boolean`

### `hasAudioFormat(`java.lang.String` format)`

**Returns:** `boolean`

### `isVideoReference(`java.lang.String` fileName)`

**Returns:** `boolean`

### `hasVideoFormat(`java.lang.String` format)`

**Returns:** `boolean`

