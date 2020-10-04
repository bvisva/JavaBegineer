package JavaStringFunctions;

public class StringMethods {
	

		 static String b= "karthik";
		public static void main(String args[]){
			
			String s= "prabhupadmanabanprabhupadmanaban";
			String a = "dhivya";
	         String b= "karthik";
			String result;
			
			acessGlobal();
			
			String c = "    kiruba       ";
			
			String [] words= {"funk","fury","fuse","chunk"};
			
			System.out.println(s.indexOf('n'));
			
			System.out.println(s.indexOf('p',10));
			
			System.out.println(b.concat(a));
			System.out.println("Substring testing");
			//System.out.println(s.substring('u'));
			//System.out.println(s.substring('5', '1'));
			System.out.println(s.toLowerCase());
			System.out.println(s.replace('a','y'));
			System.out.println(s.replace('a','v'));
			System.out.println(s.concat(c.trim()));
			System.out.println(s.toUpperCase());
			
			 result = a.concat(b);
			 System.out.println("the combined result are "+result);
			 
			 System.out.println();
			for(String w:words){
				if(w.startsWith("fu")){
					System.out.println("forcoming words are staring with fu  "+w);
				}
			}
		}
		
		
		public  static String  acessGlobal(){
			
			String newname = b;
			 System.out.println(" the global variable usage "+ b);
			return newname;
			
		}
	}



