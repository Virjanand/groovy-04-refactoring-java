package main.groovy

try {
    println("Before sleep")
    println("Sleeping...")
    Thread.sleep(5000)
} catch (InterruptedException e) {
    // often ignored
} finally {
    println("After sleep")
}
