package com.atarx.rs2.content.skill.magic.effects;

import com.atarx.core.util.Utility;
import com.atarx.rs2.content.combat.impl.CombatEffect;
import com.atarx.rs2.entity.Entity;
import com.atarx.rs2.entity.player.Player;

public class SmokeBarrageEffect implements CombatEffect {
	@Override
	public void execute(Player p, Entity e) {
		if ((p.getLastDamageDealt() >= 0) && (Utility.randomNumber(2) == 0))
			e.poison(5);
	}
}
