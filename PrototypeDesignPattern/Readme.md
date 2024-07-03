1. Used when the object creation of a certain class is time consuming/operation heavy and we might need multiple objects of the class in our code.
So instead of creating multiple objects, we create single object and then create clones of the object, skipping heavy lifting for the cloned objects.
2. Cloning / object copy can be shallow copy or deep copy.
3. Shallow (copy by reference) when the cloned object changes will affect non primitive data types (so if object has an object of type student) then any changes in the student of clone will also modify original object
4. Deep copy (copy by value) will create different object of type student and modification in this student will not impact original object's student variable.
5. Example- creating DBconnections, creating complex objects etc.
We can create a prototype class, which can store the objects of certain concrete classes of an interface in a map and clone and return when anybody asks.
