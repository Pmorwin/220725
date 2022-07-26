## Java Classes
- The best way to think of a class is a template or a blueprint for an object
- You declare classes with access modifiers which control theeh visibility of the class
    - Eg. **plubic** class Launcher
        - Thre can only be one public class per fine. The name of the public class much match the file name of the file it appears in.
- Classes contain variables (fields) and bheaviors (methods)
    - Fields are variables that store information about the class
    - Methods are blocks of code that represent actions the Class can take
        - Think of field like the attributes of a class, and the methods its behaviors
        - The fields and methods of a class are also know as its members
- Best practice for naming Classes is to use upper-case CamelCase
    - eg. ThisIsMyClassName
- A class can extend another class with the "extends" keyword

## Java Methods
- Defines the behvaiors of a class/object
    - What the class/object can do
- Block of code that can be called (used) multiple times (repeatable block of code)
    - Methods are called functions in other languages, so in interviews its important to try and keep terminology straight
- Often methods are used to manipulate data
- Methods (and fields) are conventionally named using lower-case camelCase
    - Eg. thisIsMyMethod();
- Anatomy of a method
    - [Acess modifer] [Non-access modifer (optional)] [Return type] [Name] (parameters) {}

## Access Modifiers
- Methods are delcared with an **access modfier**. This access modifer determines the availabilty/visibility of the method to outside classes
    - private: The method is only visibile to the class itself
        - We most commonly use this for encapsulation
    - default (blank): The method is only accessible within the package (folder)
    - protected: The method is accessibnle to anything within the same package **PLUS** any subclasses that inherit the class
    - public: The method is accessible to any other class in the project

## Variable Scope
- The variable scope defines where a variable can be accessed from in the code
- There are 4 scopes in Java:
    - Class (Static) Scope: Static variables must be declared inside a Class. These static variables are accessible to all object of that class.
        - A change in the value of a class scoped variable will be reflect in **EVERY** object of the class
        - Class variables can only be accessed from static methods
            - Think Static variables can be accessed within static methods
    - Instance (Object) Scope: The variable is non-static and is accessible anywhere within the obejct.
        - Generally these are called fireld variables
        - A change in the value of a non-static variable will only be reflected in that specific object 
    - Method Scope: Variables declared in a method can only be accessed in that method. This includes parameters (arugments) given to the method.
    - Block Scope: A variable declared inside a block of code (inside of the curly brases) is only bisible in that block
        - This includes if/block, loops, etc
        - Method scope is pretty much a specific form of block scope 

## Non-access Modifers
- Methods are able to have nonaccess modifers as well. These are declared in the method signature right after the access modifer
    - Static: Static members belong to the class, as opposed to ojects of the class.
        - Static methods can only call other static methods directly
    - Other non-access modifers inclue final, abstract, syncornized, volatile, and transient

## Return Types
- Methods have a return type
    - Return types define what the method "gives back" when its classed
        - return types can be primitive values, objects, or even nothing at all (void)

## Parameters
- A method can take parameters, but they don't have to.
    - Parameters are the **method's arugments**
- They are generally some type of data that the methods need in order to complete its functionality
    - Parameters are listed inside the parentheses after the method name.
    - They can be objects or primitives and the method will have to access them by the names you give them

## Java Objects
- An object is an instance of a class
    - Like building a house based on a blueprint. Class = blueprint, Object = House
- Objects are created using teh class as a blueprintfor their initial state and behaviors
    - Objects are created with teh "new" keyword
    - They are built using constructors

## Constructors
- A constructor is a special method that initializes objects.
- Specifically it assigns values to an objects variables
- Every class will have a constructor (even if you dont write one)
    - The complier will add a default "no-args" constructor for you
        - The default no-args constructor takes no parameters (hense no-args) and will simply be on line, calling the parent constructor
        - The moment you provide your own constructor, the Complier will eliminate the default no-args constructor. So you will need to manually add it in
- Keyword **super** in a constructor will call the **parent constructor**
- Keyword **this** will either assign a value, or call another constructor
    - **Constructor chaining** is when you use the **this** keyowrd to call other consturctors 
- The first line of any constructor must be a call to either "super();" or "this.". If you do not ave your first line do this, the complier will try to add a call to a no-args super();
    - If the parent class does not have a no-args constructor, your code won't compile

## Method Overloading/Overriding
- Overloading: Methods with the same name, but they have a different number, type, or order of arugments as parameters.
    - A really simple example of this is with constructors.
        - Same names, but different amount of arugments (no-args, all-args, some-args)
- Overriding: This is when a child Class implements the same method signature as a parent class, **BUT** the body of the method is different
    - In other words, the child **OVERRIDES** the functionality of the parent.
        - Easiest way to imagine this in terms of real world terms is, all animals eat, but not all animals eat the same thing
- Method overloading and overriding are two examples of Polymorphism

## Var-args
- This stands for **variable arugments**
- Varargs lets us set a variable number of arugments for a method at runtime. 
    - Java will create an Array under the hood
    - You can only have **1** varargs parameter in a method and it **MUST** be the last parameter defined
