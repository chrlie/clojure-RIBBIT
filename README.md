# RIBBIT

```

                           '.  ckO,
                         .xKOXXkkNko                            ';
                        0xoclodOkkKKKd;.      .       .        .... .
                        do'.  ':lxK0KkXWxkOOkOddl';;.  .  .      .,        ..;.
                         .:.     ,dxXOWKcxdKcxkkkdokOKll.. ..  .  ;   .  ..   '
             .    .       .c      'dx0OKddXKOdx0KXxcOxkNKo   '.   :. . .'
            . .. ;,      . c,      ::xdNkkdlxxkOdkkK000WXX0l'.'. .d.' ...''..
         ....... ,  ....  .;x'     .cxONkKXNO0K0KXKNKKXWWWNWNk:;.,d;,l','.'  . ...
        ...'',::c'.........c0Oc..  .'oOX0NOXkKx0XNXOxKWWWXXK0dl',l0dkc;;.... ... ..
       .....;cx.';.....,::;:xNN0l,..'';OXNKkdxNWKkkxXKOKKOXWKO0dokN0l;'.. .  .
      .....';oklccdodl:clllolONXKKl,,;;oNKO0kxNX0OKNXNXN0XKdxKKOdXWOx:,..
     .';:,'..':,.,,,,'......:XXNXxk::;.dNKX0ONXKxxOOkO0OOOKX0kkKXXkoc.
     ..,;::,,:;......''.':,;:,;dx';ld0xkOXKKkoclkkx0XX0OOxOkkXK0d:;,'..
             .    ...':clc::;,'',;lOKO000kxkOOxcllkdooOKxkKOkdc,,..
                   .,:;:ocooccllc::cc:;,',,'.....oo,.oc,'..
                            .......   ...'..    c'....
```

[![Clojars Project](https://img.shields.io/clojars/v/ribbit.svg)](https://clojars.org/ribbit)
[![Build Status](https://travis-ci.org/chrlie/clojure-RIBBIT.svg?branch=master)](https://travis-ci.org/chrlie/clojure-RIBBIT)

A Clojure RIBBIT client and decoding library. See [the definition here](http://frog.tips/api/1/).

## Quick start

```clojure
(ns your-namespace
  (:require ribbit.client))

...

;; {:number 42, :tip "DO NOT IMMERSE FROG IN LIQUIDS."}
(ribbit.client/tip 42)

;; Get a whole bunch of tips
(ribbit.client/croak)
```
