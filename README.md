## Cucumber JVM (Java) Examples (for Intellij)

This repository contains examples of Cucumber JVM tests.

* [Sharing State (`cucumber-picocontainer`)](https://docs.cucumber.io/cucumber/state/).
* [Expressions](https://docs.cucumber.io/cucumber/cucumber-expressions/).
* [Custom Types](https://docs.cucumber.io/cucumber/cucumber-expressions/).
* Multiple Step Files.
* Multiple Configuration Files.

##### Current Cucumber JVM dependency version `3.x.x`


### Getting Started
1. Install Intellij IDEA 2018.2.1 at least ([the plug in Cucumber for Java is working at this version](https://youtrack.jetbrains.com/issue/IDEA-192612)).

2. [Install  Cucmber Java plugin: 182.3934+](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java). You must _menually_ install the plugin by clicking on "INSTALL PLUGIN FROM DISK":

![](https://i.imgur.com/Qux06AZ.jpg)
![](https://i.imgur.com/k5dCiNM.jpg)


### Notes
1. Intellij IDEA `2018.2.1` still doesn't have support for [Cucumber expressions](https://youtrack.jetbrains.com/issue/IDEA-193111). It means that you , currently, can't browse from the feature file to the step implementations and you can't run tests from within the feature file itself, only from the main config file of the test.

