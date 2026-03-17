object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> {
        var temp = mutableListOf<Any>()

        source.forEach { x ->
            if (x is Collection<*>) {
                temp.addAll(flatten(x))
            }
            else if (x != null) {
                temp.add(x)
            }
        }
        return temp
    }
}
