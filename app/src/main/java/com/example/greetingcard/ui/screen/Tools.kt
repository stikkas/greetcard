package com.example.greetingcard.ui.screen

import android.content.Context
import android.widget.Toast

fun showMessage(msg: String, ctx: Context) {
    Toast.makeText(ctx, msg, Toast.LENGTH_LONG).show()
}
