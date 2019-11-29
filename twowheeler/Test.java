package twowheeler;

public class Test {

	public static void main(String[] args) {
		
		Hero h = new Hero();
		System.out.println(h.getModelName());
		System.out.println(h.getOwnerName());
		System.out.println(h.getRegistrationNumber());
		System.out.println(h.getSpeed());
		h.radio();
		
		Honda hn = new Honda();
		hn.getModelName();
		hn.getOwnerName();
		hn.getRegistrationNumber();
		hn.getSpeed();
		hn.cdplayer();

	}

}
