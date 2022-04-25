# Dojo TDD — Test Driven Development

## FizzBuzz Problem
Write a program that prints the numbers from 1 to 100. But for multiples of 3 print “Fizz” instead of the number and for the multiples of 5 print “Buzz“. For numbers which are multiples of both 3 and 5 print “FizzBuzz”.

## What is TDD
Test Driven Development (TDD) is software development approach in which test cases are developed to specify and validate what the code will do. In simple terms, test cases for each functionality are created and tested first and if the test fails then the new code is written in order to pass the test and making code simple and bug-free.

### Three Basic Rules — Clean Code
1. You are not allowed to write any production code unless it is to make a failing unit test pass.
2. You are not allowed to write any more of a unit test than is sufficient to fail, and compilation failures are failures.
3. You are not allowed to write any more production code than is sufficient to pass the one failing unit test.

## F.I.R.S.T Principle
- **Fast:** The tests have to be quick to execute. If they take a long time then we will be too lazy to execute them. We will forget and eventually stop testing or worse, they will start to fail and we will not listen to them.
- **Independent:** The tests should not have dependencies between them. They must be able to execute in any order, execute only a group of them or only one.
- **Repeatable:** Must be able to run in any environment. It is no excuse for the test to work locally and then fail on another developer’s computer or development environment.
- **Self-Validating:** The test can only have two possible values. Either it has failed or it has happened. So it is very easy to know if a test has gone well or not, without having to consult logs, database if you have written a value, etc…
- **Timely:** The tests have to be created just before the code that will make them pass. If we write the code first, then writing the test can be much more complex.


## TDD Heuristics
Given-When-Then originates from Behaviour Driven Development. Thinking Given-When-Then helps to think in terms of behaviour rather than internal state. Arrange-Act-Assert is a similar pattern from the eXtreme Programming community.

In the GWT world, G,W, and T are separate methods. That means that “all you need” is to fill in the blanks. I agree that this kind of structure can help newbies with their first tests. In the AAA version of the same tests, all three parts basically resides inside the same method.

### Given / When / Then

- **GIVEN** a state or situation which you set up in the test (sets up the test’s input values)

- **WHEN** I do something, or an event happens (prompts the primary function being tested)

- **THEN** I expect an outcome (verifies that the output of the function is what was expected)

### Arrange / Act / Assert

- **ARRANGE** a state or situation which you set up in the test (sets up the test’s input values)

- **ACT** when you do something, or an event happens (prompts the primary function being tested)

- **ASSERT** the expected outcome (verifies that the output of the function is what was expected)

