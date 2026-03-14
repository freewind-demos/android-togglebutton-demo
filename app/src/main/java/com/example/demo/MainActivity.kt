package com.example.demo

import android.os.Bundle
import android.widget.TextView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

/**
 * ToggleButton 演示 Activity
 * 展示如何在 Android 中使用开关按钮
 */
class MainActivity : AppCompatActivity() {

    private lateinit var toggleButton: ToggleButton
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 初始化组件
        toggleButton = findViewById(R.id.toggleButton)
        textView = findViewById(R.id.textView)

        // 设置初始状态显示
        updateStatus()

        // 设置 ToggleButton 的状态改变监听器
        toggleButton.setOnCheckedChangeListener { _, isChecked ->
            updateStatus()
        }
    }

    /**
     * 根据 ToggleButton 的状态更新显示文本
     */
    private fun updateStatus() {
        val isOn = toggleButton.isChecked
        textView.text = if (isOn) {
            "开关状态: ON (已开启)"
        } else {
            "开关状态: OFF (已关闭)"
        }
    }
}
