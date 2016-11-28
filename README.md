Press Association Coding Test
=============================

#### Requirements
* Java 7 (or higher) - [link](http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html)
* Maven 3 (or higher) - [link](http://maven.apache.org/download.cgi) - special notes for [windows](http://maven.apache.org/guides/getting-started/windows-prerequisites.html)
* Git / GitHub account - [link](https://help.github.com/articles/set-up-git/)

It is strongly suggested that you use an IDE as these will often make coding easier.
We tend to code with [IntelliJ](https://www.jetbrains.com/idea/), but other popular IDEs include
[Eclipse](https://eclipse.org/downloads/) and [NetBeans](https://netbeans.org/).

However you code you should be able to compile and package your code using the maven command:
```
mvn clean package
```
Which instructs maven to clean up after any previous builds, compile, test and then package your code as a standard jar.

#### Setup

We request that the submit of the tests be as a public git repository, by preference GitHub, there are good
instructions on the [GitHub](https://help.github.com/articles/creating-a-new-repository/) website as how this is
performed.

##### Initial Commit

Before you do any coding please ensure that you have created and uploaded the initial code to GitHub.

1) Change the `artifactId` value in the `pom.xml` (line 6) to be your name (hyphen separated).
2) Configure the project for using git as VCS (version control system):
```
git init
git add .
git add .gitignore
git commit -m "First commit"
```
3) Configure and push to remote repository (ie GitHub), please note below you will need to substitute the repository for `<repo>`:
```
git remote add origin <repo>
git push -u origin master
```

If you then look at the GitHub page you should see the initial code.

#### The Tests

There are five (5) classes that have been stubbed with methods that should be implemented, but currently throw an
`UnsupportedOperationException`:

* `Deduplicator.java` - removal of duplicate objects from an array
* `Fibonacci.java` - generation of the Fibonacci sequence
* `Palindrome.java` - testing for `String` palindromes
* `PubSubController.java` - controller for a simple pub/sub system (as part of an MVC application)
* `WordWapper.java` - text wrapping

Included also are corresponding test classes for convenience, feel free to improve and add as many tests as you feel
you need to ensure correctness of the code.

#### Submission

Reply to the email in which you were send the source zip and include the git repository where we can find the submission.
