# Polymorphism & Composition Homework - Quiz

# Polymorphism

1. What does the ___word___ 'polymorphism' mean?

Can take many forms.

2. What does it mean when we apply polymorphism to OO design? Give a simple Java example.

Polymorphism allows us to use the same method to achieve different results depending on the class it is applied to.

3. What can we use to implement polymorphism in Java?

Inheritance to pass methods from a superclass to a subclass or an interface.

4. How many 'forms' can an object take when using polymorphism?

4 - Runtime, overloading, compile-time, casting

5. Give an example of when you could use polymorphism.

When you want to abstract the object that a method can be applied to. ex: If you have many unrelated objects to sell, you might want to apply the buy() method to all objects that implement the Buyable interface.



# Composition and Aggregation

6. What do we mean by 'composition' in reference to object-oriented programming?

Creating one object class that is constructed with other object classes. 

7. When would you use composition? Provide a simple example in Java.

When you want to model a 'part of' relationship rather than a 'is a' relationship. For example, a car would be contructed with wheels, an engine, a gearbox, each their own classes.

8. Give a difference between composition and aggregation?

In aggregation, classes are loosely coupled and independent from each other. If one class ceases to exist the other will not be affected. In composition, the classes are tightly coupled and dependent on each other. If the parent class gets deleted, all the children disappear too.

9. What is/are the advantage(s) of using composition/aggregation?

Aggregation allows better code re-usability since the two aggregated classes can also exist independently. Composition has a stronger association where the parent class owns all the children classes. This means that if you delete the parent class you have no leftover child classes to deal with as they are all deeleted with the parent class.

10. When using composition, when an object is destroyed, what happens to all the objects it is composed of?

They get deleted as well.

11. When using aggregation, when an object is destroyed, what happens to all the objects it is composed of?

It continues to exist independently.