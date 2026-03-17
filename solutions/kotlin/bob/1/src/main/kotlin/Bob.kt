object Bob {
    fun hey(input: String): String {
        return if (input.contains("?")) {
            "Sure"
        } else if (input.all { it.isUpperCase() }) {
            "Whoa, chill out!"
        } else if (input.endsWith("!")) {
            "Calm down, I know what I'm doing!"
        } else if (input.all { it.isWhitespace() } or input.isEmpty()) {
            "Fine. Be that way!"
        } else {
            "Whatever."
        }
    }
}



//- **"Sure."**
//This is his response if you ask him a question, such as "How are you?"
//The convention used for questions is that it ends with a question mark.
//- **"Whoa, chill out!"**
//This is his answer if you YELL AT HIM.
//The convention used for yelling is ALL CAPITAL LETTERS.
//- **"Calm down, I know what I'm doing!"**
//This is what he says if you yell a question at him.
//- **"Fine. Be that way!"**
//This is how he responds to silence.
//The convention used for silence is nothing, or various combinations of whitespace characters.
//- **"Whatever."**
//This is what he answers to anything else.