fun main(args: Array<String>) {
        // Part|
        // Create a map with 4 elements with add, edit and remove

        var names = mutableMapOf("Ahmed" to "Aldosari" , "Ali" to "Asiri" , "Najla" to "al zahrani" , "Anas" to "Al harbi")
        names.put("Nawal", "Bawakid")
        names["Nawal"] = "Khalid"
        names.remove("Ali")
        println(names)


        println("==========================================")

        // Part||
        // Create a map of 3 elemnts and create 3 elements of list add the list to the map

        var color = mutableMapOf("one" to "red", "two" to "green", "three" to "white")
        var newColor = listOf("black", "orange", "yalow")

        color.putAll(newColor.map { it to it })
        println(color)


        println("=====================================")

        // I tried to do the nested loop

        for (num1 in 1..6) {
            for (num2 in 1..num1) {
                var num2 = 1
                print("$num1 * $num2")
            }

            println()
        }

        println("========================")


        var number1 = 1
        var number2 = 1
        while (number1 <= 10){
            if (number2<= 10){
                println("$number1 * $number2")
                number2++
            }
        }
        number1++
    }
