package com.atarx.rs2.content.combat.special.specials;

import com.atarx.rs2.content.combat.special.Special;
import com.atarx.rs2.entity.Animation;
import com.atarx.rs2.entity.Graphic;
import com.atarx.rs2.entity.player.Player;

/**
 * Bandos Godsword Special
 * @author Daniel
 *
 */
public class BandosGodswordSpecialAttack implements Special {
	
	@Override
	public boolean checkRequirements(Player player) {
		return true;
	}

	@Override
	public int getSpecialAmountRequired() {
		return 100;
	}

	@Override
	public void handleAttack(Player player) {
		player.getCombat().getMelee().setAnimation(new Animation(7060, 0));
		player.getUpdateFlags().sendGraphic(Graphic.highGraphic(1212, 0));
	}
}