- The way we write this would be:
    - ![Var-args](/Pictures/var-args.png)

## Arrays 
- Arrays in Java are objects that store the same types of data, sequentially.
- They are **fixed length** (you cannot alter the size of an array) so that Java knows how much memoery it needs for the array
    - If you need a larger/smaller Array, you have to create a new Array object in memory
    - Since the lengeth of the Array is a property, you can access it as a field variable of the array
        - Eg. myArray.length
            - Note, this is **NOT** a method. So its .length, not .length()
- Each element of an Array has a specific index
    - This allows you to quickily find a single value in an Array
    - The first index of an Array is 0, it is **zero-indexed**
- You can change the values in an Array as long as the new data are of the same type
- You can create an Array 2 main ways:
    - Empty: int[] intArray = new int[3];
    - Defined vales: int[] intArray = {8, 9, 10};

## OOP Concepts
- Abstractions: 
    - This is the hiding of implementation details from the user, so that there is more focus on the behavior, as opposed to how that behaviors is actually working under the hood
        - For instance, the user only needs to know what the Math.random() does. You dont need to know how they actually coded the functionality of that method. This makes you code (and life tbh) a lot cleaner and readable
            - Car metaphor
    - This is **NOT** to be confused with abstract classes/abstract methods, or the non-access modifer abstract. Those are **DIFFERENT** concepts
- Polymorphism: 
    - This is the ability of something in Java (usually objects/methods) to take on many forms. The name actually comes from Greek, meaning "Having many forms"
        - So when we have classes extending from the Animal class, that's the Animal class taking on many different forms
            - Every class that extends Animal IS-A Animal
- Encapsulation: 
    - This is the mechanism of wrapping data and code (typically only your fields) into a single unit
        - We do this using the **private** access modifier for the Class's instance members (fields)
        - As well, we use **public** getter and setter methods 
    - Encapsulation makes sure that any modifying of your class data is done intentionally through the getters and setters
- Inheritance:
    - This is the process where one class acquires the properties (member fields/methods) of another class
    - This enables code reusability and dynamic polymorphism
    - Say we have an ANimal class. We also have a bunch of other "Animal classes" (Dog, Cat, Bird) which **extend** the Animal Class.
        - By entending the Animal CLass, all of these other classes **inherit** its members, thus sharing the Animal attributes
    ![Class Hierarchy](/Pictures/polymorphism.png)
    - Primary examples of inheritance in Java are extending Classes and Implementing Interfaces.

## Strings
- Strings are "Strings/Groups of Characters"
- Because words and sentences are so often used in programming, Java defined a String Class with partiucalr functionality to support their use in development
- **STRINGS ARE OBJECTS NOT PRIMITVES**
- There is an entire String Class, which we make String objects from
- Strings are **immutable**
    - Once a String object is created, it **CANNOT** be changed. 
    - What *can* be done is to use String methods to create a new String in memoery changing the original String's value, and then finally assigning a new String to that changed value
- The String Class has the **final** non-access modifer, which means you cannoy create subclasses of String
- Strings Override the .equals() method from the Object class to test the value of the characters contained in that String.
    - We cannot use **==** to compare strings because it compares the value of primitives or the memory address of objects
    - However, .equals() will compare the actual content of the Strings.
        - So we use .equals to compare Strings and other objects
        - As a note, .equalsIgnoreCase() exists :)
- Strings can be constructed in a specail way in Java
    - Putting characters between "two double quotes" will create a String object known as a **String Literal**
    - These String Literals are stored in a particular place in heap memory called the String Pool
- A note on the String Pool:
    - The String Pool is located in Java's Heap memory where String literals are stored
    - Only one String object will be created for each unique String Literal in the source code
        - This means that if variaous variables use the same String Literals, they will allpoint to the same object in the String Pool
        - This is why it is **necessary** for Strings to be immutable
    - However, Strings created using the **new** keyword will not be stored in the String Pool. They will get thrown into the general heap, and get their own unique memory address
- Notable String Methods:
    - **concat()**: This joins two Strings together
    - **length()**: This returns an int with the length of the String
    - **toLowerCase()** / **toUpperCase()**: Self explanitory
- Here is a link to anything and everything you could really want to know about Strings:
    - https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
    - Really good resource to see all the different String Methods

## StringBuilder and StringBuffer
- These are **mutable** String-like objects
- They are Classes very similar to the String class and they have built-in constructors that convery easily between themselves and Strings
- Two Major Differences between StringBuffer and StringBuilder:
    - StingBuffer is synchoronized, which means that you can use it in multithreaded environments
        - It's thread safe
    - StringBuilder is newer and faster
        - We tend to use StringBuilder unless we need to use StringBuffer
- Important Methods:
    - append(): This adds chars to the **end** of the current value
    - insert(): This addes chars to a specific location based on the current value's index
    - reverse(): We saw Adam cheat with this!
- Here is a helpful chart:
    - ![Strings](/Pictures/Strings.jpg)
    