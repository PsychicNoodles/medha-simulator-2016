package items;

public class DestructableItem extends Item {

	private String attackAlt;
	private boolean isAttacked;
	
	public DestructableItem(String name, String pickUp, String use, String interact, String attack, String attackAlt) {
		super(name, pickUp, use, interact, attack);
		this.attackAlt = attackAlt;
		isAttacked = false;
	}
	
	public DestructableItem(String name, String interact, String attack, String attackAlt) {
		this(name, null, null, interact, attack, attackAlt);
	}
	
	@Override
	public String getAttack() {
		if(isAttacked) {
			return attackAlt;
		} else {
			isAttacked = true;
			return attack;
		}
	}
}
