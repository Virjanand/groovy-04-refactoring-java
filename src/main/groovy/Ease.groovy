package main.groovy


def foo(str) {
    str?.reverse()
}

println foo('evil')
println foo(null)
