package jp.co.casl0.android.design_pattern_kotlin.prototype

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class MessageBoxDialog(private val message: String): DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(activity)
            .setTitle("メッセージ")
            .setMessage(message)
            .create()
    }
}