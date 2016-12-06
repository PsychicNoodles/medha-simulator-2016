package items;

public class MathHomework extends Item {

	private String attackAlt;
	private boolean isAttacked;
	
	public MathHomework(String name, String pickUp, String use, String interact, String attack,
						boolean pickUpable, String attackAlt) {
		super(name, pickUp, use, interact, attack, pickUpable);
		this.attackAlt = attackAlt;
		isAttacked = false;
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
