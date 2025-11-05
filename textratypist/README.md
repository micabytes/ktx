[![Maven Central](https://img.shields.io/maven-central/v/io.github.libktx/ktx-textratypist.svg)](https://search.maven.org/artifact/io.github.libktx/ktx-textratypist)

# KTX: `TextraTypist` type-safe builders

Utilities for creating [`TextraTypist`](https://github.com/tommyettinger/textratypist) animated text labels using
Kotlin type-safe builders.

## Why?

`TextraTypist` provides animated typewriter-style text rendering for Scene2D.
It’s powerful for dialog boxes, narration, RPG text, terminals, UI hints, and comic-style text effects.

`ktx-textratypist` integrates Textra widgets directly into the existing `ktx-scene2d` DSL.

## Getting Started

```kotlin
import ktx.scene2d.*
import ktx.textratypist.*

val label = typingLabel(text = "Hello, world!")
```

TextraTypist requires a `Skin` with compatible styles for its widgets. This can be handled easily by using a `FWSkin`:

```kotlin
Scene2DSkin.defaultSkin = FWSkin(Gdx.files.internal("my-skin.json"))
```

## Available Builders

| Widget | DSL Method                       | Description                                      |
|-------|----------------------------------|--------------------------------------------------|
| `TextraLabel` | `textraLabel(text, skin, style)` | Plain labels with effects and styles             |
| `TypingLabel` | `typingLabel(text, skin, style)` | Labels with typing animation, effects and styles |

## Usage Examples

### Basic TypingLabel

```kotlin
scene2d.table {
  typingLabel("Welcome to [RED]KTX Textratypist[]!") {
    textSpeed = 0.5F
  }
}
```

### Using TextraTypist Markup Tags

| Effect | Example Usage            |
|-------|--------------------------|
| Color | `[RED]Danger![]`         |
| Wave Motion | `{WAVE}Ocean text[]`     |
| Slow / Fast typing | `{SLOW}`, `{FAST}`, etc- |

```kotlin
typingLabel("{WAVE}System reboot[] in [YELLOW]{SLOWER}3... 2... 1...[]")
```

### Synergy

| Library | Purpose |
|--------|---------|
| `ktx-scene2d` | Layout + widget DSL |
| `ktx-actors` | Stage helpers & utilities |
