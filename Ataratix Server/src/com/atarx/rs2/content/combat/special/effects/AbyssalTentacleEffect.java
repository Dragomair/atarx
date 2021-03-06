package com.atarx.rs2.content.combat.special.effects;

import com.atarx.core.util.Utility;
import com.atarx.rs2.content.combat.impl.CombatEffect;
import com.atarx.rs2.entity.Entity;
import com.atarx.rs2.entity.Graphic;
import com.atarx.rs2.entity.player.Player;

/**
 * Handles the Abyssal Tentacle Whip Effect
 * @author Daniel
 *
 */
public class AbyssalTentacleEffect implements CombatEffect {
	
	@Override
	public void execute(Player player, Entity entity) {
		if (!entity.isNpc()) {
			Player p2 = com.atarx.rs2.entity.World.getPlayers()[entity.getIndex()];
			if (p2 == null) {
				return;
			}
			p2.freeze(10, 5);
			p2.getUpdateFlags().sendGraphic(new Graphic(181));
			if (Utility.random(100) < 50) {
				p2.poison(4);
			}
		}
	}
	
}
