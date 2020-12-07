def f(arr:List[Int]):List[Int] = {
    arr.foldLeft(List[Int]()) { (r, h) => h :: r }
}

// test

val l = List(1,2,3,4)
println("original_list: "+l)
println(f(l))
