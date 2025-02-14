package Cycles;

import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea = new Random();
	
	public static double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	public void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		 DEFAUT_BRAQUET = dEFAUT_BRAQUET; 
	}
	
	public Velo(double braquet, double diamRoue) {
		this.braquet = braquet;
		this.setDiamRoue(diamRoue);
	}
	
	public Velo(double braquet) {
		this.braquet = braquet;
	}
	
	public Velo() {
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public double getBraquet() {
		return braquet;
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	@Override
	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		double puissance = FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
		return puissance;
	}
	
	public static void main(String[] args) {
        Velo v1 = new Velo();
        Velo v2 = new Velo(15.0, 26.0);
        Velo v3 = new Velo(18.0);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        System.out.println("Puissance du velo v2 : " + v2.getPuissance(90));
        System.out.println("Valeur par défaut du braquet : " + Velo.getDEFAUT_BRAQUET());
    }
	
}
