
public class MainMethodClassInterface {

	public static void main(String[] args)
	{
		Veena v = new Veena();
		v.play();
		Saxophone s = new Saxophone();
		s.play();
		
		Playable p;
		p=v;
		p.play();
		p=s;
		p.play();
	}
}
