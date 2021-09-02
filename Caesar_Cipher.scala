//19000782
//K.P.D.Prasad Lakshan
//The Caesar Cipher

object Caesar_Cipher {

val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

val E=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)

val D=(c:Char,key:Int,a:String)=> a(if((a.indexOf(c.toUpper)-key)%a.size >=0) 
      (a.indexOf(c.toUpper)-key)%a.size else a.size+(a.indexOf(c.toUpper)-key)%a.size)

val cipher: ((Char, Int, String) => Char, String, Int, String) => String = (algo: (Char, Int, String) =>
    Char, s: String, key: Int, a: String) =>
    s.map(algo(_, key, a))

def main(args: Array[String]): Unit = {
        println("Caeser cipher")
        println("Enter the key value: ")
        val key = scala.io.StdIn.readInt()
        println("Enter the string to Encrypt")
        val text=scala.io.StdIn.readLine()
        val ct: String = cipher(E, text, key, alphabet)
        println("String after encrypted: " + ct)
        val pt: String = cipher(D, ct, key, alphabet)
        println("string after decrypted: " + pt)
}

}