<h1>Custom Toast</h1>
<p>Custom Toast is library to create custom toast in android studio by writing less code. </p>
<h2>Getting Started</h2>
<p>Add it in your root build.gradle at the end of repositories:</p>


```
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```
<p>Add the dependency</p>


```
dependencies {
    ...
    implementation 'com.github.SabaZafar22:CustomToast:1.0'
}
```

<h2>Usage</h2>

```
 ToasterMessage
            .with(this, "Hello, I am Toast")
            .build()
```

```
 ToasterMessage
            .with(this, "Hello, I am Toast")
            .setBackgroundColor(R.color.purple_500)
            .build()
```
