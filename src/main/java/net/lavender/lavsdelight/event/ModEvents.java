package net.lavender.lavsdelight.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.lavender.lavsdelight.LavsDelight;
import net.lavender.lavsdelight.common.block.LDBlocks;
import net.lavender.lavsdelight.common.item.LDItems;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = LavsDelight.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.FARMER) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1

            //buying
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(LDItems.WHEAT_FLOUR.get(), 21),
                    13, 5, 0.2f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(LDItems.SALT.get(), 26),
                    new ItemStack(Items.EMERALD, 1),
                    16, 4, 0.2f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(LDItems.SALT.get(), 21),
                    13, 5, 0.2f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(LDItems.MINT_LEAF.get(), 24),
                    13, 5, 0.2f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(LDItems.PEACH.get(), 21),
                    13, 3, 0.15f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(LDItems.MINT_LEAF.get(), 31),
                    new ItemStack(Items.EMERALD, 1),
                    16, 4, 0.2f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(LDItems.PEACH.get(), 21),
                    new ItemStack(Items.EMERALD, 1),
                    16, 4, 0.2f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(LDItems.PEACH.get(), 20),
                    new ItemStack(Items.EMERALD, 1),
                    16, 4, 0.2f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 23),
                    new ItemStack(LDBlocks.LEMON_STARTER.get(), 1),
                    3, 14, 0.002f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(LDItems.PINE_RESIN.get(), 21),
                    new ItemStack(Items.EMERALD, 2),
                    11, 3, 0.1f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(LDItems.PINE_RESIN.get(), 20),
                    18, 4, 0.13f));

        }

            if (event.getType() == VillagerProfession.SHEPHERD) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades_a = event.getTrades();

                trades_a.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(LDItems.TATTERED_LEATHER.get(), 19),
                        new ItemStack(Items.EMERALD, 2),
                        14, 3, 0.4f));

                trades_a.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                        new ItemStack(LDItems.TATTERED_LEATHER.get(), 24),
                        new ItemStack(Items.EMERALD, 3),
                        18, 6, 0.4f));


            }
        }
    }



    //    if (event.getType() == VillagerProfession.LIBRARIAN) {
     //       Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
       //     ItemStack enchantedBook = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Enchantments.THORNS, 2));

            // Level 1
         //   trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
          //          new ItemStack(Items.EMERALD, 32),
            //        enchantedBook,
            //        2, 8, 0.02f));
      //  }
   // }
// }



  //  @SubscribeEvent
  //  public static void addCustomWanderingTrades(WandererTradesEvent event) {
     //   List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
    //    List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

     //   genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
     //           new ItemStack(Items.EMERALD, 12),
      //          new ItemStack(ModItems.SAPPHIRE_BOOTS.get(), 1),
       //         3, 2, 0.2f));

      //  rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
        //        new ItemStack(Items.EMERALD, 24),
       //         new ItemStack(ModItems.METAL_DETECTOR.get(), 1),
        //        2, 12, 0.15f))