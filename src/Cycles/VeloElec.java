package Cycles;

public class VeloElec extends Velo{
	private static final double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec() {
		super();
        this.facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getDEFAUT_COUPLE_MOTEUR() {
		double coupleMoteur  = facteurPuissanceMoteur; 
		return coupleMoteur;
	}
	
	public void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) {
		this.facteurPuissanceMoteur = DEFAUT_COUPLE_MOTEUR;
	}

	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}

	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}

	@Override
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
	    VeloElec ve1 = new VeloElec();
	    VeloElec ve2 = new VeloElec(14.0, 28.0);
	    VeloElec ve3 = new VeloElec(13.0, 26.0, 20.0);

	    System.out.println(ve1);
	    System.out.println(ve2);
	    System.out.println(ve3);

	    System.out.println("Puissance du velo electrique ve3 : " + ve3.getPuissance(90));
	}
}
