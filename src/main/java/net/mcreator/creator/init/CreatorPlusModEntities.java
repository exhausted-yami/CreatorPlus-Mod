
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.creator.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.SpawnPlacementRegisterEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.creator.entity.TommyinnitEntity;
import net.mcreator.creator.entity.TechnoBladeEntity;
import net.mcreator.creator.entity.SSundeeEntity;
import net.mcreator.creator.entity.PopularMMOsEntity;
import net.mcreator.creator.entity.PlayerEntity;
import net.mcreator.creator.entity.NorthWestTreesEntity;
import net.mcreator.creator.entity.MikeCrackEntity;
import net.mcreator.creator.entity.LootCrateEntity;
import net.mcreator.creator.entity.GamingWithJenEntity;
import net.mcreator.creator.entity.ElTrollinoEntity;
import net.mcreator.creator.entity.DreamEntity;
import net.mcreator.creator.entity.DiamondMinecartMobEntity;
import net.mcreator.creator.entity.DanTDMEntity;
import net.mcreator.creator.entity.AuthenticGamesEntity;
import net.mcreator.creator.entity.AphmauEntity;
import net.mcreator.creator.CreatorPlusMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CreatorPlusModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, CreatorPlusMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<LootCrateEntity>> LOOT_CRATE = register("loot_crate",
			EntityType.Builder.<LootCrateEntity>of(LootCrateEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PlayerEntity>> PLAYER = register("player",
			EntityType.Builder.<PlayerEntity>of(PlayerEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<NorthWestTreesEntity>> NORTH_WEST_TREES = register("north_west_trees",
			EntityType.Builder.<NorthWestTreesEntity>of(NorthWestTreesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DreamEntity>> DREAM = register("dream",
			EntityType.Builder.<DreamEntity>of(DreamEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SSundeeEntity>> SSUNDEE = register("ssundee",
			EntityType.Builder.<SSundeeEntity>of(SSundeeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TommyinnitEntity>> TOMMYINNIT = register("tommyinnit",
			EntityType.Builder.<TommyinnitEntity>of(TommyinnitEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<TechnoBladeEntity>> TECHNO_BLADE = register("techno_blade",
			EntityType.Builder.<TechnoBladeEntity>of(TechnoBladeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AphmauEntity>> APHMAU = register("aphmau",
			EntityType.Builder.<AphmauEntity>of(AphmauEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<AuthenticGamesEntity>> AUTHENTIC_GAMES = register("authentic_games",
			EntityType.Builder.<AuthenticGamesEntity>of(AuthenticGamesEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DanTDMEntity>> DAN_TDM = register("dan_tdm",
			EntityType.Builder.<DanTDMEntity>of(DanTDMEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ElTrollinoEntity>> EL_TROLLINO = register("el_trollino",
			EntityType.Builder.<ElTrollinoEntity>of(ElTrollinoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PopularMMOsEntity>> POPULAR_MM_OS = register("popular_mm_os",
			EntityType.Builder.<PopularMMOsEntity>of(PopularMMOsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<MikeCrackEntity>> MIKE_CRACK = register("mike_crack",
			EntityType.Builder.<MikeCrackEntity>of(MikeCrackEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GamingWithJenEntity>> GAMING_WITH_JEN = register("gaming_with_jen",
			EntityType.Builder.<GamingWithJenEntity>of(GamingWithJenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DiamondMinecartMobEntity>> DIAMOND_MINECART_MOB = register("diamond_minecart_mob",
			EntityType.Builder.<DiamondMinecartMobEntity>of(DiamondMinecartMobEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(SpawnPlacementRegisterEvent event) {
		LootCrateEntity.init(event);
		PlayerEntity.init(event);
		NorthWestTreesEntity.init(event);
		DreamEntity.init(event);
		SSundeeEntity.init(event);
		TommyinnitEntity.init(event);
		TechnoBladeEntity.init(event);
		AphmauEntity.init(event);
		AuthenticGamesEntity.init(event);
		DanTDMEntity.init(event);
		ElTrollinoEntity.init(event);
		PopularMMOsEntity.init(event);
		MikeCrackEntity.init(event);
		GamingWithJenEntity.init(event);
		DiamondMinecartMobEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(LOOT_CRATE.get(), LootCrateEntity.createAttributes().build());
		event.put(PLAYER.get(), PlayerEntity.createAttributes().build());
		event.put(NORTH_WEST_TREES.get(), NorthWestTreesEntity.createAttributes().build());
		event.put(DREAM.get(), DreamEntity.createAttributes().build());
		event.put(SSUNDEE.get(), SSundeeEntity.createAttributes().build());
		event.put(TOMMYINNIT.get(), TommyinnitEntity.createAttributes().build());
		event.put(TECHNO_BLADE.get(), TechnoBladeEntity.createAttributes().build());
		event.put(APHMAU.get(), AphmauEntity.createAttributes().build());
		event.put(AUTHENTIC_GAMES.get(), AuthenticGamesEntity.createAttributes().build());
		event.put(DAN_TDM.get(), DanTDMEntity.createAttributes().build());
		event.put(EL_TROLLINO.get(), ElTrollinoEntity.createAttributes().build());
		event.put(POPULAR_MM_OS.get(), PopularMMOsEntity.createAttributes().build());
		event.put(MIKE_CRACK.get(), MikeCrackEntity.createAttributes().build());
		event.put(GAMING_WITH_JEN.get(), GamingWithJenEntity.createAttributes().build());
		event.put(DIAMOND_MINECART_MOB.get(), DiamondMinecartMobEntity.createAttributes().build());
	}
}
