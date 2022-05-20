package net.mcreator.darkinfection.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.darkinfection.init.DarkInfectionModBlocks;

import java.util.Map;

public class InfectedsoilUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if (Math.random() < 0.4) {
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRASS_BLOCK) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.GRASS_BLOCK) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DIRT) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.DARKDIRT.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DIRT) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.DARKDIRT.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DIRT) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.DARKDIRT.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DIRT) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.DARKDIRT.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DIRT) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.DARKDIRT.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DIRT) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.DARKDIRT.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.COARSE_DIRT) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.DARKDIRT.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.COARSE_DIRT) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.DARKDIRT.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.COARSE_DIRT) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.DARKDIRT.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.COARSE_DIRT) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.DARKDIRT.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.COARSE_DIRT) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.DARKDIRT.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.COARSE_DIRT) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.DARKDIRT.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DIRT_PATH) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DIRT_PATH) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DIRT_PATH) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DIRT_PATH) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DIRT_PATH) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DIRT_PATH) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.MYCELIUM) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.MYCELIUM) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.MYCELIUM) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.MYCELIUM) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.MYCELIUM) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.MYCELIUM) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.INFECTEDSOIL.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.STONE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.STONE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.STONE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.STONE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.STONE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.STONE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DEEPSLATE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DEEPSLATE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = Blocks.DEEPSLATE.defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DEEPSLATE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DEEPSLATE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DEEPSLATE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BLACKSTONE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BLACKSTONE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BLACKSTONE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BLACKSTONE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BLACKSTONE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BLACKSTONE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOIDSTONE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.COBBLESTONE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_COBBLE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.COBBLESTONE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_COBBLE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.COBBLESTONE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_COBBLE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.COBBLESTONE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_COBBLE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.COBBLESTONE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_COBBLE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.COBBLESTONE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_COBBLE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.COBBLED_DEEPSLATE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_COBBLE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.COBBLED_DEEPSLATE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_COBBLE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.COBBLED_DEEPSLATE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_COBBLE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.COBBLED_DEEPSLATE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_COBBLE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.COBBLED_DEEPSLATE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_COBBLE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.COBBLED_DEEPSLATE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_COBBLE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.SAND) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.SAND) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.SAND) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.SAND) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.SAND) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.SAND) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.GRAVEL) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GRAVEL) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.GRAVEL) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.GRAVEL) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.GRAVEL) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.GRAVEL) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.WHITE_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.WHITE_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.WHITE_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.WHITE_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.WHITE_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.WHITE_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.ORANGE_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.ORANGE_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.ORANGE_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.ORANGE_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.ORANGE_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.ORANGE_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.MAGENTA_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.MAGENTA_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.MAGENTA_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.MAGENTA_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.MAGENTA_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.MAGENTA_CONCRETE_POWDER) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.LIGHT_BLUE_WOOL) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.LIGHT_BLUE_WOOL) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.LIGHT_BLUE_WOOL) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.LIGHT_BLUE_WOOL) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.LIGHT_BLUE_WOOL) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.LIGHT_BLUE_WOOL) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.GRAVITYVOID.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DIAMOND_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DIAMOND_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DIAMOND_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DIAMOND_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DIAMOND_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DIAMOND_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.GOLD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.GOLD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.GOLD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.GOLD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.GOLD_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.GOLD_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.IRON_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.IRON_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.IRON_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.IRON_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.IRON_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.IRON_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.COAL_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.COAL_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.COAL_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.COAL_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.COAL_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.COAL_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.EMERALD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.EMERALD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.EMERALD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.EMERALD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.EMERALD_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.EMERALD_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.LAPIS_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.LAPIS_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.LAPIS_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.LAPIS_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.LAPIS_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.LAPIS_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.COPPER_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.COPPER_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.COPPER_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.COPPER_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.COPPER_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.COPPER_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DEEPSLATE_COPPER_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_COPPER_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DEEPSLATE_COPPER_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DEEPSLATE_COPPER_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DEEPSLATE_COPPER_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DEEPSLATE_COPPER_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COPPER_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DEEPSLATE_LAPIS_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_LAPIS_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DEEPSLATE_LAPIS_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DEEPSLATE_LAPIS_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DEEPSLATE_LAPIS_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DEEPSLATE_LAPIS_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_LAPIS_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DEEPSLATE_REDSTONE_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_REDSTONE_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DEEPSLATE_EMERALD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_EMERALD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DEEPSLATE_EMERALD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DEEPSLATE_EMERALD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DEEPSLATE_EMERALD_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DEEPSLATE_EMERALD_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_EMERALD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DEEPSLATE_COAL_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_COAL_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DEEPSLATE_COAL_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DEEPSLATE_COAL_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DEEPSLATE_COAL_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DEEPSLATE_COAL_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_COAL_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DEEPSLATE_IRON_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_IRON_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DEEPSLATE_IRON_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DEEPSLATE_IRON_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DEEPSLATE_IRON_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DEEPSLATE_IRON_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_IRON_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DEEPSLATE_GOLD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_GOLD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DEEPSLATE_GOLD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DEEPSLATE_GOLD_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DEEPSLATE_GOLD_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DEEPSLATE_GOLD_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_GOLD_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
					if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y + 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y - 1, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z + 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE) {
						{
							BlockPos _bp = new BlockPos(x, y, z - 1);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE) {
						{
							BlockPos _bp = new BlockPos(x - 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					} else if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.DEEPSLATE_DIAMOND_ORE) {
						{
							BlockPos _bp = new BlockPos(x + 1, y, z);
							BlockState _bs = DarkInfectionModBlocks.VOID_STONE_DIAMOND_ORE.get().defaultBlockState();
							BlockState _bso = world.getBlockState(_bp);
							for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
								Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
								if (_property != null && _bs.getValue(_property) != null)
									try {
										_bs = _bs.setValue(_property, (Comparable) entry.getValue());
									} catch (Exception e) {
									}
							}
							world.setBlock(_bp, _bs, 3);
						}
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 5);
	}
}
