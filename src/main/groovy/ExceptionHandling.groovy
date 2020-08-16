package main.groovy

def openFile(fileName) {
    new FileInputStream(fileName)
}

try {
    openFile("nonexistentfile")
} catch (exception) {
    println("File 'nonexistentfile' not found")
}
