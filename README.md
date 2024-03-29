# ph-wsimport-plugin

A plugin for Jakarta JAX-WS wsimport 4.0.0 to add some extra functionality

# Maven usage

Add the following to your pom.xml to use this artifact:

```xml
  <plugin>
    <groupId>com.sun.xml.ws</groupId>
    <artifactId>jaxws-maven-plugin</artifactId>
    <version>4.0.0</version>
    <configuration>
      <args>
        <arg>-ph-csu</arg>
      </args>
    ...
    </configuration>
    <dependencies>
      <dependency>
        <groupId>com.helger</groupId>
        <artifactId>ph-wsimport-plugin</artifactId>
        <version>4.0.0</version>
      </dependency>
    </dependencies>
  </plugin>
```

# News and noteworthy

* v4.0.0 - 2022-09-13
    * Updated to Jakarta JAX-WS 4.0.0
    * Updated to ph-commons 11
    * Requires Java 11 as the baseline
* v2.3.3.2 - 2021-05-03
    * Updated to ph-commons 10.1
    * The last version that supports JAX-WS 2.3
* v2.3.3.1 - 2021-03-21
    * Updated to ph-commons 10
* v2.3.3.0 - 2020-09-17
    * Updated to JAXWS 2.3.3
* v2.3.1.4 - 2020-06-07
    * Update for latest ph-commons version
* v2.3.1.3 - 2019-05-07
    * Using unbounded version instead of limiting to Java 12.x
* v2.3.1.2 - 2019-05-05
    * Added Java 12 support
* v2.3.1.1 - 2018-11-22
    * Added support for JAXB 2.3.1 when using Java 9 or higher - still works with JAXWS 2.2.10 for Java 8
    * Updated to ph-commons 9.2.0 
    * Created code requires at least ph-commons 9.2.0
* v2.2.10.1 - 2017-11-05
    * Updated to ph-commons 9.0.0
* v2.2.10 - 2017-07-21
    * Updated to JAXWS 2.2.10
* v2.2.8.2 - 2016-06-12
    * Updated to ph-commons 8.x
* v2.2.8.1 - 2015-07-02
    * Updated to ph-commons 6.x
* v2.2.8 - 2015-02-06
    * Requires ph-commons 5.x

---

My personal [Coding Styleguide](https://github.com/phax/meta/blob/master/CodingStyleguide.md) |
It is appreciated if you star the GitHub project if you like it.