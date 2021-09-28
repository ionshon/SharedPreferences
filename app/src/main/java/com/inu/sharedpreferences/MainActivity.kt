package com.inu.sharedpreferences

import android.content.ContentValues.TAG
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceManager


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
/*
        val shared: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)

        val checkboxValue = shared.getBoolean("key_add_shortcut", false)
        val switchValue = shared.getBoolean("key_switch_on", false)
        val name = shared.getString("key_edit_name","")
        val selected = shared.getString("key_set_item", "")
*/
        PreferenceManager.getDefaultSharedPreferences(applicationContext) // or this
            .registerOnSharedPreferenceChangeListener { shared, key ->
                val checkboxValue = shared.getBoolean("key_add_shortcut", false)
                val switchValue = shared.getBoolean("key_switch_on", false)
                val name = shared.getString("key_edit_name","")
                val selected = shared.getString("key_set_item", "")

                when (key) {
                    "key_add_shortcut" -> Log.d(TAG,"preferenceLog key =$key, 값 : $checkboxValue")
                    "key_switch_on" -> Log.d(TAG,"preferenceLog key =$key, 값 : $switchValue")
                    "key_edit_name" -> Log.d(TAG,"preferenceLog key =$key, 값 : $name")
                    "key_set_item" -> Log.d(TAG,"preferenceLog key =$key, 값 : $selected")
                }

            }
        /*
        shared.registerOnSharedPreferenceChangeListener { sharedpreferences,
                                                          key ->
            if (key == "key_edit_name") {
                Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
            }
        } */
/*
        val listener =
            OnSharedPreferenceChangeListener { shared, key ->
                if (key == "key_edit_name") {
                    Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
                }
            }

        shared.registerOnSharedPreferenceChangeListener(listener)

        shared.registerOnSharedPreferenceChangeListener { shared: SharedPreferences,
                                               key ->
                if (key == "key_edit_name") {
                    Toast.makeText(this, "sss", Toast.LENGTH_SHORT).show()
                }
            }

 */

/*
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show()
        Log.d("preferenceLog", "$switchValue")
        Log.d("preferenceLog", "$checkboxValue")
        Log.d("preferenceLog", "$name")
        Log.d("preferenceLog", "$selected")
*/

    }



}
