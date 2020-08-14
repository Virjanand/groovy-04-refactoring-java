package main.groovy


def foo(str) {
    if (str != null) {
        str.reverse()
    }
}

println foo('evil')
println foo(null)
