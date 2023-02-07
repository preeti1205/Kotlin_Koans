fun containsEven(collection: Collection<Int>): Boolean =
        collection.any { data : Int -> data % 2 == 0 }
