def f(arr:List[Int]):List[Int] = {
        arr.zipWithIndex.filterNot(x => (x._2%2==0)).map(_._1)

}

//test

val l = List(1,2,3,4)
println("original_list:"+l)
println("result of func:"+f(l))
