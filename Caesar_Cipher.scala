//19000782
//K.P.D.Prasad Lakshan
//The Caesar Cipher

object Caesar_Cipher extends App{

	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val key = (scala.io.StdIn.readLine("Enter the shift: ").toInt + alphabet.size) % alphabet.size
    val SecretMsgInput = scala.io.StdIn.readLine("Enter the Message: ")
	val SecretMsgOutput = SecretMsgInput.map( (c: Char) => { 

		val x = alphabet.indexOf(c.toUpper)
		if (x == -1){
			c
		}
		else{
			alphabet((x + key) % alphabet.size)
			} 
	});

	println(SecretMsgOutput);
}