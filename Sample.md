Rangabhatla,Sai Pranav : Copy of iBus Dependency Injection Developer Guide    

1.  [Rangabhatla,Sai Pranav](index.html)
2.  [Rangabhatla,Sai Pranav’s Home](2319788389.html)

Rangabhatla,Sai Pranav : Copy of iBus Dependency Injection Developer Guide
==========================================================================

Created on Jan 14, 2021

Table of Contents

*   1 [Overview](#CopyofiBusDependencyInjectionDeveloperGuide-Overview)
    *   1.1 [Benefits](#CopyofiBusDependencyInjectionDeveloperGuide-Benefits)
    *   1.2 [ObjectLoader](#CopyofiBusDependencyInjectionDeveloperGuide-ObjectLoader)
*   2 [Injecting objects](#CopyofiBusDependencyInjectionDeveloperGuide-Injectingobjects)
    *   2.1 [Example](#CopyofiBusDependencyInjectionDeveloperGuide-Example)
    *   2.2 [Types of dependency injection](#CopyofiBusDependencyInjectionDeveloperGuide-Typesofdependencyinjection)
        *   2.2.1 [Constructor injection](#CopyofiBusDependencyInjectionDeveloperGuide-Constructorinjection)
        *   2.2.2 [Field injection](#CopyofiBusDependencyInjectionDeveloperGuide-Fieldinjection)
        *   2.2.3 [@PostConstruct annotation](#CopyofiBusDependencyInjectionDeveloperGuide-@PostConstructannotation)
        *   2.2.4 [@PreDestroy annotation](#CopyofiBusDependencyInjectionDeveloperGuide-@PreDestroyannotation)
    *   2.3 [Required versus optional dependencies](#CopyofiBusDependencyInjectionDeveloperGuide-Requiredversusoptionaldependencies)
    *   2.4 [Naming objects](#CopyofiBusDependencyInjectionDeveloperGuide-Namingobjects)
        *   2.4.1 [Naming Primitive types](#CopyofiBusDependencyInjectionDeveloperGuide-NamingPrimitivetypes)
        *   2.4.2 [Qualifying an object](#CopyofiBusDependencyInjectionDeveloperGuide-Qualifyinganobject)
        *   2.4.3 [Using named annotations](#CopyofiBusDependencyInjectionDeveloperGuide-Usingnamedannotations)
        *   2.4.4 [Creating named annotations](#CopyofiBusDependencyInjectionDeveloperGuide-Creatingnamedannotations)
*   3 [Exception handling](#CopyofiBusDependencyInjectionDeveloperGuide-Exceptionhandling)
    *   3.1 [MissingBindingException](#CopyofiBusDependencyInjectionDeveloperGuide-MissingBindingException)
    *   3.2 [FailedInstantiationException](#CopyofiBusDependencyInjectionDeveloperGuide-FailedInstantiationException)
    *   3.3 [Troubleshooting stack traces](#CopyofiBusDependencyInjectionDeveloperGuide-Troubleshootingstacktraces)
*   4 [Looking up objects directly](#CopyofiBusDependencyInjectionDeveloperGuide-Lookingupobjectsdirectly)
    *   4.1 [Get methods vs. lookup methods](#CopyofiBusDependencyInjectionDeveloperGuide-Getmethodsvs.lookupmethods)
    *   4.2 [Get / lookup](#CopyofiBusDependencyInjectionDeveloperGuide-Get/lookup)
    *   4.3 [Get / lookup (qualified)](#CopyofiBusDependencyInjectionDeveloperGuide-Get/lookup(qualified))
    *   4.4 [Getting primitive types by name](#CopyofiBusDependencyInjectionDeveloperGuide-Gettingprimitivetypesbyname)
    *   4.5 [Getting primitive types by annotation](#CopyofiBusDependencyInjectionDeveloperGuide-Gettingprimitivetypesbyannotation)
*   5 [Bindings](#CopyofiBusDependencyInjectionDeveloperGuide-Bindings)
    *   5.1 [Configuration bindings](#CopyofiBusDependencyInjectionDeveloperGuide-Configurationbindings)
        *   5.1.1 [Binding class implementations](#CopyofiBusDependencyInjectionDeveloperGuide-Bindingclassimplementations)
        *   5.1.2 [Binding class implementations by name](#CopyofiBusDependencyInjectionDeveloperGuide-Bindingclassimplementationsbyname)
    *   5.2 [@DefaultBinding annotation](#CopyofiBusDependencyInjectionDeveloperGuide-@DefaultBindingannotation)
    *   5.3 [Bind annotations](#CopyofiBusDependencyInjectionDeveloperGuide-Bindannotations)
    *   5.4 [CustomLoaders](#CopyofiBusDependencyInjectionDeveloperGuide-CustomLoaders)
        *   5.4.1 [Local registration](#CopyofiBusDependencyInjectionDeveloperGuide-Localregistration)
        *   5.4.2 [Global registration](#CopyofiBusDependencyInjectionDeveloperGuide-Globalregistration)
    *   5.5 [Manual Binding](#CopyofiBusDependencyInjectionDeveloperGuide-ManualBinding)
        *   5.5.1 [Bind an implementation classes](#CopyofiBusDependencyInjectionDeveloperGuide-Bindanimplementationclasses)
        *   5.5.2 [Bind an instance](#CopyofiBusDependencyInjectionDeveloperGuide-Bindaninstance)
        *   5.5.3 [Bind to name](#CopyofiBusDependencyInjectionDeveloperGuide-Bindtoname)
    *   5.6 [Binding order](#CopyofiBusDependencyInjectionDeveloperGuide-Bindingorder)
*   6 [ObjectLoader Hierarchy](#CopyofiBusDependencyInjectionDeveloperGuide-ObjectLoaderHierarchy)
    *   6.1 [Hierarchy example](#CopyofiBusDependencyInjectionDeveloperGuide-Hierarchyexample)
*   7 [Shared Objects](#CopyofiBusDependencyInjectionDeveloperGuide-SharedObjects)
    *   7.1 [Using the @SingletonBinding annotation](#CopyofiBusDependencyInjectionDeveloperGuide-Usingthe@SingletonBindingannotation)
    *   7.2 [Using the @SharedInstance annotation](#CopyofiBusDependencyInjectionDeveloperGuide-Usingthe@SharedInstanceannotation)
        *   7.2.1 [Usage](#CopyofiBusDependencyInjectionDeveloperGuide-Usage)
        *   7.2.2 [Common scope object names](#CopyofiBusDependencyInjectionDeveloperGuide-Commonscopeobjectnames)
        *   7.2.3 [Scope Upgrading](#CopyofiBusDependencyInjectionDeveloperGuide-ScopeUpgrading)
        *   7.2.4 [LifecycleHooks](#CopyofiBusDependencyInjectionDeveloperGuide-LifecycleHooks)
*   8 [@DataGroup and @DataName annotations](#CopyofiBusDependencyInjectionDeveloperGuide-@DataGroupand@DataNameannotations)
    *   8.1 [FAQ](#CopyofiBusDependencyInjectionDeveloperGuide-FAQ)

Overview
========

[Dependency injection](http://en.wikipedia.org/wiki/Dependency_injection) is simply the concept where your dependencies are handed to you (they are injected), instead of hard coding the implementation. This guide explains the built in support for the dependency injection on the iBus.

Benefits
--------

There are several benefits of dependency injection, including better unit testing, and simplifying / reducing your code footprint. Since there are numerous resources available online explaining the benefits and drawbacks in detail, this guide will focus more on how to use dependency injection with the iBus.

ObjectLoader
------------

Dependency injection on the iBus is provided by the ObjectLoader class. It is basically the "one stop shop" for everything related to dependency injection, and is responsible for the entire injection process. This includes looking up, constructing, and injecting all dependencies. It also provides the ability to define bindings (similar to a [guice module](https://github.com/google/guice/wiki/Bindings)), and also behaves like a general purpose [factory pattern](http://en.wikipedia.org/wiki/Factory_method_pattern).

Most of the time you never use the ObjectLoader class directly since it works behind the scene for you. Instead, all you do is declare the resources you need (aka dependencies). The framework handles looking up implementations of those dependencies and handing them to you.

Injecting objects
=================

Since dependency injection is just simply about being handed the resources you need, let's see what that looks like.

Example
-------

To begin, let's take a simple code example that does not use dependency injection.

```java


public class Restaurant { private final Owner owner; private final Menu menu; public Restaurant() { this.owner = new OwnerImpl(); this.menu = new MenuImpl(); }}


```

As you can see, we set both variables in the constructor by using the _new_ keyword. Now let's see how this is handled using dependency injection.

Types of dependency injection
-----------------------------

There are three ways dependencies can be injected: constructor injection, field injection, and the @PostConstruct annotation. You may use any combination of these together, however it is important to know that injection always happens in this order: (constructor first, field next, and then @PostConstruct annotation).

#### Constructor injection

Constructor injection simply just means that resources are "injected" as parameters to the constructor.

```java


public class Restaurant { private final Owner owner; private final Menu menu; public Restaurant(final Owner owner, final Menu menu) { this.owner = owner; this.menu = menu; }}


```

And that's all there is to it. As you can see, it seems like a fairly small change, but this subtle change makes a big difference. If classes ask for their dependencies instead of constructing them, then frameworks can decide on the implementations, and we can even "inject" mock objects in order to write fully functional unit tests.

The ObjectLoader is what does the work to figure out the Owner and Menu implementation class, construct them, and call the Restaurant constructor with those objects.

_Note:_ Unlike some of the other dependency injection frameworks, the iBus dependency injection allows constructors to specify any number of parameters, throw any type of exception, and have any visibility (for example, public or private).

If you have multiple constructors, you can place @InjectValue on the constructor you want to use. However when there are multiple constructors and the @InjectValue is not used to specify a preference, public constructors are given preference over non-public ones. Additionally, constructors with the least number of parameters are currently given preference.

#### Field injection

Field injection is similar, but it just skips the constructor all together and sets the field values of your variables for you. The @InjectValue annotation indicates which fields need to be injected. Only fields that are annotated with the @InjectValue annotation (or another custom injection annotation) will be injected. Fields without these injection annotations are left alone.

```java


public class Restaurant { @InjectValue private Owner owner; @InjectValue private Menu menu;}


```

Again, pretty easy. All that we did was add an annotation to the variables that we wanted injected. The framework handles it from there.

_Note:_ The InjectValue annotation itself may not be needed if another injection-related annotation is used. The ObjectLoader allows any annotation that has been annotated with @InjectableAnnotation will count as a trigger for the injection process. All annotations described in this guide are injectable annotations.

#### @PostConstruct annotation

The @PostConstruct annotation is typically used for initialization. Any method annotated with @PostConstuct is invoked during the injection phase, almost like it is the constructor. However, since both constructor and field injection has already happened at this point, it has access to all variables set in this way.

_Note:_ Just like constructor injection, these methods may specify any number of parameters (all parameters are injected), throw any type of exception, and have any visibility (for example, public or private).

```java


public class Restaurant { @InjectValue private Owner owner; @InjectValue private Menu menu; @PostConstruct void init(final MenuItemStorage storage) throws StorageException { final List<MenuItem> items = storage.loadItems(owner); menu.addItems(items); }}


```

In the example above, we are still using field injection, but we additionally add a @PostConstruct method where we populate menu items that have been stored.

#### @PreDestroy annotation

The @PreDestroy annotation is the opposite of the @PostConstruct annotation, and is called when objects are destroyed. For example, this may be a close or a shutdown method. Any method annotated with @PreDestroy is invoked when the object is released (see [#Lifecycle and Scoping](#CopyofiBusDependencyInjectionDeveloperGuide-LifecycleandScoping) for more information.

_Note:_ Just like the @PostConstruct annotation, a destroy method may specify any number of parameters (all parameters are injected), throw any type of exception, and have any visibility (for example, public or private).

```java


public class Restaurant { @PreDestroy void close(final MenuItemStorage storage) throws StorageException { storage.storeItems(menu.getItems()); }}


```

Here when we close we want to persist our menu items back into the store.

Required versus optional dependencies
-------------------------------------

By default, all dependencies are assumed to be required. This means that an object is not considered valid unless all dependencies have been injected with non-null values. For example, if we cannot find an implementation for one of the two dependencies in our Restaurant class, then that means we cannot construct a valid instance of a Restaurant.

There are times though when a resource is not required and we want to function properly without it. To specify this, set the "required" value on the InjectValue annotation to "false". The framework will still always attempt to look up an implementation, but if there are no implementation has been defined (called bindings), the value is not provided.

In both examples below, the menu is required, but the owner is optional. This means the menu will never be null, but the owner may or may not exist.

* * *

**Parameter example**

To make parameters on constructors or methods not required, add the @InjectValue annotation in front of all non-required parameters (which is normally not needed with parameters) and set required to false. Any missing values are passed in as null. Again, remember that values by default are required (like menu), and will never be null. However here we are saying owner may be null.

```java


public class Restaurant { private final Owner owner; private final Menu menu; public Restaurant(@InjectValue(required = false) final Owner owner, final Menu menu) { if(owner != null) this.owner = owner; else this.owner = Owner.DEFAULT\_OWNER; this.menu = menu; }}


```

  

**Field example**

For field injection, the @InjectValue is already required, so you just need to set required to false. If an implementation is missing, the field is not modified (fields are NOT set to null, instead they are just ignored). This means that it will remain with whatever default value that has been set. If a field is null, it remains null. If it already has a default value, it is left as that.

```java


public class Restaurant { @InjectValue(required = false) private Owner owner = Owner.DEFAULT\_OWNER; @InjectValue private Menu menu;}


```

Naming objects
--------------

Objects can be given a name. For example, you could take a String object and say: this is not just any String, this is the "environment" string, and this string over here is the "connectionURL".

#### Naming Primitive types

When dealing with primitive classes (like String, Integer, etc.), as well as some other non-primitive, commonly used classes (like List, etc.), the class alone is not specific enough to know what needs to be injected. For example, a connection string and the environment string are both strings, so the String class alone is not enough to qualify the expected value. In this type of scenario, these types of values must be named.

Named values are used by filling out the value on the InjectValue annotation. For example:

**Parameter example**

```java


public class Restaurant { private final String environment; public Restaurant(@InjectValue("environment") final String environment){ this.environment = environment; }}


```

  

**Field example**

```java


public class Restaurant { @InjectValue("environment") private String environment;}


```

* * *

In the examples above, there must be a string that has been bound which is named "environment".

#### Qualifying an object

In addition to when it is required, optionally naming an object also provides means the framework can uniquely identify a specific variable. The framework can then use the name of that variable to determine what to inject.

For example, we may have two different data access variables, and both are the same class, however we need two different implementations. In this scenario, we can name each object so the framework knows how to determine which implementation to use.

```java


public class MyService { @InjectValue("read") private MyDataAccess read; @InjectValue("write") private MyDataAccess write;}


```

In the example above, we can have a different class implementation for our read variable than we do our write. More on this is covered in the [#Bindings](#CopyofiBusDependencyInjectionDeveloperGuide-Bindings) section.

#### Using named annotations

When an object name is commonly used, annotations can be created to avoid copy/pasting the same string everywhere.

As an example, the @Environment annotation was created to represent @InjectValue("environment"). The behavior of @Environment and @InjectValue("environment") are identical. These types of annotations are created for convenience only. For example:

* * *

**Parameter example**

```java


public class Restaurant { private final String environment; public Restaurant(@Environment final String environment){ this.environment = environment; }}


```

  

**Field example**

```java


public class MyService { @Read private MyDataAccess read; @Write private MyDataAccess write;}


```

#### Creating named annotations

Creating these annotations is easy (but don't get carried away). The new annotation needs the @NamedAnnotation, and should look like this:

```java


@NamedAnnotation@Target({ ElementType.PARAMETER, ElementType.FIELD })@Retention(RetentionPolicy.RUNTIME)public @interface Environment {}


```

By default, the name that the annotation represents is the simple class name with with the first character set to lowercase. For example, the default name for the custom annotation @BestObjectNameEver is "bestObjectNameEver", and would be identical to calling @InjectValue("bestObjectNameEver").

Exception handling
==================

When being injected, objects are allowed to throw any exception in the constructor, @PostConstruct methods, and @PreDestory methods. However, due to the nature of dependency injection where resources are be injected, normally you will find there are no exceptions that you need to throw.

When an exception is thrown, the following happens:

1.  If an object is constructed but an exception is thrown during either field injection or when invoking @PostConstruct phase, the object is released and any methods annotated with the @PreDestroy annotation are invoked. See [#Releasing and Lifecycle](#CopyofiBusDependencyInjectionDeveloperGuide-ReleasingandLifecycle) for more information.
2.  Additionally, any other constructed objects that were created during that phase are released. For example, if a service is created, and then a data access is created, but throws an exception during the @PostConstruct phase, the data access is released, and then the service is released as well, etc.

The ObjectLoader itself throws two types of exceptions: MissingBindingException and FailedInstantiationException. Any other exception is wrapped.

MissingBindingException
-----------------------

A MissingBindingException means that a required object was requested, however no bindings (instructions) exist for the requested class. Basically it means the ObjectLoader was unable to find the implementation because there was nothing there to tell the ObjectLoader about an implementation class.

For services, in addition to default bindings for internal classes, the most common type of binding is a configuration bindings. For example, the service class itself comes from configuration. If you ever get a missing binding exception for the com.cerner.careaware.ibus.service.IBusService, that probably means the configuration was corrupted. Most of the time this means that someone manually imported or deleted the configuration. If this happens, re-run the deployer to correct this type of problem. More on this is covered in the [#Bindings](#CopyofiBusDependencyInjectionDeveloperGuide-Bindings) section.

Another cause could be that an expected [#CustomLoader](#CopyofiBusDependencyInjectionDeveloperGuide-CustomLoader) is not present. For example, service proxies are loaded through a class called ServiceProxyLoader. If you get a MissingBindingException exception on a proxy, it might mean that your version of careaware-core-client is out of date.

FailedInstantiationException
----------------------------

The other type of exception is the FailedInstantiationException. This exception means we found the bindings (we knew what to construct), but there was some kind of a failure that happened as a result of constructing the object and injecting all of it's dependencies.

Exceptions thrown by constructors or the @PostConstruct methods are wrapped (kind of like a InvocationTargetException). For example, if we are have this code:

```java


public class Restaurant { @InjectValue private Menu menu;}


```

and the ObjectLoader finds an MenuImpl binding for the Menu interface, but the MenuImpl constructor throws an IllegalArgumentException, you would get a FailedInstantiationException that was caused by an IllegalArgumentException.

Troubleshooting stack traces
----------------------------

When viewing exceptions in log related to dependency injection, it is important to look at the entire stack traces (especially the last exception). The exception at the bottom is normally the most important one, since it is the initial cause and the reason that injection failed. The other exceptions give you the full picture on how we got to that exception.

Looking at the following code example:

```java


@DefaultBinding(ClassA.class)class ClassA { @InjectValue private ClassB b;}@DefaultBinding(ClassB.class)class ClassB { private final ClassC c; public ClassB(final ClassC c) { this.c = c; }}@DefaultBinding(ClassC.class)class ClassC { public ClassC() { throw new NullPointerException(); }}


```

Here we have ClassA that depends on ClassB, which depends on ClassC. But ClassC throws a NullPointerException in the constructor. And if we called code like this:

```java


class Main { public static void main(String\[\] args) throws Exception { ObjectLoader.DEFAULT.get(ClassA.class); }}


```

  

Below is the stack trace you would get if you tried to get an instance of ClassA:

Exception in thread "main" com.cerner.careaware.ibus.core.bind.exception.FailedInstantiationException: Failed to load an implementation of com.cerner.example.ClassA at com.cerner.careaware.ibus.core.bind.CustomLoader.fullLookup(CustomLoader.java:398) at com.cerner.careaware.ibus.core.bind.ObjectLoader.lookup(ObjectLoader.java:411) at com.cerner.careaware.ibus.core.bind.ObjectLoader.get(ObjectLoader.java:373) at com.cerner.example.Main.main(Main.java:31)Caused by: com.cerner.careaware.ibus.core.bind.exception.FailedInstantiationException: Unable to construct a new instance using the constructor com.cerner.example.ClassA() at com.cerner.careaware.ibus.core.bind.CustomLoader.newInstance(CustomLoader.java:755) at com.cerner.careaware.ibus.core.bind.CustomLoader.constructUsing(CustomLoader.java:823) at com.cerner.careaware.ibus.core.bind.CustomLoader.constructInstance(CustomLoader.java:812) at com.cerner.careaware.ibus.core.bind.CustomLoader.fullLookup(CustomLoader.java:388) ... 3 moreCaused by: com.cerner.careaware.ibus.core.bind.exception.FailedInstantiationException: Failed to load an implementation of com.cerner.example.ClassB at com.cerner.careaware.ibus.core.bind.CustomLoader.fullLookup(CustomLoader.java:398) at com.cerner.careaware.ibus.core.bind.CustomLoader$InjectableValue.lookup(CustomLoader.java:563) at com.cerner.careaware.ibus.core.bind.CustomLoader$InjectableValue.access$1(CustomLoader.java:524) at com.cerner.careaware.ibus.core.bind.CustomLoader.injectFields(CustomLoader.java:458) at com.cerner.careaware.ibus.core.bind.CustomLoader.newInstance(CustomLoader.java:742) ... 6 moreCaused by: com.cerner.careaware.ibus.core.bind.exception.FailedInstantiationException: Unable to construct a new instance using the constructor public com.cerner.example.ClassB(com.cerner.example.ClassC) at com.cerner.careaware.ibus.core.bind.CustomLoader.newInstance(CustomLoader.java:755) at com.cerner.careaware.ibus.core.bind.CustomLoader.constructUsing(CustomLoader.java:823) at com.cerner.careaware.ibus.core.bind.CustomLoader.constructInstance(CustomLoader.java:809) at com.cerner.careaware.ibus.core.bind.CustomLoader.fullLookup(CustomLoader.java:388) ... 10 moreCaused by: com.cerner.careaware.ibus.core.bind.exception.FailedInstantiationException: Failed to load an implementation of com.cerner.example.ClassC at com.cerner.careaware.ibus.core.bind.CustomLoader.fullLookup(CustomLoader.java:398) at com.cerner.careaware.ibus.core.bind.CustomLoader$InjectableValue.lookup(CustomLoader.java:563) at com.cerner.careaware.ibus.core.bind.CustomLoader$InjectableValue.access$1(CustomLoader.java:524) at com.cerner.careaware.ibus.core.bind.CustomLoader.loadParameters(CustomLoader.java:431) at com.cerner.careaware.ibus.core.bind.CustomLoader.newInstance(CustomLoader.java:739) ... 13 moreCaused by: com.cerner.careaware.ibus.core.bind.exception.FailedInstantiationException: Unable to construct a new instance using the constructor public com.cerner.example.ClassC() at com.cerner.careaware.ibus.core.bind.CustomLoader.newInstance(CustomLoader.java:755) at com.cerner.careaware.ibus.core.bind.CustomLoader.constructUsing(CustomLoader.java:823) at com.cerner.careaware.ibus.core.bind.CustomLoader.constructInstance(CustomLoader.java:809) at com.cerner.careaware.ibus.core.bind.CustomLoader.fullLookup(CustomLoader.java:388) ... 17 moreCaused by: java.lang.NullPointerException at com.cerner.example.ClassC.<init>(Main.java:25) at sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method) at sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:39) at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:27) at java.lang.reflect.Constructor.newInstance(Constructor.java:513) at com.cerner.careaware.ibus.core.bind.ObjectLoader$1.newInstance(ObjectLoader.java:83) at com.cerner.careaware.ibus.core.bind.CustomLoader.newInstance(CustomLoader.java:740) ... 20 more

The stack trace tells us that at a high level, it failed to create an instance of ClassA, because it failed to create an instance of ClassB, because it failed to create an instance of ClassC. At the bottom, we see that the whole thing was caused by a NullPointerException thrown in the ClassC constructor.

The first and last exceptions are typically the most important, but due to the dynamic nature of dependency injection, the stack trace fills in all of the gaps in the middle to help with troubleshooting.

Looking up objects directly
===========================

The ObjectLoader class also allows you to ask for objects yourself (similar to something like a factory or provider pattern). One thing that is nice is that retrieving dependencies directly this way is identical to how dependencies are injected by the framework, so you benefit from all of the same functionality.

Get methods vs. lookup methods
------------------------------

There are two types of methods used to retrieve objects. There are "lookup" methods, and there are "get" methods. The only difference between these methods are that the "lookup" method may return null if no binding is found that object, while the "get" method will never return null, but instead will throw a MissingBindingException. (Quite literally, the "get" method just calls the "lookup" method, and throws an exception if the value is null). Use the "get" method when the object is required, or use "lookup" if it is optional.

Get / lookup
------------

The basic get method takes class or interface and returns you an instance of the object.

```java


public <C> C get(final Class<C> klass) throws MissingBindingException, FailedInstantiationException;


``````java


public <C> C lookup(final Class<C> klass) throws FailedInstantiationException;


```

For our example, instead of injecting the Owner and Menu instances, we will look them up directly.

```java


public class Restaurant { private Owner owner; private Menu menu; public Restaurant(final ObjectLoader loader) throws Exception { owner = loader.lookup(Owner.class); if(owner == null) owner = Owner.DEFAULT\_OWNER; this.menu = loader.get(Menu.class); }}


```

Looking up / getting instances using the ObjectLoader will have the same result as injecting them. Normally it is better to just inject resources, however there are times when you may need this.

On a side note, you can also use the ObjectLoader#get method like a [Guice provider](https://github.com/google/guice/wiki/InjectingProviders).

Get / lookup (qualified)
------------------------

In addition to the basic get/look methods, there is another pair that takes an ObjectBinding object.

```java


public <C> C get(final Class<C> klass, final ObjectBinding qualifier) throws MissingBindingException, FailedInstantiationException;


``````java


public <C> C lookup(final Class<C> klass, final ObjectBinding qualifier) throws FailedInstantiationException;


```

This enables some the same functionality that you can get through annotations when injecting objects, which includes things like:

*   A default binding (see [@DefaultBinding Annotation](https://wiki.ucern.com/display/careaware/iBus+Dependency+Injection+Developer+Guide#iBusDependencyInjectionDeveloperGuide-@DefaultBindingannotation) for more information)
*   The name of the object (see [#Naming objects](#CopyofiBusDependencyInjectionDeveloperGuide-Namingobjects) for more information)
*   The scope object. (see [#Shared Objects](#CopyofiBusDependencyInjectionDeveloperGuide-SharedObjects) for more information)

* * *

As an example, we can directly get objects by name.

**Get an object with a name example**

```java


public class MyService { private final MyDataAccess read; private final MyDataAccess write; public MyService(final ObjectLoader loader) { read = loader.get(MyDataAccess.class, new ObjectBinding().objectName("read")); write = loader.get(MyDataAccess.class, new ObjectBinding().objectName("write")); }}


```

By default, passing in an empty qualifier is identical to calling the get(Class) method.

Getting primitive types by name
-------------------------------

Unlike our MyDataAcces example, when dealing with immutable primitive values (like String or Integer), since there's no real way to fail instantiating the object, all that really matters is that a value was provided and bound to the given name.

As a convenience, a getByName method is provided for these types of values (where they are not constructed, but they must have already been bound by name).

```java


public <C> C getByName(final String name) throws MissingBindingException;


``````java


public <C> C lookupByName(final String name);


```

  

In the example below, we get the environment by name.

```java


public class Restaurant { private final String environment; public Restaurant(final ObjectLoader loader) throws Exception { environment = loader.getByName("environment"); }}


```

Getting primitive types by annotation
-------------------------------------

Just like you can use annotations to name values, you can also use those same annotations to look them up by name.

```java


public <C> C getByAnnotation(final Class<? extends Annotation> annotation) throws MissingBindingException;


``````java


public <C> C lookupByAnnotation(final Class<? extends Annotation> annotation);


```

  

The example below is functionally identical to the example getByName example above.

```java


public class Restaurant { private final String environment; public Restaurant(final ObjectLoader loader) throws Exception { environment = loader.getByAnnotation(Environment.class); }}


```

Bindings
========

When a object injected or [directly looked up](#CopyofiBusDependencyInjectionDeveloperGuide-Lookingupobjectsdirectly), the ObjectLoader needs to know how to get that object. Should the ObjectLoader create a new instance using some implementation class? Is there already an instance out there to use? Bindings are the instructions that tell the ObjectLoader what implementation to use.

For example, when the Restaurant class needs a Menu injected, with Java it is practically impossible to know about implementation classes. And even if we could, we don't know for sure what implementation to use in which scenario. This is where bindings come in. We need a binding to tell the ObjectLoader to use construct a new instance using the MenuImpl class.

Bindings are always required, however thankfully there are also lots of different types of bindings available, and they are easy to use. We'll cover the main types in the next few sections.

Configuration bindings
----------------------

Bindings often come from [configuration (ContextData)](/pages/createpage.action?spaceKey=~SR076956&title=iBus+Configuration+Developer+Guide&linkCreation=true&fromPageId=2423492736). This means that the schema for a service or an application can define the exact implementation class to use at runtime.

We'll see two ways to use configuration bindings, but first lets cover a some of the benefits of using configuration based bindings:

**Bindings are externalized**

Configuration bindings allow you to define bindings in your configuration schema. Because the schema is created as part of the packaging/assembly process, it means that bindings do not need to be hard-coded in your service or application, which means changing implementations can easily be done without code changes in your service or application.

**Schema condition language**

Because bindings are defined in a schema, it means you can use the schema condition logic to define your implementation. You can flex which implementation to use based on the configuration the user enters (or even disable a injected resource all together). For example, you could define a drop down or any other control to control which implementation to use. Or you can choose to. You can even analyse the syntax of a connection URL to identify the proper implementation to load.

#### Binding class implementations

Configuration binding work by binding the name of the interface class (aka the key) to the name of the implementation class (aka the value). In the most basic form, it looks like this:

```java


final SchemaElement element = ELEMENT\_STRING(null, null, new ContextKey<String>(MyInterface.class.getName()));element.addConditions(IF(ALWAYS()).init(MyImplementation.class.getName()).readOnly().hide());


```

This is basically a hidden constant in the schema language. The value is always set to the name of the implementation class and is always hidden. Like with other common scenarios, there is an ELEMENT\_BINDING method provided in the SchemaHelper class.

```java


final SchemaElement element = ELEMENT\_BINDING(MyInterface.class, MyImplementation.class);


```

You can also make your implementation flex based on configuration. For example:

```java


// This is a drop down with two modesfinal SchemaElement mode = ELEMENT\_STRING("Mode", "Determines the mode", MODE\_KEY);mode.addConditions(IF(ALWAYS()).enforce("DefaultMode", "AlternateMode"));// The ELEMENT\_BINDING method already adds IF(ALWAYS()).init(MyDefaultImpl.class.getName()).readOnly().hide()final SchemaElement element = ELEMENT\_BINDING(MyInterface.class, MyDefaultImpl.class);// We need to insert above the IF(ALWAYS()) condition that says if mode == "AlternateMode", then set the value to our MyAlternateImpl classelement.insertConditions(0, IF(RULE\_JOIN(mode, RULE\_EQUALS("AlternateMode"))).init(MyAlternateImpl.class.getName()).readOnly().hide());


```

#### Binding class implementations by name

In the [#Naming objects](#CopyofiBusDependencyInjectionDeveloperGuide-Namingobjects) section, we learned that objects could be named, and that we could use that name to also indicate specific bindings. This applies to configuration bindings as well.

The difference with named configuration bindings is that instead of just using the name of the class as the key, we add a ".name" to the end. For example:

```java


final SchemaElement element = ELEMENT\_STRING(null, null, null, new ContextKey<String>(klass.getName() + ".myName"));element.addConditions(IF(ALWAYS()).init(implementationClass.getName()).readOnly().hide());


```

And just like before, there is a helper method for this:

```java


final SchemaElement element = ELEMENT\_NAMED\_BINDING(MyInterface.class, "myName", MyImplementation.class);


```

You can also use conditions on named configuration binding elements just like we did without a name.

_Note:_ If an object has a named there must be an explicit binding for that name. It will NOT default to using the the binding without a name. For example:

```java


// Every MyInterface object named "read" will use MyReadImplfinal SchemaElement readImpl = ELEMENT\_NAMED\_BINDING(MyInterface.class, "read", MyReadImpl.class);// Every MyInterface object named "write" will use MyWriteImplfinal SchemaElement writeImpl = ELEMENT\_NAMED\_BINDING(MyInterface.class, "write", MyWriteImpl.class);// Every MyInterface without a name will use this.final SchemaElement defaultImpl = ELEMENT\_BINDING(MyInterface.class, MyDefaultImpl.class);


```

@DefaultBinding annotation
--------------------------

The DefaultBinding annotation is a type of binding that can be used to specify the default implementation class. This is one of the lowest priority bindings, which means it is only used if no other bindings exist.

When you use this annotation on a class or interface, you are specifying that any time you see that class, you should use that implementation by default. For example:

* * *

**Implementation class example**

```java


@DefaultBinding(MyImplementation.class)public interface MyInterface {}


```

The example above means that anywhere you want MyInterface, you will get an instance of MyImplementation if no other bindings exist.

* * *

You can also bind a class to itself, like this:

**Same class example**

```java


@DefaultBinding(MyClass.class)public class MyClass {}


```

Even when you have a concrete class that you want to instantiate, you still need to explicitly let the ObjectLoader know that it should create an instance of MyClass when it is requested.

* * *

You may also use this on fields or parameters to dictate a default implementation if one is not provided.

**Field example**

```java


@DefaultBinding(MyImplementation.class)private MyInterface mine;


```

**Parameter example**

```java


private MyClass(@DefaultBinding(MyImplementation.class) final MyInterface mine) {}


```

* * *

When both class level default bindings and field or parameter level default bindings are used, field and parameter default bindings take priority. Also, when using this on a class or interface, the binding only applies to the class or interface that is annotated. If you had MyInterface2 that extended MyInterface, the annotation for MyInterface does not apply when a request comes in for MyInterface2. If the same default implementation can be used for both MyInterface and MyInterface2, then both interfaces would need the default binding annotation.

Bind annotations
----------------

There are times we need to set a value in code for a particular variable.

For example, let's say we have we have a @Color annotation, which signifies the name of a color (eg: "blue", "red", etc.).

When you need the color, you ask for it like this (just like @Environment, etc.):

```java


@Colorprivate String color;


```

Imagine then that we have a Paint class that has a color. It would look like this:

```java


public class Paint { private final String color; public Paint(@Color final String color) { this.color = color; }}


```

In our code though, in order to inject a Paint object, we need to specify the color of the paint. Instead of binding "color" by name using the ObjectLoader.bindToAnnotation method, we can actually use a special @Color.Bind annotation in order to set the color value for the paint. It looks like this.

```java


public class MyClass { @Color.Bind("blue") private Paint paint;}


```

Setting this means that when Paint (and any of it's dependencies) need the color, it will be "blue". This means that Paint, and all of its dependencies will be able to inject @Color, and they will get "blue" as the value.

* * *

One thing to point out is that using this type of annotation only effects the object it is on (and all of its dependencies). For example, if MyClass had other variables that were injected, they do not have access to the @Color "blue" unless they also have that same binding.

In a scenario were we want multiple injected values to be able to see the binding, we can set it at the class level. This means that the service, and everything under the service (including its dependencies, and dependencies of its dependencies, etc.) For example:

```java


@Color.Bind("blue")public class MyClass { @InjectValue private Paint paint; // Here we have blue paint @InjectValue private House house; // Here we have a blue house @InjectValue private Moon moon; // Here we have a blue moon @Color private String color; // We can even get the color ourselves }


```

CustomLoaders
-------------

When the existing binding logic and / or construction logic is not enough, you are able to write your own custom loader by extending the class CustomLoader. For example, CustomLoaders are used by frameworks to allow legacy code lines to be injected properly. Try to only use CustomLoaders if you have to. Ideally you should use bindings like the [#Configuration bindings](#CopyofiBusDependencyInjectionDeveloperGuide-Configurationbindings).

The following is an example of a CustomLoader

```java


public class MyThirdPartyCustomLoader extends CustomLoader { @Override protected <C> C lookup(final Class<C> klass, final ObjectLoader loader, final LoaderContext context) throws Exception { if (klass != ThirdPartyAPI.class) return null; final ThirdPartyAnnotation annotation = context.getAnnotatedElement().getAnnotation(ThirdPartyAnnotation.class); if (annotation == null) return null; final Class<? extends ThirdPartyAPI> implClass = getThirdPartyImpl(annotation.value()); return loader.newInstance(implClass); }}


```

Since your CustomLoader may be called to analyse every single injected object, it is important to return null as soon as possible if the class requested is not related to your CustomLoader.

The LoaderContext provides access to information about the request. For example, you have access to any annotations, the name of the object, the scope for the object, if there is a default binding, etc. It also provides information on where the class is being injected, as well as any parent LoaderContext information.

There are two ways to register CustomLoaders.

#### Local registration

Custom loaders can be registered directly on an ObjectLoader to provide special logic that is specific to that instance of the loader.

```java


loader.register(new CustomLoader() { @Override protected <C> C lookup(final Class<C> klass, final ObjectLoader loader, final LoaderContext context) throws Exception { // Lookup logic }});


```

If you register a CustomLoader instance directly on an ObjectLoader, only that ObjectLoader will use that CustomLoader (which includes any child loaders created off of that ObjectLoader).

#### Global registration

CustomLoaders are normally registered at a global, system level. This means every ObjectLoader has access to these CustomLoaders.

These system custom loaders are discovered using SPI. To expose your new loader, under the "src/main/resources" folder in your project, you will want to create a new folder structure / file (in src/main/resources) called:

```java


META-INF/services/com.cerner.careaware.ibus.core.bind.CustomLoader


```

The content of the file is the full class name of your implementation, for example: "com.cerner.careaware.mysolution.MyCustomLoader".

Manual Binding
--------------

The ObjectLoader class allows you set bindings in code. These methods can be used when needed, but can also be helpful when tests require the use of the ObjectLoader for binding mock implementations.

#### Bind an implementation classes

Similar to the DefaultBinding, you can bind specific the class to use by calling the bind(Class, Class) method. When you do this, any time the ObjectLoader comes across a request for that class, it will use the implementation you provided.

For example, you can bind an interface to an implementation.

```java


loader.bind(MyInterface.class, MyImplementation.class)


```

Or you can bind a class to itself so it can be instantiated.

```java


loader.bind(MyClass.class, MyClass.class)


```

#### Bind an instance

If needed, you can actually bind a constructed object using the bind(Class, Object) method.

For example, you can bind an already constructed object:

```java


MyClass instance = ...loader.bind(MyClass.class, instance);


```

#### Bind to name

For primitive types (like String or Boolean) or named objects, you can bind the instance by name instead of class.

```java


loader.bindToName("environment", "DEV");loader.bindToName("color", "blue");loader.bindToName("maxSize", 100);


```

And since annotations can be used in place of names, there is a bindToAnnotation method available.

```java


loader.bindToAnnotation(Environment.class, "DEV");loader.bindToAnnotation(Color.class, "blue");loader.bindToAnnotation(MaxSize.class, 100);


```

Binding order
-------------

The list below specifies the order in which bindings are prioritized. The ObjectLoader will use the first available binding.

_Note:_ The ObjectLoader supports using a system property (where the key is the name of the requested class, and the value is the name of the implementation class), which takes precedence over any other type of binding. However this is only intended to be used as a stop-gap for emergency scenarios, and should not be used as a part of the design.

When a class is requested, the ObjectLoader first looks up objects bound locally:

*   **Instance Bindings** - Looks for instances explicitly bound in code using the bind(Class, Object), bindToName, and bindToAnnotation methods.
*   **Implementation Class Bindings** - Looks for implementation classes explicitly bound in code using the bind(Class, Class) method.
*   **Locally registered CustomLoaders** - Looks for instances from any custom loaders registered in code using the register(CustomLoader) method.

If no binding is found, then this process is repeated for each parent loader. And then that parent will then check it's parent, etc.

If no parent has a local binding for the requested class, it will check global bindings. This is where the majority of the bindings come from in a production environment.

*   **System registered CustomLoaders** - Looks for instances from any custom loaders which are found on the system. Configuration based bindings are performed by a system registered CustomLoader.
*   **SPI Bindings** - Although not often used, the ObjectLoader supports looking up implementations using SPI property files.

If still no binding is found, then it will use the default binding.

*   **Default Bindings** - Looks up the default implementation using the DefaultBinding annotation (for example the @DefaultBinding).

ObjectLoader Hierarchy
======================

ObjectLoaders themselves have a hierarchy, in that they have parents and children. The main benefit of this hierarchy is inheriting bindings from your parent.

Creating new loaders is done by calling the newLoader() method. The ObjectLoader.DEFAULT is at the root level. Any bindings at this level are available for all other loaders. However, children always overwrite the behavior of their parents. So as we saw in the previous section, the ObjectLoader first looks for bindings on itself, before moving to its parent.

Hierarchy example
-----------------

So then we have the question: when should I use the newLoader method?

Well, for starters, you can use the method any time you have conflicting bindings. For example, let's look at a made up service that has some plugable modules, however each module has a different bindings.

```java


public class MyService { @InjectValue private ObjectLoader loader; // This represents the loader for this service instance private final List<PluggableModule> modules = new ArrayList<PluggableModule>(); private List<ModuleConfiguration> moduleConfigurations = ... // However you get this information. @PostConstruct void init() { for (final ModuleConfiguration config : moduleConfigurations) { final ObjectLoader moduleLoader = loader.newLoader(); // Create a new child loader for each module we create. // Then we bind each configuration for each module. moduleLoader.bind(PluggableModule.class, config.getImplClass()); // Here we can bind the implementation class moduleLoader.bindToName("moduleName", config.getName()); // And bind the name moduleLoader.bind(ModuleConfiguration.class, moduleConfig); // Maybe we need to bind the entire ModuleConfiguration object itself final PluggableModule module = moduleLoader.get(PluggableModule.class); // Once we get the module, it has the configuration we bound. modules.add(module); } }}


```

As you can see, each module will have different bindings (like a different name and implementation class).

Shared Objects
==============

Many times you may want to share the same instance of an object between classes. But in order to do that, we need to decide who all gets the same instance of an object.

Using the @SingletonBinding annotation
--------------------------------------

This annotation can be placed on an class to signify that it is a static singleton. This means that only one instance may exist in the entire JVM. Any time an instance of that object is requested, the same object is returned.

```java


@SingletonBindingpublic class MySingletonClass {}


```

In this example, this means that once an instance of MySingletonClass is constructed, the same instance will always be returned for every request.

One small thing just to know is that unlike the SharedInstance annotation, this annotation automatically counts as an default binding to itself. For example:

```java


@SingletonBindingpublic class MyClass {}


```

also implies this:

```java


@DefaultBinding(MyClass.class)public class MyClass {}


```

Using the @SharedInstance annotation
------------------------------------

This annotation is used to support sharing object instances across a specific scope. This is similar to the @SingletonBinding, except that the object is not scoped statically. Instead, it is scoped to an object. When you declare the annotation, you specify the name of that scope object.

For example:

```java


@SharedInstance(SharedInstance.ENVIRONMENT)


```

is tied to the iBus environment. If the environment is "PROD", it also means the lifecycle of the objects are tied to "PROD". There will only be one instance of a resource for "PROD". Everyone needing that resource that have the environment "PROD" will all share the same instance of that object.

#### Usage

If you specify the annotation on a class, you are saying that all instances of the annotated class will be shared, one for each scope object.

```java


@SharedInstance(SharedInstance.ENVIRONMENT)public class MyClass {}


```

Putting it on a variable also works. If the class doesn't already specify it, you can specify what instances of the object you want to share.

```java


@SharedInstance(SharedInstance.ENVIRONMENT)private MyClass mine;


```

#### Common scope object names

A list of common scopes and when and how to use them is included. Note that most objects should be tied to the life cycles of a service or container.

* * *

**Shared Per Service**

If this annotation is used, there will be only one instance of a resource per service. Objects scoped to a service have their lifecycle managed in tandem with that service. If the service is stopped, those objects are released. If the service is started, new objects are created. Most objects should be shared per service.

```java


@SharedInstance(SharedInstance.SERVICE)


```

* * *

**Shared Per Container**

If this annotation is used, there will be only one instance of a resource per iBus container (and therefore, one per tenant). Objects scoped to a container scope have their lifecycle managed in tandem with that container. If the container is shut down, those objects are released. If the container is started, new objects are created. The container scope should only be used in the context of the [Service Framework](https://wiki.cerner.com/display/public/DevMethodology/iBus+Service+Framework+Design)

```java


@SharedInstance(SharedInstance.CONTAINER)


```

* * *

**Shared Per Environment**

If this annotation is used, there will be only one instance of a resource per environment. An environment scope should be used to tie an object to a particular iBus connection. For an example, the actual IBusConnection object itself is bound to this scope. Other classes like service proxies and other connection based client APIs also will be shared per environment.

**Sharing the environment scope**```java


@SharedInstance(SharedInstance.ENVIRONMENT)


```

#### Scope Upgrading

To ensure that objects managed by the service framework have their lifecycles handled properly, the object loader framework may need to perform scope upgrades. These happen due to the fact that a service container can be running while its service(s) are stopped, but a service cannot be running while its service container is stopped.

**Container Scope Upgrading**

Objects tied to the container life cycle cannot rely on dependencies tied to a service lifecycle, as a service may be brought down while its container is still up. In cases where a container scoped object is responsible for initializing a service scoped object, the object will instead be initialized with a container scope and therefore tied to the container lifecycle.

**Environment Upgrading**

Objects tied to the container life cycle cannot rely on connections shared with objects tied to the service lifecycle. If an object tied to the container scope is instantiated by a service scoped object, or due to an object instantiated in the process of creating that service scoped object, environment data (if present) will be upgraded to use the container information as metadata instead of the service information. Therefore any connections instantiated by the container will use this new environment data to connect.

Releasing and Lifecycle

Once objects are no longer needed, they need to be released (aka destroyed). When an object is released, any @PreDestroy methods are invoked. Additionally, any @SharedInstance references to that object are cleared, and any LifecycleHooks are notified that the object has been released. Releasing objects is done by calling the release() method on the ObjectLoader, and passing in all objects to be released.

While all objects should be released, frameworks that control the lifecycle of your object will automatically release your injected dependencies for you (for example, the iBus service framework automatically releases all injected resources for a service when it is destroyed). However, if required resources have a shorter lifespan that your object, you need to release those resources manually. This is typically done through the use of LifecycleHooks. The ObjectLoader framework does not control the lifecycle of objects directly. Instead, it delegates that information to the frameworks and consuming code.

#### LifecycleHooks

The LifecycleHook interface is used for notifying when objects are created and when they are released. This can be used in a variety of ways, however the most common use for a LifecycleHook is for releasing objects once they are no longer needed. The BasicLifecycleHook class is a basic implementation that provides the ability to keep track of which objects have been created for an entire scope. Once we are done with that scope, all instantiated objects can then be released.

* * *

**Worker example**

As an example, let's say we have a service that needs to schedule work to be done every so often. We know we need resources every time we run (maybe like a database connection), but we don't really want to keep those resources around for the entire lifecycle of our service (and besides, maybe we need to be able to run multiple at a time and not all resources may be thread safe). Instead of having everything injected upfront, we'll just get our resources when we run. Once we are finished though, we need to clean up after ourselves and release all acquired resources.

We use a BasicLifecycleHook to keep track of the resources for us (remember, the MyWorker implementation may have additional injected resources that we do not know about or care to track).

```java


public class MyService { @InjectValue private ObjectLoader loader; // This represents this service's scope @InjectValue private MyScheduler scheduler; @PostConstruct void init() { scheduler.schedule(new Runnable() { public void run() { final BasicLifecycleHook hook = new BasicLifecycleHook(); final ObjectLoader workerScope = loader.newLoader(); workerScope.register(hook); try { final MyWorker worker = workerScope.get(MyWorker.class); worker.doWork(); } finally { workerScope.release(hook.getObjects()); } } }); } @PreDestroy void destroy() { scheduler.shutdown(); }}


```

@DataGroup and @DataName annotations
====================================

The @DataGroup and @DataName annotations are used together define how resources are shared and qualified.

For example, a TaskBoard with a data group of "MyService", and a data name of "purge" will share the same data as another TaskBoard with the same data group and data name (assuming they are the same implementation of course, since JDBCTaskBoard can never share the same data as JDBCObjectStore). Also, it is find to use the same data group anddata name across different types of frameworks (for example, it's not a problem for a TaskBoard and an ObjectStore to have the same DataGroup and DataName).

The importance of @DataGroup and @DataName are to help qualify a resource. The data group differentiates the "purge" TaskBoard of the "LocationService" from the "purge" TaskBoard of the "PatientService". Without the @DataGroup, the @DataNames would conflict other services, and the two services separate types of services would share the same TaskBoard data.

For services, the @DataGroup should typically always be the service type (eg: "LocationService"). You should use the same data group for any framework that need the @DataGroup annotation (eg: TaskBoard, ObjectStore, ActivationManager, and MessageSubscriptionManager etc.) This allows these frameworks to know they are related, and they can more efficiently define where the data should be stored.

It is important to try to keep both the @DataGroup and @DataName as short and simple as possible. For example, if you have a ObjectStore for encounters, there is no need to set the data name to "EncounterObjectStore" or anything like that. Instead, just call it "encounter". The ObjectStore already knows it is an ObjectStore, but you are saying it is an ObjectStore for encounter data.

By convention, typically the data group follows class naming conventions (eg: "MyGroup"), while the data name follows variable naming conventions (eg: "myName").

FAQ
---

*   **Can I use the standard Java annotations (Like @Inject and @Named)?**
*   Not yet. Since Java 7 is not a minimum iBus version, these standard annotations are not used. Even though these are available through the use of an external jar, we've learned from the past that including external jars with classes has consequences. Instead, the use of the annotation @InjectValue provides similar support for @Inject and the @Named annotations. Once java 7 is supported, support for the standard annotations may likely be added.

  

*   **Which dependency injection method should I use?**
*   There is plenty of debate around this, and as clean as I think field inject looks, constructor injection tends to be the most preferred overall. There is plenty of discussion online if you are interested.

Attachments:
------------

![](images/icons/bullet_blue.gif) [iBus Dependency Injection Developer Guide.url](attachments/2423492736/2423492732.url) (application/octet-stream)  
![](images/icons/bullet_blue.gif) [Container Example](attachments/2423492736/2423492733) (application/gliffy+xml)  
![](images/icons/bullet_blue.gif) [Container Example.png](attachments/2423492736/2423492734.png) (image/png)  

Document generated by Confluence on Jan 14, 2021 10:21

[Atlassian](http://www.atlassian.com/)