[![Maven Central](https://img.shields.io/maven-central/v/com.saadahmedev.shortintent/shortintent.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.saadahmedev.shortintent%22%20AND%20a:%22shortintent%22)
[![License](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)
<a href="https://android-arsenal.com/api?level=16"><img alt="API" src="https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat"/></a>
<a href="https://github.com/saadahmedscse/shortintent"><img alt="API" src="https://badges.frapsoft.com/os/v1/open-source.png?v=103"/></a>
<a href="https://github.com/saadahmedscse/shortintent/graphs/traffic"><img alt="Total Clones" src="https://img.shields.io/badge/Clones-126-orange"/></a>
<a href="[https://github.com/rrsaikat/CodeChallengeByShikho/graphs/traffic](https://github.com/saadahmedscse/shortintent/graphs/traffic)"><img alt="Total Views" src="https://img.shields.io/badge/Views-382-brightgreen"/></a>
# Short Intent
Getting tired by usign the default Intent class? ShortIntent is a lightweight and easy to use Android library that provides user to intent between two activities with transitions by just some simple steps.
* Min SDK 16 (Android Jellybean 4.1)
* Written in Java

A lightweight, easy-to-use Android library that lets us to intent between two activities with transitions by just some simple steps.

## Installation

Add the dependency to your module build.gradle:
```groovy
dependencies {
    ...
    implementation 'com.saadahmedev.shortintent:shortintent:3.0.0'
}
```

## Usage
### Intent between to activities Easily :
```java
ShortIntent.getInstance(this)
        .addDestination(DashboardActivity.class)
        .finish(this);
```
```java
ShortIntent.getInstance(this)
        .addDestination(DashboardActivity.class)
        .putExtra("key1", "Hello")
        .putExtra("key2", "World")
        .putExtra("key3", 5)
        .putExtra("key4", 123456789)
        .putExtra("key5", true)
        .putExtra("key6", set)
        .finish(this);
```

### Put an Object with an extra cool feature of ShortIntent :
```java
Student student1 = new Student();
Student student2 = new Student();

student1.setName("Fahad");
student1.setAge(36);

student2.setName("Saad");
student2.setAge(22);

ShortIntent.getInstance(this)
      .putExtra("key1", student1)
      .putExtra("key2", student2)
      .finish(this);
```
```java
Student student = ShortIntent.getInstance(this).getObject("key1", Student.class);
```

### Intent between two activites with Transition:
```java
ShortIntent.getInstance(this)
        .addDestination(DashboardActivity.class)
        .addTransition(Anim.FADE)
        .finish(this);
```

### Get 15 animation transitions fro your project
`Anim.FADE`  
`Anim.ZOOM`  
`Anim.WINDMIL`  
`Anim.SPIN`  
`Anim.DIAGONAL`  
`Anim.SPLIT`  
`Anim.SHRINK`  
`Anim.CARD`  
`Anim.INOUT`  
`Anim.SWIPELEFT`  
`Anim.SWIPERIGHT`  
`Anim.SLIDELEFT`  
`Anim.SLIDERIGHT`  
`Anim.SLIDEDOWN`  
`Anim.SLIDEUP`  

## License
```
Copyright 2022 Saad Ahmed

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
