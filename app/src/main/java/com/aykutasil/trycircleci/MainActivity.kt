package com.aykutasil.trycircleci

import android.accounts.AccountManager
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnGetAccounts).setOnClickListener { _ ->
            val accountManager = AccountManager.get(this)
            val stringBuilder = StringBuilder()
            accountManager.accounts.forEach {
                stringBuilder.append(it.name)
                stringBuilder.append("\n")
            }

            AlertDialog.Builder(this)
                .setTitle("Accounts")
                .setMessage(stringBuilder.toString())
                .create()
                .show()
        }
    }
}
