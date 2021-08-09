import scala.io.StdIn;

object caesarcipher{


	def main(args:Array[String]){
		
		val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

		val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

		val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+a.size-key)%a.size)

		val cipher= (algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(c=> if (c==' ') c else algo(c,key,a))
		
		print("Enter String :")
		val s=scala.io.StdIn.readLine()
		
		print("Shift Value :")
		val key=scala.io.StdIn.readInt()

		val ct=cipher(E,s,key,alphabet)
				
		val dt=cipher(D,ct,key,alphabet)

		println("Encrypt: "+ct)
		println("Decrypt: "+dt)

	}
}

