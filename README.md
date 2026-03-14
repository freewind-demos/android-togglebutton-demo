# android-togglebutton-demo

## 简介

演示 ToggleButton 开关按钮组件的使用。

## 基本原理

- ToggleButton 是带有两种状态的按钮
- 状态：开 (checked=true) 和关 (checked=false)
- 通过 `isChecked` 属性获取当前状态

## 启动和使用

### 环境要求
- Android Studio 4.0+
- JDK 11+

### 安装和运行
1. 用 Android Studio 打开此项目
2. 点击 ToggleButton 切换状态
3. 观察状态显示的变化

## 教程

### ToggleButton 基础

```xml
<ToggleButton
    android:id="@+id/toggleButton"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:textOn="开启"
    android:textOff="关闭" />
```

- `textOn`: 开启状态显示的文字
- `textOff`: 关闭状态显示的文字

### 判断状态

```kotlin
val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)

// 判断当前状态
if (toggleButton.isChecked) {
    // 开启状态
} else {
    // 关闭状态
}
```

### 状态监听

```kotlin
toggleButton.setOnCheckedChangeListener { _, isChecked ->
    if (isChecked) {
        // 变为开启状态
    } else {
        // 变为关闭状态
    }
}
```

### 注意事项

- ToggleButton 适合用于开关类设置
- Switch 组件提供更现代的开关样式
- 记得在监听器中处理状态变化
