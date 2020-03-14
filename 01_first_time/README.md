https://kotlinlang.org/docs/tutorials/command-line.html

Compile including runtime

```
> kotlinc hello.kt -include-runtime -d hello.jar
```

Now it can be run like this

```
> java -jar hello.jar
```

Compile without including runtime

```
> kotlinc hello.kt -d hello.jar
```

Now it can be run like this

```
> kotlin -classpath hello.jar HelloKt
```

Running the REPL

```
> kotlinc-jvm
```

Kotlin can be used as a scripting language with .kts source files.

```
> kotlinc -script list_folders.kts -- -d <path_to_folder_to_inspect>
```