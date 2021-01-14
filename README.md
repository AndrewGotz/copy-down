## Copy Down
Convert HTML into Markdown with Java.

### Installation
In your gradle file:

```groovy
dependencies {
        compile 'io.github.furstenheim:copy_down:1.0'
}
```

### Usage

```java

import io.github.furstenheim.CopyDown;
public class io.github.furstenheim.Main {
    public static void main (String[] args) {
        CopyDown converter = new CopyDown();
        String myHtml = "<h1>Some title</h1><div>Some html<p>Another paragraph</p></div>";
        String markdown = converter.convert(myHtml);
        System.out.println(markdown);
        // Some title\n==========\n\nSome html\n\nAnother paragraph\n
    }
}
```

### Options

It is possible to use options for converting markdown:

```java
import io.github.furstenheim.CopyDown;
import io.github.furstenheim.Options;
import io.github.furstenheim.OptionsBuilder;

public class io.github.furstenheim.Main {
   public static void main (String[] args) {
       OptionsBuilder optionsBuilder = OptionsBuilder.anOptions();
       Options options = optionsBuilder
               .withBr("-")
               // more options
               .build();
       CopyDown converter = new CopyDown(options);
       String myHtml = "<h1>Some title</h1><div>Some html<p>Another paragraph</p></div>";
       String markdown = converter.convert(myHtml);
       System.out.println(markdown);
   }
}
```


| Option                | Valid values  | Default |
| :-------------------- | :------------ | :------ |
| `headingStyle`        | `SETEXT` or `ATX` | `SETEXT`  |
| `hr`                  | Any [Thematic break](http://spec.commonmark.org/0.27/#thematic-breaks) | `* * *` |
| `bulletListMarker`    | `-`, `+`, or `*` | `*` |
| `codeBlockStyle`      | `INDENTED` or `FENCED` | `INDENTED` |
| `fence`               | ` ``` ` or `~~~` | ` ``` ` |
| `emDelimiter`         | `_` or `*` | `_` |
| `strongDelimiter`     | `**` or `__` | `**` |
| `linkStyle`           | `INLINED` or `REFERENCED` | `INLINED` |
| `linkReferenceStyle`  | `FULL`, `COLLAPSED`, or `SHORTCUT` | `FULL` |


### Acknowledgment
This library is a port to Java of the wonderful library [Turndown.js](https://github.com/domchristie/turndown). This library passes the same test suite as the original library to ensure same behavior.
