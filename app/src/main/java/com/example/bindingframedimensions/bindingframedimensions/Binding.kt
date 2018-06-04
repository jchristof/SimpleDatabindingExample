package com.example.bindingframedimensions.bindingframedimensions

import android.databinding.BindingAdapter
import android.view.View

@BindingAdapter("android:layout_width")
fun setLayoutWidth(view: View, width: Int) {
    val layoutParams = view.layoutParams
    layoutParams.width = width.toInt()
    view.layoutParams = layoutParams
}

@BindingAdapter("android:layout_height")
fun setLayoutHeight(view: View, height: Int) {
    val layoutParams = view.layoutParams
    layoutParams.width = height.toInt()
    view.layoutParams = layoutParams
}