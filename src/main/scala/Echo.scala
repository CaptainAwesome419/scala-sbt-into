object Echo extends App{

  println(s"You said ${if(args.isEmpty) "Nothing" else args.mkString(" ")}")

}
