fun reverse(input: String): String {
    var newString = ""
    for (i in input.length - 1 downTo 0) {
        newString += input[i]
    }
    return newString
}
