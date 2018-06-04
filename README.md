# SimpleDatabindingExample

Basic databinding example demonstrates binding a FrameLayout's dimension, position and color to a data class.

I had particular difficulty binding the layout dimensions. The code and example show's the appropriate binding adapter declarations to make this work.
Thanks to [Keshav Aggarwal](https://stackoverflow.com/users/7482517/keshav-aggarwal) for the assist on [StackOverflow](https://stackoverflow.com/questions/50669421/kotlin-layout-width-and-height-binding/50670451?noredirect=1#comment88367138_50670451)

# Highlights

build.gradle

```
apply plugin: 'kotlin-kapt'
```

```
android {

    dataBinding {
        enabled = true
    }

    kapt {
        generateStubs = true
    }
}
```

# Layout declarations
```xml
<layout xmlns:android="http://schemas.android.com/apk/res/android">
    <data>
        <import type="com.example.bindingframedimensions.bindingframedimensions.BindingKt"/>
        <variable
            name="panel"
            type="com.example.bindingframedimensions.bindingframedimensions.ContainerViewModel"/>
    </data>

    <FrameLayout/>
</layout>
```

# BindingAdapter declarations

Binding.kt
```kotlin
@BindingAdapter("android:layout_width")
fun setLayoutWidth(view: View, width: Int) {
    val layoutParams = view.layoutParams
    layoutParams.width = width
    view.layoutParams = layoutParams
}

@BindingAdapter("android:layout_height")
fun setLayoutHeight(view: View, height: Int) {
    val layoutParams = view.layoutParams
    layoutParams.height = height
    view.layoutParams = layoutParams
```

![app image](./images/device-2018-06-04-074731.png)