package org.paradrops.materialsample.view.dialogtransition

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import org.paradrops.materialsample.R

class GridImageItemView : ImageView {
    companion object {
        fun inflate(context: Context) : GridImageItemView {
            return LayoutInflater.from(context).inflate(R.layout.view_grid_image_item, null) as GridImageItemView
        }
    }

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : super(context, attrs, defStyleAttr)
}