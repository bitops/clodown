# clodown

A tiny markdown library for Clojure. Takes 
[Markdown](http://daringfireball.net/projects/markdown/syntax) 
strings and converts them to HTML strings.

Built on top of the [pegdown](https://github.com/sirthias/pegdown) library.

## Basic Usage

There is only one function available, **md**. It takes 
a String of text containing markdown and returns
a String containing HTML instead.

    (use 'clodown.core)
    (md "test")
    ;;=> "<p>test</p>"
    
There is also a concurrency-safe version of **md** available,
**mdp**.

## License

Copyright (C) 2012 Sebastian Wittenkamp.

Distributed under the Eclipse Public License, the same as Clojure.
