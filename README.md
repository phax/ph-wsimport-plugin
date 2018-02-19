# ph-wsimport-plugin
A plugin for wsimport 2.2 to add some extra functionality

# News and noteworthy
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

# Maven usage
Add the following to your pom.xml to use this artifact:

```xml
  <plugin>
    <groupId>org.codehaus.mojo</groupId>
    <artifactId>jaxws-maven-plugin</artifactId>
    <version>2.5</version>
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
        <version>2.2.10.1</version>
      </dependency>
    </dependencies>
  </plugin>
```

---

My personal [Coding Styleguide](https://github.com/phax/meta/blob/master/CodingStyleguide.md) |
On Twitter: <a href="https://twitter.com/philiphelger">@philiphelger</a>
