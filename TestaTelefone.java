package fiado;

public class TestaTelefone {
	
	public static void main(String[] args) {
		
		Consumidor cons1 = new Consumidor("Bruno");
		cons1.setTelefone("48-96188863");
		System.out.println(cons1.getTelefone());
	}
}
