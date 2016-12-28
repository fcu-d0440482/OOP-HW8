package fcu.iecs.oop.pokemon;

public abstract class Pokemon implements Fightable {

	private int cp;
	private String nickName;
	private PokemonType type;

	public void Pokemon(String nickName, PokemonType type, int cp) {
		this.cp = cp;
		this.nickName = nickName;
		this.type = type;
	}

	public String getnickName() {
		return nickName;
	}

	public void setnickName(String nickName) {
		this.nickName = nickName;
	}

	public PokemonType getType() {
		return type;
	}

	public int getcp() {
		return cp;
	}

	public void setcp(int cp) {
		this.cp = this.cp + cp;
	}

	
	public void attack() {

	}

	
}
