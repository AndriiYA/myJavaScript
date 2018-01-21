package ua.Kharkov.Hitman.Shild.Calling.Constructors;

public class A {
		int i, j;
		A (int a, int b){
			i = a;
			j = b;
		}
		// otobra*enie i, j
		void show (){
			System.out.println("i, j: "+ i+ " "+ j);
	}
}
//Cozdanie podklassa za schet raswirenia klassa A.
class B extends A{
int k;
B(int a, int b, int c){
	super (a, b);
	k = c;
	}
// otobra*enie k - etot metod pereopredeliaet metod show() klassa A

void show(){
	System.out.println("k: "+ k);

	}

}
