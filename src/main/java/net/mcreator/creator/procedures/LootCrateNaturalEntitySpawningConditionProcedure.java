package net.mcreator.creator.procedures;

public class LootCrateNaturalEntitySpawningConditionProcedure {
	public static boolean execute() {
		if (Math.random() < 0.9) {
			return false;
		}
		return true;
	}
}
