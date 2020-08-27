package main.groovy

def log(x, base = 10) {
    Math.log(x) / Math.log(base)
}

println log(1024)
println log(1024, 10)
println log(1024, 2)
