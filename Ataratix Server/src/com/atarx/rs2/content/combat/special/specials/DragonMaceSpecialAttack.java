package com.atarx.rs2.content.combat.special.specials;

import com.atarx.rs2.content.combat.special.Special;
import com.atarx.rs2.entity.Animation;
import com.atarx.rs2.entity.Graphic;
import com.atarx.rs2.entity.player.Player;

public class DragonMaceSpecialAttack implements Special {
	@Override
	public boolean checkRequirements(Player player) {
		return true;
	}

	@Override
	public int getSpecialAmountRequired() {
		return 25;
	}

	@Override
	public void handleAttack(Player player) {
		player.getCombat().getMelee().setAnimation(new Animation(1060, 0));
		player.getUpdateFlags().sendGraphic(Graphic.highGraphic(251, 2));
	}
}
