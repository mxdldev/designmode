package com.designmode.action.t09_mementto;

public class Boss {
	private int vitality;//生命力
	private int defense;//防御力
	private int aggressivity;//攻击力
	
	public Boss(int vitality, int defense, int aggressivity) {
		super();
		this.vitality = vitality;
		this.defense = defense;
		this.aggressivity = aggressivity;
	}
	public int getVitality() {
		return vitality;
	}
	public void setVitality(int vitality) {
		this.vitality = vitality;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getAggressivity() {
		return aggressivity;
	}
	public void setAggressivity(int aggressivity) {
		this.aggressivity = aggressivity;
	}
	public Mementto createMementto(){
		Mementto mementto = new Mementto();
		mementto.setVitality(vitality);
		mementto.setDefense(defense);
		mementto.setAggressivity(aggressivity);
		return mementto;
	}
	public void recoverFromMementto(Mementto mementto){
		this.setVitality(mementto.getVitality());
		this.setDefense(mementto.getDefense());
		this.setAggressivity(mementto.getAggressivity());
	}
	@Override
	public String toString() {
		return "Boss [vitality=" + vitality + ", defense=" + defense + ", aggressivity=" + aggressivity + "]";
	}
}
