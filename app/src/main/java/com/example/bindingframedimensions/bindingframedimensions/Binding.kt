package com.example.bindingframedimensions.bindingframedimensions

import android.databinding.BindingAdapter
import android.view.View

@BindingAdapter("android:layout_width")
fun setLayoutWidth(view: View, width: Float) {
    val layoutParams = view.layoutParams
    layoutParams.width = width.toInt()
    view.layoutParams = layoutParams
}