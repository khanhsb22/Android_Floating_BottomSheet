package com.example.demo1

import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomSheetPlace : BottomSheetDialogFragment {
    var title = ""
    var date = ""
    var context: Activity

    lateinit var v: View

    constructor(title: String, date: String, context: Activity) : super() {
        this.title = title
        this.date = date
        this.context = context
    }

    override fun setupDialog(dialog: Dialog, style: Int) {
        var contentView = View.inflate(getContext(), R.layout.bottom_sheet, null)
        dialog.setContentView(contentView)
        ((contentView.parent) as View).setBackgroundColor(resources.getColor(android.R.color.transparent))

        var text_title_bottom_sheet = contentView.findViewById(R.id.text_title_bottom_sheet) as TextView
        var text_date_bottom_sheet = contentView.findViewById(R.id.text_date_bottom_sheet) as TextView
        var img_close_bottom_sheet = contentView.findViewById(R.id.img_close_bottom_sheet) as ImageView
        var button_submit_rating = contentView.findViewById(R.id.button_submit_rating) as Button
        var ratingBar = contentView.findViewById(R.id.ratingBar) as RatingBar

        text_title_bottom_sheet.text = title
        text_date_bottom_sheet.text = date

        img_close_bottom_sheet.setOnClickListener {
            dismiss()
        }

        button_submit_rating.setOnClickListener {
            Toast.makeText(context, "Submit rating.", Toast.LENGTH_SHORT).show()
        }
    }

    /*override fun getTheme(): Int {
        return R.style.BottomSheetDialog
    }*/

}