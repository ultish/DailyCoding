fun main() {
    val list = arrayListOf(10, 15, 3, 7, 13)
    val k = 16

    // Given a list of numbers and a number k, return whether any two numbers from the list add up to k
    val result:Boolean = findSums(list, k)
    println("$list contains sums of $k: $result")
}

/**
 * O(n) complexity
 */
fun findSums(list:Collection<Int>, value:Int): Boolean {
    val set:Set<Int> = list.toSet()
    for (i in list) {
        val want:Int = value - i

        println("want $want")

        if (set.contains(want)) {
            println("found sum")
            return true
        }
    }
    println("no sums")
    return false
}