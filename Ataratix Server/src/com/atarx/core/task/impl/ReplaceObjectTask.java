package com.atarx.core.task.impl;

import com.atarx.core.task.Task;
import com.atarx.rs2.entity.object.GameObject;
import com.atarx.rs2.entity.object.ObjectManager;

public class ReplaceObjectTask extends Task {

	private final int id;
	private final int x;
	private final int y;
	private final int z;

	/**
	 * Only for replacing objects of the same clipping flags.
	 */
	public ReplaceObjectTask(int delay, int id, int x, int y, int z) {
		super(delay);
		this.id = id;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public void execute() {
		GameObject o = new GameObject(id, x, y, z, -1, -1);
		ObjectManager.remove(o);
		ObjectManager.register(o);
	}

	@Override
	public void onStop() {
	}
}
