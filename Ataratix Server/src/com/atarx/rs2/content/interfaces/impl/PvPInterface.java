package com.atarx.rs2.content.interfaces.impl;

import com.atarx.rs2.content.interfaces.InterfaceHandler;
import com.atarx.rs2.entity.player.Player;

/**
 * Handles the pvp teleport interface
 * @author Daniel
 *
 */
public class PvPInterface extends InterfaceHandler {
	
	public PvPInterface(Player player) {
		super(player);
	}

	private final String[] text = {
			"Edgeville",
			"Varrock",
			"East Dragons",
			"Castle",
			"Mage Bank",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			
	};

	@Override
	protected String[] text() {
		return text;
	}

	@Override
	protected int startingLine() {
		return 63051;
	}

}

